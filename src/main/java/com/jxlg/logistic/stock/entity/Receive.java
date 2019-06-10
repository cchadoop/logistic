package com.jxlg.logistic.stock.entity;

import java.io.Serializable;
import java.util.Date;

public class Receive implements Serializable {
    private String receiveId;

    private String receiveNo;

    private String orderId;

    private String receivePerson;

    private Date receiveTime;

    private String receiveStatus;

    private String receiveWay;

    private Date confirmTime;

    private String confirmAddr;

    private String confirmPerson;

    private static final long serialVersionUID = 1L;

    public String getReceiveId() {
        return receiveId;
    }

    public void setReceiveId(String receiveId) {
        this.receiveId = receiveId == null ? null : receiveId.trim();
    }

    public String getReceiveNo() {
        return receiveNo;
    }

    public void setReceiveNo(String receiveNo) {
        this.receiveNo = receiveNo == null ? null : receiveNo.trim();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getReceivePerson() {
        return receivePerson;
    }

    public void setReceivePerson(String receivePerson) {
        this.receivePerson = receivePerson == null ? null : receivePerson.trim();
    }

    public Date getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    public String getReceiveStatus() {
        return receiveStatus;
    }

    public void setReceiveStatus(String receiveStatus) {
        this.receiveStatus = receiveStatus == null ? null : receiveStatus.trim();
    }

    public String getReceiveWay() {
        return receiveWay;
    }

    public void setReceiveWay(String receiveWay) {
        this.receiveWay = receiveWay == null ? null : receiveWay.trim();
    }

    public Date getConfirmTime() {
        return confirmTime;
    }

    public void setConfirmTime(Date confirmTime) {
        this.confirmTime = confirmTime;
    }

    public String getConfirmAddr() {
        return confirmAddr;
    }

    public void setConfirmAddr(String confirmAddr) {
        this.confirmAddr = confirmAddr == null ? null : confirmAddr.trim();
    }

    public String getConfirmPerson() {
        return confirmPerson;
    }

    public void setConfirmPerson(String confirmPerson) {
        this.confirmPerson = confirmPerson == null ? null : confirmPerson.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", receiveId=").append(receiveId);
        sb.append(", receiveNo=").append(receiveNo);
        sb.append(", orderId=").append(orderId);
        sb.append(", receivePerson=").append(receivePerson);
        sb.append(", receiveTime=").append(receiveTime);
        sb.append(", receiveStatus=").append(receiveStatus);
        sb.append(", receiveWay=").append(receiveWay);
        sb.append(", confirmTime=").append(confirmTime);
        sb.append(", confirmAddr=").append(confirmAddr);
        sb.append(", confirmPerson=").append(confirmPerson);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}