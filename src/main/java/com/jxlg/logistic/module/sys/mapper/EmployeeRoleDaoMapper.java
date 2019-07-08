package com.jxlg.logistic.module.sys.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.jxlg.logistic.module.sys.queryview.EmployeeRoleQueryView;

public interface EmployeeRoleDaoMapper{
	
	@Select("select er.*,e.emp_code,r.role_name from sys_emp_role er LEFT JOIN sys_emp e on er.emp_id = e.emp_id left join sys_role r on er.role_id = r.role_id")
	@Results(value= {
			@Result(column="emp_role_id",property="empRoleId"),
			@Result(column="emp_id",property="empId"),
			@Result(column="role_id",property="roleId"),
			@Result(column="emp_code",property="empCode"),
			@Result(column="role_name",property="roleName"),
	})
	List<EmployeeRoleQueryView> listView();
}
