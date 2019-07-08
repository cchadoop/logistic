package com.jxlg.logistic.module.transport.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jxlg.logistic.module.transport.entity.City;
import com.jxlg.logistic.module.transport.entity.CityExample;
import com.jxlg.logistic.module.transport.mapper.CityMapper;
import com.jxlg.logistic.module.transport.queryview.CityQueryView;
import com.jxlg.logistic.module.transport.service.ICityService;

@Service
public class CityServiceImpl implements ICityService{
	
	@Autowired
	CityMapper cityMapper;

	@Override
	public int deleteByPrimaryKey(String cityId) {
		return cityMapper.deleteByPrimaryKey(cityId);
	}

	@Override
	public int insertSelective(City record) {
		String cityId = UUID.randomUUID().toString().replaceAll("-", "");
		record.setCityId(cityId);
		return cityMapper.insertSelective(record);
	}

	@Override
	public List<City> selectByExample(CityExample example) {
		return cityMapper.selectByExample(example);
	}

	@Override
	public City selectByPrimaryKey(String cityId) {
		return cityMapper.selectByPrimaryKey(cityId);
	}

	@Override
	public int updateByPrimaryKeySelective(City record) {
		return cityMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public void deleteRows(String[] ids) {
		for (String cityId : ids) {
			deleteByPrimaryKey(cityId);
		}
	}

	@Override
	public List<CityQueryView> listView() {
		return cityMapper.listView();
	}
}
