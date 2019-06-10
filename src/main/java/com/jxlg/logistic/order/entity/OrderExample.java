package com.jxlg.logistic.order.entity;

import java.util.ArrayList;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("order_id like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("order_id not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andSendNameIsNull() {
            addCriterion("send_name is null");
            return (Criteria) this;
        }

        public Criteria andSendNameIsNotNull() {
            addCriterion("send_name is not null");
            return (Criteria) this;
        }

        public Criteria andSendNameEqualTo(String value) {
            addCriterion("send_name =", value, "sendName");
            return (Criteria) this;
        }

        public Criteria andSendNameNotEqualTo(String value) {
            addCriterion("send_name <>", value, "sendName");
            return (Criteria) this;
        }

        public Criteria andSendNameGreaterThan(String value) {
            addCriterion("send_name >", value, "sendName");
            return (Criteria) this;
        }

        public Criteria andSendNameGreaterThanOrEqualTo(String value) {
            addCriterion("send_name >=", value, "sendName");
            return (Criteria) this;
        }

        public Criteria andSendNameLessThan(String value) {
            addCriterion("send_name <", value, "sendName");
            return (Criteria) this;
        }

        public Criteria andSendNameLessThanOrEqualTo(String value) {
            addCriterion("send_name <=", value, "sendName");
            return (Criteria) this;
        }

        public Criteria andSendNameLike(String value) {
            addCriterion("send_name like", value, "sendName");
            return (Criteria) this;
        }

        public Criteria andSendNameNotLike(String value) {
            addCriterion("send_name not like", value, "sendName");
            return (Criteria) this;
        }

        public Criteria andSendNameIn(List<String> values) {
            addCriterion("send_name in", values, "sendName");
            return (Criteria) this;
        }

        public Criteria andSendNameNotIn(List<String> values) {
            addCriterion("send_name not in", values, "sendName");
            return (Criteria) this;
        }

        public Criteria andSendNameBetween(String value1, String value2) {
            addCriterion("send_name between", value1, value2, "sendName");
            return (Criteria) this;
        }

        public Criteria andSendNameNotBetween(String value1, String value2) {
            addCriterion("send_name not between", value1, value2, "sendName");
            return (Criteria) this;
        }

        public Criteria andSendAddrIsNull() {
            addCriterion("send_addr is null");
            return (Criteria) this;
        }

        public Criteria andSendAddrIsNotNull() {
            addCriterion("send_addr is not null");
            return (Criteria) this;
        }

        public Criteria andSendAddrEqualTo(String value) {
            addCriterion("send_addr =", value, "sendAddr");
            return (Criteria) this;
        }

        public Criteria andSendAddrNotEqualTo(String value) {
            addCriterion("send_addr <>", value, "sendAddr");
            return (Criteria) this;
        }

        public Criteria andSendAddrGreaterThan(String value) {
            addCriterion("send_addr >", value, "sendAddr");
            return (Criteria) this;
        }

        public Criteria andSendAddrGreaterThanOrEqualTo(String value) {
            addCriterion("send_addr >=", value, "sendAddr");
            return (Criteria) this;
        }

        public Criteria andSendAddrLessThan(String value) {
            addCriterion("send_addr <", value, "sendAddr");
            return (Criteria) this;
        }

        public Criteria andSendAddrLessThanOrEqualTo(String value) {
            addCriterion("send_addr <=", value, "sendAddr");
            return (Criteria) this;
        }

        public Criteria andSendAddrLike(String value) {
            addCriterion("send_addr like", value, "sendAddr");
            return (Criteria) this;
        }

        public Criteria andSendAddrNotLike(String value) {
            addCriterion("send_addr not like", value, "sendAddr");
            return (Criteria) this;
        }

        public Criteria andSendAddrIn(List<String> values) {
            addCriterion("send_addr in", values, "sendAddr");
            return (Criteria) this;
        }

        public Criteria andSendAddrNotIn(List<String> values) {
            addCriterion("send_addr not in", values, "sendAddr");
            return (Criteria) this;
        }

        public Criteria andSendAddrBetween(String value1, String value2) {
            addCriterion("send_addr between", value1, value2, "sendAddr");
            return (Criteria) this;
        }

        public Criteria andSendAddrNotBetween(String value1, String value2) {
            addCriterion("send_addr not between", value1, value2, "sendAddr");
            return (Criteria) this;
        }

        public Criteria andSendAddrCodeIsNull() {
            addCriterion("send_addr_code is null");
            return (Criteria) this;
        }

        public Criteria andSendAddrCodeIsNotNull() {
            addCriterion("send_addr_code is not null");
            return (Criteria) this;
        }

        public Criteria andSendAddrCodeEqualTo(String value) {
            addCriterion("send_addr_code =", value, "sendAddrCode");
            return (Criteria) this;
        }

        public Criteria andSendAddrCodeNotEqualTo(String value) {
            addCriterion("send_addr_code <>", value, "sendAddrCode");
            return (Criteria) this;
        }

        public Criteria andSendAddrCodeGreaterThan(String value) {
            addCriterion("send_addr_code >", value, "sendAddrCode");
            return (Criteria) this;
        }

        public Criteria andSendAddrCodeGreaterThanOrEqualTo(String value) {
            addCriterion("send_addr_code >=", value, "sendAddrCode");
            return (Criteria) this;
        }

        public Criteria andSendAddrCodeLessThan(String value) {
            addCriterion("send_addr_code <", value, "sendAddrCode");
            return (Criteria) this;
        }

        public Criteria andSendAddrCodeLessThanOrEqualTo(String value) {
            addCriterion("send_addr_code <=", value, "sendAddrCode");
            return (Criteria) this;
        }

        public Criteria andSendAddrCodeLike(String value) {
            addCriterion("send_addr_code like", value, "sendAddrCode");
            return (Criteria) this;
        }

        public Criteria andSendAddrCodeNotLike(String value) {
            addCriterion("send_addr_code not like", value, "sendAddrCode");
            return (Criteria) this;
        }

        public Criteria andSendAddrCodeIn(List<String> values) {
            addCriterion("send_addr_code in", values, "sendAddrCode");
            return (Criteria) this;
        }

        public Criteria andSendAddrCodeNotIn(List<String> values) {
            addCriterion("send_addr_code not in", values, "sendAddrCode");
            return (Criteria) this;
        }

        public Criteria andSendAddrCodeBetween(String value1, String value2) {
            addCriterion("send_addr_code between", value1, value2, "sendAddrCode");
            return (Criteria) this;
        }

        public Criteria andSendAddrCodeNotBetween(String value1, String value2) {
            addCriterion("send_addr_code not between", value1, value2, "sendAddrCode");
            return (Criteria) this;
        }

        public Criteria andSendTelIsNull() {
            addCriterion("send_tel is null");
            return (Criteria) this;
        }

        public Criteria andSendTelIsNotNull() {
            addCriterion("send_tel is not null");
            return (Criteria) this;
        }

        public Criteria andSendTelEqualTo(String value) {
            addCriterion("send_tel =", value, "sendTel");
            return (Criteria) this;
        }

        public Criteria andSendTelNotEqualTo(String value) {
            addCriterion("send_tel <>", value, "sendTel");
            return (Criteria) this;
        }

        public Criteria andSendTelGreaterThan(String value) {
            addCriterion("send_tel >", value, "sendTel");
            return (Criteria) this;
        }

        public Criteria andSendTelGreaterThanOrEqualTo(String value) {
            addCriterion("send_tel >=", value, "sendTel");
            return (Criteria) this;
        }

        public Criteria andSendTelLessThan(String value) {
            addCriterion("send_tel <", value, "sendTel");
            return (Criteria) this;
        }

        public Criteria andSendTelLessThanOrEqualTo(String value) {
            addCriterion("send_tel <=", value, "sendTel");
            return (Criteria) this;
        }

        public Criteria andSendTelLike(String value) {
            addCriterion("send_tel like", value, "sendTel");
            return (Criteria) this;
        }

        public Criteria andSendTelNotLike(String value) {
            addCriterion("send_tel not like", value, "sendTel");
            return (Criteria) this;
        }

        public Criteria andSendTelIn(List<String> values) {
            addCriterion("send_tel in", values, "sendTel");
            return (Criteria) this;
        }

        public Criteria andSendTelNotIn(List<String> values) {
            addCriterion("send_tel not in", values, "sendTel");
            return (Criteria) this;
        }

        public Criteria andSendTelBetween(String value1, String value2) {
            addCriterion("send_tel between", value1, value2, "sendTel");
            return (Criteria) this;
        }

        public Criteria andSendTelNotBetween(String value1, String value2) {
            addCriterion("send_tel not between", value1, value2, "sendTel");
            return (Criteria) this;
        }

        public Criteria andReceiveNameIsNull() {
            addCriterion("receive_name is null");
            return (Criteria) this;
        }

        public Criteria andReceiveNameIsNotNull() {
            addCriterion("receive_name is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveNameEqualTo(String value) {
            addCriterion("receive_name =", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameNotEqualTo(String value) {
            addCriterion("receive_name <>", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameGreaterThan(String value) {
            addCriterion("receive_name >", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameGreaterThanOrEqualTo(String value) {
            addCriterion("receive_name >=", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameLessThan(String value) {
            addCriterion("receive_name <", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameLessThanOrEqualTo(String value) {
            addCriterion("receive_name <=", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameLike(String value) {
            addCriterion("receive_name like", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameNotLike(String value) {
            addCriterion("receive_name not like", value, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameIn(List<String> values) {
            addCriterion("receive_name in", values, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameNotIn(List<String> values) {
            addCriterion("receive_name not in", values, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameBetween(String value1, String value2) {
            addCriterion("receive_name between", value1, value2, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveNameNotBetween(String value1, String value2) {
            addCriterion("receive_name not between", value1, value2, "receiveName");
            return (Criteria) this;
        }

        public Criteria andReceiveAddrIsNull() {
            addCriterion("receive_addr is null");
            return (Criteria) this;
        }

        public Criteria andReceiveAddrIsNotNull() {
            addCriterion("receive_addr is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveAddrEqualTo(String value) {
            addCriterion("receive_addr =", value, "receiveAddr");
            return (Criteria) this;
        }

        public Criteria andReceiveAddrNotEqualTo(String value) {
            addCriterion("receive_addr <>", value, "receiveAddr");
            return (Criteria) this;
        }

        public Criteria andReceiveAddrGreaterThan(String value) {
            addCriterion("receive_addr >", value, "receiveAddr");
            return (Criteria) this;
        }

        public Criteria andReceiveAddrGreaterThanOrEqualTo(String value) {
            addCriterion("receive_addr >=", value, "receiveAddr");
            return (Criteria) this;
        }

        public Criteria andReceiveAddrLessThan(String value) {
            addCriterion("receive_addr <", value, "receiveAddr");
            return (Criteria) this;
        }

        public Criteria andReceiveAddrLessThanOrEqualTo(String value) {
            addCriterion("receive_addr <=", value, "receiveAddr");
            return (Criteria) this;
        }

        public Criteria andReceiveAddrLike(String value) {
            addCriterion("receive_addr like", value, "receiveAddr");
            return (Criteria) this;
        }

        public Criteria andReceiveAddrNotLike(String value) {
            addCriterion("receive_addr not like", value, "receiveAddr");
            return (Criteria) this;
        }

        public Criteria andReceiveAddrIn(List<String> values) {
            addCriterion("receive_addr in", values, "receiveAddr");
            return (Criteria) this;
        }

        public Criteria andReceiveAddrNotIn(List<String> values) {
            addCriterion("receive_addr not in", values, "receiveAddr");
            return (Criteria) this;
        }

        public Criteria andReceiveAddrBetween(String value1, String value2) {
            addCriterion("receive_addr between", value1, value2, "receiveAddr");
            return (Criteria) this;
        }

        public Criteria andReceiveAddrNotBetween(String value1, String value2) {
            addCriterion("receive_addr not between", value1, value2, "receiveAddr");
            return (Criteria) this;
        }

        public Criteria andReceiveAddrCodeIsNull() {
            addCriterion("receive_addr_code is null");
            return (Criteria) this;
        }

        public Criteria andReceiveAddrCodeIsNotNull() {
            addCriterion("receive_addr_code is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveAddrCodeEqualTo(String value) {
            addCriterion("receive_addr_code =", value, "receiveAddrCode");
            return (Criteria) this;
        }

        public Criteria andReceiveAddrCodeNotEqualTo(String value) {
            addCriterion("receive_addr_code <>", value, "receiveAddrCode");
            return (Criteria) this;
        }

        public Criteria andReceiveAddrCodeGreaterThan(String value) {
            addCriterion("receive_addr_code >", value, "receiveAddrCode");
            return (Criteria) this;
        }

        public Criteria andReceiveAddrCodeGreaterThanOrEqualTo(String value) {
            addCriterion("receive_addr_code >=", value, "receiveAddrCode");
            return (Criteria) this;
        }

        public Criteria andReceiveAddrCodeLessThan(String value) {
            addCriterion("receive_addr_code <", value, "receiveAddrCode");
            return (Criteria) this;
        }

        public Criteria andReceiveAddrCodeLessThanOrEqualTo(String value) {
            addCriterion("receive_addr_code <=", value, "receiveAddrCode");
            return (Criteria) this;
        }

        public Criteria andReceiveAddrCodeLike(String value) {
            addCriterion("receive_addr_code like", value, "receiveAddrCode");
            return (Criteria) this;
        }

        public Criteria andReceiveAddrCodeNotLike(String value) {
            addCriterion("receive_addr_code not like", value, "receiveAddrCode");
            return (Criteria) this;
        }

        public Criteria andReceiveAddrCodeIn(List<String> values) {
            addCriterion("receive_addr_code in", values, "receiveAddrCode");
            return (Criteria) this;
        }

        public Criteria andReceiveAddrCodeNotIn(List<String> values) {
            addCriterion("receive_addr_code not in", values, "receiveAddrCode");
            return (Criteria) this;
        }

        public Criteria andReceiveAddrCodeBetween(String value1, String value2) {
            addCriterion("receive_addr_code between", value1, value2, "receiveAddrCode");
            return (Criteria) this;
        }

        public Criteria andReceiveAddrCodeNotBetween(String value1, String value2) {
            addCriterion("receive_addr_code not between", value1, value2, "receiveAddrCode");
            return (Criteria) this;
        }

        public Criteria andReceiveTelIsNull() {
            addCriterion("receive_tel is null");
            return (Criteria) this;
        }

        public Criteria andReceiveTelIsNotNull() {
            addCriterion("receive_tel is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveTelEqualTo(String value) {
            addCriterion("receive_tel =", value, "receiveTel");
            return (Criteria) this;
        }

        public Criteria andReceiveTelNotEqualTo(String value) {
            addCriterion("receive_tel <>", value, "receiveTel");
            return (Criteria) this;
        }

        public Criteria andReceiveTelGreaterThan(String value) {
            addCriterion("receive_tel >", value, "receiveTel");
            return (Criteria) this;
        }

        public Criteria andReceiveTelGreaterThanOrEqualTo(String value) {
            addCriterion("receive_tel >=", value, "receiveTel");
            return (Criteria) this;
        }

        public Criteria andReceiveTelLessThan(String value) {
            addCriterion("receive_tel <", value, "receiveTel");
            return (Criteria) this;
        }

        public Criteria andReceiveTelLessThanOrEqualTo(String value) {
            addCriterion("receive_tel <=", value, "receiveTel");
            return (Criteria) this;
        }

        public Criteria andReceiveTelLike(String value) {
            addCriterion("receive_tel like", value, "receiveTel");
            return (Criteria) this;
        }

        public Criteria andReceiveTelNotLike(String value) {
            addCriterion("receive_tel not like", value, "receiveTel");
            return (Criteria) this;
        }

        public Criteria andReceiveTelIn(List<String> values) {
            addCriterion("receive_tel in", values, "receiveTel");
            return (Criteria) this;
        }

        public Criteria andReceiveTelNotIn(List<String> values) {
            addCriterion("receive_tel not in", values, "receiveTel");
            return (Criteria) this;
        }

        public Criteria andReceiveTelBetween(String value1, String value2) {
            addCriterion("receive_tel between", value1, value2, "receiveTel");
            return (Criteria) this;
        }

        public Criteria andReceiveTelNotBetween(String value1, String value2) {
            addCriterion("receive_tel not between", value1, value2, "receiveTel");
            return (Criteria) this;
        }

        public Criteria andIsdelIsNull() {
            addCriterion("isdel is null");
            return (Criteria) this;
        }

        public Criteria andIsdelIsNotNull() {
            addCriterion("isdel is not null");
            return (Criteria) this;
        }

        public Criteria andIsdelEqualTo(String value) {
            addCriterion("isdel =", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotEqualTo(String value) {
            addCriterion("isdel <>", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelGreaterThan(String value) {
            addCriterion("isdel >", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelGreaterThanOrEqualTo(String value) {
            addCriterion("isdel >=", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelLessThan(String value) {
            addCriterion("isdel <", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelLessThanOrEqualTo(String value) {
            addCriterion("isdel <=", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelLike(String value) {
            addCriterion("isdel like", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotLike(String value) {
            addCriterion("isdel not like", value, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelIn(List<String> values) {
            addCriterion("isdel in", values, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotIn(List<String> values) {
            addCriterion("isdel not in", values, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelBetween(String value1, String value2) {
            addCriterion("isdel between", value1, value2, "isdel");
            return (Criteria) this;
        }

        public Criteria andIsdelNotBetween(String value1, String value2) {
            addCriterion("isdel not between", value1, value2, "isdel");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}