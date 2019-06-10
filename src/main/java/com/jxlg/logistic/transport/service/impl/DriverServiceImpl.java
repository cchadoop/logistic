package com.jxlg.logistic.transport.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jxlg.logistic.transport.entity.Driver;
import com.jxlg.logistic.transport.entity.DriverExample;
import com.jxlg.logistic.transport.mapper.DriverDaoMapper;
import com.jxlg.logistic.transport.mapper.DriverMapper;
import com.jxlg.logistic.transport.service.IDriverService;

@Service
public class DriverServiceImpl implements IDriverService{
	
	@Autowired
	DriverMapper driverMapper;
	@Autowired
	DriverDaoMapper driverDaoMapper;

	@Override
	public int deleteByPrimaryKey(String driverId) {
		return driverMapper.deleteByPrimaryKey(driverId);
	}

	@Override
	public int insertSelective(Driver record) {
		String driverId = UUID.randomUUID().toString().replaceAll("-", "");
		record.setDriverId(driverId);
		return driverMapper.insertSelective(record);
	}

	@Override
	public List<Driver> selectByExample(DriverExample example) {
		return driverMapper.selectByExample(example);
	}

	@Override
	public Driver selectByPrimaryKey(String driverId) {
		return driverMapper.selectByPrimaryKey(driverId);
	}

	@Override
	public int updateByPrimaryKeySelective(Driver record) {
		return driverMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public void deleteRows(String[] ids) {
		for (String driverId : ids) {
			deleteByPrimaryKey(driverId);
		}
	}

	@Override
	public List<Driver> listView(Driver driver) {
		// TODO Auto-generated method stub
		return driverDaoMapper.listView(driver);
	}
}
