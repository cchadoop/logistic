package com.jxlg.logistic.order.queryview;

import com.jxlg.logistic.order.entity.Suppiler;

public class SuppilerQueryView extends Suppiler{

	private static final long serialVersionUID = 1L;
	
	private String suppilerTypeOptionLabel;
	
	private String isvailOptionLabel;
	
	private String isdelOptionLabel;

	public String getIsvailOptionLabel() {
		return isvailOptionLabel;
	}

	public void setIsvailOptionLabel(String isvailOptionLabel) {
		this.isvailOptionLabel = isvailOptionLabel;
	}

	public String getIsdelOptionLabel() {
		return isdelOptionLabel;
	}

	public void setIsdelOptionLabel(String isdelOptionLabel) {
		this.isdelOptionLabel = isdelOptionLabel;
	}

	public String getSuppilerTypeOptionLabel() {
		return suppilerTypeOptionLabel;
	}

	public void setSuppilerTypeOptionLabel(String suppilerTypeOptionLabel) {
		this.suppilerTypeOptionLabel = suppilerTypeOptionLabel;
	}
	
}
