package com.jxlg.logistic.module.sys.action;

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
import com.jxlg.logistic.module.data.entity.DataDictionaryDetail;
import com.jxlg.logistic.module.data.entity.DataDictionaryDetailExample;
import com.jxlg.logistic.module.data.entity.DataDictionaryDetailExample.Criteria;
import com.jxlg.logistic.module.data.service.IDataDictionaryDetailService;
import com.jxlg.logistic.repository.EmployeeMongoRepository;
import com.jxlg.logistic.module.sys.condition.EmployeeCondition;
import com.jxlg.logistic.module.sys.entity.Employee;
import com.jxlg.logistic.module.sys.service.IEmployeeEsService;
import com.jxlg.logistic.module.sys.service.IEmployeeService;

@RestController
@RequestMapping("/admin/sys/employee/")
public class EmployeeAction {

	@Autowired
	IEmployeeService employeeService;

	@Autowired
	IDataDictionaryDetailService dataDictionaryDetailService;

	@Autowired
	private IEmployeeEsService employeeEsService;
	
	@Autowired
	private EmployeeMongoRepository employeeMongoRepository;

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
		return result;
	}

	// ElasticSearch TEST
	// MongoDB TEST
	@PostMapping("save")
	public String save(Employee employee) {
		employeeEsService.save(employee);
		employeeMongoRepository.save(employee);
		return "success";
	}

	@GetMapping("delete")
	public String delete(String empId) {
		employeeEsService.deleteById(empId);
		return "success";
	}

	@PostMapping("update")
	public String update(Employee employee) {
		employeeEsService.save(employee);
		return "success";
	}

	@GetMapping("search")
	public List<Employee> search(Integer pageNumber, Integer pageSize, String searchContent) {
		return employeeEsService.search(pageNumber, pageSize, searchContent);
	}

}
