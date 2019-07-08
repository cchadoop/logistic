package com.jxlg.logistic.module.order.mapper;

import java.util.List;

import com.jxlg.logistic.module.order.entity.Order;

public interface OrderDaoMapper {
	List<Order> listView(Order order);

	Order selectByOrderNo(String orderNo);
}
