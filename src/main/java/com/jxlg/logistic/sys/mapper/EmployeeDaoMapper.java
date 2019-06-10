package com.jxlg.logistic.sys.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jxlg.logistic.sys.condition.EmployeeCondition;
import com.jxlg.logistic.sys.entity.Employee;

public interface EmployeeDaoMapper {
	// 动态sql
	List<Employee> listView(EmployeeCondition condition);

	// 登录验证
	Employee checkLogin(@Param("account") String account, @Param("password") String password);

	// 注册用户名是否存在
	Employee checkRegisterForEmp(@Param("account") String account);

	int modifyUserAndPass(@Param("account")String account,@Param("password") String password);
}
