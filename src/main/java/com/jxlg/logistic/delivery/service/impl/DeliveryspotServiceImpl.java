package com.jxlg.logistic.delivery.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jxlg.logistic.delivery.condition.DeliveryspotCondition;
import com.jxlg.logistic.delivery.entity.Deliveryspot;
import com.jxlg.logistic.delivery.entity.DeliveryspotExample;
import com.jxlg.logistic.delivery.mapper.DeliveryspotDaoMapper;
import com.jxlg.logistic.delivery.mapper.DeliveryspotMapper;
import com.jxlg.logistic.delivery.service.IDeliveryspotService;

@Service
public class DeliveryspotServiceImpl implements IDeliveryspotService{
	
	@Autowired
	DeliveryspotMapper deliveryspotMapper;
	@Autowired
	DeliveryspotDaoMapper deliveryspotDaoMapper;

	@Override
	public int deleteByPrimaryKey(String deliveryspotId) {
		return deliveryspotMapper.deleteByPrimaryKey(deliveryspotId);
	}

	@Override
	public int insertSelective(Deliveryspot record) {
		String deliveryspotId = UUID.randomUUID().toString().replaceAll("-", "");
		record.setDeliveryspotId(deliveryspotId);
		return deliveryspotMapper.insertSelective(record);
	}

	@Override
	public List<Deliveryspot> selectByExample(DeliveryspotExample example) {
		return deliveryspotMapper.selectByExample(example);
	}

	@Override
	public Deliveryspot selectByPrimaryKey(String deliveryspotId) {
		return deliveryspotMapper.selectByPrimaryKey(deliveryspotId);
	}

	@Override
	public int updateByPrimaryKeySelective(Deliveryspot record) {
		return deliveryspotMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public void deleteRows(String[] ids) {
		for (String deliveryspotId : ids) {
			deleteByPrimaryKey(deliveryspotId);
		}
	}

	@Override
	public List<Deliveryspot> listView(DeliveryspotCondition condition) {
		return deliveryspotDaoMapper.listView(condition);
	}

	@Override
	public List<Deliveryspot> selectByProvinceName(String provinceName) {
		return deliveryspotDaoMapper.selectByProvinceName(provinceName);
	}

	@Override
	public Deliveryspot selectByAddr(String deliveryspotAddr) {
		return deliveryspotDaoMapper.selectByAddr(deliveryspotAddr);
	}
}
