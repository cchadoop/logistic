package com.jxlg.logistic.delivery.mapper;

import java.util.List;

import com.jxlg.logistic.delivery.condition.DeliveryspotCondition;
import com.jxlg.logistic.delivery.entity.Deliveryspot;

public interface DeliveryspotDaoMapper {
	List<Deliveryspot> listView(DeliveryspotCondition condition);

	List<Deliveryspot> selectByProvinceName(String provinceName);

	Deliveryspot selectByAddr(String deliveryspotAddr);
}
