package com.jxlg.logistic.module.stock.mapper;

import java.util.List;

import com.jxlg.logistic.module.stock.entity.Stock;

public interface StockDaoMapper {

	List<Stock> listView(Stock stock);

}
