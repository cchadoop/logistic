package com.jxlg.logistic.transport.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DriverExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DriverExample() {
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

        public Criteria andDriverIdIsNull() {
            addCriterion("driver_id is null");
            return (Criteria) this;
        }

        public Criteria andDriverIdIsNotNull() {
            addCriterion("driver_id is not null");
            return (Criteria) this;
        }

        public Criteria andDriverIdEqualTo(String value) {
            addCriterion("driver_id =", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdNotEqualTo(String value) {
            addCriterion("driver_id <>", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdGreaterThan(String value) {
            addCriterion("driver_id >", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdGreaterThanOrEqualTo(String value) {
            addCriterion("driver_id >=", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdLessThan(String value) {
            addCriterion("driver_id <", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdLessThanOrEqualTo(String value) {
            addCriterion("driver_id <=", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdLike(String value) {
            addCriterion("driver_id like", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdNotLike(String value) {
            addCriterion("driver_id not like", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdIn(List<String> values) {
            addCriterion("driver_id in", values, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdNotIn(List<String> values) {
            addCriterion("driver_id not in", values, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdBetween(String value1, String value2) {
            addCriterion("driver_id between", value1, value2, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdNotBetween(String value1, String value2) {
            addCriterion("driver_id not between", value1, value2, "driverId");
            return (Criteria) this;
        }

        public Criteria andDirverNameIsNull() {
            addCriterion("dirver_name is null");
            return (Criteria) this;
        }

        public Criteria andDirverNameIsNotNull() {
            addCriterion("dirver_name is not null");
            return (Criteria) this;
        }

        public Criteria andDirverNameEqualTo(String value) {
            addCriterion("dirver_name =", value, "dirverName");
            return (Criteria) this;
        }

        public Criteria andDirverNameNotEqualTo(String value) {
            addCriterion("dirver_name <>", value, "dirverName");
            return (Criteria) this;
        }

        public Criteria andDirverNameGreaterThan(String value) {
            addCriterion("dirver_name >", value, "dirverName");
            return (Criteria) this;
        }

        public Criteria andDirverNameGreaterThanOrEqualTo(String value) {
            addCriterion("dirver_name >=", value, "dirverName");
            return (Criteria) this;
        }

        public Criteria andDirverNameLessThan(String value) {
            addCriterion("dirver_name <", value, "dirverName");
            return (Criteria) this;
        }

        public Criteria andDirverNameLessThanOrEqualTo(String value) {
            addCriterion("dirver_name <=", value, "dirverName");
            return (Criteria) this;
        }

        public Criteria andDirverNameLike(String value) {
            addCriterion("dirver_name like", value, "dirverName");
            return (Criteria) this;
        }

        public Criteria andDirverNameNotLike(String value) {
            addCriterion("dirver_name not like", value, "dirverName");
            return (Criteria) this;
        }

        public Criteria andDirverNameIn(List<String> values) {
            addCriterion("dirver_name in", values, "dirverName");
            return (Criteria) this;
        }

        public Criteria andDirverNameNotIn(List<String> values) {
            addCriterion("dirver_name not in", values, "dirverName");
            return (Criteria) this;
        }

        public Criteria andDirverNameBetween(String value1, String value2) {
            addCriterion("dirver_name between", value1, value2, "dirverName");
            return (Criteria) this;
        }

        public Criteria andDirverNameNotBetween(String value1, String value2) {
            addCriterion("dirver_name not between", value1, value2, "dirverName");
            return (Criteria) this;
        }

        public Criteria andDriverSexIsNull() {
            addCriterion("driver_sex is null");
            return (Criteria) this;
        }

        public Criteria andDriverSexIsNotNull() {
            addCriterion("driver_sex is not null");
            return (Criteria) this;
        }

        public Criteria andDriverSexEqualTo(String value) {
            addCriterion("driver_sex =", value, "driverSex");
            return (Criteria) this;
        }

        public Criteria andDriverSexNotEqualTo(String value) {
            addCriterion("driver_sex <>", value, "driverSex");
            return (Criteria) this;
        }

        public Criteria andDriverSexGreaterThan(String value) {
            addCriterion("driver_sex >", value, "driverSex");
            return (Criteria) this;
        }

        public Criteria andDriverSexGreaterThanOrEqualTo(String value) {
            addCriterion("driver_sex >=", value, "driverSex");
            return (Criteria) this;
        }

        public Criteria andDriverSexLessThan(String value) {
            addCriterion("driver_sex <", value, "driverSex");
            return (Criteria) this;
        }

        public Criteria andDriverSexLessThanOrEqualTo(String value) {
            addCriterion("driver_sex <=", value, "driverSex");
            return (Criteria) this;
        }

        public Criteria andDriverSexLike(String value) {
            addCriterion("driver_sex like", value, "driverSex");
            return (Criteria) this;
        }

        public Criteria andDriverSexNotLike(String value) {
            addCriterion("driver_sex not like", value, "driverSex");
            return (Criteria) this;
        }

        public Criteria andDriverSexIn(List<String> values) {
            addCriterion("driver_sex in", values, "driverSex");
            return (Criteria) this;
        }

        public Criteria andDriverSexNotIn(List<String> values) {
            addCriterion("driver_sex not in", values, "driverSex");
            return (Criteria) this;
        }

        public Criteria andDriverSexBetween(String value1, String value2) {
            addCriterion("driver_sex between", value1, value2, "driverSex");
            return (Criteria) this;
        }

        public Criteria andDriverSexNotBetween(String value1, String value2) {
            addCriterion("driver_sex not between", value1, value2, "driverSex");
            return (Criteria) this;
        }

        public Criteria andDriverTelIsNull() {
            addCriterion("driver_tel is null");
            return (Criteria) this;
        }

        public Criteria andDriverTelIsNotNull() {
            addCriterion("driver_tel is not null");
            return (Criteria) this;
        }

        public Criteria andDriverTelEqualTo(String value) {
            addCriterion("driver_tel =", value, "driverTel");
            return (Criteria) this;
        }

        public Criteria andDriverTelNotEqualTo(String value) {
            addCriterion("driver_tel <>", value, "driverTel");
            return (Criteria) this;
        }

        public Criteria andDriverTelGreaterThan(String value) {
            addCriterion("driver_tel >", value, "driverTel");
            return (Criteria) this;
        }

        public Criteria andDriverTelGreaterThanOrEqualTo(String value) {
            addCriterion("driver_tel >=", value, "driverTel");
            return (Criteria) this;
        }

        public Criteria andDriverTelLessThan(String value) {
            addCriterion("driver_tel <", value, "driverTel");
            return (Criteria) this;
        }

        public Criteria andDriverTelLessThanOrEqualTo(String value) {
            addCriterion("driver_tel <=", value, "driverTel");
            return (Criteria) this;
        }

        public Criteria andDriverTelLike(String value) {
            addCriterion("driver_tel like", value, "driverTel");
            return (Criteria) this;
        }

        public Criteria andDriverTelNotLike(String value) {
            addCriterion("driver_tel not like", value, "driverTel");
            return (Criteria) this;
        }

        public Criteria andDriverTelIn(List<String> values) {
            addCriterion("driver_tel in", values, "driverTel");
            return (Criteria) this;
        }

        public Criteria andDriverTelNotIn(List<String> values) {
            addCriterion("driver_tel not in", values, "driverTel");
            return (Criteria) this;
        }

        public Criteria andDriverTelBetween(String value1, String value2) {
            addCriterion("driver_tel between", value1, value2, "driverTel");
            return (Criteria) this;
        }

        public Criteria andDriverTelNotBetween(String value1, String value2) {
            addCriterion("driver_tel not between", value1, value2, "driverTel");
            return (Criteria) this;
        }

        public Criteria andDriverIdcardIsNull() {
            addCriterion("driver_idcard is null");
            return (Criteria) this;
        }

        public Criteria andDriverIdcardIsNotNull() {
            addCriterion("driver_idcard is not null");
            return (Criteria) this;
        }

        public Criteria andDriverIdcardEqualTo(String value) {
            addCriterion("driver_idcard =", value, "driverIdcard");
            return (Criteria) this;
        }

        public Criteria andDriverIdcardNotEqualTo(String value) {
            addCriterion("driver_idcard <>", value, "driverIdcard");
            return (Criteria) this;
        }

        public Criteria andDriverIdcardGreaterThan(String value) {
            addCriterion("driver_idcard >", value, "driverIdcard");
            return (Criteria) this;
        }

        public Criteria andDriverIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("driver_idcard >=", value, "driverIdcard");
            return (Criteria) this;
        }

        public Criteria andDriverIdcardLessThan(String value) {
            addCriterion("driver_idcard <", value, "driverIdcard");
            return (Criteria) this;
        }

        public Criteria andDriverIdcardLessThanOrEqualTo(String value) {
            addCriterion("driver_idcard <=", value, "driverIdcard");
            return (Criteria) this;
        }

        public Criteria andDriverIdcardLike(String value) {
            addCriterion("driver_idcard like", value, "driverIdcard");
            return (Criteria) this;
        }

        public Criteria andDriverIdcardNotLike(String value) {
            addCriterion("driver_idcard not like", value, "driverIdcard");
            return (Criteria) this;
        }

        public Criteria andDriverIdcardIn(List<String> values) {
            addCriterion("driver_idcard in", values, "driverIdcard");
            return (Criteria) this;
        }

        public Criteria andDriverIdcardNotIn(List<String> values) {
            addCriterion("driver_idcard not in", values, "driverIdcard");
            return (Criteria) this;
        }

        public Criteria andDriverIdcardBetween(String value1, String value2) {
            addCriterion("driver_idcard between", value1, value2, "driverIdcard");
            return (Criteria) this;
        }

        public Criteria andDriverIdcardNotBetween(String value1, String value2) {
            addCriterion("driver_idcard not between", value1, value2, "driverIdcard");
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

        public Criteria andDriverTimeIsNull() {
            addCriterion("driver_time is null");
            return (Criteria) this;
        }

        public Criteria andDriverTimeIsNotNull() {
            addCriterion("driver_time is not null");
            return (Criteria) this;
        }

        public Criteria andDriverTimeEqualTo(BigDecimal value) {
            addCriterion("driver_time =", value, "driverTime");
            return (Criteria) this;
        }

        public Criteria andDriverTimeNotEqualTo(BigDecimal value) {
            addCriterion("driver_time <>", value, "driverTime");
            return (Criteria) this;
        }

        public Criteria andDriverTimeGreaterThan(BigDecimal value) {
            addCriterion("driver_time >", value, "driverTime");
            return (Criteria) this;
        }

        public Criteria andDriverTimeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("driver_time >=", value, "driverTime");
            return (Criteria) this;
        }

        public Criteria andDriverTimeLessThan(BigDecimal value) {
            addCriterion("driver_time <", value, "driverTime");
            return (Criteria) this;
        }

        public Criteria andDriverTimeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("driver_time <=", value, "driverTime");
            return (Criteria) this;
        }

        public Criteria andDriverTimeIn(List<BigDecimal> values) {
            addCriterion("driver_time in", values, "driverTime");
            return (Criteria) this;
        }

        public Criteria andDriverTimeNotIn(List<BigDecimal> values) {
            addCriterion("driver_time not in", values, "driverTime");
            return (Criteria) this;
        }

        public Criteria andDriverTimeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("driver_time between", value1, value2, "driverTime");
            return (Criteria) this;
        }

        public Criteria andDriverTimeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("driver_time not between", value1, value2, "driverTime");
            return (Criteria) this;
        }

        public Criteria andDirverStatusIsNull() {
            addCriterion("dirver_status is null");
            return (Criteria) this;
        }

        public Criteria andDirverStatusIsNotNull() {
            addCriterion("dirver_status is not null");
            return (Criteria) this;
        }

        public Criteria andDirverStatusEqualTo(String value) {
            addCriterion("dirver_status =", value, "dirverStatus");
            return (Criteria) this;
        }

        public Criteria andDirverStatusNotEqualTo(String value) {
            addCriterion("dirver_status <>", value, "dirverStatus");
            return (Criteria) this;
        }

        public Criteria andDirverStatusGreaterThan(String value) {
            addCriterion("dirver_status >", value, "dirverStatus");
            return (Criteria) this;
        }

        public Criteria andDirverStatusGreaterThanOrEqualTo(String value) {
            addCriterion("dirver_status >=", value, "dirverStatus");
            return (Criteria) this;
        }

        public Criteria andDirverStatusLessThan(String value) {
            addCriterion("dirver_status <", value, "dirverStatus");
            return (Criteria) this;
        }

        public Criteria andDirverStatusLessThanOrEqualTo(String value) {
            addCriterion("dirver_status <=", value, "dirverStatus");
            return (Criteria) this;
        }

        public Criteria andDirverStatusLike(String value) {
            addCriterion("dirver_status like", value, "dirverStatus");
            return (Criteria) this;
        }

        public Criteria andDirverStatusNotLike(String value) {
            addCriterion("dirver_status not like", value, "dirverStatus");
            return (Criteria) this;
        }

        public Criteria andDirverStatusIn(List<String> values) {
            addCriterion("dirver_status in", values, "dirverStatus");
            return (Criteria) this;
        }

        public Criteria andDirverStatusNotIn(List<String> values) {
            addCriterion("dirver_status not in", values, "dirverStatus");
            return (Criteria) this;
        }

        public Criteria andDirverStatusBetween(String value1, String value2) {
            addCriterion("dirver_status between", value1, value2, "dirverStatus");
            return (Criteria) this;
        }

        public Criteria andDirverStatusNotBetween(String value1, String value2) {
            addCriterion("dirver_status not between", value1, value2, "dirverStatus");
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