package com.jxlg.logistic.module.sys.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.springframework.data.annotation.Id;

@org.springframework.data.elasticsearch.annotations.Document(indexName = "testemployee",type = "employee")
//@org.springframework.data.mongodb.core.mapping.Document(collection="employee")
public class Employee implements Serializable {
	@Id
    private String empId;

    private String empCode;
    
    private String empAccount;

    private String empName;

    private String empPassword;

    private String empSex;

    private Date empBirthday;

    private String empLiveAddress;

    private String empWorkAddress;

    private String empPhone;

    private Date empWorktime;

    private BigDecimal empSalary;

    private String empEmail;

    private String empIdcard;

    private String empBankcode;

    private String empWorkStatus;

    private String empMarryStatus;

    private static final long serialVersionUID = 1L;

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId == null ? null : empId.trim();
    }

    public String getEmpCode() {
        return empCode;
    }

    public void setEmpCode(String empCode) {
        this.empCode = empCode == null ? null : empCode.trim();
    }
    
    public String getEmpAccount() {
		return empAccount;
	}

	public void setEmpAccount(String empAccount) {
		 this.empAccount = empAccount == null ? null : empAccount.trim();
	}

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

    public String getEmpPassword() {
        return empPassword;
    }

    public void setEmpPassword(String empPassword) {
        this.empPassword = empPassword == null ? null : empPassword.trim();
    }

    public String getEmpSex() {
        return empSex;
    }

    public void setEmpSex(String empSex) {
        this.empSex = empSex == null ? null : empSex.trim();
    }

    public Date getEmpBirthday() {
        return empBirthday;
    }

    public void setEmpBirthday(Date empBirthday) {
        this.empBirthday = empBirthday;
    }

    public String getEmpLiveAddress() {
        return empLiveAddress;
    }

    public void setEmpLiveAddress(String empLiveAddress) {
        this.empLiveAddress = empLiveAddress == null ? null : empLiveAddress.trim();
    }

    public String getEmpWorkAddress() {
        return empWorkAddress;
    }

    public void setEmpWorkAddress(String empWorkAddress) {
        this.empWorkAddress = empWorkAddress == null ? null : empWorkAddress.trim();
    }

    public String getEmpPhone() {
        return empPhone;
    }

    public void setEmpPhone(String empPhone) {
        this.empPhone = empPhone == null ? null : empPhone.trim();
    }

    public Date getEmpWorktime() {
        return empWorktime;
    }

    public void setEmpWorktime(Date empWorktime) {
        this.empWorktime = empWorktime;
    }

    public BigDecimal getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(BigDecimal empSalary) {
        this.empSalary = empSalary;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail == null ? null : empEmail.trim();
    }

    public String getEmpIdcard() {
        return empIdcard;
    }

    public void setEmpIdcard(String empIdcard) {
        this.empIdcard = empIdcard == null ? null : empIdcard.trim();
    }

    public String getEmpBankcode() {
        return empBankcode;
    }

    public void setEmpBankcode(String empBankcode) {
        this.empBankcode = empBankcode == null ? null : empBankcode.trim();
    }

    public String getEmpWorkStatus() {
        return empWorkStatus;
    }

    public void setEmpWorkStatus(String empWorkStatus) {
        this.empWorkStatus = empWorkStatus == null ? null : empWorkStatus.trim();
    }

    public String getEmpMarryStatus() {
        return empMarryStatus;
    }

    public void setEmpMarryStatus(String empMarryStatus) {
        this.empMarryStatus = empMarryStatus == null ? null : empMarryStatus.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", empId=").append(empId);
        sb.append(", empCode=").append(empCode);
        sb.append(", empAccount=").append(empAccount);
        sb.append(", empName=").append(empName);
        sb.append(", empPassword=").append(empPassword);
        sb.append(", empSex=").append(empSex);
        sb.append(", empBirthday=").append(empBirthday);
        sb.append(", empLiveAddress=").append(empLiveAddress);
        sb.append(", empWorkAddress=").append(empWorkAddress);
        sb.append(", empPhone=").append(empPhone);
        sb.append(", empWorktime=").append(empWorktime);
        sb.append(", empSalary=").append(empSalary);
        sb.append(", empEmail=").append(empEmail);
        sb.append(", empIdcard=").append(empIdcard);
        sb.append(", empBankcode=").append(empBankcode);
        sb.append(", empWorkStatus=").append(empWorkStatus);
        sb.append(", empMarryStatus=").append(empMarryStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}