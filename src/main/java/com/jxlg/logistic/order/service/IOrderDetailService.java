package com.jxlg.logistic.order.service;

import java.util.List;

import com.jxlg.logistic.order.condition.OrderDetailCondition;
import com.jxlg.logistic.order.entity.OrderDetail;
import com.jxlg.logistic.order.entity.OrderDetailExample;

public interface IOrderDetailService {

    int deleteByPrimaryKey(String orderdetailId);

    int insertSelective(OrderDetail record);

    List<OrderDetail> selectByExample(OrderDetailExample example);

    OrderDetail selectByPrimaryKey(String orderdetailId);

    int updateByPrimaryKeySelective(OrderDetail record);
    
    void deleteRows(String[] ids);

	List<OrderDetail> listView(OrderDetailCondition condition);

	List<OrderDetail> selectByOrderNo(String orderNo);

}
