package com.jxlg.logistic.order.queryview;

import com.jxlg.logistic.order.entity.OrderDetail;

public class OrderDetailQueryView extends OrderDetail{
	private static final long serialVersionUID = 1L;
	
	private String orderNo;
	
	private String deliveryspotNo;
	
	private String suppilerNo;

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getDeliveryspotNo() {
		return deliveryspotNo;
	}

	public void setDeliveryspotNo(String deliveryspotNo) {
		this.deliveryspotNo = deliveryspotNo;
	}

	public String getSuppilerNo() {
		return suppilerNo;
	}

	public void setSuppilerNo(String suppilerNo) {
		this.suppilerNo = suppilerNo;
	}

}
