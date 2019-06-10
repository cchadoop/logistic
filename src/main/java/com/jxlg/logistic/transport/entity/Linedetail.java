package com.jxlg.logistic.transport.entity;

import java.io.Serializable;

public class Linedetail implements Serializable {
    private String linedetailId;

    private String lineId;

    private String deliveryspotId;

    private Integer lineIndex;

    private static final long serialVersionUID = 1L;

    public String getLinedetailId() {
        return linedetailId;
    }

    public void setLinedetailId(String linedetailId) {
        this.linedetailId = linedetailId == null ? null : linedetailId.trim();
    }

    public String getLineId() {
        return lineId;
    }

    public void setLineId(String lineId) {
        this.lineId = lineId == null ? null : lineId.trim();
    }

    public String getDeliveryspotId() {
        return deliveryspotId;
    }

    public void setDeliveryspotId(String deliveryspotId) {
        this.deliveryspotId = deliveryspotId == null ? null : deliveryspotId.trim();
    }

    public Integer getLineIndex() {
        return lineIndex;
    }

    public void setLineIndex(Integer lineIndex) {
        this.lineIndex = lineIndex;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", linedetailId=").append(linedetailId);
        sb.append(", lineId=").append(lineId);
        sb.append(", deliveryspotId=").append(deliveryspotId);
        sb.append(", lineIndex=").append(lineIndex);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}