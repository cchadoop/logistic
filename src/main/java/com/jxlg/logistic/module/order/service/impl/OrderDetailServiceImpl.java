package com.jxlg.logistic.module.order.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jxlg.logistic.module.order.condition.OrderDetailCondition;
import com.jxlg.logistic.module.order.entity.OrderDetail;
import com.jxlg.logistic.module.order.entity.OrderDetailExample;
import com.jxlg.logistic.module.order.mapper.OrderDetailDaoMapper;
import com.jxlg.logistic.module.order.mapper.OrderDetailMapper;
import com.jxlg.logistic.module.order.service.IOrderDetailService;

@Service
public class OrderDetailServiceImpl implements IOrderDetailService{
	
	@Autowired
	OrderDetailMapper orderDetailMapper;
	@Autowired
	OrderDetailDaoMapper orderDetailDaoMapper;

	@Override
	public int deleteByPrimaryKey(String orderdetailId) {
		return orderDetailMapper.deleteByPrimaryKey(orderdetailId);
	}

	@Override
	public int insertSelective(OrderDetail record) {
		String orderdetailId = UUID.randomUUID().toString().replaceAll("-", "");
		record.setOrderdetailId(orderdetailId);
		return orderDetailMapper.insertSelective(record);
	}

	@Override
	public List<OrderDetail> selectByExample(OrderDetailExample example) {
		return orderDetailMapper.selectByExample(example);
	}

	@Override
	public OrderDetail selectByPrimaryKey(String orderdetailId) {
		return orderDetailMapper.selectByPrimaryKey(orderdetailId);
	}

	@Override
	public int updateByPrimaryKeySelective(OrderDetail record) {
		return orderDetailMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public void deleteRows(String[] ids) {
		for (String orderdetailId : ids) {
			deleteByPrimaryKey(orderdetailId);
		}
	}

	@Override
	public List<OrderDetail> listView(OrderDetailCondition condition) {
		return orderDetailDaoMapper.listView(condition);
	}

	@Override
	public List<OrderDetail> selectByOrderNo(String orderNo) {
		return orderDetailDaoMapper.selectByOrderNo(orderNo);
	}
}
