package com.jxlg.logistic.order.queryview;

import com.jxlg.logistic.order.entity.Order;

public class OrderQueryView extends Order{
	private static final long serialVersionUID = 1L;
	
	private String orderStatusOptionLabel;

	public String getOrderStatusOptionLabel() {
		return orderStatusOptionLabel;
	}

	public void setOrderStatusOptionLabel(String orderStatusOptionLabel) {
		this.orderStatusOptionLabel = orderStatusOptionLabel;
	}
	
}
