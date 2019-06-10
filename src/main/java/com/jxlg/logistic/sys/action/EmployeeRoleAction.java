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
import com.jxlg.logistic.sys.entity.Employee;
import com.jxlg.logistic.sys.entity.EmployeeRole;
import com.jxlg.logistic.sys.entity.Role;
import com.jxlg.logistic.sys.queryview.EmployeeRoleQueryView;
import com.jxlg.logistic.sys.service.IEmployeeRoleService;
import com.jxlg.logistic.sys.service.IEmployeeService;
import com.jxlg.logistic.sys.service.IRoleService;

@RestController
@RequestMapping("/admin/sys/employeeRole/")
public class EmployeeRoleAction {

	@Autowired
	IEmployeeRoleService employeeRoleService;
	@Autowired
	IEmployeeService employeeService;
	@Autowired
	IRoleService roleService;

	@GetMapping("page")
	public ModelAndView page() {
		ModelAndView modelAndView = new ModelAndView("admin/sys/emp_role_list");
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
		List<EmployeeRoleQueryView> listEmployeeRole = employeeRoleService.listView();
		PageInfo<EmployeeRoleQueryView> pageInfo = new PageInfo<>(listEmployeeRole);
		Map<String, Object> map = new HashMap<>();
		map.put("total", pageInfo.getTotal());
		map.put("rows", pageInfo.getList());

		return map;
	}

	@RequestMapping("edit")
	public ModelAndView edit(@RequestParam(name = "empRoleId", required = false) String empRoleId) {
		ModelAndView modelAndView = new ModelAndView("admin/sys/emp_role_edit");
		if (StringUtils.isNotBlank(empRoleId)) {
			EmployeeRole employeeRole = employeeRoleService.selectByPrimaryKey(empRoleId);
			modelAndView.addObject("employeeRole", employeeRole);
		} else {

		}
		// 员工角色
		List<Employee> listEmployee = employeeService.selectByExample(null);
		List<Role> listRole = roleService.selectByExample(null);
		modelAndView.addObject("listEmployee", listEmployee);
		modelAndView.addObject("listRole", listRole);
		return modelAndView;
	}

	@RequestMapping("deleteAj")
	public String deleteAj(HttpServletRequest request, HttpServletResponse response) {
		String result = null;
		try {
			String empRoleId = request.getParameter("empRoleId");
			employeeRoleService.deleteByPrimaryKey(empRoleId);
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
			employeeRoleService.deleteRows(ids);
		} catch (Exception ex) {
			result = "删除失败";
		}
		return result;
	}

	@PostMapping("saveAj")
	public String saveAj(EmployeeRole employeeRole, HttpServletRequest request, HttpServletResponse response) {
		String result = null;
		// employeeRoleer.setAddress("no_pay");
		try {
			if (!StringUtils.isEmpty(employeeRole.getEmpRoleId())) {
				employeeRoleService.updateByPrimaryKeySelective(employeeRole);
			} else {
				employeeRoleService.insertSelective(employeeRole);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			result = "保存失败";
		}
		// return "保存失败" ;
		return result;
	}
}
