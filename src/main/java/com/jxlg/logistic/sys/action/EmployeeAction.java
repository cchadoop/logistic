package com.jxlg.logistic.sys.action;

import java.util.Date;
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
import com.jxlg.logistic.constants.Contants;
import com.jxlg.logistic.converter.DateConverter;
import com.jxlg.logistic.data.entity.DataDictionaryDetail;
import com.jxlg.logistic.data.entity.DataDictionaryDetailExample;
import com.jxlg.logistic.data.entity.DataDictionaryDetailExample.Criteria;
import com.jxlg.logistic.data.service.IDataDictionaryDetailService;
import com.jxlg.logistic.sys.condition.EmployeeCondition;
import com.jxlg.logistic.sys.entity.Employee;
import com.jxlg.logistic.sys.service.IEmployeeService;

@RestController
@RequestMapping("/admin/sys/employee/")
public class EmployeeAction {

	@Autowired
	IEmployeeService employeeService;

	@Autowired
	IDataDictionaryDetailService dataDictionaryDetailService;

	@GetMapping("page")
	public ModelAndView page(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView modelAndView = new ModelAndView("admin/sys/emp_list");
		// 员工工作状态下拉列表
		DataDictionaryDetailExample exampleWork = new DataDictionaryDetailExample();
		Criteria criteria = exampleWork.createCriteria();
		criteria.andDictionaryDetailCodeEqualTo(Contants.EMP_WORK_STATUS);
		List<DataDictionaryDetail> listEmpWorkStatus = dataDictionaryDetailService.selectByExample(exampleWork);
		modelAndView.addObject("listEmpWorkStatus", listEmpWorkStatus);
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
		// 查询条件
		String empName = request.getParameter("empName");
		String empWorkStatus = request.getParameter("empWorkStatus");
		String minDateStr = request.getParameter("minDate");
		String maxDateStr = request.getParameter("maxDate");
		EmployeeCondition condition = new EmployeeCondition();
		if (StringUtils.isNotEmpty(empName)) {
			condition.setEmpName(empName);
		}
		if (StringUtils.isNotEmpty(empWorkStatus)) {
			condition.setEmpWorkStatus(empWorkStatus);
		}
		if (StringUtils.isNotEmpty(minDateStr) && StringUtils.isNotEmpty(maxDateStr)) {
			try {
				DateConverter dateConverter = new DateConverter();
				Date minDate = dateConverter.convert(minDateStr);
				Date maxDate = dateConverter.convert(maxDateStr);
				condition.setMinDate(minDate);
				condition.setMaxDate(maxDate);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (StringUtils.isNotEmpty(minDateStr) && StringUtils.isEmpty(maxDateStr)) {
			try {
				DateConverter dateConverter = new DateConverter();
				Date minDate = dateConverter.convert(minDateStr);
				condition.setMinDate(minDate);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (StringUtils.isEmpty(minDateStr) && StringUtils.isNotEmpty(maxDateStr)) {
			try {
				DateConverter dateConverter = new DateConverter();
				Date maxDate = dateConverter.convert(maxDateStr);
				condition.setMaxDate(maxDate);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		PageHelper.startPage(pageNum, pageSize);
		List<Employee> listEmployee = employeeService.listView(condition);
		PageInfo<Employee> pageInfo = new PageInfo<>(listEmployee);
		Map<String, Object> map = new HashMap<>();
		map.put("total", pageInfo.getTotal());
		map.put("rows", pageInfo.getList());
		return map;
	}

	// @GetMapping("edit/{empId}")
	// public ModelAndView edit(@PathParam("empId") String empId) {
	// System.out.println(empId);
	// ModelAndView modelAndView = new ModelAndView("admin/sys/emp_edit");
	// return modelAndView;
	// }
	// @PostMapping("add")
	// public ModelAndView add() {
	// ModelAndView modelAndView = new ModelAndView("admin/sys/emp_edit");
	// return modelAndView;
	// }
	@RequestMapping("edit")
	public ModelAndView edit(@RequestParam(name = "empId", required = false) String empId) {
		ModelAndView modelAndView = new ModelAndView("admin/sys/emp_edit");
		if (StringUtils.isNotBlank(empId)) {
			Employee employee = employeeService.selectByPrimaryKey(empId);
			modelAndView.addObject("employee", employee);
		} else {

		}
		// 员工工作状态下拉列表
		DataDictionaryDetailExample exampleWork = new DataDictionaryDetailExample();
		Criteria criteria = exampleWork.createCriteria();
		criteria.andDictionaryDetailCodeEqualTo(Contants.EMP_WORK_STATUS);
		List<DataDictionaryDetail> listEmpWorkStatus = dataDictionaryDetailService.selectByExample(exampleWork);
		modelAndView.addObject("listEmpWorkStatus", listEmpWorkStatus);
		// 员工婚姻状态下拉列表
		DataDictionaryDetailExample exampleMarry = new DataDictionaryDetailExample();
		criteria = exampleMarry.createCriteria();
		criteria.andDictionaryDetailCodeEqualTo(Contants.EMP_MARRY_STATUS);
		List<DataDictionaryDetail> listEmpMarryStatus = dataDictionaryDetailService.selectByExample(exampleMarry);
		modelAndView.addObject("listEmpMarryStatus", listEmpMarryStatus);
		return modelAndView;
	}

	@RequestMapping("deleteAj")
	public String deleteAj(HttpServletRequest request, HttpServletResponse response) {
		String result = null;
		try {
			String empId = request.getParameter("empId");
			employeeService.deleteByPrimaryKey(empId);
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
			employeeService.deleteRows(ids);
		} catch (Exception ex) {
			result = "删除失败";
		}
		return result;
	}

	@PostMapping("saveAj")
	public String saveAj(Employee employee, HttpServletRequest request, HttpServletResponse response) {
		String result = null;
		// customer.setAddress("no_pay");
		try {
			if (!StringUtils.isEmpty(employee.getEmpId())) {
				employeeService.updateByPrimaryKeySelective(employee);
			} else {
				employeeService.insertSelective(employee);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			result = "保存失败";
		}
		// return "保存失败" ;
		return result;
	}
}
