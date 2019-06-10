package com.jxlg.logistic.data.entity;

import java.util.ArrayList;
import java.util.List;

public class DataDictionaryDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DataDictionaryDetailExample() {
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

        public Criteria andDictionaryDetailIdIsNull() {
            addCriterion("DICTIONARY_DETAIL_ID is null");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailIdIsNotNull() {
            addCriterion("DICTIONARY_DETAIL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailIdEqualTo(String value) {
            addCriterion("DICTIONARY_DETAIL_ID =", value, "dictionaryDetailId");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailIdNotEqualTo(String value) {
            addCriterion("DICTIONARY_DETAIL_ID <>", value, "dictionaryDetailId");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailIdGreaterThan(String value) {
            addCriterion("DICTIONARY_DETAIL_ID >", value, "dictionaryDetailId");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailIdGreaterThanOrEqualTo(String value) {
            addCriterion("DICTIONARY_DETAIL_ID >=", value, "dictionaryDetailId");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailIdLessThan(String value) {
            addCriterion("DICTIONARY_DETAIL_ID <", value, "dictionaryDetailId");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailIdLessThanOrEqualTo(String value) {
            addCriterion("DICTIONARY_DETAIL_ID <=", value, "dictionaryDetailId");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailIdLike(String value) {
            addCriterion("DICTIONARY_DETAIL_ID like", value, "dictionaryDetailId");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailIdNotLike(String value) {
            addCriterion("DICTIONARY_DETAIL_ID not like", value, "dictionaryDetailId");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailIdIn(List<String> values) {
            addCriterion("DICTIONARY_DETAIL_ID in", values, "dictionaryDetailId");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailIdNotIn(List<String> values) {
            addCriterion("DICTIONARY_DETAIL_ID not in", values, "dictionaryDetailId");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailIdBetween(String value1, String value2) {
            addCriterion("DICTIONARY_DETAIL_ID between", value1, value2, "dictionaryDetailId");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailIdNotBetween(String value1, String value2) {
            addCriterion("DICTIONARY_DETAIL_ID not between", value1, value2, "dictionaryDetailId");
            return (Criteria) this;
        }

        public Criteria andDataDictionaryIdIsNull() {
            addCriterion("DATA_DICTIONARY_ID is null");
            return (Criteria) this;
        }

        public Criteria andDataDictionaryIdIsNotNull() {
            addCriterion("DATA_DICTIONARY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDataDictionaryIdEqualTo(String value) {
            addCriterion("DATA_DICTIONARY_ID =", value, "dataDictionaryId");
            return (Criteria) this;
        }

        public Criteria andDataDictionaryIdNotEqualTo(String value) {
            addCriterion("DATA_DICTIONARY_ID <>", value, "dataDictionaryId");
            return (Criteria) this;
        }

        public Criteria andDataDictionaryIdGreaterThan(String value) {
            addCriterion("DATA_DICTIONARY_ID >", value, "dataDictionaryId");
            return (Criteria) this;
        }

        public Criteria andDataDictionaryIdGreaterThanOrEqualTo(String value) {
            addCriterion("DATA_DICTIONARY_ID >=", value, "dataDictionaryId");
            return (Criteria) this;
        }

        public Criteria andDataDictionaryIdLessThan(String value) {
            addCriterion("DATA_DICTIONARY_ID <", value, "dataDictionaryId");
            return (Criteria) this;
        }

        public Criteria andDataDictionaryIdLessThanOrEqualTo(String value) {
            addCriterion("DATA_DICTIONARY_ID <=", value, "dataDictionaryId");
            return (Criteria) this;
        }

        public Criteria andDataDictionaryIdLike(String value) {
            addCriterion("DATA_DICTIONARY_ID like", value, "dataDictionaryId");
            return (Criteria) this;
        }

        public Criteria andDataDictionaryIdNotLike(String value) {
            addCriterion("DATA_DICTIONARY_ID not like", value, "dataDictionaryId");
            return (Criteria) this;
        }

        public Criteria andDataDictionaryIdIn(List<String> values) {
            addCriterion("DATA_DICTIONARY_ID in", values, "dataDictionaryId");
            return (Criteria) this;
        }

        public Criteria andDataDictionaryIdNotIn(List<String> values) {
            addCriterion("DATA_DICTIONARY_ID not in", values, "dataDictionaryId");
            return (Criteria) this;
        }

        public Criteria andDataDictionaryIdBetween(String value1, String value2) {
            addCriterion("DATA_DICTIONARY_ID between", value1, value2, "dataDictionaryId");
            return (Criteria) this;
        }

        public Criteria andDataDictionaryIdNotBetween(String value1, String value2) {
            addCriterion("DATA_DICTIONARY_ID not between", value1, value2, "dataDictionaryId");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailCodeIsNull() {
            addCriterion("DICTIONARY_DETAIL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailCodeIsNotNull() {
            addCriterion("DICTIONARY_DETAIL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailCodeEqualTo(String value) {
            addCriterion("DICTIONARY_DETAIL_CODE =", value, "dictionaryDetailCode");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailCodeNotEqualTo(String value) {
            addCriterion("DICTIONARY_DETAIL_CODE <>", value, "dictionaryDetailCode");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailCodeGreaterThan(String value) {
            addCriterion("DICTIONARY_DETAIL_CODE >", value, "dictionaryDetailCode");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailCodeGreaterThanOrEqualTo(String value) {
            addCriterion("DICTIONARY_DETAIL_CODE >=", value, "dictionaryDetailCode");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailCodeLessThan(String value) {
            addCriterion("DICTIONARY_DETAIL_CODE <", value, "dictionaryDetailCode");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailCodeLessThanOrEqualTo(String value) {
            addCriterion("DICTIONARY_DETAIL_CODE <=", value, "dictionaryDetailCode");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailCodeLike(String value) {
            addCriterion("DICTIONARY_DETAIL_CODE like", value, "dictionaryDetailCode");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailCodeNotLike(String value) {
            addCriterion("DICTIONARY_DETAIL_CODE not like", value, "dictionaryDetailCode");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailCodeIn(List<String> values) {
            addCriterion("DICTIONARY_DETAIL_CODE in", values, "dictionaryDetailCode");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailCodeNotIn(List<String> values) {
            addCriterion("DICTIONARY_DETAIL_CODE not in", values, "dictionaryDetailCode");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailCodeBetween(String value1, String value2) {
            addCriterion("DICTIONARY_DETAIL_CODE between", value1, value2, "dictionaryDetailCode");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailCodeNotBetween(String value1, String value2) {
            addCriterion("DICTIONARY_DETAIL_CODE not between", value1, value2, "dictionaryDetailCode");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailLabelIsNull() {
            addCriterion("DICTIONARY_DETAIL_LABEL is null");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailLabelIsNotNull() {
            addCriterion("DICTIONARY_DETAIL_LABEL is not null");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailLabelEqualTo(String value) {
            addCriterion("DICTIONARY_DETAIL_LABEL =", value, "dictionaryDetailLabel");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailLabelNotEqualTo(String value) {
            addCriterion("DICTIONARY_DETAIL_LABEL <>", value, "dictionaryDetailLabel");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailLabelGreaterThan(String value) {
            addCriterion("DICTIONARY_DETAIL_LABEL >", value, "dictionaryDetailLabel");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailLabelGreaterThanOrEqualTo(String value) {
            addCriterion("DICTIONARY_DETAIL_LABEL >=", value, "dictionaryDetailLabel");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailLabelLessThan(String value) {
            addCriterion("DICTIONARY_DETAIL_LABEL <", value, "dictionaryDetailLabel");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailLabelLessThanOrEqualTo(String value) {
            addCriterion("DICTIONARY_DETAIL_LABEL <=", value, "dictionaryDetailLabel");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailLabelLike(String value) {
            addCriterion("DICTIONARY_DETAIL_LABEL like", value, "dictionaryDetailLabel");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailLabelNotLike(String value) {
            addCriterion("DICTIONARY_DETAIL_LABEL not like", value, "dictionaryDetailLabel");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailLabelIn(List<String> values) {
            addCriterion("DICTIONARY_DETAIL_LABEL in", values, "dictionaryDetailLabel");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailLabelNotIn(List<String> values) {
            addCriterion("DICTIONARY_DETAIL_LABEL not in", values, "dictionaryDetailLabel");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailLabelBetween(String value1, String value2) {
            addCriterion("DICTIONARY_DETAIL_LABEL between", value1, value2, "dictionaryDetailLabel");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailLabelNotBetween(String value1, String value2) {
            addCriterion("DICTIONARY_DETAIL_LABEL not between", value1, value2, "dictionaryDetailLabel");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailXhIsNull() {
            addCriterion("DICTIONARY_DETAIL_XH is null");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailXhIsNotNull() {
            addCriterion("DICTIONARY_DETAIL_XH is not null");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailXhEqualTo(Integer value) {
            addCriterion("DICTIONARY_DETAIL_XH =", value, "dictionaryDetailXh");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailXhNotEqualTo(Integer value) {
            addCriterion("DICTIONARY_DETAIL_XH <>", value, "dictionaryDetailXh");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailXhGreaterThan(Integer value) {
            addCriterion("DICTIONARY_DETAIL_XH >", value, "dictionaryDetailXh");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailXhGreaterThanOrEqualTo(Integer value) {
            addCriterion("DICTIONARY_DETAIL_XH >=", value, "dictionaryDetailXh");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailXhLessThan(Integer value) {
            addCriterion("DICTIONARY_DETAIL_XH <", value, "dictionaryDetailXh");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailXhLessThanOrEqualTo(Integer value) {
            addCriterion("DICTIONARY_DETAIL_XH <=", value, "dictionaryDetailXh");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailXhIn(List<Integer> values) {
            addCriterion("DICTIONARY_DETAIL_XH in", values, "dictionaryDetailXh");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailXhNotIn(List<Integer> values) {
            addCriterion("DICTIONARY_DETAIL_XH not in", values, "dictionaryDetailXh");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailXhBetween(Integer value1, Integer value2) {
            addCriterion("DICTIONARY_DETAIL_XH between", value1, value2, "dictionaryDetailXh");
            return (Criteria) this;
        }

        public Criteria andDictionaryDetailXhNotBetween(Integer value1, Integer value2) {
            addCriterion("DICTIONARY_DETAIL_XH not between", value1, value2, "dictionaryDetailXh");
            return (Criteria) this;
        }

        public Criteria andOptionLabelIsNull() {
            addCriterion("OPTION_LABEL is null");
            return (Criteria) this;
        }

        public Criteria andOptionLabelIsNotNull() {
            addCriterion("OPTION_LABEL is not null");
            return (Criteria) this;
        }

        public Criteria andOptionLabelEqualTo(String value) {
            addCriterion("OPTION_LABEL =", value, "optionLabel");
            return (Criteria) this;
        }

        public Criteria andOptionLabelNotEqualTo(String value) {
            addCriterion("OPTION_LABEL <>", value, "optionLabel");
            return (Criteria) this;
        }

        public Criteria andOptionLabelGreaterThan(String value) {
            addCriterion("OPTION_LABEL >", value, "optionLabel");
            return (Criteria) this;
        }

        public Criteria andOptionLabelGreaterThanOrEqualTo(String value) {
            addCriterion("OPTION_LABEL >=", value, "optionLabel");
            return (Criteria) this;
        }

        public Criteria andOptionLabelLessThan(String value) {
            addCriterion("OPTION_LABEL <", value, "optionLabel");
            return (Criteria) this;
        }

        public Criteria andOptionLabelLessThanOrEqualTo(String value) {
            addCriterion("OPTION_LABEL <=", value, "optionLabel");
            return (Criteria) this;
        }

        public Criteria andOptionLabelLike(String value) {
            addCriterion("OPTION_LABEL like", value, "optionLabel");
            return (Criteria) this;
        }

        public Criteria andOptionLabelNotLike(String value) {
            addCriterion("OPTION_LABEL not like", value, "optionLabel");
            return (Criteria) this;
        }

        public Criteria andOptionLabelIn(List<String> values) {
            addCriterion("OPTION_LABEL in", values, "optionLabel");
            return (Criteria) this;
        }

        public Criteria andOptionLabelNotIn(List<String> values) {
            addCriterion("OPTION_LABEL not in", values, "optionLabel");
            return (Criteria) this;
        }

        public Criteria andOptionLabelBetween(String value1, String value2) {
            addCriterion("OPTION_LABEL between", value1, value2, "optionLabel");
            return (Criteria) this;
        }

        public Criteria andOptionLabelNotBetween(String value1, String value2) {
            addCriterion("OPTION_LABEL not between", value1, value2, "optionLabel");
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