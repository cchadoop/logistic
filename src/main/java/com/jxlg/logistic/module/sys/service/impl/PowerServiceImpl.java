package com.jxlg.logistic.module.sys.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jxlg.logistic.module.sys.entity.Power;
import com.jxlg.logistic.module.sys.entity.PowerExample;
import com.jxlg.logistic.module.sys.mapper.PowerDaoMapper;
import com.jxlg.logistic.module.sys.mapper.PowerMapper;
import com.jxlg.logistic.module.sys.service.IPowerService;
@Service
public class PowerServiceImpl implements IPowerService{
	
	@Autowired
	PowerMapper powerMapper;
	@Autowired
	PowerDaoMapper powerDaoMapper;
	
	@Override
	public int deleteByPrimaryKey(String powerId) {
		return powerMapper.deleteByPrimaryKey(powerId);
	}

	@Override
	public int insertSelective(Power record) {
		String powerId = UUID.randomUUID().toString().replaceAll("-", "");
		record.setPowerId(powerId);
		return powerMapper.insertSelective(record);
	}

	@Override
	public List<Power> selectByExample(PowerExample example) {
		return powerMapper.selectByExample(example);
	}

	@Override
	public Power selectByPrimaryKey(String powerId) {
		return powerMapper.selectByPrimaryKey(powerId);
	}

	@Override
	public int updateByPrimaryKeySelective(Power record) {
		return powerMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public void deleteRows(String[] ids) {
		for (String powerId : ids) {
			deleteByPrimaryKey(powerId);
		}
	}

	@Override
	public List<Power> listView() {
		// TODO Auto-generated method stub
		return powerDaoMapper.listView();
	}

	@Override
	public List<Power> selectPowerById(String empId) {
		// TODO Auto-generated method stub
		return powerDaoMapper.selectPowerById(empId);
	}
}
