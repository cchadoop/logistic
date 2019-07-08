package com.jxlg.logistic.front.index;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jxlg.logistic.module.delivery.entity.Deliveryspot;
import com.jxlg.logistic.module.delivery.service.IDeliveryspotService;
import com.jxlg.logistic.module.order.entity.Order;
import com.jxlg.logistic.module.order.entity.OrderDetail;
import com.jxlg.logistic.module.order.service.IOrderDetailService;
import com.jxlg.logistic.module.order.service.IOrderService;
import com.jxlg.logistic.module.sys.entity.Custom;
import com.jxlg.logistic.module.sys.service.ICustomService;
import com.jxlg.logistic.module.transport.entity.City;
import com.jxlg.logistic.module.transport.service.ICityService;

@Controller
@RequestMapping("/front/")
public class FrontAction {
	@Autowired
	private ICustomService customService;
	@Autowired
	private IOrderService orderService;
	@Autowired
	private IOrderDetailService orderDetailService;
	@Autowired
	private IDeliveryspotService deliveryspotService;
	@Autowired
	private ICityService cityService;

	@RequestMapping("index")
	public String index(HttpSession session) {
		return "front/index";
	}

	@RequestMapping("about")
	public String about() {
		return "front/about";
	}

	@RequestMapping("news")
	public String news() {
		return "front/news";
	}

	@RequestMapping("websit")
	public String website(HttpServletRequest request, HttpServletResponse response) {
		List<Deliveryspot> listDeliveryspot = deliveryspotService.listView(null);
		request.setAttribute("listDeliveryspot", listDeliveryspot);
		return "front/websit";
	}

	@RequestMapping("websitSearch")
	public String websitSearch(HttpServletRequest request, HttpServletResponse response) {
		String provinceName = request.getParameter("provinceName");
		List<Deliveryspot> listDeliveryspot = deliveryspotService.selectByProvinceName(provinceName);
		request.setAttribute("listDeliveryspot", listDeliveryspot);
		request.setAttribute("provinceName", provinceName);
		return "front/websitSearch";
	}

	@RequestMapping("userServer")
	public String userServer() {
		return "front/userServer";
	}

	@RequestMapping("recruit")
	public String recruit() {
		return "front/recruit";
	}

	@RequestMapping("search")
	public String search(@RequestParam("orderNo") String orderNo, HttpServletRequest request,
			HttpServletResponse response) {
		// 订单搜索
		Order order = orderService.selectByOrderNo(orderNo);
		request.setAttribute("order", order);
		// 订单详情搜索
		List<OrderDetail> listOrderDetail = orderDetailService.selectByOrderNo(orderNo);
		request.setAttribute("listOrderDetail", listOrderDetail);
		return "front/search";
	}

	@RequestMapping("placeOrder")
	public String placeOrder() {
		return "front/placeOrder";
	}

	@RequestMapping("placeOrderSuccess")
	@ResponseBody
	public String placeOrderSuccess(Order order, OrderDetail orderDetail) {
		String result = null;
		Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddhhmm");
		String orderNo = df.format(date);
		order.setOrderNo(orderNo);
		orderService.insertSelective(order);

		String orderId = order.getOrderId();
		orderDetail.setOrderId(orderId);
		orderDetailService.insertSelective(orderDetail);
		return result;
	}

	@RequestMapping("searchPrice")
	public String searchPrice(HttpServletRequest request, HttpServletResponse response,HttpSession session) {
		List<City> listCity = cityService.selectByExample(null);
		request.setAttribute("listCity", listCity);
		List<Deliveryspot> listDeliveryspot = deliveryspotService.selectByExample(null);
		request.setAttribute("listDeliveryspot", listDeliveryspot);
		return "front/searchPrice";
	}
	
	@RequestMapping("searchPriceResult")
	@ResponseBody
	public BigDecimal searchPriceResult(HttpServletRequest request, HttpServletResponse response) throws Exception{
		//计算价格，得到配送点信息
		BigDecimal result = new BigDecimal(0);
		String deliveryspotAddr = request.getParameter("deliveryspotAddr");
		String weight = request.getParameter("weight");
		String volume = request.getParameter("volume");
		BigDecimal decimalWeight = new BigDecimal(weight);
		BigDecimal decimalVolume = new BigDecimal(volume);
		Deliveryspot deliveryspot =deliveryspotService.selectByAddr(deliveryspotAddr);
		BigDecimal firstWeightScope = deliveryspot.getFirstWeightScope();
		BigDecimal firstWeightPrice = deliveryspot.getFirstWeightPrice();
		BigDecimal secondWeightRate = deliveryspot.getSecondWeightRate();
		BigDecimal firstVolumeScope = deliveryspot.getFirstVolumeScope();
		BigDecimal firstVolumePrice = deliveryspot.getFirstVolumePrice();
		BigDecimal secondVolumeRate = deliveryspot.getSecondVolumeRate();
		if(decimalVolume.compareTo(new BigDecimal(1))>=0) {
			//体积大于1m³，按体积标准计算
			result = firstVolumePrice.add(decimalVolume.subtract(firstVolumeScope).multiply(secondVolumeRate));
		}else {
			//按重量计算
			if(decimalWeight.compareTo(firstWeightScope)<=0) {
				result = firstWeightPrice;
			}else {
				result = firstWeightPrice.add(decimalWeight.subtract(firstWeightScope).multiply(secondWeightRate));
			}
		}
		result.setScale(2);	
		return result;
	}
	
	@RequestMapping("login")
	public String login() {
		return "front/login";
	}
	@RequestMapping("register")
	public String register() {
		return "front/register";
	}
	
	@RequestMapping("checkLogin")
	@ResponseBody
	public String checkLogin(HttpServletRequest request, HttpServletResponse response,HttpSession session) {
		String result = "";
		String code = request.getParameter("account");
		String password = request.getParameter("password");
		Custom custom = customService.selectByAccountAndPwd(code,password);
		if(null==custom) {
			result="账号"+code+"登录失败";
		}else {
			session.setAttribute("custom", custom);
		}
		return result;
	}
	@RequestMapping("close")
	public String close(HttpSession session) {
		session.setAttribute("custom", null);
		return "front/index";
	}
	@RequestMapping("checkRegister")
	@ResponseBody
	public String checkRegister(HttpServletRequest request) {
		String result = "";
		String code = request.getParameter("code");
		Custom custom = customService.checkCustom(code);
		if (StringUtils.isEmpty(custom)) {
			result = "";
		} else {
			result = "账号已存在，请重新申请";
		}
		return result;
	}
	
	@RequestMapping("saveCustom")
	@ResponseBody
	public String saveCustom(Custom custom, HttpServletRequest request) {
		String result = "";
		String flag = request.getParameter("checkbox");
		int count = 0;
		if ("on".equals(flag)) {
			Date createTime = new Date();
			custom.setCreateTime(createTime);
			count = customService.insertSelective(custom);
		}
		if (count > 0) {
			// 注册成功
			result = "注册成功";
		}
		return result;
	}
}
