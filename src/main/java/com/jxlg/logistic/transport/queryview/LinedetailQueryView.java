package com.jxlg.logistic.transport.queryview;

import com.jxlg.logistic.transport.entity.Linedetail;

public class LinedetailQueryView extends Linedetail{

	private static final long serialVersionUID = 1L;
	
	private String lineNo;
	private String deliveryspotNo;
	public String getLineNo() {
		return lineNo;
	}
	public void setLineNo(String lineNo) {
		this.lineNo = lineNo;
	}
	public String getDeliveryspotNo() {
		return deliveryspotNo;
	}
	public void setDeliveryspotNo(String deliveryspotNo) {
		this.deliveryspotNo = deliveryspotNo;
	}

}
