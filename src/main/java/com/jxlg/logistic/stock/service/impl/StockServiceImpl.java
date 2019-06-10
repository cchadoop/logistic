package com.jxlg.logistic.stock.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jxlg.logistic.stock.entity.Stock;
import com.jxlg.logistic.stock.entity.StockExample;
import com.jxlg.logistic.stock.mapper.StockDaoMapper;
import com.jxlg.logistic.stock.mapper.StockMapper;
import com.jxlg.logistic.stock.service.IStockService;

@Service
public class StockServiceImpl implements IStockService{
	
	@Autowired
	StockMapper stockMapper;
	@Autowired
	StockDaoMapper stockDaoMapper;

	@Override
	public int deleteByPrimaryKey(String stockId) {
		return stockMapper.deleteByPrimaryKey(stockId);
	}

	@Override
	public int insertSelective(Stock record) {
		String stockId = UUID.randomUUID().toString().replaceAll("-", "");
		record.setStockId(stockId);
		return stockMapper.insertSelective(record);
	}

	@Override
	public List<Stock> selectByExample(StockExample example) {
		return stockMapper.selectByExample(example);
	}

	@Override
	public Stock selectByPrimaryKey(String stockId) {
		return stockMapper.selectByPrimaryKey(stockId);
	}

	@Override
	public int updateByPrimaryKeySelective(Stock record) {
		return stockMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public void deleteRows(String[] ids) {
		for (String stockId : ids) {
			deleteByPrimaryKey(stockId);
		}
	}

	@Override
	public List<Stock> listView(Stock stock) {
		// TODO Auto-generated method stub
		return stockDaoMapper.listView(stock);
	}
}
