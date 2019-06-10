package com.jxlg.logistic.transport.entity;

import java.io.Serializable;

public class Cartype implements Serializable {
    private String cartypeId;

    private String cartypeName;

    private static final long serialVersionUID = 1L;

    public String getCartypeId() {
        return cartypeId;
    }

    public void setCartypeId(String cartypeId) {
        this.cartypeId = cartypeId == null ? null : cartypeId.trim();
    }

    public String getCartypeName() {
        return cartypeName;
    }

    public void setCartypeName(String cartypeName) {
        this.cartypeName = cartypeName == null ? null : cartypeName.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", cartypeId=").append(cartypeId);
        sb.append(", cartypeName=").append(cartypeName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}