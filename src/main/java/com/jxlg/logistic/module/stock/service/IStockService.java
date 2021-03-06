package com.jxlg.logistic.module.stock.service;

import java.util.List;

import com.jxlg.logistic.module.stock.entity.Stock;
import com.jxlg.logistic.module.stock.entity.StockExample;

public interface IStockService {

    int deleteByPrimaryKey(String stockId);

    int insertSelective(Stock record);

    List<Stock> selectByExample(StockExample example);

    Stock selectByPrimaryKey(String stockId);

    int updateByPrimaryKeySelective(Stock record);
    
    void deleteRows(String[] ids);

	List<Stock> listView(Stock stock);

}
