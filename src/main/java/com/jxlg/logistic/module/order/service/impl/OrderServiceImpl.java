package com.jxlg.logistic.module.order.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jxlg.logistic.module.order.entity.Order;
import com.jxlg.logistic.module.order.entity.OrderExample;
import com.jxlg.logistic.module.order.mapper.OrderDaoMapper;
import com.jxlg.logistic.module.order.mapper.OrderMapper;
import com.jxlg.logistic.module.order.service.IOrderService;

@Service
public class OrderServiceImpl implements IOrderService{
	
	@Autowired
	OrderMapper orderMapper;
	@Autowired
	OrderDaoMapper orderDaoMapper;

	@Override
	public int deleteByPrimaryKey(String orderId) {
		return orderMapper.deleteByPrimaryKey(orderId);
	}

	@Override
	public int insertSelective(Order record) {
		String orderId = UUID.randomUUID().toString().replaceAll("-", "");
		record.setOrderId(orderId);
		return orderMapper.insertSelective(record);
	}

	@Override
	public List<Order> selectByExample(OrderExample example) {
		return orderMapper.selectByExample(example);
	}

	@Override
	public Order selectByPrimaryKey(String orderId) {
		return orderMapper.selectByPrimaryKey(orderId);
	}

	@Override
	public int updateByPrimaryKeySelective(Order record) {
		return orderMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public void deleteRows(String[] ids) {
		for (String orderId : ids) {
			deleteByPrimaryKey(orderId);
		}
	}

	@Override
	public List<Order> listView(Order order) {
		return orderDaoMapper.listView(order);
	}

	@Override
	public Order selectByOrderNo(String orderNo) {
		return orderDaoMapper.selectByOrderNo(orderNo);
	}

}
