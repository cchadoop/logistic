package com.jxlg.logistic.order.service;

import java.util.List;

import com.jxlg.logistic.order.entity.Order;
import com.jxlg.logistic.order.entity.OrderExample;

public interface IOrderService {

    int deleteByPrimaryKey(String orderId);

    int insertSelective(Order record);

    List<Order> selectByExample(OrderExample example);

    Order selectByPrimaryKey(String orderId);

    int updateByPrimaryKeySelective(Order record);
    
    void deleteRows(String[] ids);

	List<Order> listView(Order order);

	Order selectByOrderNo(String orderNo);

}
