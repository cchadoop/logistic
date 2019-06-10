package com.jxlg.logistic.delivery.action;

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
import com.jxlg.logistic.data.entity.DataDictionaryDetail;
import com.jxlg.logistic.data.entity.DataDictionaryDetailExample;
import com.jxlg.logistic.data.entity.DataDictionaryDetailExample.Criteria;
import com.jxlg.logistic.data.service.IDataDictionaryDetailService;
import com.jxlg.logistic.delivery.entity.Deliveryspot;
import com.jxlg.logistic.delivery.entity.Handler;
import com.jxlg.logistic.delivery.service.IDeliveryspotService;
import com.jxlg.logistic.delivery.service.IHandlerService;
import com.jxlg.logistic.order.entity.Order;
import com.jxlg.logistic.order.service.IOrderService;
import com.jxlg.logistic.sys.entity.Employee;
import com.jxlg.logistic.sys.service.IEmployeeService;
import com.jxlg.logistic.transport.entity.Car;
import com.jxlg.logistic.transport.service.ICarService;

@RestController
@RequestMapping("/admin/delivery/handler/")
public class HandlerAction {

	@Autowired
	IHandlerService handlerService;
	@Autowired
	IDataDictionaryDetailService dataDictionaryDetailService;
	@Autowired
	IEmployeeService employeeService;
	@Autowired
	IOrderService orderService;
	@Autowired
	IDeliveryspotService deliveryspotService;
	@Autowired
	ICarService carService;

	@GetMapping("page")
	public ModelAndView page() {
		ModelAndView modelAndView = new ModelAndView("admin/delivery/handler_list");
		List<Order> listOrder = orderService.selectByExample(null);
		modelAndView.addObject("listOrder", listOrder);
		DataDictionaryDetailExample example = new DataDictionaryDetailExample();
		Criteria criteria = example.createCriteria();
		criteria.andDictionaryDetailCodeEqualTo(Contants.HANDLER_STATUS);
		List<DataDictionaryDetail> listHandlerStatus = dataDictionaryDetailService.selectByExample(example);
		modelAndView.addObject("listHandlerStatus", listHandlerStatus);
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

		Handler handler = new Handler();
		String orderId = request.getParameter("orderId");
		String handlerStatus = request.getParameter("handlerStatus");
		if (StringUtils.isNotBlank(orderId)) {
			handler.setOrderId(orderId);
		}
		if (StringUtils.isNotBlank(handlerStatus)) {
			handler.setHandlerStatus(handlerStatus);
		}
		List<Handler> listHandler = handlerService.listView(handler);
		PageHelper.startPage(pageNum, pageSize);
		PageInfo<Handler> pageInfo = new PageInfo<>(listHandler);
		Map<String, Object> map = new HashMap<>();
		map.put("total", pageInfo.getTotal());
		map.put("rows", pageInfo.getList());

		return map;
	}

	@RequestMapping("edit")
	public ModelAndView edit(@RequestParam(name = "handlerId", required = false) String handlerId) {
		ModelAndView modelAndView = new ModelAndView("admin/delivery/handler_edit");
		if (StringUtils.isNotBlank(handlerId)) {
			Handler handler = handlerService.selectByPrimaryKey(handlerId);
			modelAndView.addObject("handler", handler);
		} else {

		}

		// TODO
		List<Employee> listEmployee = employeeService.selectByExample(null);
		List<Order> listOrder = orderService.selectByExample(null);
		List<Deliveryspot> listDeliveryspot = deliveryspotService.selectByExample(null);
		List<Car> listCar = carService.selectByExample(null);
		modelAndView.addObject("listEmployee", listEmployee);
		modelAndView.addObject("listOrder", listOrder);
		modelAndView.addObject("listDeliveryspot", listDeliveryspot);
		modelAndView.addObject("listCar", listCar);
		// 交接状态
		DataDictionaryDetailExample example = new DataDictionaryDetailExample();
		Criteria criteria = example.createCriteria();
		criteria.andDictionaryDetailCodeEqualTo(Contants.HANDLER_STATUS);
		List<DataDictionaryDetail> listHandlerStatus = dataDictionaryDetailService.selectByExample(example);
		modelAndView.addObject("listHandlerStatus", listHandlerStatus);
		return modelAndView;
	}

	@RequestMapping("deleteAj")
	public String deleteAj(HttpServletRequest request, HttpServletResponse response) {
		String result = null;
		try {
			String handlerId = request.getParameter("handlerId");
			handlerService.deleteByPrimaryKey(handlerId);
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
			handlerService.deleteRows(ids);
		} catch (Exception ex) {
			result = "删除失败";
		}
		return result;
	}

	@PostMapping("saveAj")
	public String saveAj(Handler handler, HttpServletRequest request, HttpServletResponse response) {
		String result = null;
		try {
			if (!StringUtils.isEmpty(handler.getHandlerId())) {
				handlerService.updateByPrimaryKeySelective(handler);
			} else {
				handlerService.insertSelective(handler);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			result = "保存失败";
		}
		// return "保存失败" ;
		return result;
	}
}
