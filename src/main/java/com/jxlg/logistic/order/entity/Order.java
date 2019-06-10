package com.jxlg.logistic.order.entity;

import java.io.Serializable;

public class Order implements Serializable {
    private String orderId;

    private String orderNo;

    private String sendName;

    private String sendAddr;

    private String sendAddrCode;

    private String sendTel;

    private String receiveName;

    private String receiveAddr;

    private String receiveAddrCode;

    private String receiveTel;

    private String orderStatus;

    private String remark;

    private static final long serialVersionUID = 1L;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public String getSendName() {
        return sendName;
    }

    public void setSendName(String sendName) {
        this.sendName = sendName == null ? null : sendName.trim();
    }

    public String getSendAddr() {
        return sendAddr;
    }

    public void setSendAddr(String sendAddr) {
        this.sendAddr = sendAddr == null ? null : sendAddr.trim();
    }

    public String getSendAddrCode() {
        return sendAddrCode;
    }

    public void setSendAddrCode(String sendAddrCode) {
        this.sendAddrCode = sendAddrCode == null ? null : sendAddrCode.trim();
    }

    public String getSendTel() {
        return sendTel;
    }

    public void setSendTel(String sendTel) {
        this.sendTel = sendTel == null ? null : sendTel.trim();
    }

    public String getReceiveName() {
        return receiveName;
    }

    public void setReceiveName(String receiveName) {
        this.receiveName = receiveName == null ? null : receiveName.trim();
    }

    public String getReceiveAddr() {
        return receiveAddr;
    }

    public void setReceiveAddr(String receiveAddr) {
        this.receiveAddr = receiveAddr == null ? null : receiveAddr.trim();
    }

    public String getReceiveAddrCode() {
        return receiveAddrCode;
    }

    public void setReceiveAddrCode(String receiveAddrCode) {
        this.receiveAddrCode = receiveAddrCode == null ? null : receiveAddrCode.trim();
    }

    public String getReceiveTel() {
        return receiveTel;
    }

    public void setReceiveTel(String receiveTel) {
        this.receiveTel = receiveTel == null ? null : receiveTel.trim();
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
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
        sb.append(", orderId=").append(orderId);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", sendName=").append(sendName);
        sb.append(", sendAddr=").append(sendAddr);
        sb.append(", sendAddrCode=").append(sendAddrCode);
        sb.append(", sendTel=").append(sendTel);
        sb.append(", receiveName=").append(receiveName);
        sb.append(", receiveAddr=").append(receiveAddr);
        sb.append(", receiveAddrCode=").append(receiveAddrCode);
        sb.append(", receiveTel=").append(receiveTel);
        sb.append(", orderStatus=").append(orderStatus);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}