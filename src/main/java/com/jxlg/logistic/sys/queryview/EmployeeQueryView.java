package com.jxlg.logistic.sys.queryview;

import com.jxlg.logistic.sys.entity.Employee;

public class EmployeeQueryView extends Employee{
	
	private static final long serialVersionUID = 1L;

	private String workOptionLabel;
	
	private String marryOptionLabel;

	public String getWorkOptionLabel() {
		return workOptionLabel;
	}

	public void setWorkOptionLabel(String workOptionLabel) {
		this.workOptionLabel = workOptionLabel;
	}

	public String getMarryOptionLabel() {
		return marryOptionLabel;
	}

	public void setMarryOptionLabel(String marryOptionLabel) {
		this.marryOptionLabel = marryOptionLabel;
	}
	
}
