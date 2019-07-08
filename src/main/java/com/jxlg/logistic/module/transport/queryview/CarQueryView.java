package com.jxlg.logistic.module.transport.queryview;

import com.jxlg.logistic.module.transport.entity.Car;

public class CarQueryView extends Car{
	private static final long serialVersionUID = 1L;
	private String cartypeName;
	private String lineNo;
	private String driverName;
	private String carStatusOptionLabel;
	public String getCartypeName() {
		return cartypeName;
	}
	public void setCartypeName(String cartypeName) {
		this.cartypeName = cartypeName;
	}
	public String getLineNo() {
		return lineNo;
	}
	public void setLineNo(String lineNo) {
		this.lineNo = lineNo;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public String getCarStatusOptionLabel() {
		return carStatusOptionLabel;
	}
	public void setCarStatusOptionLabel(String carStatusOptionLabel) {
		this.carStatusOptionLabel = carStatusOptionLabel;
	}
	
}
