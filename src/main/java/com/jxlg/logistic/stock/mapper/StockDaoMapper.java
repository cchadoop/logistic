package com.jxlg.logistic.stock.mapper;

import java.util.List;

import com.jxlg.logistic.stock.entity.Stock;

public interface StockDaoMapper {

	List<Stock> listView(Stock stock);

}
