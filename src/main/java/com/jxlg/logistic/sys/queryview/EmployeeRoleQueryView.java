package com.jxlg.logistic.sys.queryview;

import com.jxlg.logistic.sys.entity.EmployeeRole;

public class EmployeeRoleQueryView extends EmployeeRole{

	private static final long serialVersionUID = 1L;
	private String empCode;
	private String roleName;
	public String getEmpCode() {
		return empCode;
	}
	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

}
