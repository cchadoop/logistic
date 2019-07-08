package com.jxlg.logistic.module.delivery.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Deliveryspot implements Serializable {
    private String deliveryspotId;

    private String deliveryspotNo;

    private String deliveryspotName;

    private String cityId;
    
    private String deliveryspotAddr;

    private String empId;

    private String tel;

    private BigDecimal firstWeightScope;

    private BigDecimal firstWeightPrice;

    private BigDecimal secondWeightRate;

    private BigDecimal firstVolumeScope;

    private BigDecimal firstVolumePrice;

    private BigDecimal secondVolumeRate;

    private Date deliveryTime;

    private String deliveryStatus;

    private static final long serialVersionUID = 1L;

    public String getDeliveryspotId() {
        return deliveryspotId;
    }

    public void setDeliveryspotId(String deliveryspotId) {
        this.deliveryspotId = deliveryspotId == null ? null : deliveryspotId.trim();
    }

    public String getDeliveryspotNo() {
        return deliveryspotNo;
    }

    public void setDeliveryspotNo(String deliveryspotNo) {
        this.deliveryspotNo = deliveryspotNo == null ? null : deliveryspotNo.trim();
    }

    public String getDeliveryspotName() {
        return deliveryspotName;
    }

    public void setDeliveryspotName(String deliveryspotName) {
        this.deliveryspotName = deliveryspotName == null ? null : deliveryspotName.trim();
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId == null ? null : cityId.trim();
    }
    
    public String getDeliveryspotAddr() {
        return deliveryspotAddr;
    }

    public void setDeliveryspotAddr(String deliveryspotAddr) {
        this.deliveryspotAddr = deliveryspotAddr == null ? null : deliveryspotAddr.trim();
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId == null ? null : empId.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public BigDecimal getFirstWeightScope() {
        return firstWeightScope;
    }

    public void setFirstWeightScope(BigDecimal firstWeightScope) {
        this.firstWeightScope = firstWeightScope;
    }

    public BigDecimal getFirstWeightPrice() {
        return firstWeightPrice;
    }

    public void setFirstWeightPrice(BigDecimal firstWeightPrice) {
        this.firstWeightPrice = firstWeightPrice;
    }

    public BigDecimal getSecondWeightRate() {
        return secondWeightRate;
    }

    public void setSecondWeightRate(BigDecimal secondWeightRate) {
        this.secondWeightRate = secondWeightRate;
    }

    public BigDecimal getFirstVolumeScope() {
        return firstVolumeScope;
    }

    public void setFirstVolumeScope(BigDecimal firstVolumeScope) {
        this.firstVolumeScope = firstVolumeScope;
    }

    public BigDecimal getFirstVolumePrice() {
        return firstVolumePrice;
    }

    public void setFirstVolumePrice(BigDecimal firstVolumePrice) {
        this.firstVolumePrice = firstVolumePrice;
    }

    public BigDecimal getSecondVolumeRate() {
        return secondVolumeRate;
    }

    public void setSecondVolumeRate(BigDecimal secondVolumeRate) {
        this.secondVolumeRate = secondVolumeRate;
    }

    public Date getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus == null ? null : deliveryStatus.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", deliveryspotId=").append(deliveryspotId);
        sb.append(", deliveryspotNo=").append(deliveryspotNo);
        sb.append(", deliveryspotName=").append(deliveryspotName);
        sb.append(", cityId=").append(cityId);
        sb.append(", deliveryspotAddr=").append(deliveryspotAddr);
        sb.append(", empId=").append(empId);
        sb.append(", tel=").append(tel);
        sb.append(", firstWeightScope=").append(firstWeightScope);
        sb.append(", firstWeightPrice=").append(firstWeightPrice);
        sb.append(", secondWeightRate=").append(secondWeightRate);
        sb.append(", firstVolumeScope=").append(firstVolumeScope);
        sb.append(", firstVolumePrice=").append(firstVolumePrice);
        sb.append(", secondVolumeRate=").append(secondVolumeRate);
        sb.append(", deliveryTime=").append(deliveryTime);
        sb.append(", deliveryStatus=").append(deliveryStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}