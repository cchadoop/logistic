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
import com.jxlg.logistic.sys.entity.Module;
import com.jxlg.logistic.sys.entity.Power;
import com.jxlg.logistic.sys.service.IModuleService;
import com.jxlg.logistic.sys.service.IPowerService;

@RestController
@RequestMapping("/admin/sys/power/")
public class PowerAction {

	@Autowired
	IPowerService powerService;
	@Autowired
	IModuleService moduleService;

	@GetMapping("page")
	public ModelAndView page() {
		ModelAndView modelAndView = new ModelAndView("admin/sys/power_list");
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
		List<Power> listPower = powerService.listView();
		PageInfo<Power> pageInfo = new PageInfo<>(listPower);
		Map<String, Object> map = new HashMap<>();
		map.put("total", pageInfo.getTotal());
		map.put("rows", pageInfo.getList());

		return map;
	}

	@RequestMapping("edit")
	public ModelAndView edit(@RequestParam(name = "powerId", required = false) String powerId) {
		ModelAndView modelAndView = new ModelAndView("admin/sys/power_edit");
		if (StringUtils.isNotBlank(powerId)) {
			Power power = powerService.selectByPrimaryKey(powerId);
			modelAndView.addObject("power", power);
		} else {

		}
		// 模块id
		List<Module> listModule = moduleService.selectByExample(null);
		modelAndView.addObject("listModule", listModule);
		return modelAndView;
	}

	@RequestMapping("deleteAj")
	public String deleteAj(HttpServletRequest request, HttpServletResponse response) {
		String result = null;
		try {
			String powerId = request.getParameter("powerId");
			powerService.deleteByPrimaryKey(powerId);
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
			powerService.deleteRows(ids);
		} catch (Exception ex) {
			result = "删除失败";
		}
		return result;
	}

	@PostMapping("saveAj")
	public String saveAj(Power power, HttpServletRequest request, HttpServletResponse response) {
		String result = null;
		// powerer.setAddress("no_pay");
		try {
			if (!StringUtils.isEmpty(power.getPowerId())) {
				powerService.updateByPrimaryKeySelective(power);
			} else {
				powerService.insertSelective(power);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			result = "保存失败";
		}
		// return "保存失败" ;
		return result;
	}
}
