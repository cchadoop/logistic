package com.jxlg.logistic.sys.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jxlg.logistic.sys.condition.EmployeeCondition;
import com.jxlg.logistic.sys.entity.Employee;
import com.jxlg.logistic.sys.entity.EmployeeExample;
import com.jxlg.logistic.sys.mapper.EmployeeDaoMapper;
import com.jxlg.logistic.sys.mapper.EmployeeMapper;
import com.jxlg.logistic.sys.service.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	EmployeeMapper employeeMapper;
	@Autowired
	EmployeeDaoMapper employeeDao;

	@Override
	public long countByExample(EmployeeExample example) {
		return employeeMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(EmployeeExample example) {
		return employeeMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(String empId) {
		return employeeMapper.deleteByPrimaryKey(empId);
	}

	@Override
	public int insert(Employee record) {
		return employeeMapper.insert(record);
	}

	@Override
	public int insertSelective(Employee record) {
		String empId = UUID.randomUUID().toString().replaceAll("-", "");
		record.setEmpId(empId);
		return employeeMapper.insertSelective(record);
	}

	@Override
	public List<Employee> selectByExample(EmployeeExample example) {
		return employeeMapper.selectByExample(example);
	}

	@Override
	public Employee selectByPrimaryKey(String empId) {
		return employeeMapper.selectByPrimaryKey(empId);
	}

	@Override
	public int updateByExampleSelective(Employee record, EmployeeExample example) {
		return employeeMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(Employee record, EmployeeExample example) {
		return employeeMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(Employee record) {
		return employeeMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Employee record) {
		return employeeMapper.updateByPrimaryKey(record);
	}

	@Override
	public void deleteRows(String[] ids) {
		for (String id : ids) {
			employeeMapper.deleteByPrimaryKey(id);
		}
	}

	@Override
	public List<Employee> listView(EmployeeCondition condition) {
		return employeeDao.listView(condition);
	}

	@Override
	public Employee checkLogin(String account, String password) {
		return employeeDao.checkLogin(account, password);
	}

	@Override
	public Employee checkRegisterForEmp(String account) {
		return employeeDao.checkRegisterForEmp(account);
	}

	@Override
	public int modifyUserAndPass(String account, String password) {
		return employeeDao.modifyUserAndPass(account, password);
	}

}
