package com.jxlg.logistic.transport.queryview;

import com.jxlg.logistic.transport.entity.City;

public class CityQueryView extends City{
	private static final long serialVersionUID = 1L;
	private String provinceName;
	public String getProvinceName() {
		return provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}
}
