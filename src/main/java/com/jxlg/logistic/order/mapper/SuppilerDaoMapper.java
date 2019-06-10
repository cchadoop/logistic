package com.jxlg.logistic.order.mapper;

import java.util.List;

import com.jxlg.logistic.order.entity.Suppiler;

public interface SuppilerDaoMapper {
	
	List<Suppiler> listView(Suppiler suppiler);
}
