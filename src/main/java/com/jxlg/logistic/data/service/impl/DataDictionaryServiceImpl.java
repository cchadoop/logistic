package com.jxlg.logistic.data.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jxlg.logistic.data.entity.DataDictionary;
import com.jxlg.logistic.data.entity.DataDictionaryExample;
import com.jxlg.logistic.data.mapper.DataDictionaryMapper;
import com.jxlg.logistic.data.service.IDataDictionaryService;


@Service
public class DataDictionaryServiceImpl implements IDataDictionaryService{
	
	@Autowired
	DataDictionaryMapper dataDictionaryMapper;

	@Override
	public int deleteByPrimaryKey(String dataDictionaryId) {
		return dataDictionaryMapper.deleteByPrimaryKey(dataDictionaryId);
	}

	@Override
	public int insertSelective(DataDictionary record) {
		String dataDictionaryId = UUID.randomUUID().toString().replaceAll("-", "");
		record.setDataDictionaryId(dataDictionaryId);
		return dataDictionaryMapper.insertSelective(record);
	}

	@Override
	public List<DataDictionary> selectByExample(DataDictionaryExample example) {
		return dataDictionaryMapper.selectByExample(example);
	}

	@Override
	public DataDictionary selectByPrimaryKey(String dataDictionaryId) {
		return dataDictionaryMapper.selectByPrimaryKey(dataDictionaryId);
	}

	@Override
	public int updateByPrimaryKeySelective(DataDictionary record) {
		return dataDictionaryMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public void deleteRows(String[] ids) {
		for (String dataDictionaryId : ids) {
			deleteByPrimaryKey(dataDictionaryId);
		}
	}
}
