package com.jxlg.logistic.order.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jxlg.logistic.order.entity.Suppiler;
import com.jxlg.logistic.order.entity.SuppilerExample;
import com.jxlg.logistic.order.mapper.SuppilerDaoMapper;
import com.jxlg.logistic.order.mapper.SuppilerMapper;
import com.jxlg.logistic.order.service.ISuppilerService;

@Service
public class SuppilerServiceImpl implements ISuppilerService{
	
	@Autowired
	SuppilerMapper suppilerMapper;
	@Autowired
	SuppilerDaoMapper suppilerDaoMapper;

	@Override
	public int deleteByPrimaryKey(String suppilerId) {
		return suppilerMapper.deleteByPrimaryKey(suppilerId);
	}

	@Override
	public int insertSelective(Suppiler record) {
		String suppilerId = UUID.randomUUID().toString().replaceAll("-", "");
		record.setSuppilerId(suppilerId);
		return suppilerMapper.insertSelective(record);
	}

	@Override
	public List<Suppiler> selectByExample(SuppilerExample example) {
		return suppilerMapper.selectByExample(example);
	}

	@Override
	public Suppiler selectByPrimaryKey(String suppilerId) {
		return suppilerMapper.selectByPrimaryKey(suppilerId);
	}

	@Override
	public int updateByPrimaryKeySelective(Suppiler record) {
		return suppilerMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public void deleteRows(String[] ids) {
		for (String suppilerId : ids) {
			deleteByPrimaryKey(suppilerId);
		}
	}

	@Override
	public List<Suppiler> listView(Suppiler suppiler) {
		// TODO Auto-generated method stub
		return suppilerDaoMapper.listView(suppiler);
	}
}
