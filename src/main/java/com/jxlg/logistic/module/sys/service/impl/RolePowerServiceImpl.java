package com.jxlg.logistic.module.sys.service.impl;

import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jxlg.logistic.module.sys.entity.RolePower;
import com.jxlg.logistic.module.sys.entity.RolePowerExample;
import com.jxlg.logistic.module.sys.mapper.RolePowerDaoMapper;
import com.jxlg.logistic.module.sys.mapper.RolePowerMapper;
import com.jxlg.logistic.module.sys.queryview.RolePowerQueryView;
import com.jxlg.logistic.module.sys.service.IRolePowerService;
@Service
public class RolePowerServiceImpl implements IRolePowerService{

	@Autowired
	RolePowerMapper rolePowerMapper;
	@Autowired
	RolePowerDaoMapper rolePowerDaoMapper;
	@Override
	public int deleteByPrimaryKey(String rolePowerId) {
		return rolePowerMapper.deleteByPrimaryKey(rolePowerId);
	}

	@Override
	public int insertSelective(RolePower record) {
		String rolePowerId = UUID.randomUUID().toString().replaceAll("-", "");
		record.setRolePowerId(rolePowerId);
		return rolePowerMapper.insertSelective(record);
	}

	@Override
	public List<RolePower> selectByExample(RolePowerExample example) {
		return rolePowerMapper.selectByExample(example);
	}

	@Override
	public RolePower selectByPrimaryKey(String rolePowerId) {
		return rolePowerMapper.selectByPrimaryKey(rolePowerId);
	}

	@Override
	public int updateByPrimaryKeySelective(RolePower record) {
		return rolePowerMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public void deleteRows(String[] ids) {
		for (String rolePowerId : ids) {
			deleteByPrimaryKey(rolePowerId);
		}
	}

	@Override
	public List<RolePowerQueryView> listView() {
		return rolePowerDaoMapper.listView();
	}

}
