package com.jxlg.logistic.delivery.queryview;

import com.jxlg.logistic.delivery.entity.Handler;

public class HandlerQueryView extends Handler{

	private static final long serialVersionUID = 1L;
	
	private String empName;
	private String orderNo;
	private String deliveryspotNo;
	private String carNo;
	private String handlerStatusOptionLabel;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
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
	public String getCarNo() {
		return carNo;
	}
	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}
	public String getHandlerStatusOptionLabel() {
		return handlerStatusOptionLabel;
	}
	public void setHandlerStatusOptionLabel(String handlerStatusOptionLabel) {
		this.handlerStatusOptionLabel = handlerStatusOptionLabel;
	}
	
}
