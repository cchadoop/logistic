package com.jxlg.logistic.delivery.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HandlerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HandlerExample() {
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

        public Criteria andHandlerIdIsNull() {
            addCriterion("handler_id is null");
            return (Criteria) this;
        }

        public Criteria andHandlerIdIsNotNull() {
            addCriterion("handler_id is not null");
            return (Criteria) this;
        }

        public Criteria andHandlerIdEqualTo(String value) {
            addCriterion("handler_id =", value, "handlerId");
            return (Criteria) this;
        }

        public Criteria andHandlerIdNotEqualTo(String value) {
            addCriterion("handler_id <>", value, "handlerId");
            return (Criteria) this;
        }

        public Criteria andHandlerIdGreaterThan(String value) {
            addCriterion("handler_id >", value, "handlerId");
            return (Criteria) this;
        }

        public Criteria andHandlerIdGreaterThanOrEqualTo(String value) {
            addCriterion("handler_id >=", value, "handlerId");
            return (Criteria) this;
        }

        public Criteria andHandlerIdLessThan(String value) {
            addCriterion("handler_id <", value, "handlerId");
            return (Criteria) this;
        }

        public Criteria andHandlerIdLessThanOrEqualTo(String value) {
            addCriterion("handler_id <=", value, "handlerId");
            return (Criteria) this;
        }

        public Criteria andHandlerIdLike(String value) {
            addCriterion("handler_id like", value, "handlerId");
            return (Criteria) this;
        }

        public Criteria andHandlerIdNotLike(String value) {
            addCriterion("handler_id not like", value, "handlerId");
            return (Criteria) this;
        }

        public Criteria andHandlerIdIn(List<String> values) {
            addCriterion("handler_id in", values, "handlerId");
            return (Criteria) this;
        }

        public Criteria andHandlerIdNotIn(List<String> values) {
            addCriterion("handler_id not in", values, "handlerId");
            return (Criteria) this;
        }

        public Criteria andHandlerIdBetween(String value1, String value2) {
            addCriterion("handler_id between", value1, value2, "handlerId");
            return (Criteria) this;
        }

        public Criteria andHandlerIdNotBetween(String value1, String value2) {
            addCriterion("handler_id not between", value1, value2, "handlerId");
            return (Criteria) this;
        }

        public Criteria andHandlerNoIsNull() {
            addCriterion("handler_no is null");
            return (Criteria) this;
        }

        public Criteria andHandlerNoIsNotNull() {
            addCriterion("handler_no is not null");
            return (Criteria) this;
        }

        public Criteria andHandlerNoEqualTo(String value) {
            addCriterion("handler_no =", value, "handlerNo");
            return (Criteria) this;
        }

        public Criteria andHandlerNoNotEqualTo(String value) {
            addCriterion("handler_no <>", value, "handlerNo");
            return (Criteria) this;
        }

        public Criteria andHandlerNoGreaterThan(String value) {
            addCriterion("handler_no >", value, "handlerNo");
            return (Criteria) this;
        }

        public Criteria andHandlerNoGreaterThanOrEqualTo(String value) {
            addCriterion("handler_no >=", value, "handlerNo");
            return (Criteria) this;
        }

        public Criteria andHandlerNoLessThan(String value) {
            addCriterion("handler_no <", value, "handlerNo");
            return (Criteria) this;
        }

        public Criteria andHandlerNoLessThanOrEqualTo(String value) {
            addCriterion("handler_no <=", value, "handlerNo");
            return (Criteria) this;
        }

        public Criteria andHandlerNoLike(String value) {
            addCriterion("handler_no like", value, "handlerNo");
            return (Criteria) this;
        }

        public Criteria andHandlerNoNotLike(String value) {
            addCriterion("handler_no not like", value, "handlerNo");
            return (Criteria) this;
        }

        public Criteria andHandlerNoIn(List<String> values) {
            addCriterion("handler_no in", values, "handlerNo");
            return (Criteria) this;
        }

        public Criteria andHandlerNoNotIn(List<String> values) {
            addCriterion("handler_no not in", values, "handlerNo");
            return (Criteria) this;
        }

        public Criteria andHandlerNoBetween(String value1, String value2) {
            addCriterion("handler_no between", value1, value2, "handlerNo");
            return (Criteria) this;
        }

        public Criteria andHandlerNoNotBetween(String value1, String value2) {
            addCriterion("handler_no not between", value1, value2, "handlerNo");
            return (Criteria) this;
        }

        public Criteria andEmpIdIsNull() {
            addCriterion("emp_id is null");
            return (Criteria) this;
        }

        public Criteria andEmpIdIsNotNull() {
            addCriterion("emp_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmpIdEqualTo(String value) {
            addCriterion("emp_id =", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotEqualTo(String value) {
            addCriterion("emp_id <>", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThan(String value) {
            addCriterion("emp_id >", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdGreaterThanOrEqualTo(String value) {
            addCriterion("emp_id >=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThan(String value) {
            addCriterion("emp_id <", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLessThanOrEqualTo(String value) {
            addCriterion("emp_id <=", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdLike(String value) {
            addCriterion("emp_id like", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotLike(String value) {
            addCriterion("emp_id not like", value, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdIn(List<String> values) {
            addCriterion("emp_id in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotIn(List<String> values) {
            addCriterion("emp_id not in", values, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdBetween(String value1, String value2) {
            addCriterion("emp_id between", value1, value2, "empId");
            return (Criteria) this;
        }

        public Criteria andEmpIdNotBetween(String value1, String value2) {
            addCriterion("emp_id not between", value1, value2, "empId");
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

        public Criteria andDeliveryspotIdIsNull() {
            addCriterion("deliveryspot_id is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryspotIdIsNotNull() {
            addCriterion("deliveryspot_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryspotIdEqualTo(String value) {
            addCriterion("deliveryspot_id =", value, "deliveryspotId");
            return (Criteria) this;
        }

        public Criteria andDeliveryspotIdNotEqualTo(String value) {
            addCriterion("deliveryspot_id <>", value, "deliveryspotId");
            return (Criteria) this;
        }

        public Criteria andDeliveryspotIdGreaterThan(String value) {
            addCriterion("deliveryspot_id >", value, "deliveryspotId");
            return (Criteria) this;
        }

        public Criteria andDeliveryspotIdGreaterThanOrEqualTo(String value) {
            addCriterion("deliveryspot_id >=", value, "deliveryspotId");
            return (Criteria) this;
        }

        public Criteria andDeliveryspotIdLessThan(String value) {
            addCriterion("deliveryspot_id <", value, "deliveryspotId");
            return (Criteria) this;
        }

        public Criteria andDeliveryspotIdLessThanOrEqualTo(String value) {
            addCriterion("deliveryspot_id <=", value, "deliveryspotId");
            return (Criteria) this;
        }

        public Criteria andDeliveryspotIdLike(String value) {
            addCriterion("deliveryspot_id like", value, "deliveryspotId");
            return (Criteria) this;
        }

        public Criteria andDeliveryspotIdNotLike(String value) {
            addCriterion("deliveryspot_id not like", value, "deliveryspotId");
            return (Criteria) this;
        }

        public Criteria andDeliveryspotIdIn(List<String> values) {
            addCriterion("deliveryspot_id in", values, "deliveryspotId");
            return (Criteria) this;
        }

        public Criteria andDeliveryspotIdNotIn(List<String> values) {
            addCriterion("deliveryspot_id not in", values, "deliveryspotId");
            return (Criteria) this;
        }

        public Criteria andDeliveryspotIdBetween(String value1, String value2) {
            addCriterion("deliveryspot_id between", value1, value2, "deliveryspotId");
            return (Criteria) this;
        }

        public Criteria andDeliveryspotIdNotBetween(String value1, String value2) {
            addCriterion("deliveryspot_id not between", value1, value2, "deliveryspotId");
            return (Criteria) this;
        }

        public Criteria andCarIdIsNull() {
            addCriterion("car_id is null");
            return (Criteria) this;
        }

        public Criteria andCarIdIsNotNull() {
            addCriterion("car_id is not null");
            return (Criteria) this;
        }

        public Criteria andCarIdEqualTo(String value) {
            addCriterion("car_id =", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotEqualTo(String value) {
            addCriterion("car_id <>", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThan(String value) {
            addCriterion("car_id >", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdGreaterThanOrEqualTo(String value) {
            addCriterion("car_id >=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThan(String value) {
            addCriterion("car_id <", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLessThanOrEqualTo(String value) {
            addCriterion("car_id <=", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdLike(String value) {
            addCriterion("car_id like", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotLike(String value) {
            addCriterion("car_id not like", value, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdIn(List<String> values) {
            addCriterion("car_id in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotIn(List<String> values) {
            addCriterion("car_id not in", values, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdBetween(String value1, String value2) {
            addCriterion("car_id between", value1, value2, "carId");
            return (Criteria) this;
        }

        public Criteria andCarIdNotBetween(String value1, String value2) {
            addCriterion("car_id not between", value1, value2, "carId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andHandlerStatusIsNull() {
            addCriterion("handler_status is null");
            return (Criteria) this;
        }

        public Criteria andHandlerStatusIsNotNull() {
            addCriterion("handler_status is not null");
            return (Criteria) this;
        }

        public Criteria andHandlerStatusEqualTo(String value) {
            addCriterion("handler_status =", value, "handlerStatus");
            return (Criteria) this;
        }

        public Criteria andHandlerStatusNotEqualTo(String value) {
            addCriterion("handler_status <>", value, "handlerStatus");
            return (Criteria) this;
        }

        public Criteria andHandlerStatusGreaterThan(String value) {
            addCriterion("handler_status >", value, "handlerStatus");
            return (Criteria) this;
        }

        public Criteria andHandlerStatusGreaterThanOrEqualTo(String value) {
            addCriterion("handler_status >=", value, "handlerStatus");
            return (Criteria) this;
        }

        public Criteria andHandlerStatusLessThan(String value) {
            addCriterion("handler_status <", value, "handlerStatus");
            return (Criteria) this;
        }

        public Criteria andHandlerStatusLessThanOrEqualTo(String value) {
            addCriterion("handler_status <=", value, "handlerStatus");
            return (Criteria) this;
        }

        public Criteria andHandlerStatusLike(String value) {
            addCriterion("handler_status like", value, "handlerStatus");
            return (Criteria) this;
        }

        public Criteria andHandlerStatusNotLike(String value) {
            addCriterion("handler_status not like", value, "handlerStatus");
            return (Criteria) this;
        }

        public Criteria andHandlerStatusIn(List<String> values) {
            addCriterion("handler_status in", values, "handlerStatus");
            return (Criteria) this;
        }

        public Criteria andHandlerStatusNotIn(List<String> values) {
            addCriterion("handler_status not in", values, "handlerStatus");
            return (Criteria) this;
        }

        public Criteria andHandlerStatusBetween(String value1, String value2) {
            addCriterion("handler_status between", value1, value2, "handlerStatus");
            return (Criteria) this;
        }

        public Criteria andHandlerStatusNotBetween(String value1, String value2) {
            addCriterion("handler_status not between", value1, value2, "handlerStatus");
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