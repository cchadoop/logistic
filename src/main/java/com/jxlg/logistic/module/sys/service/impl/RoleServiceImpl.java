package com.jxlg.logistic.module.sys.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jxlg.logistic.module.sys.entity.Role;
import com.jxlg.logistic.module.sys.entity.RoleExample;
import com.jxlg.logistic.module.sys.mapper.RoleMapper;
import com.jxlg.logistic.module.sys.service.IRoleService;
@Service
public class RoleServiceImpl implements IRoleService{

	@Autowired
	RoleMapper roleMapper;
	
	@Override
	public int deleteByPrimaryKey(String roleId) {
		// TODO Auto-generated method stub
		return roleMapper.deleteByPrimaryKey(roleId);
	}

	@Override
	public int insertSelective(Role record) {
		// TODO Auto-generated method stub
		
		String roleId = UUID.randomUUID().toString().replaceAll("-", "");
		record.setRoleId(roleId);
		return roleMapper.insertSelective(record);
	}

	@Override
	public Role selectByPrimaryKey(String roleId) {
		// TODO Auto-generated method stub
		return roleMapper.selectByPrimaryKey(roleId);
	}

	@Override
	public int updateByPrimaryKeySelective(Role record) {
		// TODO Auto-generated method stub
		return roleMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public List<Role> selectByExample(RoleExample example) {
		// TODO Auto-generated method stub
		return roleMapper.selectByExample(example);
	}

	@Override
	public void deleteRows(String[] ids) {
		// TODO Auto-generated method stub
		for (String roleId : ids) {
			roleMapper.deleteByPrimaryKey(roleId);
		}
	}

}
