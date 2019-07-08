package com.jxlg.logistic.module.delivery.mapper;

import java.util.List;

import com.jxlg.logistic.module.delivery.condition.DeliveryspotCondition;
import com.jxlg.logistic.module.delivery.entity.Deliveryspot;

public interface DeliveryspotDaoMapper {
	List<Deliveryspot> listView(DeliveryspotCondition condition);

	List<Deliveryspot> selectByProvinceName(String provinceName);

	Deliveryspot selectByAddr(String deliveryspotAddr);
}
