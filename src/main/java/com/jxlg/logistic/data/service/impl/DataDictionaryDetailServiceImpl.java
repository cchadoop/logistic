package com.jxlg.logistic.data.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jxlg.logistic.data.entity.DataDictionaryDetail;
import com.jxlg.logistic.data.entity.DataDictionaryDetailExample;
import com.jxlg.logistic.data.mapper.DataDictionaryDetailMapper;
import com.jxlg.logistic.data.service.IDataDictionaryDetailService;

@Service
public class DataDictionaryDetailServiceImpl implements IDataDictionaryDetailService{
	
	@Autowired
	DataDictionaryDetailMapper dataDictionaryDetailMapper;

	@Override
	public int deleteByPrimaryKey(String dictionaryDetailId) {
		return dataDictionaryDetailMapper.deleteByPrimaryKey(dictionaryDetailId);
	}

	@Override
	public int insertSelective(DataDictionaryDetail record) {
		String dictionaryDetailId = UUID.randomUUID().toString().replaceAll("-", "");
		record.setDictionaryDetailId(dictionaryDetailId);
		return dataDictionaryDetailMapper.insertSelective(record);
	}

	@Override
	public List<DataDictionaryDetail> selectByExample(DataDictionaryDetailExample example) {
		return dataDictionaryDetailMapper.selectByExample(example);
	}

	@Override
	public DataDictionaryDetail selectByPrimaryKey(String dictionaryDetailId) {
		return dataDictionaryDetailMapper.selectByPrimaryKey(dictionaryDetailId);
	}

	@Override
	public int updateByPrimaryKeySelective(DataDictionaryDetail record) {
		return dataDictionaryDetailMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public void deleteRows(String[] ids) {
		for (String dictionaryDetailId : ids) {
			deleteByPrimaryKey(dictionaryDetailId);
		}
	}
}
