package com.jxlg.logistic.module.sys.action;

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
import com.jxlg.logistic.module.sys.entity.Module;
import com.jxlg.logistic.module.sys.entity.ModuleExample;
import com.jxlg.logistic.module.sys.service.IModuleService;

@RestController
@RequestMapping("/admin/sys/module/")
public class ModuleAction {

	@Autowired
	IModuleService moduleService;

	@GetMapping("page")
	public ModelAndView page() {
		ModelAndView modelAndView = new ModelAndView("admin/sys/module_list");
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
		ModuleExample example = new ModuleExample();

		List<Module> listModule = moduleService.selectByExample(example);
		PageInfo<Module> pageInfo = new PageInfo<>(listModule);
		Map<String, Object> map = new HashMap<>();
		map.put("total", pageInfo.getTotal());
		map.put("rows", pageInfo.getList());

		return map;
	}

	@RequestMapping("edit")
	public ModelAndView edit(@RequestParam(name = "moduleId", required = false) String moduleId) {
		ModelAndView modelAndView = new ModelAndView("admin/sys/module_edit");
		if (StringUtils.isNotBlank(moduleId)) {
			Module module = moduleService.selectByPrimaryKey(moduleId);
			modelAndView.addObject("module", module);
		} else {

		}
		return modelAndView;
	}

	@RequestMapping("deleteAj")
	public String deleteAj(HttpServletRequest request, HttpServletResponse response) {
		String result = null;
		try {
			String moduleId = request.getParameter("moduleId");
			moduleService.deleteByPrimaryKey(moduleId);
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
			moduleService.deleteRows(ids);
		} catch (Exception ex) {
			result = "删除失败";
		}
		return result;
	}

	@PostMapping("saveAj")
	public String saveAj(Module module, HttpServletRequest request, HttpServletResponse response) {
		String result = null;
		try {
			if (!StringUtils.isEmpty(module.getModuleId())) {
				moduleService.updateByPrimaryKeySelective(module);
			} else {
				moduleService.insertSelective(module);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			result = "保存失败";
		}
		// return "保存失败" ;
		return result;
	}
}
