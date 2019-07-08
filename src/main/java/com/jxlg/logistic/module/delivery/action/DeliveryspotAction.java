package com.jxlg.logistic.module.delivery.action;

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
import com.jxlg.logistic.module.delivery.condition.DeliveryspotCondition;
import com.jxlg.logistic.module.delivery.entity.Deliveryspot;
import com.jxlg.logistic.module.delivery.service.IDeliveryspotService;
import com.jxlg.logistic.module.sys.entity.Employee;
import com.jxlg.logistic.module.sys.entity.EmployeeExample;
import com.jxlg.logistic.module.sys.service.IEmployeeService;
import com.jxlg.logistic.module.transport.entity.City;
import com.jxlg.logistic.module.transport.service.ICityService;

@RestController
@RequestMapping("/admin/delivery/deliveryspot/")
public class DeliveryspotAction {

	@Autowired
	IDeliveryspotService deliveryspotService;
	@Autowired
	IDataDictionaryDetailService dataDictionaryDetailService;
	@Autowired
	ICityService cityService;
	@Autowired
	IEmployeeService employeeService;

	@GetMapping("page")
	public ModelAndView page() {
		ModelAndView modelAndView = new ModelAndView("admin/delivery/deliveryspot_list");

		List<City> listCity = cityService.selectByExample(null);
		modelAndView.addObject("listCity", listCity);

		DataDictionaryDetailExample example = new DataDictionaryDetailExample();
		Criteria criteria = example.createCriteria();
		criteria.andDictionaryDetailCodeEqualTo(Contants.DELIVERY_STATUS);
		List<DataDictionaryDetail> listDeliveryStatus = dataDictionaryDetailService.selectByExample(example);
		modelAndView.addObject("listDeliveryStatus", listDeliveryStatus);
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

		DeliveryspotCondition condition = new DeliveryspotCondition();
		String cityId = request.getParameter("cityId");
		String minDateStr = request.getParameter("minDate");
		String maxDateStr = request.getParameter("maxDate");
		String deliveryStatus = request.getParameter("deliveryStatus");
		DateConverter dateConverter = new DateConverter();
		if (StringUtils.isNotBlank(cityId)) {
			condition.setCityId(cityId);
		}
		if (StringUtils.isNotBlank(deliveryStatus)) {
			condition.setDeliveryStatus(deliveryStatus);
		}
		if (StringUtils.isNotBlank(minDateStr) && StringUtils.isNotBlank(maxDateStr)) {
			Date minDate = dateConverter.convert(minDateStr);
			Date maxDate = dateConverter.convert(maxDateStr);
			condition.setMinDate(minDate);
			condition.setMaxDate(maxDate);
		}
		if (StringUtils.isBlank(minDateStr) && StringUtils.isNotBlank(maxDateStr)) {
			Date maxDate = dateConverter.convert(maxDateStr);
			condition.setMaxDate(maxDate);
		}
		if (StringUtils.isNotBlank(minDateStr) && StringUtils.isBlank(maxDateStr)) {
			Date minDate = dateConverter.convert(minDateStr);
			condition.setMinDate(minDate);
		}

		PageHelper.startPage(pageNum, pageSize);
		List<Deliveryspot> listDeliveryspot = deliveryspotService.listView(condition);
		PageInfo<Deliveryspot> pageInfo = new PageInfo<>(listDeliveryspot);
		Map<String, Object> map = new HashMap<>();
		map.put("total", pageInfo.getTotal());
		map.put("rows", pageInfo.getList());
		return map;
	}

	@RequestMapping("edit")
	public ModelAndView edit(@RequestParam(name = "deliveryspotId", required = false) String deliveryspotId) {
		ModelAndView modelAndView = new ModelAndView("admin/delivery/deliveryspot_edit");
		if (StringUtils.isNotBlank(deliveryspotId)) {
			Deliveryspot deliveryspot = deliveryspotService.selectByPrimaryKey(deliveryspotId);
			modelAndView.addObject("deliveryspot", deliveryspot);
		} else {

		}

		// 城市，员工
		List<City> listCity = cityService.selectByExample(null);
		modelAndView.addObject("listCity", listCity);
		EmployeeExample exampleEmployee = new EmployeeExample();
		List<Employee> listEmployee = employeeService.selectByExample(exampleEmployee);
		modelAndView.addObject("listEmployee", listEmployee);
		// 配送状态
		DataDictionaryDetailExample example = new DataDictionaryDetailExample();
		Criteria criteria = example.createCriteria();
		criteria.andDictionaryDetailCodeEqualTo(Contants.DELIVERY_STATUS);
		List<DataDictionaryDetail> listDeliveryStatus = dataDictionaryDetailService.selectByExample(example);
		modelAndView.addObject("listDeliveryStatus", listDeliveryStatus);
		return modelAndView;
	}

	@RequestMapping("deleteAj")
	public String deleteAj(HttpServletRequest request, HttpServletResponse response) {
		String result = null;
		try {
			String deliveryspotId = request.getParameter("deliveryspotId");
			deliveryspotService.deleteByPrimaryKey(deliveryspotId);
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
			deliveryspotService.deleteRows(ids);
		} catch (Exception ex) {
			result = "删除失败";
		}
		return result;
	}

	@PostMapping("saveAj")
	public String saveAj(Deliveryspot deliveryspot, HttpServletRequest request, HttpServletResponse response) {
		String result = null;
		try {
			if (!StringUtils.isEmpty(deliveryspot.getDeliveryspotId())) {
				deliveryspotService.updateByPrimaryKeySelective(deliveryspot);
			} else {
				deliveryspotService.insertSelective(deliveryspot);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			result = "保存失败";
		}
		// return "保存失败" ;
		return result;
	}
}
