package com.jxlg.logistic.module.transport.entity;

import java.util.ArrayList;
import java.util.List;

public class LinedetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LinedetailExample() {
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

        public Criteria andLinedetailIdIsNull() {
            addCriterion("linedetail_id is null");
            return (Criteria) this;
        }

        public Criteria andLinedetailIdIsNotNull() {
            addCriterion("linedetail_id is not null");
            return (Criteria) this;
        }

        public Criteria andLinedetailIdEqualTo(String value) {
            addCriterion("linedetail_id =", value, "linedetailId");
            return (Criteria) this;
        }

        public Criteria andLinedetailIdNotEqualTo(String value) {
            addCriterion("linedetail_id <>", value, "linedetailId");
            return (Criteria) this;
        }

        public Criteria andLinedetailIdGreaterThan(String value) {
            addCriterion("linedetail_id >", value, "linedetailId");
            return (Criteria) this;
        }

        public Criteria andLinedetailIdGreaterThanOrEqualTo(String value) {
            addCriterion("linedetail_id >=", value, "linedetailId");
            return (Criteria) this;
        }

        public Criteria andLinedetailIdLessThan(String value) {
            addCriterion("linedetail_id <", value, "linedetailId");
            return (Criteria) this;
        }

        public Criteria andLinedetailIdLessThanOrEqualTo(String value) {
            addCriterion("linedetail_id <=", value, "linedetailId");
            return (Criteria) this;
        }

        public Criteria andLinedetailIdLike(String value) {
            addCriterion("linedetail_id like", value, "linedetailId");
            return (Criteria) this;
        }

        public Criteria andLinedetailIdNotLike(String value) {
            addCriterion("linedetail_id not like", value, "linedetailId");
            return (Criteria) this;
        }

        public Criteria andLinedetailIdIn(List<String> values) {
            addCriterion("linedetail_id in", values, "linedetailId");
            return (Criteria) this;
        }

        public Criteria andLinedetailIdNotIn(List<String> values) {
            addCriterion("linedetail_id not in", values, "linedetailId");
            return (Criteria) this;
        }

        public Criteria andLinedetailIdBetween(String value1, String value2) {
            addCriterion("linedetail_id between", value1, value2, "linedetailId");
            return (Criteria) this;
        }

        public Criteria andLinedetailIdNotBetween(String value1, String value2) {
            addCriterion("linedetail_id not between", value1, value2, "linedetailId");
            return (Criteria) this;
        }

        public Criteria andLineIdIsNull() {
            addCriterion("line_id is null");
            return (Criteria) this;
        }

        public Criteria andLineIdIsNotNull() {
            addCriterion("line_id is not null");
            return (Criteria) this;
        }

        public Criteria andLineIdEqualTo(String value) {
            addCriterion("line_id =", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdNotEqualTo(String value) {
            addCriterion("line_id <>", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdGreaterThan(String value) {
            addCriterion("line_id >", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdGreaterThanOrEqualTo(String value) {
            addCriterion("line_id >=", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdLessThan(String value) {
            addCriterion("line_id <", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdLessThanOrEqualTo(String value) {
            addCriterion("line_id <=", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdLike(String value) {
            addCriterion("line_id like", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdNotLike(String value) {
            addCriterion("line_id not like", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdIn(List<String> values) {
            addCriterion("line_id in", values, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdNotIn(List<String> values) {
            addCriterion("line_id not in", values, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdBetween(String value1, String value2) {
            addCriterion("line_id between", value1, value2, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdNotBetween(String value1, String value2) {
            addCriterion("line_id not between", value1, value2, "lineId");
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

        public Criteria andLineIndexIsNull() {
            addCriterion("line_index is null");
            return (Criteria) this;
        }

        public Criteria andLineIndexIsNotNull() {
            addCriterion("line_index is not null");
            return (Criteria) this;
        }

        public Criteria andLineIndexEqualTo(Integer value) {
            addCriterion("line_index =", value, "lineIndex");
            return (Criteria) this;
        }

        public Criteria andLineIndexNotEqualTo(Integer value) {
            addCriterion("line_index <>", value, "lineIndex");
            return (Criteria) this;
        }

        public Criteria andLineIndexGreaterThan(Integer value) {
            addCriterion("line_index >", value, "lineIndex");
            return (Criteria) this;
        }

        public Criteria andLineIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("line_index >=", value, "lineIndex");
            return (Criteria) this;
        }

        public Criteria andLineIndexLessThan(Integer value) {
            addCriterion("line_index <", value, "lineIndex");
            return (Criteria) this;
        }

        public Criteria andLineIndexLessThanOrEqualTo(Integer value) {
            addCriterion("line_index <=", value, "lineIndex");
            return (Criteria) this;
        }

        public Criteria andLineIndexIn(List<Integer> values) {
            addCriterion("line_index in", values, "lineIndex");
            return (Criteria) this;
        }

        public Criteria andLineIndexNotIn(List<Integer> values) {
            addCriterion("line_index not in", values, "lineIndex");
            return (Criteria) this;
        }

        public Criteria andLineIndexBetween(Integer value1, Integer value2) {
            addCriterion("line_index between", value1, value2, "lineIndex");
            return (Criteria) this;
        }

        public Criteria andLineIndexNotBetween(Integer value1, Integer value2) {
            addCriterion("line_index not between", value1, value2, "lineIndex");
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