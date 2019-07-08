package com.jxlg.logistic.module.order.entity;

import java.util.ArrayList;
import java.util.List;

public class SuppilerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SuppilerExample() {
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

        public Criteria andSuppilerIdIsNull() {
            addCriterion("suppiler_id is null");
            return (Criteria) this;
        }

        public Criteria andSuppilerIdIsNotNull() {
            addCriterion("suppiler_id is not null");
            return (Criteria) this;
        }

        public Criteria andSuppilerIdEqualTo(String value) {
            addCriterion("suppiler_id =", value, "suppilerId");
            return (Criteria) this;
        }

        public Criteria andSuppilerIdNotEqualTo(String value) {
            addCriterion("suppiler_id <>", value, "suppilerId");
            return (Criteria) this;
        }

        public Criteria andSuppilerIdGreaterThan(String value) {
            addCriterion("suppiler_id >", value, "suppilerId");
            return (Criteria) this;
        }

        public Criteria andSuppilerIdGreaterThanOrEqualTo(String value) {
            addCriterion("suppiler_id >=", value, "suppilerId");
            return (Criteria) this;
        }

        public Criteria andSuppilerIdLessThan(String value) {
            addCriterion("suppiler_id <", value, "suppilerId");
            return (Criteria) this;
        }

        public Criteria andSuppilerIdLessThanOrEqualTo(String value) {
            addCriterion("suppiler_id <=", value, "suppilerId");
            return (Criteria) this;
        }

        public Criteria andSuppilerIdLike(String value) {
            addCriterion("suppiler_id like", value, "suppilerId");
            return (Criteria) this;
        }

        public Criteria andSuppilerIdNotLike(String value) {
            addCriterion("suppiler_id not like", value, "suppilerId");
            return (Criteria) this;
        }

        public Criteria andSuppilerIdIn(List<String> values) {
            addCriterion("suppiler_id in", values, "suppilerId");
            return (Criteria) this;
        }

        public Criteria andSuppilerIdNotIn(List<String> values) {
            addCriterion("suppiler_id not in", values, "suppilerId");
            return (Criteria) this;
        }

        public Criteria andSuppilerIdBetween(String value1, String value2) {
            addCriterion("suppiler_id between", value1, value2, "suppilerId");
            return (Criteria) this;
        }

        public Criteria andSuppilerIdNotBetween(String value1, String value2) {
            addCriterion("suppiler_id not between", value1, value2, "suppilerId");
            return (Criteria) this;
        }

        public Criteria andSuppilerNoIsNull() {
            addCriterion("suppiler_no is null");
            return (Criteria) this;
        }

        public Criteria andSuppilerNoIsNotNull() {
            addCriterion("suppiler_no is not null");
            return (Criteria) this;
        }

        public Criteria andSuppilerNoEqualTo(String value) {
            addCriterion("suppiler_no =", value, "suppilerNo");
            return (Criteria) this;
        }

        public Criteria andSuppilerNoNotEqualTo(String value) {
            addCriterion("suppiler_no <>", value, "suppilerNo");
            return (Criteria) this;
        }

        public Criteria andSuppilerNoGreaterThan(String value) {
            addCriterion("suppiler_no >", value, "suppilerNo");
            return (Criteria) this;
        }

        public Criteria andSuppilerNoGreaterThanOrEqualTo(String value) {
            addCriterion("suppiler_no >=", value, "suppilerNo");
            return (Criteria) this;
        }

        public Criteria andSuppilerNoLessThan(String value) {
            addCriterion("suppiler_no <", value, "suppilerNo");
            return (Criteria) this;
        }

        public Criteria andSuppilerNoLessThanOrEqualTo(String value) {
            addCriterion("suppiler_no <=", value, "suppilerNo");
            return (Criteria) this;
        }

        public Criteria andSuppilerNoLike(String value) {
            addCriterion("suppiler_no like", value, "suppilerNo");
            return (Criteria) this;
        }

        public Criteria andSuppilerNoNotLike(String value) {
            addCriterion("suppiler_no not like", value, "suppilerNo");
            return (Criteria) this;
        }

        public Criteria andSuppilerNoIn(List<String> values) {
            addCriterion("suppiler_no in", values, "suppilerNo");
            return (Criteria) this;
        }

        public Criteria andSuppilerNoNotIn(List<String> values) {
            addCriterion("suppiler_no not in", values, "suppilerNo");
            return (Criteria) this;
        }

        public Criteria andSuppilerNoBetween(String value1, String value2) {
            addCriterion("suppiler_no between", value1, value2, "suppilerNo");
            return (Criteria) this;
        }

        public Criteria andSuppilerNoNotBetween(String value1, String value2) {
            addCriterion("suppiler_no not between", value1, value2, "suppilerNo");
            return (Criteria) this;
        }

