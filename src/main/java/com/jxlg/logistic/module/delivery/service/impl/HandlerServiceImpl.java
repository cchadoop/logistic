package com.jxlg.logistic.module.delivery.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jxlg.logistic.module.delivery.entity.Handler;
import com.jxlg.logistic.module.delivery.entity.HandlerExample;
import com.jxlg.logistic.module.delivery.mapper.HandlerDaoMapper;
import com.jxlg.logistic.module.delivery.mapper.HandlerMapper;
import com.jxlg.logistic.module.delivery.service.IHandlerService;


@Service
public class HandlerServiceImpl implements IHandlerService{
	
	@Autowired
	HandlerMapper handlerMapper;
	@Autowired
	HandlerDaoMapper handlerDaoMapper;

	@Override
	public int deleteByPrimaryKey(String handlerId) {
		return handlerMapper.deleteByPrimaryKey(handlerId);
	}

	@Override
	public int insertSelective(Handler record) {
		String handlerId = UUID.randomUUID().toString().replaceAll("-", "");
		record.setHandlerId(handlerId);
		return handlerMapper.insertSelective(record);
	}

	@Override
	public List<Handler> selectByExample(HandlerExample example) {
		return handlerMapper.selectByExample(example);
	}

	@Override
	public Handler selectByPrimaryKey(String handlerId) {
		return handlerMapper.selectByPrimaryKey(handlerId);
	}

	@Override
	public int updateByPrimaryKeySelective(Handler record) {
		return handlerMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public void deleteRows(String[] ids) {
		for (String handlerId : ids) {
			deleteByPrimaryKey(handlerId);
		}
	}

	@Override
	public List<Handler> listView(Handler handler) {
		return handlerDaoMapper.listView(handler);
	}
}
