package com.jxlg.logistic.order.mapper;

import java.util.List;

import com.jxlg.logistic.order.condition.OrderDetailCondition;
import com.jxlg.logistic.order.entity.OrderDetail;

public interface OrderDetailDaoMapper {
	List<OrderDetail> listView(OrderDetailCondition condition);

	List<OrderDetail> selectByOrderNo(String orderNo);
}
