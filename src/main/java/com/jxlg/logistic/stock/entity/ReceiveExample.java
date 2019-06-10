package com.jxlg.logistic.stock.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReceiveExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReceiveExample() {
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

        public Criteria andReceiveIdIsNull() {
            addCriterion("receive_id is null");
            return (Criteria) this;
        }

        public Criteria andReceiveIdIsNotNull() {
            addCriterion("receive_id is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveIdEqualTo(String value) {
            addCriterion("receive_id =", value, "receiveId");
            return (Criteria) this;
        }

        public Criteria andReceiveIdNotEqualTo(String value) {
            addCriterion("receive_id <>", value, "receiveId");
            return (Criteria) this;
        }

        public Criteria andReceiveIdGreaterThan(String value) {
            addCriterion("receive_id >", value, "receiveId");
            return (Criteria) this;
        }

        public Criteria andReceiveIdGreaterThanOrEqualTo(String value) {
            addCriterion("receive_id >=", value, "receiveId");
            return (Criteria) this;
        }

        public Criteria andReceiveIdLessThan(String value) {
            addCriterion("receive_id <", value, "receiveId");
            return (Criteria) this;
        }

        public Criteria andReceiveIdLessThanOrEqualTo(String value) {
            addCriterion("receive_id <=", value, "receiveId");
            return (Criteria) this;
        }

        public Criteria andReceiveIdLike(String value) {
            addCriterion("receive_id like", value, "receiveId");
            return (Criteria) this;
        }

        public Criteria andReceiveIdNotLike(String value) {
            addCriterion("receive_id not like", value, "receiveId");
            return (Criteria) this;
        }

        public Criteria andReceiveIdIn(List<String> values) {
            addCriterion("receive_id in", values, "receiveId");
            return (Criteria) this;
        }

        public Criteria andReceiveIdNotIn(List<String> values) {
            addCriterion("receive_id not in", values, "receiveId");
            return (Criteria) this;
        }

        public Criteria andReceiveIdBetween(String value1, String value2) {
            addCriterion("receive_id between", value1, value2, "receiveId");
            return (Criteria) this;
        }

        public Criteria andReceiveIdNotBetween(String value1, String value2) {
            addCriterion("receive_id not between", value1, value2, "receiveId");
            return (Criteria) this;
        }

        public Criteria andReceiveNoIsNull() {
            addCriterion("receive_no is null");
            return (Criteria) this;
        }

        public Criteria andReceiveNoIsNotNull() {
            addCriterion("receive_no is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveNoEqualTo(String value) {
            addCriterion("receive_no =", value, "receiveNo");
            return (Criteria) this;
        }

        public Criteria andReceiveNoNotEqualTo(String value) {
            addCriterion("receive_no <>", value, "receiveNo");
            return (Criteria) this;
        }

        public Criteria andReceiveNoGreaterThan(String value) {
            addCriterion("receive_no >", value, "receiveNo");
            return (Criteria) this;
        }

        public Criteria andReceiveNoGreaterThanOrEqualTo(String value) {
            addCriterion("receive_no >=", value, "receiveNo");
            return (Criteria) this;
        }

        public Criteria andReceiveNoLessThan(String value) {
            addCriterion("receive_no <", value, "receiveNo");
            return (Criteria) this;
        }

        public Criteria andReceiveNoLessThanOrEqualTo(String value) {
            addCriterion("receive_no <=", value, "receiveNo");
            return (Criteria) this;
        }

        public Criteria andReceiveNoLike(String value) {
            addCriterion("receive_no like", value, "receiveNo");
            return (Criteria) this;
        }

        public Criteria andReceiveNoNotLike(String value) {
            addCriterion("receive_no not like", value, "receiveNo");
            return (Criteria) this;
        }

        public Criteria andReceiveNoIn(List<String> values) {
            addCriterion("receive_no in", values, "receiveNo");
            return (Criteria) this;
        }

        public Criteria andReceiveNoNotIn(List<String> values) {
            addCriterion("receive_no not in", values, "receiveNo");
            return (Criteria) this;
        }

        public Criteria andReceiveNoBetween(String value1, String value2) {
            addCriterion("receive_no between", value1, value2, "receiveNo");
            return (Criteria) this;
        }

        public Criteria andReceiveNoNotBetween(String value1, String value2) {
            addCriterion("receive_no not between", value1, value2, "receiveNo");
            return (Criteria) this;
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

        public Criteria andReceivePersonIsNull() {
            addCriterion("receive_person is null");
            return (Criteria) this;
        }

        public Criteria andReceivePersonIsNotNull() {
            addCriterion("receive_person is not null");
            return (Criteria) this;
        }

        public Criteria andReceivePersonEqualTo(String value) {
            addCriterion("receive_person =", value, "receivePerson");
            return (Criteria) this;
        }

        public Criteria andReceivePersonNotEqualTo(String value) {
            addCriterion("receive_person <>", value, "receivePerson");
            return (Criteria) this;
        }

        public Criteria andReceivePersonGreaterThan(String value) {
            addCriterion("receive_person >", value, "receivePerson");
            return (Criteria) this;
        }

        public Criteria andReceivePersonGreaterThanOrEqualTo(String value) {
            addCriterion("receive_person >=", value, "receivePerson");
            return (Criteria) this;
        }

        public Criteria andReceivePersonLessThan(String value) {
            addCriterion("receive_person <", value, "receivePerson");
            return (Criteria) this;
        }

        public Criteria andReceivePersonLessThanOrEqualTo(String value) {
            addCriterion("receive_person <=", value, "receivePerson");
            return (Criteria) this;
        }

        public Criteria andReceivePersonLike(String value) {
            addCriterion("receive_person like", value, "receivePerson");
            return (Criteria) this;
        }

        public Criteria andReceivePersonNotLike(String value) {
            addCriterion("receive_person not like", value, "receivePerson");
            return (Criteria) this;
        }

        public Criteria andReceivePersonIn(List<String> values) {
            addCriterion("receive_person in", values, "receivePerson");
            return (Criteria) this;
        }

        public Criteria andReceivePersonNotIn(List<String> values) {
            addCriterion("receive_person not in", values, "receivePerson");
            return (Criteria) this;
        }

        public Criteria andReceivePersonBetween(String value1, String value2) {
            addCriterion("receive_person between", value1, value2, "receivePerson");
            return (Criteria) this;
        }

        public Criteria andReceivePersonNotBetween(String value1, String value2) {
            addCriterion("receive_person not between", value1, value2, "receivePerson");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeIsNull() {
            addCriterion("receive_time is null");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeIsNotNull() {
            addCriterion("receive_time is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeEqualTo(Date value) {
            addCriterion("receive_time =", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotEqualTo(Date value) {
            addCriterion("receive_time <>", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeGreaterThan(Date value) {
            addCriterion("receive_time >", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("receive_time >=", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeLessThan(Date value) {
            addCriterion("receive_time <", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeLessThanOrEqualTo(Date value) {
            addCriterion("receive_time <=", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeIn(List<Date> values) {
            addCriterion("receive_time in", values, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotIn(List<Date> values) {
            addCriterion("receive_time not in", values, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeBetween(Date value1, Date value2) {
            addCriterion("receive_time between", value1, value2, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotBetween(Date value1, Date value2) {
            addCriterion("receive_time not between", value1, value2, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveStatusIsNull() {
            addCriterion("receive_status is null");
            return (Criteria) this;
        }

        public Criteria andReceiveStatusIsNotNull() {
            addCriterion("receive_status is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveStatusEqualTo(String value) {
            addCriterion("receive_status =", value, "receiveStatus");
            return (Criteria) this;
        }

        public Criteria andReceiveStatusNotEqualTo(String value) {
            addCriterion("receive_status <>", value, "receiveStatus");
            return (Criteria) this;
        }

        public Criteria andReceiveStatusGreaterThan(String value) {
            addCriterion("receive_status >", value, "receiveStatus");
            return (Criteria) this;
        }

        public Criteria andReceiveStatusGreaterThanOrEqualTo(String value) {
            addCriterion("receive_status >=", value, "receiveStatus");
            return (Criteria) this;
        }

        public Criteria andReceiveStatusLessThan(String value) {
            addCriterion("receive_status <", value, "receiveStatus");
            return (Criteria) this;
        }

        public Criteria andReceiveStatusLessThanOrEqualTo(String value) {
            addCriterion("receive_status <=", value, "receiveStatus");
            return (Criteria) this;
        }

        public Criteria andReceiveStatusLike(String value) {
            addCriterion("receive_status like", value, "receiveStatus");
            return (Criteria) this;
        }

        public Criteria andReceiveStatusNotLike(String value) {
            addCriterion("receive_status not like", value, "receiveStatus");
            return (Criteria) this;
        }

        public Criteria andReceiveStatusIn(List<String> values) {
            addCriterion("receive_status in", values, "receiveStatus");
            return (Criteria) this;
        }

        public Criteria andReceiveStatusNotIn(List<String> values) {
            addCriterion("receive_status not in", values, "receiveStatus");
            return (Criteria) this;
        }

        public Criteria andReceiveStatusBetween(String value1, String value2) {
            addCriterion("receive_status between", value1, value2, "receiveStatus");
            return (Criteria) this;
        }

        public Criteria andReceiveStatusNotBetween(String value1, String value2) {
            addCriterion("receive_status not between", value1, value2, "receiveStatus");
            return (Criteria) this;
        }

        public Criteria andReceiveWayIsNull() {
            addCriterion("receive_way is null");
            return (Criteria) this;
        }

        public Criteria andReceiveWayIsNotNull() {
            addCriterion("receive_way is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveWayEqualTo(String value) {
            addCriterion("receive_way =", value, "receiveWay");
            return (Criteria) this;
        }

        public Criteria andReceiveWayNotEqualTo(String value) {
            addCriterion("receive_way <>", value, "receiveWay");
            return (Criteria) this;
        }

        public Criteria andReceiveWayGreaterThan(String value) {
            addCriterion("receive_way >", value, "receiveWay");
            return (Criteria) this;
        }

        public Criteria andReceiveWayGreaterThanOrEqualTo(String value) {
            addCriterion("receive_way >=", value, "receiveWay");
            return (Criteria) this;
        }

        public Criteria andReceiveWayLessThan(String value) {
            addCriterion("receive_way <", value, "receiveWay");
            return (Criteria) this;
        }

        public Criteria andReceiveWayLessThanOrEqualTo(String value) {
            addCriterion("receive_way <=", value, "receiveWay");
            return (Criteria) this;
        }

        public Criteria andReceiveWayLike(String value) {
            addCriterion("receive_way like", value, "receiveWay");
            return (Criteria) this;
        }

        public Criteria andReceiveWayNotLike(String value) {
            addCriterion("receive_way not like", value, "receiveWay");
            return (Criteria) this;
        }

        public Criteria andReceiveWayIn(List<String> values) {
            addCriterion("receive_way in", values, "receiveWay");
            return (Criteria) this;
        }

        public Criteria andReceiveWayNotIn(List<String> values) {
            addCriterion("receive_way not in", values, "receiveWay");
            return (Criteria) this;
        }

        public Criteria andReceiveWayBetween(String value1, String value2) {
            addCriterion("receive_way between", value1, value2, "receiveWay");
            return (Criteria) this;
        }

        public Criteria andReceiveWayNotBetween(String value1, String value2) {
            addCriterion("receive_way not between", value1, value2, "receiveWay");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeIsNull() {
            addCriterion("confirm_time is null");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeIsNotNull() {
            addCriterion("confirm_time is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeEqualTo(Date value) {
            addCriterion("confirm_time =", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeNotEqualTo(Date value) {
            addCriterion("confirm_time <>", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeGreaterThan(Date value) {
            addCriterion("confirm_time >", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("confirm_time >=", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeLessThan(Date value) {
            addCriterion("confirm_time <", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeLessThanOrEqualTo(Date value) {
            addCriterion("confirm_time <=", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeIn(List<Date> values) {
            addCriterion("confirm_time in", values, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeNotIn(List<Date> values) {
            addCriterion("confirm_time not in", values, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeBetween(Date value1, Date value2) {
            addCriterion("confirm_time between", value1, value2, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeNotBetween(Date value1, Date value2) {
            addCriterion("confirm_time not between", value1, value2, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmAddrIsNull() {
            addCriterion("confirm_addr is null");
            return (Criteria) this;
        }

        public Criteria andConfirmAddrIsNotNull() {
            addCriterion("confirm_addr is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmAddrEqualTo(String value) {
            addCriterion("confirm_addr =", value, "confirmAddr");
            return (Criteria) this;
        }

        public Criteria andConfirmAddrNotEqualTo(String value) {
            addCriterion("confirm_addr <>", value, "confirmAddr");
            return (Criteria) this;
        }

        public Criteria andConfirmAddrGreaterThan(String value) {
            addCriterion("confirm_addr >", value, "confirmAddr");
            return (Criteria) this;
        }

        public Criteria andConfirmAddrGreaterThanOrEqualTo(String value) {
            addCriterion("confirm_addr >=", value, "confirmAddr");
            return (Criteria) this;
        }

        public Criteria andConfirmAddrLessThan(String value) {
            addCriterion("confirm_addr <", value, "confirmAddr");
            return (Criteria) this;
        }

        public Criteria andConfirmAddrLessThanOrEqualTo(String value) {
            addCriterion("confirm_addr <=", value, "confirmAddr");
            return (Criteria) this;
        }

        public Criteria andConfirmAddrLike(String value) {
            addCriterion("confirm_addr like", value, "confirmAddr");
            return (Criteria) this;
        }

        public Criteria andConfirmAddrNotLike(String value) {
            addCriterion("confirm_addr not like", value, "confirmAddr");
            return (Criteria) this;
        }

        public Criteria andConfirmAddrIn(List<String> values) {
            addCriterion("confirm_addr in", values, "confirmAddr");
            return (Criteria) this;
        }

        public Criteria andConfirmAddrNotIn(List<String> values) {
            addCriterion("confirm_addr not in", values, "confirmAddr");
            return (Criteria) this;
        }

        public Criteria andConfirmAddrBetween(String value1, String value2) {
            addCriterion("confirm_addr between", value1, value2, "confirmAddr");
            return (Criteria) this;
        }

        public Criteria andConfirmAddrNotBetween(String value1, String value2) {
            addCriterion("confirm_addr not between", value1, value2, "confirmAddr");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonIsNull() {
            addCriterion("confirm_person is null");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonIsNotNull() {
            addCriterion("confirm_person is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonEqualTo(String value) {
            addCriterion("confirm_person =", value, "confirmPerson");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonNotEqualTo(String value) {
            addCriterion("confirm_person <>", value, "confirmPerson");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonGreaterThan(String value) {
            addCriterion("confirm_person >", value, "confirmPerson");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonGreaterThanOrEqualTo(String value) {
            addCriterion("confirm_person >=", value, "confirmPerson");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonLessThan(String value) {
            addCriterion("confirm_person <", value, "confirmPerson");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonLessThanOrEqualTo(String value) {
            addCriterion("confirm_person <=", value, "confirmPerson");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonLike(String value) {
            addCriterion("confirm_person like", value, "confirmPerson");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonNotLike(String value) {
            addCriterion("confirm_person not like", value, "confirmPerson");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonIn(List<String> values) {
            addCriterion("confirm_person in", values, "confirmPerson");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonNotIn(List<String> values) {
            addCriterion("confirm_person not in", values, "confirmPerson");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonBetween(String value1, String value2) {
            addCriterion("confirm_person between", value1, value2, "confirmPerson");
            return (Criteria) this;
        }

        public Criteria andConfirmPersonNotBetween(String value1, String value2) {
            addCriterion("confirm_person not between", value1, value2, "confirmPerson");
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