        public Criteria andSuppilerNameIsNull() {
            addCriterion("suppiler_name is null");
            return (Criteria) this;
        }

        public Criteria andSuppilerNameIsNotNull() {
            addCriterion("suppiler_name is not null");
            return (Criteria) this;
        }

        public Criteria andSuppilerNameEqualTo(String value) {
            addCriterion("suppiler_name =", value, "suppilerName");
            return (Criteria) this;
        }

        public Criteria andSuppilerNameNotEqualTo(String value) {
            addCriterion("suppiler_name <>", value, "suppilerName");
            return (Criteria) this;
        }

        public Criteria andSuppilerNameGreaterThan(String value) {
            addCriterion("suppiler_name >", value, "suppilerName");
            return (Criteria) this;
        }

        public Criteria andSuppilerNameGreaterThanOrEqualTo(String value) {
            addCriterion("suppiler_name >=", value, "suppilerName");
            return (Criteria) this;
        }

        public Criteria andSuppilerNameLessThan(String value) {
            addCriterion("suppiler_name <", value, "suppilerName");
            return (Criteria) this;
        }

        public Criteria andSuppilerNameLessThanOrEqualTo(String value) {
            addCriterion("suppiler_name <=", value, "suppilerName");
            return (Criteria) this;
        }

        public Criteria andSuppilerNameLike(String value) {
            addCriterion("suppiler_name like", value, "suppilerName");
            return (Criteria) this;
        }

        public Criteria andSuppilerNameNotLike(String value) {
            addCriterion("suppiler_name not like", value, "suppilerName");
            return (Criteria) this;
        }

        public Criteria andSuppilerNameIn(List<String> values) {
            addCriterion("suppiler_name in", values, "suppilerName");
            return (Criteria) this;
        }

        public Criteria andSuppilerNameNotIn(List<String> values) {
            addCriterion("suppiler_name not in", values, "suppilerName");
            return (Criteria) this;
        }

        public Criteria andSuppilerNameBetween(String value1, String value2) {
            addCriterion("suppiler_name between", value1, value2, "suppilerName");
            return (Criteria) this;
        }

