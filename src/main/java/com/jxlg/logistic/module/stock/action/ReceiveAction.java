package com.jxlg.logistic.module.stock.action;

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
import com.jxlg.logistic.module.data.service.IDataDictionaryDetailService;
import com.jxlg.logistic.module.order.entity.Order;
import com.jxlg.logistic.module.order.service.IOrderService;
import com.jxlg.logistic.module.stock.condition.ReceiveCondition;
import com.jxlg.logistic.module.stock.entity.Receive;
import com.jxlg.logistic.module.stock.service.IReceiveService;

@RestController
@RequestMapping("/admin/stock/receive/")
public class ReceiveAction {

	@Autowired
	IReceiveService receiveService;
	@Autowired
	IOrderService orderService;
	@Autowired
	IDataDictionaryDetailService dataDictionaryDetailService;

	@GetMapping("page")
	public ModelAndView page() {
		ModelAndView modelAndView = new ModelAndView("admin/stock/receive_list");
		List<Order> listOrder = orderService.selectByExample(null);
		modelAndView.addObject("listOrder", listOrder);
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
		ReceiveCondition condition = new ReceiveCondition();
		String orderId = request.getParameter("orderId");
		String minDateStr = request.getParameter("minDate");
		String maxDateStr = request.getParameter("maxDate");
		DateConverter dateConverter = new DateConverter();
		if (StringUtils.isNotBlank(orderId)) {
			condition.setOrderId(orderId);
		}
		if (StringUtils.isNotBlank(minDateStr) && StringUtils.isNotBlank(maxDateStr)) {
			Date minDate = dateConverter.convert(minDateStr);
			condition.setMinDate(minDate);
			Date maxDate = dateConverter.convert(maxDateStr);
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

		List<Receive> listReceive = receiveService.listView(condition);
		PageInfo<Receive> pageInfo = new PageInfo<>(listReceive);
		Map<String, Object> map = new HashMap<>();
		map.put("total", pageInfo.getTotal());
		map.put("rows", pageInfo.getList());

		return map;
	}

	@RequestMapping("edit")
	public ModelAndView edit(@RequestParam(name = "receiveId", required = false) String receiveId) {
		ModelAndView modelAndView = new ModelAndView("admin/stock/receive_edit");
		if (StringUtils.isNotBlank(receiveId)) {
			Receive receive = receiveService.selectByPrimaryKey(receiveId);
			modelAndView.addObject("receive", receive);
		} else {

		}
		// 收货状态
		List<Order> listOrder = orderService.selectByExample(null);
		modelAndView.addObject("listOrder", listOrder);

		DataDictionaryDetailExample exampleReceiveStatus = new DataDictionaryDetailExample();
		com.jxlg.logistic.module.data.entity.DataDictionaryDetailExample.Criteria criteria = exampleReceiveStatus
				.createCriteria();
		criteria.andDictionaryDetailCodeEqualTo(Contants.RECEIVE_STATUS);
		List<DataDictionaryDetail> listReceiveStatus = dataDictionaryDetailService
				.selectByExample(exampleReceiveStatus);
		modelAndView.addObject("listReceiveStatus", listReceiveStatus);

		// 收货方式
		DataDictionaryDetailExample exampleReceiveWay = new DataDictionaryDetailExample();
		criteria = exampleReceiveWay.createCriteria();
		criteria.andDictionaryDetailCodeEqualTo(Contants.RECEIVE_WAY);
		List<DataDictionaryDetail> listReceiveWay = dataDictionaryDetailService.selectByExample(exampleReceiveWay);
		modelAndView.addObject("listReceiveWay", listReceiveWay);
		return modelAndView;
	}

	@RequestMapping("deleteAj")
	public String deleteAj(HttpServletRequest request, HttpServletResponse response) {
		String result = null;
		try {
			String receiveId = request.getParameter("receiveId");
			receiveService.deleteByPrimaryKey(receiveId);
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
			receiveService.deleteRows(ids);
		} catch (Exception ex) {
			result = "删除失败";
		}
		return result;
	}

	@PostMapping("saveAj")
	public String saveAj(Receive receive, HttpServletRequest request, HttpServletResponse response) {
		String result = null;
		try {
			if (!StringUtils.isEmpty(receive.getReceiveId())) {
				receiveService.updateByPrimaryKeySelective(receive);
			} else {
				receiveService.insertSelective(receive);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			result = "保存失败";
		}
		// return "保存失败" ;
		return result;
	}
}
