package com.jxlg.logistic.module.order.mapper;

import java.util.List;

import com.jxlg.logistic.module.order.condition.OrderDetailCondition;
import com.jxlg.logistic.module.order.entity.OrderDetail;

public interface OrderDetailDaoMapper {
	List<OrderDetail> listView(OrderDetailCondition condition);

	List<OrderDetail> selectByOrderNo(String orderNo);
}
