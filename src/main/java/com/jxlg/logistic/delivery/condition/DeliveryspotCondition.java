package com.jxlg.logistic.delivery.condition;

import java.util.Date;

import com.jxlg.logistic.delivery.entity.Deliveryspot;

public class DeliveryspotCondition extends Deliveryspot{

	private static final long serialVersionUID = 1L;
	
	private Date minDate;
	
	private Date maxDate;

	public Date getMinDate() {
		return minDate;
	}

	public void setMinDate(Date minDate) {
		this.minDate = minDate;
	}

	public Date getMaxDate() {
		return maxDate;
	}

	public void setMaxDate(Date maxDate) {
		this.maxDate = maxDate;
	}

}
