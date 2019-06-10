package com.jxlg.logistic.stock.queryview;

import com.jxlg.logistic.stock.entity.Receive;

public class ReceiveQueryView extends Receive{

	private static final long serialVersionUID = 1L;
	private String orderNo;
	private String receiveStatusOptionLabel;
	private String receiveWayOptionLabel;
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getReceiveStatusOptionLabel() {
		return receiveStatusOptionLabel;
	}
	public void setReceiveStatusOptionLabel(String receiveStatusOptionLabel) {
		this.receiveStatusOptionLabel = receiveStatusOptionLabel;
	}
	public String getReceiveWayOptionLabel() {
		return receiveWayOptionLabel;
	}
	public void setReceiveWayOptionLabel(String receiveWayOptionLabel) {
		this.receiveWayOptionLabel = receiveWayOptionLabel;
	}

}
