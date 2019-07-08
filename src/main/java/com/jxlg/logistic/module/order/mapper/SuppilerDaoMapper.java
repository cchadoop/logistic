package com.jxlg.logistic.module.order.mapper;

import java.util.List;

import com.jxlg.logistic.module.order.entity.Suppiler;

public interface SuppilerDaoMapper {
	
	List<Suppiler> listView(Suppiler suppiler);
}
