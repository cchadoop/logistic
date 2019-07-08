package com.jxlg.logistic.module.sys.service;

import java.util.List;

import com.jxlg.logistic.module.sys.entity.RolePower;
import com.jxlg.logistic.module.sys.entity.RolePowerExample;
import com.jxlg.logistic.module.sys.queryview.RolePowerQueryView;

public interface IRolePowerService {
	int deleteByPrimaryKey(String rolePowerId);
	
	int insertSelective(RolePower record);
	
	List<RolePower> selectByExample(RolePowerExample example);
	
	RolePower selectByPrimaryKey(String rolePowerId);
	
	int updateByPrimaryKeySelective(RolePower record);
	
	void deleteRows(String[] ids);

	List<RolePowerQueryView> listView();
}
