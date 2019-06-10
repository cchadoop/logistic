package com.jxlg.logistic.transport.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jxlg.logistic.transport.entity.Cartype;
import com.jxlg.logistic.transport.entity.CartypeExample;
import com.jxlg.logistic.transport.mapper.CartypeMapper;
import com.jxlg.logistic.transport.service.ICartypeService;

@Service
public class CartypeServiceImpl implements ICartypeService{
	
	@Autowired
	CartypeMapper cartypeMapper;

	@Override
	public int deleteByPrimaryKey(String cartypeId) {
		return cartypeMapper.deleteByPrimaryKey(cartypeId);
	}

	@Override
	public int insertSelective(Cartype record) {
		String cartypeId = UUID.randomUUID().toString().replaceAll("-", "");
		record.setCartypeId(cartypeId);
		return cartypeMapper.insertSelective(record);
	}

	@Override
	public List<Cartype> selectByExample(CartypeExample example) {
		return cartypeMapper.selectByExample(example);
	}

	@Override
	public Cartype selectByPrimaryKey(String cartypeId) {
		return cartypeMapper.selectByPrimaryKey(cartypeId);
	}

	@Override
	public int updateByPrimaryKeySelective(Cartype record) {
		return cartypeMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public void deleteRows(String[] ids) {
		for (String cartypeId : ids) {
			deleteByPrimaryKey(cartypeId);
		}
	}
}
