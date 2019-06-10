package com.jxlg.logistic.sys.queryview;

import com.jxlg.logistic.sys.entity.RolePower;

public class RolePowerQueryView extends RolePower{
	private static final long serialVersionUID = 1L;
	private String roleName;
	private String powerName;
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getPowerName() {
		return powerName;
	}
	public void setPowerName(String powerName) {
		this.powerName = powerName;
	}
	
	
}
