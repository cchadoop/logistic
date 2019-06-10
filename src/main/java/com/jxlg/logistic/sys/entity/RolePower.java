package com.jxlg.logistic.sys.entity;

import java.io.Serializable;

public class RolePower implements Serializable {
    private String rolePowerId;

    private String roleId;

    private String powerId;

    private static final long serialVersionUID = 1L;

    public String getRolePowerId() {
        return rolePowerId;
    }

    public void setRolePowerId(String rolePowerId) {
        this.rolePowerId = rolePowerId == null ? null : rolePowerId.trim();
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId == null ? null : roleId.trim();
    }

    public String getPowerId() {
        return powerId;
    }

    public void setPowerId(String powerId) {
        this.powerId = powerId == null ? null : powerId.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rolePowerId=").append(rolePowerId);
        sb.append(", roleId=").append(roleId);
        sb.append(", powerId=").append(powerId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}