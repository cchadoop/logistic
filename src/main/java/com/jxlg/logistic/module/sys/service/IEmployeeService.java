package com.jxlg.logistic.module.sys.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jxlg.logistic.module.sys.condition.EmployeeCondition;
import com.jxlg.logistic.module.sys.entity.Employee;
import com.jxlg.logistic.module.sys.entity.EmployeeExample;

public interface IEmployeeService {
	long countByExample(EmployeeExample example);

	int deleteByExample(EmployeeExample example);

	int deleteByPrimaryKey(String empId);

	int insert(Employee record);

	int insertSelective(Employee record);

	List<Employee> selectByExample(EmployeeExample example);

	Employee selectByPrimaryKey(String empId);

	int updateByExampleSelective(@Param("record") Employee record, @Param("example") EmployeeExample example);

	int updateByExample(@Param("record") Employee record, @Param("example") EmployeeExample example);

	int updateByPrimaryKeySelective(Employee record);

	int updateByPrimaryKey(Employee record);

	void deleteRows(String[] ids);

	List<Employee> listView(EmployeeCondition condition);

	Employee checkLogin(@Param("account") String account, @Param("password") String password);

	Employee checkRegisterForEmp(@Param("account") String account);

	// 修改密码
	int modifyUserAndPass(@Param("account") String account, @Param("password") String password);

}
