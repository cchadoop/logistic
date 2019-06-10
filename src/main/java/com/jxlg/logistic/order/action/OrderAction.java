package com.jxlg.logistic.order.action;

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
import com.jxlg.logistic.order.entity.Order;
import com.jxlg.logistic.order.service.IOrderService;

@RestController
@RequestMapping("/admin/order/order/")
public class OrderAction {

	@Autowired
	IOrderService orderService;
	@Autowired
	IDataDictionaryDetailService dataDictionaryDetailService;
	
	@GetMapping("page")
	public ModelAndView page(){
		ModelAndView modelAndView = new ModelAndView("admin/order/order_list");
		return modelAndView;
	}
	@SuppressWarnings("rawtypes")
	@PostMapping("pageAjax")
	public Map pageAjax(@RequestParam("page") String strPage,@RequestParam("rows") String strRows,HttpServletRequest request,HttpServletResponse response){	
		int pageNum = 0 ;
		int pageSize = 10 ;
		
		if(StringUtils.isNotBlank(strPage)) {
			pageNum = Integer.parseInt(strPage) ;
		}
		if(StringUtils.isNotBlank(strRows)) {
			pageSize = Integer.parseInt(strRows) ;
		}
		
		//条件查询
		Order order = new Order();
		String sendName = request.getParameter("sendName");
		String receiveAddr = request.getParameter("receiveAddr");
		if(StringUtils.isNotBlank(sendName)) {
			order.setSendName(sendName);
		}
		if(StringUtils.isNotBlank(receiveAddr)) {
			order.setReceiveAddr(receiveAddr);
		}
		
		PageHelper.startPage(pageNum, pageSize);
		List<Order> listOrder = orderService.listView(order);
		PageInfo<Order> pageInfo  = new PageInfo<>(listOrder);
		Map<String, Object> map = new HashMap<>();
		map.put("total", pageInfo.getTotal());
		map.put("rows", pageInfo.getList());
		
		return map;
	}
	
	@RequestMapping("edit")
	public ModelAndView edit(@RequestParam(name="orderId",required=false)String orderId) {
		ModelAndView modelAndView = new ModelAndView("admin/order/order_edit");
		if(StringUtils.isNotBlank(orderId)) {
			Order order = orderService.selectByPrimaryKey(orderId);
			modelAndView.addObject("order", order);
		}else {
			
		}
		//订单状态
		DataDictionaryDetailExample example = new DataDictionaryDetailExample();
		Criteria criteria = example.createCriteria();
		criteria.andDictionaryDetailCodeEqualTo(Contants.ORDER_STATUS);
		List<DataDictionaryDetail> listOrderStatus = dataDictionaryDetailService.selectByExample(example );
		modelAndView.addObject("listOrderStatus", listOrderStatus);
		return modelAndView;
	}
	
	@RequestMapping("deleteAj")
	public String deleteAj( HttpServletRequest request, HttpServletResponse response) {
		String result = null;
		try {
			String orderId = request.getParameter("orderId") ;
			orderService.deleteByPrimaryKey(orderId);
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
			orderService.deleteRows(ids);
		} catch (Exception ex) {
			result = "删除失败";
		}
		return result;
	}
	
	@PostMapping("saveAj")
	public String saveAj(Order order, HttpServletRequest request, HttpServletResponse response) {
		String result = null ;
		try{
			if(!StringUtils.isEmpty(order.getOrderId())){
				orderService.updateByPrimaryKeySelective(order) ;
			}else{
				orderService.insertSelective(order);
			}
		}catch(Exception ex){
			ex.printStackTrace();
			result = "保存失败" ;
		}
		//return "保存失败" ;
		return result ;
	}
}

