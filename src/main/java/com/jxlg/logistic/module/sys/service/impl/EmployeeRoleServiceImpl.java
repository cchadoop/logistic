package com.jxlg.logistic.module.sys.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jxlg.logistic.module.sys.entity.EmployeeRole;
import com.jxlg.logistic.module.sys.entity.EmployeeRoleExample;
import com.jxlg.logistic.module.sys.mapper.EmployeeRoleDaoMapper;
import com.jxlg.logistic.module.sys.mapper.EmployeeRoleMapper;
import com.jxlg.logistic.module.sys.queryview.EmployeeRoleQueryView;
import com.jxlg.logistic.module.sys.service.IEmployeeRoleService;

@Service
public class EmployeeRoleServiceImpl implements IEmployeeRoleService{
	
	@Autowired
	EmployeeRoleMapper employeeRoleMapper;
	@Autowired
	EmployeeRoleDaoMapper employeeRoleDaoMapper;


	@Override
	public int deleteByPrimaryKey(String empRoleId) {
		return employeeRoleMapper.deleteByPrimaryKey(empRoleId);
	}

	@Override
	public int insertSelective(EmployeeRole record) {
		String empRoleId = UUID.randomUUID().toString().replaceAll("-", "");
		record.setEmpRoleId(empRoleId);
		return employeeRoleMapper.insertSelective(record);
	}

	@Override
	public List<EmployeeRole> selectByExample(EmployeeRoleExample example) {
		// TODO Auto-generated method stub
		return employeeRoleMapper.selectByExample(example);
	}

	@Override
	public EmployeeRole selectByPrimaryKey(String empRoleId) {
		// TODO Auto-generated method stub
		return employeeRoleMapper.selectByPrimaryKey(empRoleId);
	}

	@Override
	public int updateByPrimaryKeySelective(EmployeeRole record) {
		return employeeRoleMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public void deleteRows(String[] ids) {
		for (String empRoleId : ids) {
			employeeRoleMapper.deleteByPrimaryKey(empRoleId);
		}
	}

	@Override
	public List<EmployeeRoleQueryView> listView() {
		return employeeRoleDaoMapper.listView();
	}
	
}
