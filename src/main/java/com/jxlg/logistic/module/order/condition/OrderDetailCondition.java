package com.jxlg.logistic.module.order.condition;

import java.math.BigDecimal;

import com.jxlg.logistic.module.order.entity.OrderDetail;

public class OrderDetailCondition extends OrderDetail{

	private static final long serialVersionUID = 1L;
	
	private BigDecimal minPrice;
	
	private BigDecimal maxPrice;

	public BigDecimal getMinPrice() {
		return minPrice;
	}

	public void setMinPrice(BigDecimal minPrice) {
		this.minPrice = minPrice;
	}

	public BigDecimal getMaxPrice() {
		return maxPrice;
	}

	public void setMaxPrice(BigDecimal maxPrice) {
		this.maxPrice = maxPrice;
	}

}
