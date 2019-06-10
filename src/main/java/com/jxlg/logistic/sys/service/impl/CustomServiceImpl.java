package com.jxlg.logistic.sys.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jxlg.logistic.sys.entity.Custom;
import com.jxlg.logistic.sys.entity.CustomExample;
import com.jxlg.logistic.sys.mapper.CustomDaoMapper;
import com.jxlg.logistic.sys.mapper.CustomMapper;
import com.jxlg.logistic.sys.service.ICustomService;

@Service
public class CustomServiceImpl implements ICustomService{

	@Autowired
	CustomMapper customMapper;
	@Autowired
	CustomDaoMapper customDaoMapper;
	
	@Override
	public int deleteByPrimaryKey(String cstId) {
		return customMapper.deleteByPrimaryKey(cstId);
	}

	@Override
	public int insertSelective(Custom record) {
		String cstId = UUID.randomUUID().toString().replaceAll("-", "");
		record.setCstId(cstId);
		return customMapper.insertSelective(record);
	}

	@Override
	public List<Custom> selectByExample(CustomExample example) {
		return customMapper.selectByExample(example);
	}

	@Override
	public Custom selectByPrimaryKey(String cstId) {
		return customMapper.selectByPrimaryKey(cstId);
	}

	@Override
	public int updateByPrimaryKeySelective(Custom record) {
		return customMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public void deleteRows(String[] ids) {
		for (String cstId : ids) {
			deleteByPrimaryKey(cstId);
		}
	}

	@Override
	public List<Custom> listView(Custom custom) {
		return customDaoMapper.listView(custom);
	}

	@Override
	public Custom checkCustom(String code) {
		return customDaoMapper.checkCustom(code);
	}

	@Override
	public Custom selectByAccountAndPwd(String code, String password) {
		return customDaoMapper.selectByAccountAndPwd(code,password);
	}
}
