package com.jxlg.logistic.delivery.service;

import java.util.List;

import com.jxlg.logistic.delivery.condition.DeliveryspotCondition;
import com.jxlg.logistic.delivery.entity.Deliveryspot;
import com.jxlg.logistic.delivery.entity.DeliveryspotExample;

public interface IDeliveryspotService {

    int deleteByPrimaryKey(String deliveryspotId);

    int insertSelective(Deliveryspot record);

    List<Deliveryspot> selectByExample(DeliveryspotExample example);

    Deliveryspot selectByPrimaryKey(String deliveryspotId);

    int updateByPrimaryKeySelective(Deliveryspot record);
    
    void deleteRows(String[] ids);

	List<Deliveryspot> listView(DeliveryspotCondition condition);

	List<Deliveryspot> selectByProvinceName(String provinceName);

	Deliveryspot selectByAddr(String deliveryspotAddr);
}
