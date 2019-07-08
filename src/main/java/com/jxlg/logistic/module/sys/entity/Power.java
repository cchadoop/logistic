package com.jxlg.logistic.module.sys.entity;

import java.io.Serializable;

public class Power implements Serializable {
    private String powerId;

    private String moduleId;

    private String powerName;

    private String url;

    private static final long serialVersionUID = 1L;

    public String getPowerId() {
        return powerId;
    }

    public void setPowerId(String powerId) {
        this.powerId = powerId == null ? null : powerId.trim();
    }

    public String getModuleId() {
        return moduleId;
    }

    public void setModuleId(String moduleId) {
        this.moduleId = moduleId == null ? null : moduleId.trim();
    }

    public String getPowerName() {
        return powerName;
    }

    public void setPowerName(String powerName) {
        this.powerName = powerName == null ? null : powerName.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", powerId=").append(powerId);
        sb.append(", moduleId=").append(moduleId);
        sb.append(", powerName=").append(powerName);
        sb.append(", url=").append(url);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}