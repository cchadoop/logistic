package com.jxlg.logistic.module.delivery.queryview;

import com.jxlg.logistic.module.delivery.entity.Deliveryspot;

public class DeliveryspotQueryView extends Deliveryspot{

	private static final long serialVersionUID = 1L;
	
	private String cityName;
	private String empName;
	private String deliveryStatusOptionLabel;
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDeliveryStatusOptionLabel() {
		return deliveryStatusOptionLabel;
	}
	public void setDeliveryStatusOptionLabel(String deliveryStatusOptionLabel) {
		this.deliveryStatusOptionLabel = deliveryStatusOptionLabel;
	}

}
