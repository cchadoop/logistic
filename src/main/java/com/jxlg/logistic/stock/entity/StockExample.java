package com.jxlg.logistic.stock.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StockExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StockExample() {
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

        public Criteria andStockIdIsNull() {
            addCriterion("stock_id is null");
            return (Criteria) this;
        }

        public Criteria andStockIdIsNotNull() {
            addCriterion("stock_id is not null");
            return (Criteria) this;
        }

        public Criteria andStockIdEqualTo(String value) {
            addCriterion("stock_id =", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdNotEqualTo(String value) {
            addCriterion("stock_id <>", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdGreaterThan(String value) {
            addCriterion("stock_id >", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdGreaterThanOrEqualTo(String value) {
            addCriterion("stock_id >=", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdLessThan(String value) {
            addCriterion("stock_id <", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdLessThanOrEqualTo(String value) {
            addCriterion("stock_id <=", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdLike(String value) {
            addCriterion("stock_id like", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdNotLike(String value) {
            addCriterion("stock_id not like", value, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdIn(List<String> values) {
            addCriterion("stock_id in", values, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdNotIn(List<String> values) {
            addCriterion("stock_id not in", values, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdBetween(String value1, String value2) {
            addCriterion("stock_id between", value1, value2, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockIdNotBetween(String value1, String value2) {
            addCriterion("stock_id not between", value1, value2, "stockId");
            return (Criteria) this;
        }

        public Criteria andStockNoIsNull() {
            addCriterion("stock_no is null");
            return (Criteria) this;
        }

        public Criteria andStockNoIsNotNull() {
            addCriterion("stock_no is not null");
            return (Criteria) this;
        }

        public Criteria andStockNoEqualTo(String value) {
            addCriterion("stock_no =", value, "stockNo");
            return (Criteria) this;
        }

        public Criteria andStockNoNotEqualTo(String value) {
            addCriterion("stock_no <>", value, "stockNo");
            return (Criteria) this;
        }

        public Criteria andStockNoGreaterThan(String value) {
            addCriterion("stock_no >", value, "stockNo");
            return (Criteria) this;
        }

        public Criteria andStockNoGreaterThanOrEqualTo(String value) {
            addCriterion("stock_no >=", value, "stockNo");
            return (Criteria) this;
        }

        public Criteria andStockNoLessThan(String value) {
            addCriterion("stock_no <", value, "stockNo");
            return (Criteria) this;
        }

        public Criteria andStockNoLessThanOrEqualTo(String value) {
            addCriterion("stock_no <=", value, "stockNo");
            return (Criteria) this;
        }

        public Criteria andStockNoLike(String value) {
            addCriterion("stock_no like", value, "stockNo");
            return (Criteria) this;
        }

        public Criteria andStockNoNotLike(String value) {
            addCriterion("stock_no not like", value, "stockNo");
            return (Criteria) this;
        }

        public Criteria andStockNoIn(List<String> values) {
            addCriterion("stock_no in", values, "stockNo");
            return (Criteria) this;
        }

        public Criteria andStockNoNotIn(List<String> values) {
            addCriterion("stock_no not in", values, "stockNo");
            return (Criteria) this;
        }

        public Criteria andStockNoBetween(String value1, String value2) {
            addCriterion("stock_no between", value1, value2, "stockNo");
            return (Criteria) this;
        }

        public Criteria andStockNoNotBetween(String value1, String value2) {
            addCriterion("stock_no not between", value1, value2, "stockNo");
            return (Criteria) this;
        }

        public Criteria andStockNameIsNull() {
            addCriterion("stock_name is null");
            return (Criteria) this;
        }

        public Criteria andStockNameIsNotNull() {
            addCriterion("stock_name is not null");
            return (Criteria) this;
        }

        public Criteria andStockNameEqualTo(String value) {
            addCriterion("stock_name =", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameNotEqualTo(String value) {
            addCriterion("stock_name <>", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameGreaterThan(String value) {
            addCriterion("stock_name >", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameGreaterThanOrEqualTo(String value) {
            addCriterion("stock_name >=", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameLessThan(String value) {
            addCriterion("stock_name <", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameLessThanOrEqualTo(String value) {
            addCriterion("stock_name <=", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameLike(String value) {
            addCriterion("stock_name like", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameNotLike(String value) {
            addCriterion("stock_name not like", value, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameIn(List<String> values) {
            addCriterion("stock_name in", values, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameNotIn(List<String> values) {
            addCriterion("stock_name not in", values, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameBetween(String value1, String value2) {
            addCriterion("stock_name between", value1, value2, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockNameNotBetween(String value1, String value2) {
            addCriterion("stock_name not between", value1, value2, "stockName");
            return (Criteria) this;
        }

        public Criteria andStockAddrIsNull() {
            addCriterion("stock_addr is null");
            return (Criteria) this;
        }

        public Criteria andStockAddrIsNotNull() {
            addCriterion("stock_addr is not null");
            return (Criteria) this;
        }

        public Criteria andStockAddrEqualTo(String value) {
            addCriterion("stock_addr =", value, "stockAddr");
            return (Criteria) this;
        }

        public Criteria andStockAddrNotEqualTo(String value) {
            addCriterion("stock_addr <>", value, "stockAddr");
            return (Criteria) this;
        }

        public Criteria andStockAddrGreaterThan(String value) {
            addCriterion("stock_addr >", value, "stockAddr");
            return (Criteria) this;
        }

        public Criteria andStockAddrGreaterThanOrEqualTo(String value) {
            addCriterion("stock_addr >=", value, "stockAddr");
            return (Criteria) this;
        }

        public Criteria andStockAddrLessThan(String value) {
            addCriterion("stock_addr <", value, "stockAddr");
            return (Criteria) this;
        }

        public Criteria andStockAddrLessThanOrEqualTo(String value) {
            addCriterion("stock_addr <=", value, "stockAddr");
            return (Criteria) this;
        }

        public Criteria andStockAddrLike(String value) {
            addCriterion("stock_addr like", value, "stockAddr");
            return (Criteria) this;
        }

        public Criteria andStockAddrNotLike(String value) {
            addCriterion("stock_addr not like", value, "stockAddr");
            return (Criteria) this;
        }

        public Criteria andStockAddrIn(List<String> values) {
            addCriterion("stock_addr in", values, "stockAddr");
            return (Criteria) this;
        }

        public Criteria andStockAddrNotIn(List<String> values) {
            addCriterion("stock_addr not in", values, "stockAddr");
            return (Criteria) this;
        }

        public Criteria andStockAddrBetween(String value1, String value2) {
            addCriterion("stock_addr between", value1, value2, "stockAddr");
            return (Criteria) this;
        }

        public Criteria andStockAddrNotBetween(String value1, String value2) {
            addCriterion("stock_addr not between", value1, value2, "stockAddr");
            return (Criteria) this;
        }

        public Criteria andCstIdIsNull() {
            addCriterion("cst_id is null");
            return (Criteria) this;
        }

        public Criteria andCstIdIsNotNull() {
            addCriterion("cst_id is not null");
            return (Criteria) this;
        }

        public Criteria andCstIdEqualTo(String value) {
            addCriterion("cst_id =", value, "cstId");
            return (Criteria) this;
        }

        public Criteria andCstIdNotEqualTo(String value) {
            addCriterion("cst_id <>", value, "cstId");
            return (Criteria) this;
        }

        public Criteria andCstIdGreaterThan(String value) {
            addCriterion("cst_id >", value, "cstId");
            return (Criteria) this;
        }

        public Criteria andCstIdGreaterThanOrEqualTo(String value) {
            addCriterion("cst_id >=", value, "cstId");
            return (Criteria) this;
        }

        public Criteria andCstIdLessThan(String value) {
            addCriterion("cst_id <", value, "cstId");
            return (Criteria) this;
        }

        public Criteria andCstIdLessThanOrEqualTo(String value) {
            addCriterion("cst_id <=", value, "cstId");
            return (Criteria) this;
        }

        public Criteria andCstIdLike(String value) {
            addCriterion("cst_id like", value, "cstId");
            return (Criteria) this;
        }

        public Criteria andCstIdNotLike(String value) {
            addCriterion("cst_id not like", value, "cstId");
            return (Criteria) this;
        }

        public Criteria andCstIdIn(List<String> values) {
            addCriterion("cst_id in", values, "cstId");
            return (Criteria) this;
        }

        public Criteria andCstIdNotIn(List<String> values) {
            addCriterion("cst_id not in", values, "cstId");
            return (Criteria) this;
        }

        public Criteria andCstIdBetween(String value1, String value2) {
            addCriterion("cst_id between", value1, value2, "cstId");
            return (Criteria) this;
        }

        public Criteria andCstIdNotBetween(String value1, String value2) {
            addCriterion("cst_id not between", value1, value2, "cstId");
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

        public Criteria andInstockTimeIsNull() {
            addCriterion("instock_time is null");
            return (Criteria) this;
        }

        public Criteria andInstockTimeIsNotNull() {
            addCriterion("instock_time is not null");
            return (Criteria) this;
        }

        public Criteria andInstockTimeEqualTo(Date value) {
            addCriterion("instock_time =", value, "instockTime");
            return (Criteria) this;
        }

        public Criteria andInstockTimeNotEqualTo(Date value) {
            addCriterion("instock_time <>", value, "instockTime");
            return (Criteria) this;
        }

        public Criteria andInstockTimeGreaterThan(Date value) {
            addCriterion("instock_time >", value, "instockTime");
            return (Criteria) this;
        }

        public Criteria andInstockTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("instock_time >=", value, "instockTime");
            return (Criteria) this;
        }

        public Criteria andInstockTimeLessThan(Date value) {
            addCriterion("instock_time <", value, "instockTime");
            return (Criteria) this;
        }

        public Criteria andInstockTimeLessThanOrEqualTo(Date value) {
            addCriterion("instock_time <=", value, "instockTime");
            return (Criteria) this;
        }

        public Criteria andInstockTimeIn(List<Date> values) {
            addCriterion("instock_time in", values, "instockTime");
            return (Criteria) this;
        }

        public Criteria andInstockTimeNotIn(List<Date> values) {
            addCriterion("instock_time not in", values, "instockTime");
            return (Criteria) this;
        }

        public Criteria andInstockTimeBetween(Date value1, Date value2) {
            addCriterion("instock_time between", value1, value2, "instockTime");
            return (Criteria) this;
        }

        public Criteria andInstockTimeNotBetween(Date value1, Date value2) {
            addCriterion("instock_time not between", value1, value2, "instockTime");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("`position` is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("`position` is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("`position` =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("`position` <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("`position` >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("`position` >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("`position` <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("`position` <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("`position` like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("`position` not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("`position` in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("`position` not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("`position` between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("`position` not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPkgsIsNull() {
            addCriterion("pkgs is null");
            return (Criteria) this;
        }

        public Criteria andPkgsIsNotNull() {
            addCriterion("pkgs is not null");
            return (Criteria) this;
        }

        public Criteria andPkgsEqualTo(Integer value) {
            addCriterion("pkgs =", value, "pkgs");
            return (Criteria) this;
        }

        public Criteria andPkgsNotEqualTo(Integer value) {
            addCriterion("pkgs <>", value, "pkgs");
            return (Criteria) this;
        }

        public Criteria andPkgsGreaterThan(Integer value) {
            addCriterion("pkgs >", value, "pkgs");
            return (Criteria) this;
        }

        public Criteria andPkgsGreaterThanOrEqualTo(Integer value) {
            addCriterion("pkgs >=", value, "pkgs");
            return (Criteria) this;
        }

        public Criteria andPkgsLessThan(Integer value) {
            addCriterion("pkgs <", value, "pkgs");
            return (Criteria) this;
        }

        public Criteria andPkgsLessThanOrEqualTo(Integer value) {
            addCriterion("pkgs <=", value, "pkgs");
            return (Criteria) this;
        }

        public Criteria andPkgsIn(List<Integer> values) {
            addCriterion("pkgs in", values, "pkgs");
            return (Criteria) this;
        }

        public Criteria andPkgsNotIn(List<Integer> values) {
            addCriterion("pkgs not in", values, "pkgs");
            return (Criteria) this;
        }

        public Criteria andPkgsBetween(Integer value1, Integer value2) {
            addCriterion("pkgs between", value1, value2, "pkgs");
            return (Criteria) this;
        }

        public Criteria andPkgsNotBetween(Integer value1, Integer value2) {
            addCriterion("pkgs not between", value1, value2, "pkgs");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(BigDecimal value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(BigDecimal value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(BigDecimal value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(BigDecimal value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<BigDecimal> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<BigDecimal> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andCbmIsNull() {
            addCriterion("CBM is null");
            return (Criteria) this;
        }

        public Criteria andCbmIsNotNull() {
            addCriterion("CBM is not null");
            return (Criteria) this;
        }

        public Criteria andCbmEqualTo(BigDecimal value) {
            addCriterion("CBM =", value, "cbm");
            return (Criteria) this;
        }

        public Criteria andCbmNotEqualTo(BigDecimal value) {
            addCriterion("CBM <>", value, "cbm");
            return (Criteria) this;
        }

        public Criteria andCbmGreaterThan(BigDecimal value) {
            addCriterion("CBM >", value, "cbm");
            return (Criteria) this;
        }

        public Criteria andCbmGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CBM >=", value, "cbm");
            return (Criteria) this;
        }

        public Criteria andCbmLessThan(BigDecimal value) {
            addCriterion("CBM <", value, "cbm");
            return (Criteria) this;
        }

        public Criteria andCbmLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CBM <=", value, "cbm");
            return (Criteria) this;
        }

        public Criteria andCbmIn(List<BigDecimal> values) {
            addCriterion("CBM in", values, "cbm");
            return (Criteria) this;
        }

        public Criteria andCbmNotIn(List<BigDecimal> values) {
            addCriterion("CBM not in", values, "cbm");
            return (Criteria) this;
        }

        public Criteria andCbmBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CBM between", value1, value2, "cbm");
            return (Criteria) this;
        }

        public Criteria andCbmNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CBM not between", value1, value2, "cbm");
            return (Criteria) this;
        }

        public Criteria andLIsNull() {
            addCriterion("L is null");
            return (Criteria) this;
        }

        public Criteria andLIsNotNull() {
            addCriterion("L is not null");
            return (Criteria) this;
        }

        public Criteria andLEqualTo(BigDecimal value) {
            addCriterion("L =", value, "l");
            return (Criteria) this;
        }

        public Criteria andLNotEqualTo(BigDecimal value) {
            addCriterion("L <>", value, "l");
            return (Criteria) this;
        }

        public Criteria andLGreaterThan(BigDecimal value) {
            addCriterion("L >", value, "l");
            return (Criteria) this;
        }

        public Criteria andLGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("L >=", value, "l");
            return (Criteria) this;
        }

        public Criteria andLLessThan(BigDecimal value) {
            addCriterion("L <", value, "l");
            return (Criteria) this;
        }

        public Criteria andLLessThanOrEqualTo(BigDecimal value) {
            addCriterion("L <=", value, "l");
            return (Criteria) this;
        }

        public Criteria andLIn(List<BigDecimal> values) {
            addCriterion("L in", values, "l");
            return (Criteria) this;
        }

        public Criteria andLNotIn(List<BigDecimal> values) {
            addCriterion("L not in", values, "l");
            return (Criteria) this;
        }

        public Criteria andLBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("L between", value1, value2, "l");
            return (Criteria) this;
        }

        public Criteria andLNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("L not between", value1, value2, "l");
            return (Criteria) this;
        }

        public Criteria andWIsNull() {
            addCriterion("W is null");
            return (Criteria) this;
        }

        public Criteria andWIsNotNull() {
            addCriterion("W is not null");
            return (Criteria) this;
        }

        public Criteria andWEqualTo(BigDecimal value) {
            addCriterion("W =", value, "w");
            return (Criteria) this;
        }

        public Criteria andWNotEqualTo(BigDecimal value) {
            addCriterion("W <>", value, "w");
            return (Criteria) this;
        }

        public Criteria andWGreaterThan(BigDecimal value) {
            addCriterion("W >", value, "w");
            return (Criteria) this;
        }

        public Criteria andWGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("W >=", value, "w");
            return (Criteria) this;
        }

        public Criteria andWLessThan(BigDecimal value) {
            addCriterion("W <", value, "w");
            return (Criteria) this;
        }

        public Criteria andWLessThanOrEqualTo(BigDecimal value) {
            addCriterion("W <=", value, "w");
            return (Criteria) this;
        }

        public Criteria andWIn(List<BigDecimal> values) {
            addCriterion("W in", values, "w");
            return (Criteria) this;
        }

        public Criteria andWNotIn(List<BigDecimal> values) {
            addCriterion("W not in", values, "w");
            return (Criteria) this;
        }

        public Criteria andWBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("W between", value1, value2, "w");
            return (Criteria) this;
        }

        public Criteria andWNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("W not between", value1, value2, "w");
            return (Criteria) this;
        }

        public Criteria andHIsNull() {
            addCriterion("H is null");
            return (Criteria) this;
        }

        public Criteria andHIsNotNull() {
            addCriterion("H is not null");
            return (Criteria) this;
        }

        public Criteria andHEqualTo(BigDecimal value) {
            addCriterion("H =", value, "h");
            return (Criteria) this;
        }

        public Criteria andHNotEqualTo(BigDecimal value) {
            addCriterion("H <>", value, "h");
            return (Criteria) this;
        }

        public Criteria andHGreaterThan(BigDecimal value) {
            addCriterion("H >", value, "h");
            return (Criteria) this;
        }

        public Criteria andHGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("H >=", value, "h");
            return (Criteria) this;
        }

        public Criteria andHLessThan(BigDecimal value) {
            addCriterion("H <", value, "h");
            return (Criteria) this;
        }

        public Criteria andHLessThanOrEqualTo(BigDecimal value) {
            addCriterion("H <=", value, "h");
            return (Criteria) this;
        }

        public Criteria andHIn(List<BigDecimal> values) {
            addCriterion("H in", values, "h");
            return (Criteria) this;
        }

        public Criteria andHNotIn(List<BigDecimal> values) {
            addCriterion("H not in", values, "h");
            return (Criteria) this;
        }

        public Criteria andHBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("H between", value1, value2, "h");
            return (Criteria) this;
        }

        public Criteria andHNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("H not between", value1, value2, "h");
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