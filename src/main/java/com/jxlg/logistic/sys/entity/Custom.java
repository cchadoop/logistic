package com.jxlg.logistic.sys.entity;

import java.io.Serializable;
import java.util.Date;

public class Custom implements Serializable {
    private String cstId;

    private String cstCode;

    private String cstName;

    private String cstPassword;

    private Date cstBirthday;

    private String cstSex;

    private String cstEmail;

    private String cstPhone;

    private String cstAddress;

    private String cstIdcard;

    private Date createTime;

    private String cstStatus;

    private static final long serialVersionUID = 1L;

    public String getCstId() {
        return cstId;
    }

    public void setCstId(String cstId) {
        this.cstId = cstId == null ? null : cstId.trim();
    }

    public String getCstCode() {
        return cstCode;
    }

    public void setCstCode(String cstCode) {
        this.cstCode = cstCode == null ? null : cstCode.trim();
    }

    public String getCstName() {
        return cstName;
    }

    public void setCstName(String cstName) {
        this.cstName = cstName == null ? null : cstName.trim();
    }

    public String getCstPassword() {
        return cstPassword;
    }

    public void setCstPassword(String cstPassword) {
        this.cstPassword = cstPassword == null ? null : cstPassword.trim();
    }

    public Date getCstBirthday() {
        return cstBirthday;
    }

    public void setCstBirthday(Date cstBirthday) {
        this.cstBirthday = cstBirthday;
    }

    public String getCstSex() {
        return cstSex;
    }

    public void setCstSex(String cstSex) {
        this.cstSex = cstSex == null ? null : cstSex.trim();
    }

    public String getCstEmail() {
        return cstEmail;
    }

    public void setCstEmail(String cstEmail) {
        this.cstEmail = cstEmail == null ? null : cstEmail.trim();
    }

    public String getCstPhone() {
        return cstPhone;
    }

    public void setCstPhone(String cstPhone) {
        this.cstPhone = cstPhone == null ? null : cstPhone.trim();
    }

    public String getCstAddress() {
        return cstAddress;
    }

    public void setCstAddress(String cstAddress) {
        this.cstAddress = cstAddress == null ? null : cstAddress.trim();
    }

    public String getCstIdcard() {
        return cstIdcard;
    }

    public void setCstIdcard(String cstIdcard) {
        this.cstIdcard = cstIdcard == null ? null : cstIdcard.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCstStatus() {
        return cstStatus;
    }

    public void setCstStatus(String cstStatus) {
        this.cstStatus = cstStatus == null ? null : cstStatus.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cstId=").append(cstId);
        sb.append(", cstCode=").append(cstCode);
        sb.append(", cstName=").append(cstName);
        sb.append(", cstPassword=").append(cstPassword);
        sb.append(", cstBirthday=").append(cstBirthday);
        sb.append(", cstSex=").append(cstSex);
        sb.append(", cstEmail=").append(cstEmail);
        sb.append(", cstPhone=").append(cstPhone);
        sb.append(", cstAddress=").append(cstAddress);
        sb.append(", cstIdcard=").append(cstIdcard);
        sb.append(", createTime=").append(createTime);
        sb.append(", cstStatus=").append(cstStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}