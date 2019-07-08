package com.jxlg.logistic.module.data.entity;

import java.io.Serializable;

public class DataDictionaryDetail implements Serializable {
    private String dictionaryDetailId;

    private String dataDictionaryId;

    private String dictionaryDetailCode;

    private String dictionaryDetailLabel;

    private Integer dictionaryDetailXh;

    private String optionLabel;

    private static final long serialVersionUID = 1L;

    public String getDictionaryDetailId() {
        return dictionaryDetailId;
    }

    public void setDictionaryDetailId(String dictionaryDetailId) {
        this.dictionaryDetailId = dictionaryDetailId == null ? null : dictionaryDetailId.trim();
    }

    public String getDataDictionaryId() {
        return dataDictionaryId;
    }

    public void setDataDictionaryId(String dataDictionaryId) {
        this.dataDictionaryId = dataDictionaryId == null ? null : dataDictionaryId.trim();
    }

    public String getDictionaryDetailCode() {
        return dictionaryDetailCode;
    }

    public void setDictionaryDetailCode(String dictionaryDetailCode) {
        this.dictionaryDetailCode = dictionaryDetailCode == null ? null : dictionaryDetailCode.trim();
    }

    public String getDictionaryDetailLabel() {
        return dictionaryDetailLabel;
    }

    public void setDictionaryDetailLabel(String dictionaryDetailLabel) {
        this.dictionaryDetailLabel = dictionaryDetailLabel == null ? null : dictionaryDetailLabel.trim();
    }

    public Integer getDictionaryDetailXh() {
        return dictionaryDetailXh;
    }

    public void setDictionaryDetailXh(Integer dictionaryDetailXh) {
        this.dictionaryDetailXh = dictionaryDetailXh;
    }

    public String getOptionLabel() {
        return optionLabel;
    }

    public void setOptionLabel(String optionLabel) {
        this.optionLabel = optionLabel == null ? null : optionLabel.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", dictionaryDetailId=").append(dictionaryDetailId);
        sb.append(", dataDictionaryId=").append(dataDictionaryId);
        sb.append(", dictionaryDetailCode=").append(dictionaryDetailCode);
        sb.append(", dictionaryDetailLabel=").append(dictionaryDetailLabel);
        sb.append(", dictionaryDetailXh=").append(dictionaryDetailXh);
        sb.append(", optionLabel=").append(optionLabel);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}