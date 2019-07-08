package com.jxlg.logistic.module.transport.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jxlg.logistic.module.transport.entity.Car;
import com.jxlg.logistic.module.transport.entity.CarExample;
import com.jxlg.logistic.module.transport.mapper.CarDaoMapper;
import com.jxlg.logistic.module.transport.mapper.CarMapper;
import com.jxlg.logistic.module.transport.queryview.CarQueryView;
import com.jxlg.logistic.module.transport.service.ICarService;

@Service
public class CarServiceImpl implements ICarService{
	
	@Autowired
	CarMapper carMapper;
	@Autowired
	CarDaoMapper carDaoMapper;

	@Override
	public int deleteByPrimaryKey(String carId) {
		return carMapper.deleteByPrimaryKey(carId);
	}

	@Override
	public int insertSelective(Car record) {
		String carId = UUID.randomUUID().toString().replaceAll("-", "");
		record.setCarId(carId);
		return carMapper.insertSelective(record);
	}

	@Override
	public List<Car> selectByExample(CarExample example) {
		return carMapper.selectByExample(example);
	}

	@Override
	public Car selectByPrimaryKey(String carId) {
		return carMapper.selectByPrimaryKey(carId);
	}

	@Override
	public int updateByPrimaryKeySelective(Car record) {
		return carMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public void deleteRows(String[] ids) {
		for (String carId : ids) {
			deleteByPrimaryKey(carId);
		}
	}

	@Override
	public List<CarQueryView> listView(Car car) {
		return carDaoMapper.listView(car);
	}
}
