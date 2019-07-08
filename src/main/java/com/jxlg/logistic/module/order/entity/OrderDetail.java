package com.jxlg.logistic.module.order.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OrderDetail implements Serializable {
    private String orderdetailId;

    private String orderId;

    private String goodsName;

    private Integer number;

    private BigDecimal volume;

    private BigDecimal weight;

    private BigDecimal totalPrice;

    private Date createTime;

    private Date updateTime;

    private String deliveryspotId;

    private String suppilerId;

    private static final long serialVersionUID = 1L;

    public String getOrderdetailId() {
        return orderdetailId;
    }

    public void setOrderdetailId(String orderdetailId) {
        this.orderdetailId = orderdetailId == null ? null : orderdetailId.trim();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public BigDecimal getVolume() {
        return volume;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getDeliveryspotId() {
        return deliveryspotId;
    }

    public void setDeliveryspotId(String deliveryspotId) {
        this.deliveryspotId = deliveryspotId == null ? null : deliveryspotId.trim();
    }

    public String getSuppilerId() {
        return suppilerId;
    }

    public void setSuppilerId(String suppilerId) {
        this.suppilerId = suppilerId == null ? null : suppilerId.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderdetailId=").append(orderdetailId);
        sb.append(", orderId=").append(orderId);
        sb.append(", goodsName=").append(goodsName);
        sb.append(", number=").append(number);
        sb.append(", volume=").append(volume);
        sb.append(", weight=").append(weight);
        sb.append(", totalPrice=").append(totalPrice);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", deliveryspotId=").append(deliveryspotId);
        sb.append(", suppilerId=").append(suppilerId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}