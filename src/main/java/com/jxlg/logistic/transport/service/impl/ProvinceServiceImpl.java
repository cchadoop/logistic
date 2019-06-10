package com.jxlg.logistic.transport.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jxlg.logistic.transport.entity.Province;
import com.jxlg.logistic.transport.entity.ProvinceExample;
import com.jxlg.logistic.transport.mapper.ProvinceMapper;
import com.jxlg.logistic.transport.service.IProvinceService;

@Service
public class ProvinceServiceImpl implements IProvinceService{
	
	@Autowired
	ProvinceMapper provinceMapper;

	@Override
	public int deleteByPrimaryKey(String provinceId) {
		return provinceMapper.deleteByPrimaryKey(provinceId);
	}

	@Override
	public int insertSelective(Province record) {
		String provinceId = UUID.randomUUID().toString().replaceAll("-", "");
		record.setProvinceId(provinceId);
		return provinceMapper.insertSelective(record);
	}

	@Override
	public List<Province> selectByExample(ProvinceExample example) {
		return provinceMapper.selectByExample(example);
	}

	@Override
	public Province selectByPrimaryKey(String provinceId) {
		return provinceMapper.selectByPrimaryKey(provinceId);
	}

	@Override
	public int updateByPrimaryKeySelective(Province record) {
		return provinceMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public void deleteRows(String[] ids) {
		for (String provinceId : ids) {
			deleteByPrimaryKey(provinceId);
		}
	}
}
