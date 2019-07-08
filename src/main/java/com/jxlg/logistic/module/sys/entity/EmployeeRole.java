package com.jxlg.logistic.module.sys.entity;

import java.io.Serializable;

public class EmployeeRole implements Serializable {
    private String empRoleId;

    private String empId;

    private String roleId;

    private static final long serialVersionUID = 1L;

    public String getEmpRoleId() {
        return empRoleId;
    }

    public void setEmpRoleId(String empRoleId) {
        this.empRoleId = empRoleId == null ? null : empRoleId.trim();
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId == null ? null : empId.trim();
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", empRoleId=").append(empRoleId);
        sb.append(", empId=").append(empId);
        sb.append(", roleId=").append(roleId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}