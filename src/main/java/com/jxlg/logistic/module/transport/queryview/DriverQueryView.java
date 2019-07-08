package com.jxlg.logistic.module.transport.queryview;

import com.jxlg.logistic.module.transport.entity.Driver;

public class DriverQueryView extends Driver{

	private static final long serialVersionUID = 1L;
	
	private String driverStatusOptionLabel;

	public String getDriverStatusOptionLabel() {
		return driverStatusOptionLabel;
	}

	public void setDriverStatusOptionLabel(String driverStatusOptionLabel) {
		this.driverStatusOptionLabel = driverStatusOptionLabel;
	}
	
}
