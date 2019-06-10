package com.jxlg.logistic.stock.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Stock implements Serializable {
    private String stockId;

    private String stockNo;

    private String stockName;

    private String stockAddr;

    private String cstId;

    private String orderId;

    private String receiveId;

    private Date instockTime;

    private String position;

    private Integer pkgs;

    private BigDecimal weight;

    private BigDecimal cbm;

    private BigDecimal l;

    private BigDecimal w;

    private BigDecimal h;

    private static final long serialVersionUID = 1L;

    public String getStockId() {
        return stockId;
    }

    public void setStockId(String stockId) {
        this.stockId = stockId == null ? null : stockId.trim();
    }

    public String getStockNo() {
        return stockNo;
    }

    public void setStockNo(String stockNo) {
        this.stockNo = stockNo == null ? null : stockNo.trim();
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName == null ? null : stockName.trim();
    }

    public String getStockAddr() {
        return stockAddr;
    }

    public void setStockAddr(String stockAddr) {
        this.stockAddr = stockAddr == null ? null : stockAddr.trim();
    }

    public String getCstId() {
        return cstId;
    }

    public void setCstId(String cstId) {
        this.cstId = cstId == null ? null : cstId.trim();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getReceiveId() {
        return receiveId;
    }

    public void setReceiveId(String receiveId) {
        this.receiveId = receiveId == null ? null : receiveId.trim();
    }

    public Date getInstockTime() {
        return instockTime;
    }

    public void setInstockTime(Date instockTime) {
        this.instockTime = instockTime;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public Integer getPkgs() {
        return pkgs;
    }

    public void setPkgs(Integer pkgs) {
        this.pkgs = pkgs;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getCbm() {
        return cbm;
    }

    public void setCbm(BigDecimal cbm) {
        this.cbm = cbm;
    }

    public BigDecimal getL() {
        return l;
    }

    public void setL(BigDecimal l) {
        this.l = l;
    }

    public BigDecimal getW() {
        return w;
    }

    public void setW(BigDecimal w) {
        this.w = w;
    }

    public BigDecimal getH() {
        return h;
    }

    public void setH(BigDecimal h) {
        this.h = h;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", stockId=").append(stockId);
        sb.append(", stockNo=").append(stockNo);
        sb.append(", stockName=").append(stockName);
        sb.append(", stockAddr=").append(stockAddr);
        sb.append(", cstId=").append(cstId);
        sb.append(", orderId=").append(orderId);
        sb.append(", receiveId=").append(receiveId);
        sb.append(", instockTime=").append(instockTime);
        sb.append(", position=").append(position);
        sb.append(", pkgs=").append(pkgs);
        sb.append(", weight=").append(weight);
        sb.append(", cbm=").append(cbm);
        sb.append(", l=").append(l);
        sb.append(", w=").append(w);
        sb.append(", h=").append(h);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}