        public Criteria andSuppilerNameNotBetween(String value1, String value2) {
            addCriterion("suppiler_name not between", value1, value2, "suppilerName");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeIsNull() {
            addCriterion("supplier_type is null");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeIsNotNull() {
            addCriterion("supplier_type is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeEqualTo(String value) {
            addCriterion("supplier_type =", value, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeNotEqualTo(String value) {
            addCriterion("supplier_type <>", value, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeGreaterThan(String value) {
            addCriterion("supplier_type >", value, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_type >=", value, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeLessThan(String value) {
            addCriterion("supplier_type <", value, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeLessThanOrEqualTo(String value) {
            addCriterion("supplier_type <=", value, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeLike(String value) {
            addCriterion("supplier_type like", value, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeNotLike(String value) {
            addCriterion("supplier_type not like", value, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeIn(List<String> values) {
            addCriterion("supplier_type in", values, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeNotIn(List<String> values) {
            addCriterion("supplier_type not in", values, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeBetween(String value1, String value2) {
            addCriterion("supplier_type between", value1, value2, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSupplierTypeNotBetween(String value1, String value2) {
            addCriterion("supplier_type not between", value1, value2, "supplierType");
            return (Criteria) this;
        }

        public Criteria andSuppilerAddrIsNull() {
            addCriterion("suppiler_addr is null");
            return (Criteria) this;
        }

        public Criteria andSuppilerAddrIsNotNull() {
            addCriterion("suppiler_addr is not null");
            return (Criteria) this;
        }

        public Criteria andSuppilerAddrEqualTo(String value) {
            addCriterion("suppiler_addr =", value, "suppilerAddr");
            return (Criteria) this;
        }

        public Criteria andSuppilerAddrNotEqualTo(String value) {
            addCriterion("suppiler_addr <>", value, "suppilerAddr");
            return (Criteria) this;
        }

        public Criteria andSuppilerAddrGreaterThan(String value) {
            addCriterion("suppiler_addr >", value, "suppilerAddr");
            return (Criteria) this;
        }

        public Criteria andSuppilerAddrGreaterThanOrEqualTo(String value) {
            addCriterion("suppiler_addr >=", value, "suppilerAddr");
            return (Criteria) this;
        }

        public Criteria andSuppilerAddrLessThan(String value) {
            addCriterion("suppiler_addr <", value, "suppilerAddr");
            return (Criteria) this;
        }

        public Criteria andSuppilerAddrLessThanOrEqualTo(String value) {
            addCriterion("suppiler_addr <=", value, "suppilerAddr");
            return (Criteria) this;
        }

        public Criteria andSuppilerAddrLike(String value) {
            addCriterion("suppiler_addr like", value, "suppilerAddr");
            return (Criteria) this;
        }

        public Criteria andSuppilerAddrNotLike(String value) {
            addCriterion("suppiler_addr not like", value, "suppilerAddr");
            return (Criteria) this;
        }

        public Criteria andSuppilerAddrIn(List<String> values) {
            addCriterion("suppiler_addr in", values, "suppilerAddr");
            return (Criteria) this;
        }

        public Criteria andSuppilerAddrNotIn(List<String> values) {
            addCriterion("suppiler_addr not in", values, "suppilerAddr");
            return (Criteria) this;
        }

        public Criteria andSuppilerAddrBetween(String value1, String value2) {
            addCriterion("suppiler_addr between", value1, value2, "suppilerAddr");
            return (Criteria) this;
        }

        public Criteria andSuppilerAddrNotBetween(String value1, String value2) {
            addCriterion("suppiler_addr not between", value1, value2, "suppilerAddr");
            return (Criteria) this;
        }

        public Criteria andLinkmanIsNull() {
            addCriterion("linkman is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanIsNotNull() {
            addCriterion("linkman is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanEqualTo(String value) {
            addCriterion("linkman =", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotEqualTo(String value) {
            addCriterion("linkman <>", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanGreaterThan(String value) {
            addCriterion("linkman >", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("linkman >=", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLessThan(String value) {
            addCriterion("linkman <", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLessThanOrEqualTo(String value) {
            addCriterion("linkman <=", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanLike(String value) {
            addCriterion("linkman like", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotLike(String value) {
            addCriterion("linkman not like", value, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanIn(List<String> values) {
            addCriterion("linkman in", values, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotIn(List<String> values) {
            addCriterion("linkman not in", values, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanBetween(String value1, String value2) {
            addCriterion("linkman between", value1, value2, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanNotBetween(String value1, String value2) {
            addCriterion("linkman not between", value1, value2, "linkman");
            return (Criteria) this;
        }

        public Criteria andLinkmanTelIsNull() {
            addCriterion("linkman_tel is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanTelIsNotNull() {
            addCriterion("linkman_tel is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanTelEqualTo(String value) {
            addCriterion("linkman_tel =", value, "linkmanTel");
            return (Criteria) this;
        }

        public Criteria andLinkmanTelNotEqualTo(String value) {
            addCriterion("linkman_tel <>", value, "linkmanTel");
            return (Criteria) this;
        }

        public Criteria andLinkmanTelGreaterThan(String value) {
            addCriterion("linkman_tel >", value, "linkmanTel");
            return (Criteria) this;
        }

        public Criteria andLinkmanTelGreaterThanOrEqualTo(String value) {
            addCriterion("linkman_tel >=", value, "linkmanTel");
            return (Criteria) this;
        }

        public Criteria andLinkmanTelLessThan(String value) {
            addCriterion("linkman_tel <", value, "linkmanTel");
            return (Criteria) this;
        }

        public Criteria andLinkmanTelLessThanOrEqualTo(String value) {
            addCriterion("linkman_tel <=", value, "linkmanTel");
            return (Criteria) this;
        }

        public Criteria andLinkmanTelLike(String value) {
            addCriterion("linkman_tel like", value, "linkmanTel");
            return (Criteria) this;
        }

        public Criteria andLinkmanTelNotLike(String value) {
            addCriterion("linkman_tel not like", value, "linkmanTel");
            return (Criteria) this;
        }

        public Criteria andLinkmanTelIn(List<String> values) {
            addCriterion("linkman_tel in", values, "linkmanTel");
            return (Criteria) this;
        }

        public Criteria andLinkmanTelNotIn(List<String> values) {
            addCriterion("linkman_tel not in", values, "linkmanTel");
            return (Criteria) this;
        }

        public Criteria andLinkmanTelBetween(String value1, String value2) {
            addCriterion("linkman_tel between", value1, value2, "linkmanTel");
            return (Criteria) this;
        }

        public Criteria andLinkmanTelNotBetween(String value1, String value2) {
            addCriterion("linkman_tel not between", value1, value2, "linkmanTel");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailIsNull() {
            addCriterion("linkman_email is null");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailIsNotNull() {
            addCriterion("linkman_email is not null");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailEqualTo(String value) {
            addCriterion("linkman_email =", value, "linkmanEmail");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailNotEqualTo(String value) {
            addCriterion("linkman_email <>", value, "linkmanEmail");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailGreaterThan(String value) {
            addCriterion("linkman_email >", value, "linkmanEmail");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailGreaterThanOrEqualTo(String value) {
            addCriterion("linkman_email >=", value, "linkmanEmail");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailLessThan(String value) {
            addCriterion("linkman_email <", value, "linkmanEmail");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailLessThanOrEqualTo(String value) {
            addCriterion("linkman_email <=", value, "linkmanEmail");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailLike(String value) {
            addCriterion("linkman_email like", value, "linkmanEmail");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailNotLike(String value) {
            addCriterion("linkman_email not like", value, "linkmanEmail");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailIn(List<String> values) {
            addCriterion("linkman_email in", values, "linkmanEmail");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailNotIn(List<String> values) {
            addCriterion("linkman_email not in", values, "linkmanEmail");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailBetween(String value1, String value2) {
            addCriterion("linkman_email between", value1, value2, "linkmanEmail");
            return (Criteria) this;
        }

        public Criteria andLinkmanEmailNotBetween(String value1, String value2) {
            addCriterion("linkman_email not between", value1, value2, "linkmanEmail");
            return (Criteria) this;
        }

        public Criteria andInternetsiteIsNull() {
            addCriterion("internetsite is null");
            return (Criteria) this;
        }

        public Criteria andInternetsiteIsNotNull() {
            addCriterion("internetsite is not null");
            return (Criteria) this;
        }

        public Criteria andInternetsiteEqualTo(String value) {
            addCriterion("internetsite =", value, "internetsite");
            return (Criteria) this;
        }

        public Criteria andInternetsiteNotEqualTo(String value) {
            addCriterion("internetsite <>", value, "internetsite");
            return (Criteria) this;
        }

        public Criteria andInternetsiteGreaterThan(String value) {
            addCriterion("internetsite >", value, "internetsite");
            return (Criteria) this;
        }

        public Criteria andInternetsiteGreaterThanOrEqualTo(String value) {
            addCriterion("internetsite >=", value, "internetsite");
            return (Criteria) this;
        }

        public Criteria andInternetsiteLessThan(String value) {
            addCriterion("internetsite <", value, "internetsite");
            return (Criteria) this;
        }

        public Criteria andInternetsiteLessThanOrEqualTo(String value) {
            addCriterion("internetsite <=", value, "internetsite");
            return (Criteria) this;
        }

        public Criteria andInternetsiteLike(String value) {
            addCriterion("internetsite like", value, "internetsite");
            return (Criteria) this;
        }

        public Criteria andInternetsiteNotLike(String value) {
            addCriterion("internetsite not like", value, "internetsite");
            return (Criteria) this;
        }

        public Criteria andInternetsiteIn(List<String> values) {
            addCriterion("internetsite in", values, "internetsite");
            return (Criteria) this;
        }

        public Criteria andInternetsiteNotIn(List<String> values) {
            addCriterion("internetsite not in", values, "internetsite");
            return (Criteria) this;
        }

        public Criteria andInternetsiteBetween(String value1, String value2) {
            addCriterion("internetsite between", value1, value2, "internetsite");
            return (Criteria) this;
        }

        public Criteria andInternetsiteNotBetween(String value1, String value2) {
            addCriterion("internetsite not between", value1, value2, "internetsite");
            return (Criteria) this;
        }

        public Criteria andIsvailIsNull() {
            addCriterion("isvail is null");
            return (Criteria) this;
        }

        public Criteria andIsvailIsNotNull() {
            addCriterion("isvail is not null");
            return (Criteria) this;
        }

        public Criteria andIsvailEqualTo(String value) {
            addCriterion("isvail =", value, "isvail");
            return (Criteria) this;
        }

        public Criteria andIsvailNotEqualTo(String value) {
            addCriterion("isvail <>", value, "isvail");
            return (Criteria) this;
        }

        public Criteria andIsvailGreaterThan(String value) {
            addCriterion("isvail >", value, "isvail");
            return (Criteria) this;
        }

        public Criteria andIsvailGreaterThanOrEqualTo(String value) {
            addCriterion("isvail >=", value, "isvail");
            return (Criteria) this;
        }

        public Criteria andIsvailLessThan(String value) {
            addCriterion("isvail <", value, "isvail");
            return (Criteria) this;
        }

        public Criteria andIsvailLessThanOrEqualTo(String value) {
            addCriterion("isvail <=", value, "isvail");
            return (Criteria) this;
        }

        public Criteria andIsvailLike(String value) {
            addCriterion("isvail like", value, "isvail");
            return (Criteria) this;
        }

        public Criteria andIsvailNotLike(String value) {
            addCriterion("isvail not like", value, "isvail");
            return (Criteria) this;
        }

        public Criteria andIsvailIn(List<String> values) {
            addCriterion("isvail in", values, "isvail");
            return (Criteria) this;
        }

        public Criteria andIsvailNotIn(List<String> values) {
            addCriterion("isvail not in", values, "isvail");
            return (Criteria) this;
        }

        public Criteria andIsvailBetween(String value1, String value2) {
            addCriterion("isvail between", value1, value2, "isvail");
            return (Criteria) this;
        }

        public Criteria andIsvailNotBetween(String value1, String value2) {
            addCriterion("isvail not between", value1, value2, "isvail");
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