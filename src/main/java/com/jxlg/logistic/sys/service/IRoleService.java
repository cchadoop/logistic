package com.jxlg.logistic.sys.service;

import java.util.List;

import com.jxlg.logistic.sys.entity.Role;
import com.jxlg.logistic.sys.entity.RoleExample;

public interface IRoleService {
	int deleteByPrimaryKey(String roleId);
	
	int insertSelective(Role record);
	
	Role selectByPrimaryKey(String roleId);
	
	int updateByPrimaryKeySelective(Role record);
	
	List<Role> selectByExample(RoleExample example);
	
	void deleteRows(String[] ids);
}
