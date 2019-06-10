package com.jxlg.logistic.stock.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jxlg.logistic.stock.condition.ReceiveCondition;
import com.jxlg.logistic.stock.entity.Receive;
import com.jxlg.logistic.stock.entity.ReceiveExample;
import com.jxlg.logistic.stock.mapper.ReceiveDaoMapper;
import com.jxlg.logistic.stock.mapper.ReceiveMapper;
import com.jxlg.logistic.stock.service.IReceiveService;

@Service
public class ReceiveServiceImpl implements IReceiveService{
	
	@Autowired
	ReceiveMapper receiveMapper;
	@Autowired
	ReceiveDaoMapper receiveDaoMapper;

	@Override
	public int deleteByPrimaryKey(String receiveId) {
		return receiveMapper.deleteByPrimaryKey(receiveId);
	}

	@Override
	public int insertSelective(Receive record) {
		String receiveId = UUID.randomUUID().toString().replaceAll("-", "");
		record.setReceiveId(receiveId);
		return receiveMapper.insertSelective(record);
	}

	@Override
	public List<Receive> selectByExample(ReceiveExample example) {
		return receiveMapper.selectByExample(example);
	}

	@Override
	public Receive selectByPrimaryKey(String receiveId) {
		return receiveMapper.selectByPrimaryKey(receiveId);
	}

	@Override
	public int updateByPrimaryKeySelective(Receive record) {
		return receiveMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public void deleteRows(String[] ids) {
		for (String receiveId : ids) {
			deleteByPrimaryKey(receiveId);
		}
	}

	@Override
	public List<Receive> listView(ReceiveCondition condition) {
		// TODO Auto-generated method stub
		return receiveDaoMapper.listView(condition);
	}
}
