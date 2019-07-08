package com.jxlg.logistic.module.delivery.entity;

import java.io.Serializable;
import java.util.Date;

public class Handler implements Serializable {
    private String handlerId;

    private String handlerNo;

    private String empId;

    private String orderId;

    private String deliveryspotId;

    private String carId;

    private Date createTime;

    private String handlerStatus;

    private String remark;

    private static final long serialVersionUID = 1L;

    public String getHandlerId() {
        return handlerId;
    }

    public void setHandlerId(String handlerId) {
        this.handlerId = handlerId == null ? null : handlerId.trim();
    }

    public String getHandlerNo() {
        return handlerNo;
    }

    public void setHandlerNo(String handlerNo) {
        this.handlerNo = handlerNo == null ? null : handlerNo.trim();
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId == null ? null : empId.trim();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getDeliveryspotId() {
        return deliveryspotId;
    }

    public void setDeliveryspotId(String deliveryspotId) {
        this.deliveryspotId = deliveryspotId == null ? null : deliveryspotId.trim();
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId == null ? null : carId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getHandlerStatus() {
        return handlerStatus;
    }

    public void setHandlerStatus(String handlerStatus) {
        this.handlerStatus = handlerStatus == null ? null : handlerStatus.trim();
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
        sb.append(", handlerId=").append(handlerId);
        sb.append(", handlerNo=").append(handlerNo);
        sb.append(", empId=").append(empId);
        sb.append(", orderId=").append(orderId);
        sb.append(", deliveryspotId=").append(deliveryspotId);
        sb.append(", carId=").append(carId);
        sb.append(", createTime=").append(createTime);
        sb.append(", handlerStatus=").append(handlerStatus);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}