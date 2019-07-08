package com.jxlg.logistic.module.stock.service;

import java.util.List;

import com.jxlg.logistic.module.stock.condition.ReceiveCondition;
import com.jxlg.logistic.module.stock.entity.Receive;
import com.jxlg.logistic.module.stock.entity.ReceiveExample;

public interface IReceiveService {

    int deleteByPrimaryKey(String receiveId);

    int insertSelective(Receive record);

    List<Receive> selectByExample(ReceiveExample example);

    Receive selectByPrimaryKey(String receiveId);

    int updateByPrimaryKeySelective(Receive record);

    void deleteRows(String[] ids);

	List<Receive> listView(ReceiveCondition condition);
}
