package com.jxlg.logistic.stock.mapper;

import java.util.List;

import com.jxlg.logistic.stock.condition.ReceiveCondition;
import com.jxlg.logistic.stock.entity.Receive;

public interface ReceiveDaoMapper {

	List<Receive> listView(ReceiveCondition condition);

}
