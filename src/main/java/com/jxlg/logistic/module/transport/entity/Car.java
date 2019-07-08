package com.jxlg.logistic.module.transport.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Car implements Serializable {
    private String carId;

    private String carNo;

    private String cartypeId;

    private BigDecimal tonnage;

    private String image;

    private Date buyTime;

    private Date leaveTime;

    private String carStatus;

    private String lineId;

    private String driverId;

    private String company;

    private String remark;

    private static final long serialVersionUID = 1L;

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId == null ? null : carId.trim();
    }

    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo == null ? null : carNo.trim();
    }

    public String getCartypeId() {
        return cartypeId;
    }

    public void setCartypeId(String cartypeId) {
        this.cartypeId = cartypeId == null ? null : cartypeId.trim();
    }

    public BigDecimal getTonnage() {
        return tonnage;
    }

    public void setTonnage(BigDecimal tonnage) {
        this.tonnage = tonnage;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public Date getBuyTime() {
        return buyTime;
    }

    public void setBuyTime(Date buyTime) {
        this.buyTime = buyTime;
    }

    public Date getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(Date leaveTime) {
        this.leaveTime = leaveTime;
    }

    public String getCarStatus() {
        return carStatus;
    }

    public void setCarStatus(String carStatus) {
        this.carStatus = carStatus == null ? null : carStatus.trim();
    }

    public String getLineId() {
        return lineId;
    }

    public void setLineId(String lineId) {
        this.lineId = lineId == null ? null : lineId.trim();
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId == null ? null : driverId.trim();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
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
        sb.append(", carId=").append(carId);
        sb.append(", carNo=").append(carNo);
        sb.append(", cartypeId=").append(cartypeId);
        sb.append(", tonnage=").append(tonnage);
        sb.append(", image=").append(image);
        sb.append(", buyTime=").append(buyTime);
        sb.append(", leaveTime=").append(leaveTime);
        sb.append(", carStatus=").append(carStatus);
        sb.append(", lineId=").append(lineId);
        sb.append(", driverId=").append(driverId);
        sb.append(", company=").append(company);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}