package com.jxlg.logistic.module.stock.mapper;

import java.util.List;

import com.jxlg.logistic.module.stock.condition.ReceiveCondition;
import com.jxlg.logistic.module.stock.entity.Receive;

public interface ReceiveDaoMapper {

	List<Receive> listView(ReceiveCondition condition);

}
