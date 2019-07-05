package com.jxlg.logistic.sys.service.impl;

import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;
import com.jxlg.logistic.sys.condition.EmployeeCondition;
import com.jxlg.logistic.sys.entity.Employee;
import com.jxlg.logistic.sys.entity.EmployeeExample;
import com.jxlg.logistic.sys.mapper.EmployeeDaoMapper;
import com.jxlg.logistic.sys.mapper.EmployeeMapper;
import com.jxlg.logistic.sys.service.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
	
	private static Logger LOGGER = LoggerFactory.getLogger(EmployeeServiceImpl.class);

	@Autowired
	EmployeeMapper employeeMapper;
	@Autowired
	EmployeeDaoMapper employeeDao;

	@Autowired
	private RedisTemplate<String, Object> redistemplate;

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
	@Cacheable(value = "Employee", key = "#empId")
	public Employee selectByPrimaryKey(String empId) {
		long start = System.currentTimeMillis();
		String key = "empId";
		// 判断缓存中是否有
		// 有则从缓存中取
		// 没有从DB中取,并存入缓存中
		Employee employee = new Employee();
		ValueOperations<String, Object> opsForValue = redistemplate.opsForValue();
		if (redistemplate.hasKey(key)) {
			LOGGER.debug("从redis缓存中读取数据");
			employee = (Employee) opsForValue.get(key);
		} else {
			employee = employeeMapper.selectByPrimaryKey(empId);
			opsForValue.set(key, employee);
		}
		long end = System.currentTimeMillis();
		LOGGER.info("处理时间："+(end-start)+"ms");
		return employee;
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
	@Cacheable(cacheNames = "employeeList")
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
