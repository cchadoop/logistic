package com.jxlg.logistic.order.action;

import java.math.BigDecimal;
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
import com.jxlg.logistic.delivery.entity.Deliveryspot;
import com.jxlg.logistic.delivery.service.IDeliveryspotService;
import com.jxlg.logistic.order.condition.OrderDetailCondition;
import com.jxlg.logistic.order.entity.Order;
import com.jxlg.logistic.order.entity.OrderDetail;
import com.jxlg.logistic.order.entity.Suppiler;
import com.jxlg.logistic.order.service.IOrderDetailService;
import com.jxlg.logistic.order.service.IOrderService;
import com.jxlg.logistic.order.service.ISuppilerService;

@RestController
@RequestMapping("/admin/order/orderdetail/")
public class OrderDetailAction {

	@Autowired
	IOrderDetailService orderdetailService;

	// 三个下拉列表外键关联
	@Autowired
	IOrderService orderService;
	@Autowired
	ISuppilerService suppilerService;
	@Autowired
	IDeliveryspotService deliveryspotService;

	@GetMapping("page")
	public ModelAndView page() {
		ModelAndView modelAndView = new ModelAndView("admin/order/orderdetail_list");
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

		OrderDetailCondition condition = new OrderDetailCondition();
		// 条件查询
		String goodsName = request.getParameter("goodsName");
		if (StringUtils.isNotBlank(goodsName)) {
			condition.setGoodsName(goodsName);
		}
		String minPriceStr = request.getParameter("minPrice");
		String maxPriceStr = request.getParameter("maxPrice");

		if (StringUtils.isNotBlank(minPriceStr) && StringUtils.isNotBlank(maxPriceStr)) {
			BigDecimal minPrice = new BigDecimal(minPriceStr);
			minPrice = minPrice.setScale(1, BigDecimal.ROUND_HALF_UP);
			BigDecimal maxPrice = new BigDecimal(maxPriceStr);
			maxPrice = maxPrice.setScale(1, BigDecimal.ROUND_HALF_UP);
			condition.setMaxPrice(maxPrice);
			condition.setMinPrice(minPrice);
		}
		if (StringUtils.isBlank(minPriceStr) && StringUtils.isNotBlank(maxPriceStr)) {
			BigDecimal maxPrice = new BigDecimal(maxPriceStr);
			maxPrice = maxPrice.setScale(1, BigDecimal.ROUND_HALF_UP);
			condition.setMaxPrice(maxPrice);
		}
		if (StringUtils.isNotBlank(minPriceStr) && StringUtils.isBlank(maxPriceStr)) {
			BigDecimal minPrice = new BigDecimal(minPriceStr);
			minPrice = minPrice.setScale(1, BigDecimal.ROUND_HALF_UP);
			condition.setMinPrice(minPrice);
		}
		List<OrderDetail> listOrderDetail = orderdetailService.listView(condition);
		PageInfo<OrderDetail> pageInfo = new PageInfo<>(listOrderDetail);
		Map<String, Object> map = new HashMap<>();
		map.put("total", pageInfo.getTotal());
		map.put("rows", pageInfo.getList());

		return map;
	}

	@RequestMapping("edit")
	public ModelAndView edit(@RequestParam(name = "orderdetailId", required = false) String orderdetailId) {
		ModelAndView modelAndView = new ModelAndView("admin/order/orderdetail_edit");
		if (StringUtils.isNotBlank(orderdetailId)) {
			OrderDetail orderdetail = orderdetailService.selectByPrimaryKey(orderdetailId);
			modelAndView.addObject("orderdetail", orderdetail);
		} else {

		}

		// 三个下拉列表
		List<Order> listOrder = orderService.selectByExample(null);
		List<Suppiler> listSuppiler = suppilerService.selectByExample(null);
		List<Deliveryspot> listDeliveryspot = deliveryspotService.selectByExample(null);
		Map<String, Object> modelMap = new HashMap<String, Object>();
		modelMap.put("listOrder", listOrder);
		modelMap.put("listSuppiler", listSuppiler);
		modelMap.put("listDeliveryspot", listDeliveryspot);
		modelAndView.addObject("modelMap", modelMap);
		return modelAndView;
	}

	@RequestMapping("deleteAj")
	public String deleteAj(HttpServletRequest request, HttpServletResponse response) {
		String result = null;
		try {
			String orderdetailId = request.getParameter("orderdetailId");
			orderdetailService.deleteByPrimaryKey(orderdetailId);
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
			orderdetailService.deleteRows(ids);
		} catch (Exception ex) {
			result = "删除失败";
		}
		return result;
	}

	@PostMapping("saveAj")
	public String saveAj(OrderDetail orderdetail, HttpServletRequest request, HttpServletResponse response) {
		String result = null;
		try {
			if (!StringUtils.isEmpty(orderdetail.getOrderdetailId())) {
				orderdetailService.updateByPrimaryKeySelective(orderdetail);
			} else {
				orderdetailService.insertSelective(orderdetail);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			result = "保存失败";
		}
		// return "保存失败" ;
		return result;
	}
}
