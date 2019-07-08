package com.jxlg.logistic.module.transport.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Driver implements Serializable {
    private String driverId;

    private String driverName;

    private String driverSex;

    private String driverTel;

    private String driverIdcard;

    private Date createTime;

    private BigDecimal driverTime;

    private String driverStatus;

    private String remark;

    private static final long serialVersionUID = 1L;

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId == null ? null : driverId.trim();
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName == null ? null : driverName.trim();
    }

    public String getDriverSex() {
        return driverSex;
    }

    public void setDriverSex(String driverSex) {
        this.driverSex = driverSex == null ? null : driverSex.trim();
    }

    public String getDriverTel() {
        return driverTel;
    }

    public void setDriverTel(String driverTel) {
        this.driverTel = driverTel == null ? null : driverTel.trim();
    }

    public String getDriverIdcard() {
        return driverIdcard;
    }

    public void setDriverIdcard(String driverIdcard) {
        this.driverIdcard = driverIdcard == null ? null : driverIdcard.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public BigDecimal getDriverTime() {
        return driverTime;
    }

    public void setDriverTime(BigDecimal driverTime) {
        this.driverTime = driverTime;
    }

    public String getDriverStatus() {
        return driverStatus;
    }

    public void setDriverStatus(String driverStatus) {
        this.driverStatus = driverStatus == null ? null : driverStatus.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", driverId=").append(driverId);
        sb.append(", driverName=").append(driverName);
        sb.append(", driverSex=").append(driverSex);
        sb.append(", driverTel=").append(driverTel);
        sb.append(", driverIdcard=").append(driverIdcard);
        sb.append(", createTime=").append(createTime);
        sb.append(", driverTime=").append(driverTime);
        sb.append(", driverStatus=").append(driverStatus);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}