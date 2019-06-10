package com.jxlg.logistic.stock.action;

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
import com.jxlg.logistic.order.entity.Order;
import com.jxlg.logistic.order.service.IOrderService;
import com.jxlg.logistic.stock.entity.Receive;
import com.jxlg.logistic.stock.entity.Stock;
import com.jxlg.logistic.stock.service.IReceiveService;
import com.jxlg.logistic.stock.service.IStockService;
import com.jxlg.logistic.sys.entity.Custom;
import com.jxlg.logistic.sys.service.ICustomService;

@RestController
@RequestMapping("/admin/stock/stock/")
public class StockAction {

	@Autowired
	IStockService stockService;
	@Autowired
	ICustomService customService;
	@Autowired
	IOrderService orderService;
	@Autowired
	IReceiveService receiveService;

	@GetMapping("page")
	public ModelAndView page() {
		ModelAndView modelAndView = new ModelAndView("admin/stock/stock_list");
		List<Custom> listCustom = customService.selectByExample(null);
		List<Order> listOrder = orderService.selectByExample(null);
		List<Receive> listReceive = receiveService.selectByExample(null);
		modelAndView.addObject("listCustom", listCustom);
		modelAndView.addObject("listOrder", listOrder);
		modelAndView.addObject("listReceive", listReceive);
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
		Stock stock = new Stock();
		String cstId = request.getParameter("cstId");
		String orderId = request.getParameter("orderId");
		String receiveId = request.getParameter("receiveId");
		if (StringUtils.isNotBlank(cstId)) {
			stock.setCstId(cstId);
		}
		if (StringUtils.isNotBlank(orderId)) {
			stock.setOrderId(orderId);
		}
		if (StringUtils.isNotBlank(receiveId)) {
			stock.setReceiveId(receiveId);
		}
		List<Stock> listStock = stockService.listView(stock);
		PageInfo<Stock> pageInfo = new PageInfo<>(listStock);
		Map<String, Object> map = new HashMap<>();
		map.put("total", pageInfo.getTotal());
		map.put("rows", pageInfo.getList());

		return map;
	}

	@RequestMapping("edit")
	public ModelAndView edit(@RequestParam(name = "stockId", required = false) String stockId) {
		ModelAndView modelAndView = new ModelAndView("admin/stock/stock_edit");
		if (StringUtils.isNotBlank(stockId)) {
			Stock stock = stockService.selectByPrimaryKey(stockId);
			modelAndView.addObject("stock", stock);
		} else {

		}
		// 下拉列表
		List<Custom> listCustom = customService.selectByExample(null);
		List<Order> listOrder = orderService.selectByExample(null);
		List<Receive> listReceive = receiveService.selectByExample(null);
		modelAndView.addObject("listCustom", listCustom);
		modelAndView.addObject("listOrder", listOrder);
		modelAndView.addObject("listReceive", listReceive);
		return modelAndView;
	}

	@RequestMapping("deleteAj")
	public String deleteAj(HttpServletRequest request, HttpServletResponse response) {
		String result = null;
		try {
			String stockId = request.getParameter("stockId");
			stockService.deleteByPrimaryKey(stockId);
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
			stockService.deleteRows(ids);
		} catch (Exception ex) {
			result = "删除失败";
		}
		return result;
	}

	@PostMapping("saveAj")
	public String saveAj(Stock stock, HttpServletRequest request, HttpServletResponse response) {
		String result = null;
		try {
			if (!StringUtils.isEmpty(stock.getStockId())) {
				stockService.updateByPrimaryKeySelective(stock);
			} else {
				stockService.insertSelective(stock);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			result = "保存失败";
		}
		// return "保存失败" ;
		return result;
	}
}
