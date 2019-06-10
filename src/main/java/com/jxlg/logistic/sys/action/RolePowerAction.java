package com.jxlg.logistic.sys.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jxlg.logistic.sys.entity.Power;
import com.jxlg.logistic.sys.entity.Role;
import com.jxlg.logistic.sys.entity.RolePower;
import com.jxlg.logistic.sys.queryview.RolePowerQueryView;
import com.jxlg.logistic.sys.service.IPowerService;
import com.jxlg.logistic.sys.service.IRolePowerService;
import com.jxlg.logistic.sys.service.IRoleService;

@RestController
@RequestMapping("/admin/sys/rolePower/")
public class RolePowerAction {

	@Autowired
	IRolePowerService rolePowerService;
	@Autowired
	IRoleService roleService;
	@Autowired
	IPowerService powerService;

	@GetMapping("page")
	public ModelAndView page() {
		ModelAndView modelAndView = new ModelAndView("admin/sys/role_power_list");
		return modelAndView;
	}

	@SuppressWarnings("rawtypes")
	@PostMapping("pageAjax")
	public Map pageAjax(@RequestParam("page") String strPage, @RequestParam("rows") String strRows,
			HttpServletRequest request, HttpServletResponse response) {
		int pageNum = 0;
		int pageSize = 10;

		if (StringUtils.isNotBlank(strPage)) {
			pageNum = Integer.parseInt(strPage);
		}
		if (StringUtils.isNotBlank(strRows)) {
			pageSize = Integer.parseInt(strRows);
		}
		PageHelper.startPage(pageNum, pageSize);
		List<RolePowerQueryView> listRolePower = rolePowerService.listView();
		PageInfo<RolePowerQueryView> pageInfo = new PageInfo<>(listRolePower);
		Map<String, Object> map = new HashMap<>();
		map.put("total", pageInfo.getTotal());
		map.put("rows", pageInfo.getList());

		return map;
	}

	@RequestMapping("edit")
	public ModelAndView edit(@RequestParam(name = "rolePowerId", required = false) String rolePowerId) {
		ModelAndView modelAndView = new ModelAndView("admin/sys/role_power_edit");
		if (StringUtils.isNotBlank(rolePowerId)) {
			RolePower rolePower = rolePowerService.selectByPrimaryKey(rolePowerId);
			modelAndView.addObject("rolePower", rolePower);
		} else {

		}
		// 角色权限
		List<Role> listRole = roleService.selectByExample(null);
		List<Power> listPower = powerService.selectByExample(null);
		modelAndView.addObject("listRole", listRole);
		modelAndView.addObject("listPower", listPower);
		return modelAndView;
	}

	@RequestMapping("deleteAj")
	public String deleteAj(HttpServletRequest request, HttpServletResponse response) {
		String result = null;
		try {
			String rolePowerId = request.getParameter("rolePowerId");
			rolePowerService.deleteByPrimaryKey(rolePowerId);
		} catch (Exception ex) {
			result = "删除失败";
		}
		return result;
	}

	@RequestMapping("deleteRowsAj")
	public String deleteRowsAj(@RequestParam("ids[]") String[] ids, HttpServletRequest request,
			HttpServletResponse response) {
		String result = null;
		try {
			rolePowerService.deleteRows(ids);
		} catch (Exception ex) {
			result = "删除失败";
		}
		return result;
	}

	@PostMapping("saveAj")
	public String saveAj(RolePower rolePower, HttpServletRequest request, HttpServletResponse response) {
		String result = null;
		// rolePowerer.setAddress("no_pay");
		try {
			if (!StringUtils.isEmpty(rolePower.getRolePowerId())) {
				rolePowerService.updateByPrimaryKeySelective(rolePower);
			} else {
				rolePowerService.insertSelective(rolePower);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			result = "保存失败";
		}
		// return "保存失败" ;
		return result;
	}
}
