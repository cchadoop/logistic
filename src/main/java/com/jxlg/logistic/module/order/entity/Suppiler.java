package com.jxlg.logistic.module.order.entity;

import java.io.Serializable;

public class Suppiler implements Serializable {
    private String suppilerId;

    private String suppilerNo;

    private String suppilerName;

    private String suppilerType;

    private String suppilerAddr;

    private String linkman;

    private String linkmanTel;

    private String linkmanEmail;

    private String internetsite;

    private String isvail;

    private String isdel;

    private String remark;

    private static final long serialVersionUID = 1L;

    public String getSuppilerId() {
        return suppilerId;
    }

    public void setSuppilerId(String suppilerId) {
        this.suppilerId = suppilerId == null ? null : suppilerId.trim();
    }

    public String getSuppilerNo() {
        return suppilerNo;
    }

    public void setSuppilerNo(String suppilerNo) {
        this.suppilerNo = suppilerNo == null ? null : suppilerNo.trim();
    }

    public String getSuppilerName() {
        return suppilerName;
    }

    public void setSuppilerName(String suppilerName) {
        this.suppilerName = suppilerName == null ? null : suppilerName.trim();
    }

    public String getSuppilerType() {
        return suppilerType;
    }

    public void setSuppilerType(String suppilerType) {
        this.suppilerType = suppilerType == null ? null : suppilerType.trim();
    }

    public String getSuppilerAddr() {
        return suppilerAddr;
    }

    public void setSuppilerAddr(String suppilerAddr) {
        this.suppilerAddr = suppilerAddr == null ? null : suppilerAddr.trim();
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman == null ? null : linkman.trim();
    }

    public String getLinkmanTel() {
        return linkmanTel;
    }

    public void setLinkmanTel(String linkmanTel) {
        this.linkmanTel = linkmanTel == null ? null : linkmanTel.trim();
    }

    public String getLinkmanEmail() {
        return linkmanEmail;
    }

    public void setLinkmanEmail(String linkmanEmail) {
        this.linkmanEmail = linkmanEmail == null ? null : linkmanEmail.trim();
    }

    public String getInternetsite() {
        return internetsite;
    }

    public void setInternetsite(String internetsite) {
        this.internetsite = internetsite == null ? null : internetsite.trim();
    }

    public String getIsvail() {
        return isvail;
    }

    public void setIsvail(String isvail) {
        this.isvail = isvail == null ? null : isvail.trim();
    }

    public String getIsdel() {
        return isdel;
    }

    public void setIsdel(String isdel) {
        this.isdel = isdel == null ? null : isdel.trim();
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
        sb.append(", suppilerId=").append(suppilerId);
        sb.append(", suppilerNo=").append(suppilerNo);
        sb.append(", suppilerName=").append(suppilerName);
        sb.append(", suppilerType=").append(suppilerType);
        sb.append(", suppilerAddr=").append(suppilerAddr);
        sb.append(", linkman=").append(linkman);
        sb.append(", linkmanTel=").append(linkmanTel);
        sb.append(", linkmanEmail=").append(linkmanEmail);
        sb.append(", internetsite=").append(internetsite);
        sb.append(", isvail=").append(isvail);
        sb.append(", isdel=").append(isdel);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}