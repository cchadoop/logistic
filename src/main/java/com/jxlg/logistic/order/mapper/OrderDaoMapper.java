package com.jxlg.logistic.order.mapper;

import java.util.List;

import com.jxlg.logistic.order.entity.Order;

public interface OrderDaoMapper {
	List<Order> listView(Order order);

	Order selectByOrderNo(String orderNo);
}
