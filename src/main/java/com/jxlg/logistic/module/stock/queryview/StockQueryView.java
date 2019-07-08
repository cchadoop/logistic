package com.jxlg.logistic.module.stock.queryview;

import com.jxlg.logistic.module.stock.entity.Stock;

public class StockQueryView extends Stock{

	private static final long serialVersionUID = 1L;
	private String cstName;
	private String orderNo;
	private String receiveNo;
	public String getCstName() {
		return cstName;
	}
	public void setCstName(String cstName) {
		this.cstName = cstName;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getReceiveNo() {
		return receiveNo;
	}
	public void setReceiveNo(String receiveNo) {
		this.receiveNo = receiveNo;
	}
	
}
