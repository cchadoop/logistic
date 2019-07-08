package com.jxlg.logistic.module.delivery.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DeliveryspotExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeliveryspotExample() {
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

        public Criteria andDeliveryspotNoIsNull() {
            addCriterion("deliveryspot_no is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryspotNoIsNotNull() {
            addCriterion("deliveryspot_no is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryspotNoEqualTo(String value) {
            addCriterion("deliveryspot_no =", value, "deliveryspotNo");
            return (Criteria) this;
        }

        public Criteria andDeliveryspotNoNotEqualTo(String value) {
            addCriterion("deliveryspot_no <>", value, "deliveryspotNo");
            return (Criteria) this;
        }

        public Criteria andDeliveryspotNoGreaterThan(String value) {
            addCriterion("deliveryspot_no >", value, "deliveryspotNo");
            return (Criteria) this;
        }

        public Criteria andDeliveryspotNoGreaterThanOrEqualTo(String value) {
            addCriterion("deliveryspot_no >=", value, "deliveryspotNo");
            return (Criteria) this;
        }

        public Criteria andDeliveryspotNoLessThan(String value) {
            addCriterion("deliveryspot_no <", value, "deliveryspotNo");
            return (Criteria) this;
        }

        public Criteria andDeliveryspotNoLessThanOrEqualTo(String value) {
            addCriterion("deliveryspot_no <=", value, "deliveryspotNo");
            return (Criteria) this;
        }

        public Criteria andDeliveryspotNoLike(String value) {
            addCriterion("deliveryspot_no like", value, "deliveryspotNo");
            return (Criteria) this;
        }

        public Criteria andDeliveryspotNoNotLike(String value) {
            addCriterion("deliveryspot_no not like", value, "deliveryspotNo");
            return (Criteria) this;
        }

        public Criteria andDeliveryspotNoIn(List<String> values) {
            addCriterion("deliveryspot_no in", values, "deliveryspotNo");
            return (Criteria) this;
        }

        public Criteria andDeliveryspotNoNotIn(List<String> values) {
            addCriterion("deliveryspot_no not in", values, "deliveryspotNo");
            return (Criteria) this;
        }

        public Criteria andDeliveryspotNoBetween(String value1, String value2) {
            addCriterion("deliveryspot_no between", value1, value2, "deliveryspotNo");
            return (Criteria) this;
        }

        public Criteria andDeliveryspotNoNotBetween(String value1, String value2) {
            addCriterion("deliveryspot_no not between", value1, value2, "deliveryspotNo");
            return (Criteria) this;
        }

        public Criteria andDeliveryspotNameIsNull() {
            addCriterion("deliveryspot_name is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryspotNameIsNotNull() {
            addCriterion("deliveryspot_name is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryspotNameEqualTo(String value) {
            addCriterion("deliveryspot_name =", value, "deliveryspotName");
            return (Criteria) this;
        }

        public Criteria andDeliveryspotNameNotEqualTo(String value) {
            addCriterion("deliveryspot_name <>", value, "deliveryspotName");
            return (Criteria) this;
        }

        public Criteria andDeliveryspotNameGreaterThan(String value) {
            addCriterion("deliveryspot_name >", value, "deliveryspotName");
            return (Criteria) this;
        }

        public Criteria andDeliveryspotNameGreaterThanOrEqualTo(String value) {
            addCriterion("deliveryspot_name >=", value, "deliveryspotName");
            return (Criteria) this;
        }

        public Criteria andDeliveryspotNameLessThan(String value) {
            addCriterion("deliveryspot_name <", value, "deliveryspotName");
            return (Criteria) this;
        }

        public Criteria andDeliveryspotNameLessThanOrEqualTo(String value) {
            addCriterion("deliveryspot_name <=", value, "deliveryspotName");
            return (Criteria) this;
        }

        public Criteria andDeliveryspotNameLike(String value) {
            addCriterion("deliveryspot_name like", value, "deliveryspotName");
            return (Criteria) this;
        }

        public Criteria andDeliveryspotNameNotLike(String value) {
            addCriterion("deliveryspot_name not like", value, "deliveryspotName");
            return (Criteria) this;
        }

        public Criteria andDeliveryspotNameIn(List<String> values) {
            addCriterion("deliveryspot_name in", values, "deliveryspotName");
            return (Criteria) this;
        }

        public Criteria andDeliveryspotNameNotIn(List<String> values) {
            addCriterion("deliveryspot_name not in", values, "deliveryspotName");
            return (Criteria) this;
        }

        public Criteria andDeliveryspotNameBetween(String value1, String value2) {
            addCriterion("deliveryspot_name between", value1, value2, "deliveryspotName");
            return (Criteria) this;
        }

        public Criteria andDeliveryspotNameNotBetween(String value1, String value2) {
            addCriterion("deliveryspot_name not between", value1, value2, "deliveryspotName");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNull() {
            addCriterion("city_id is null");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNotNull() {
            addCriterion("city_id is not null");
            return (Criteria) this;
        }

        public Criteria andCityIdEqualTo(String value) {
            addCriterion("city_id =", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotEqualTo(String value) {
            addCriterion("city_id <>", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThan(String value) {
            addCriterion("city_id >", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThanOrEqualTo(String value) {
            addCriterion("city_id >=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThan(String value) {
            addCriterion("city_id <", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThanOrEqualTo(String value) {
            addCriterion("city_id <=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLike(String value) {
            addCriterion("city_id like", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotLike(String value) {
            addCriterion("city_id not like", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdIn(List<String> values) {
            addCriterion("city_id in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotIn(List<String> values) {
            addCriterion("city_id not in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdBetween(String value1, String value2) {
            addCriterion("city_id between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotBetween(String value1, String value2) {
            addCriterion("city_id not between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIsNull() {
            addCriterion("province_id is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIsNotNull() {
            addCriterion("province_id is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdEqualTo(String value) {
            addCriterion("province_id =", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotEqualTo(String value) {
            addCriterion("province_id <>", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThan(String value) {
            addCriterion("province_id >", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThanOrEqualTo(String value) {
            addCriterion("province_id >=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThan(String value) {
            addCriterion("province_id <", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThanOrEqualTo(String value) {
            addCriterion("province_id <=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLike(String value) {
            addCriterion("province_id like", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotLike(String value) {
            addCriterion("province_id not like", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIn(List<String> values) {
            addCriterion("province_id in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotIn(List<String> values) {
            addCriterion("province_id not in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdBetween(String value1, String value2) {
            addCriterion("province_id between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotBetween(String value1, String value2) {
            addCriterion("province_id not between", value1, value2, "provinceId");
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

        public Criteria andTelIsNull() {
            addCriterion("tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("tel not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andFirstWeightScopeIsNull() {
            addCriterion("first_weight_scope is null");
            return (Criteria) this;
        }

        public Criteria andFirstWeightScopeIsNotNull() {
            addCriterion("first_weight_scope is not null");
            return (Criteria) this;
        }

        public Criteria andFirstWeightScopeEqualTo(BigDecimal value) {
            addCriterion("first_weight_scope =", value, "firstWeightScope");
            return (Criteria) this;
        }

        public Criteria andFirstWeightScopeNotEqualTo(BigDecimal value) {
            addCriterion("first_weight_scope <>", value, "firstWeightScope");
            return (Criteria) this;
        }

        public Criteria andFirstWeightScopeGreaterThan(BigDecimal value) {
            addCriterion("first_weight_scope >", value, "firstWeightScope");
            return (Criteria) this;
        }

        public Criteria andFirstWeightScopeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("first_weight_scope >=", value, "firstWeightScope");
            return (Criteria) this;
        }

        public Criteria andFirstWeightScopeLessThan(BigDecimal value) {
            addCriterion("first_weight_scope <", value, "firstWeightScope");
            return (Criteria) this;
        }

        public Criteria andFirstWeightScopeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("first_weight_scope <=", value, "firstWeightScope");
            return (Criteria) this;
        }

        public Criteria andFirstWeightScopeIn(List<BigDecimal> values) {
            addCriterion("first_weight_scope in", values, "firstWeightScope");
            return (Criteria) this;
        }

        public Criteria andFirstWeightScopeNotIn(List<BigDecimal> values) {
            addCriterion("first_weight_scope not in", values, "firstWeightScope");
            return (Criteria) this;
        }

        public Criteria andFirstWeightScopeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("first_weight_scope between", value1, value2, "firstWeightScope");
            return (Criteria) this;
        }

        public Criteria andFirstWeightScopeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("first_weight_scope not between", value1, value2, "firstWeightScope");
            return (Criteria) this;
        }

        public Criteria andFirstWeightPriceIsNull() {
            addCriterion("first_weight_price is null");
            return (Criteria) this;
        }

        public Criteria andFirstWeightPriceIsNotNull() {
            addCriterion("first_weight_price is not null");
            return (Criteria) this;
        }

        public Criteria andFirstWeightPriceEqualTo(BigDecimal value) {
            addCriterion("first_weight_price =", value, "firstWeightPrice");
            return (Criteria) this;
        }

        public Criteria andFirstWeightPriceNotEqualTo(BigDecimal value) {
            addCriterion("first_weight_price <>", value, "firstWeightPrice");
            return (Criteria) this;
        }

        public Criteria andFirstWeightPriceGreaterThan(BigDecimal value) {
            addCriterion("first_weight_price >", value, "firstWeightPrice");
            return (Criteria) this;
        }

        public Criteria andFirstWeightPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("first_weight_price >=", value, "firstWeightPrice");
            return (Criteria) this;
        }

        public Criteria andFirstWeightPriceLessThan(BigDecimal value) {
            addCriterion("first_weight_price <", value, "firstWeightPrice");
            return (Criteria) this;
        }

        public Criteria andFirstWeightPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("first_weight_price <=", value, "firstWeightPrice");
            return (Criteria) this;
        }

        public Criteria andFirstWeightPriceIn(List<BigDecimal> values) {
            addCriterion("first_weight_price in", values, "firstWeightPrice");
            return (Criteria) this;
        }

        public Criteria andFirstWeightPriceNotIn(List<BigDecimal> values) {
            addCriterion("first_weight_price not in", values, "firstWeightPrice");
            return (Criteria) this;
        }

        public Criteria andFirstWeightPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("first_weight_price between", value1, value2, "firstWeightPrice");
            return (Criteria) this;
        }

        public Criteria andFirstWeightPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("first_weight_price not between", value1, value2, "firstWeightPrice");
            return (Criteria) this;
        }

        public Criteria andSecondWeightRateIsNull() {
            addCriterion("second_weight_rate is null");
            return (Criteria) this;
        }

        public Criteria andSecondWeightRateIsNotNull() {
            addCriterion("second_weight_rate is not null");
            return (Criteria) this;
        }

        public Criteria andSecondWeightRateEqualTo(BigDecimal value) {
            addCriterion("second_weight_rate =", value, "secondWeightRate");
            return (Criteria) this;
        }

        public Criteria andSecondWeightRateNotEqualTo(BigDecimal value) {
            addCriterion("second_weight_rate <>", value, "secondWeightRate");
            return (Criteria) this;
        }

        public Criteria andSecondWeightRateGreaterThan(BigDecimal value) {
            addCriterion("second_weight_rate >", value, "secondWeightRate");
            return (Criteria) this;
        }

        public Criteria andSecondWeightRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("second_weight_rate >=", value, "secondWeightRate");
            return (Criteria) this;
        }

        public Criteria andSecondWeightRateLessThan(BigDecimal value) {
            addCriterion("second_weight_rate <", value, "secondWeightRate");
            return (Criteria) this;
        }

        public Criteria andSecondWeightRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("second_weight_rate <=", value, "secondWeightRate");
            return (Criteria) this;
        }

        public Criteria andSecondWeightRateIn(List<BigDecimal> values) {
            addCriterion("second_weight_rate in", values, "secondWeightRate");
            return (Criteria) this;
        }

        public Criteria andSecondWeightRateNotIn(List<BigDecimal> values) {
            addCriterion("second_weight_rate not in", values, "secondWeightRate");
            return (Criteria) this;
        }

        public Criteria andSecondWeightRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("second_weight_rate between", value1, value2, "secondWeightRate");
            return (Criteria) this;
        }

        public Criteria andSecondWeightRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("second_weight_rate not between", value1, value2, "secondWeightRate");
            return (Criteria) this;
        }

        public Criteria andFirstVolumeScopeIsNull() {
            addCriterion("first_volume_scope is null");
            return (Criteria) this;
        }

        public Criteria andFirstVolumeScopeIsNotNull() {
            addCriterion("first_volume_scope is not null");
            return (Criteria) this;
        }

        public Criteria andFirstVolumeScopeEqualTo(BigDecimal value) {
            addCriterion("first_volume_scope =", value, "firstVolumeScope");
            return (Criteria) this;
        }

        public Criteria andFirstVolumeScopeNotEqualTo(BigDecimal value) {
            addCriterion("first_volume_scope <>", value, "firstVolumeScope");
            return (Criteria) this;
        }

        public Criteria andFirstVolumeScopeGreaterThan(BigDecimal value) {
            addCriterion("first_volume_scope >", value, "firstVolumeScope");
            return (Criteria) this;
        }

        public Criteria andFirstVolumeScopeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("first_volume_scope >=", value, "firstVolumeScope");
            return (Criteria) this;
        }

        public Criteria andFirstVolumeScopeLessThan(BigDecimal value) {
            addCriterion("first_volume_scope <", value, "firstVolumeScope");
            return (Criteria) this;
        }

        public Criteria andFirstVolumeScopeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("first_volume_scope <=", value, "firstVolumeScope");
            return (Criteria) this;
        }

        public Criteria andFirstVolumeScopeIn(List<BigDecimal> values) {
            addCriterion("first_volume_scope in", values, "firstVolumeScope");
            return (Criteria) this;
        }

        public Criteria andFirstVolumeScopeNotIn(List<BigDecimal> values) {
            addCriterion("first_volume_scope not in", values, "firstVolumeScope");
            return (Criteria) this;
        }

        public Criteria andFirstVolumeScopeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("first_volume_scope between", value1, value2, "firstVolumeScope");
            return (Criteria) this;
        }

        public Criteria andFirstVolumeScopeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("first_volume_scope not between", value1, value2, "firstVolumeScope");
            return (Criteria) this;
        }

        public Criteria andFirstVolumePriceIsNull() {
            addCriterion("first_volume_price is null");
            return (Criteria) this;
        }

        public Criteria andFirstVolumePriceIsNotNull() {
            addCriterion("first_volume_price is not null");
            return (Criteria) this;
        }

        public Criteria andFirstVolumePriceEqualTo(BigDecimal value) {
            addCriterion("first_volume_price =", value, "firstVolumePrice");
            return (Criteria) this;
        }

        public Criteria andFirstVolumePriceNotEqualTo(BigDecimal value) {
            addCriterion("first_volume_price <>", value, "firstVolumePrice");
            return (Criteria) this;
        }

        public Criteria andFirstVolumePriceGreaterThan(BigDecimal value) {
            addCriterion("first_volume_price >", value, "firstVolumePrice");
            return (Criteria) this;
        }

        public Criteria andFirstVolumePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("first_volume_price >=", value, "firstVolumePrice");
            return (Criteria) this;
        }

        public Criteria andFirstVolumePriceLessThan(BigDecimal value) {
            addCriterion("first_volume_price <", value, "firstVolumePrice");
            return (Criteria) this;
        }

        public Criteria andFirstVolumePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("first_volume_price <=", value, "firstVolumePrice");
            return (Criteria) this;
        }

        public Criteria andFirstVolumePriceIn(List<BigDecimal> values) {
            addCriterion("first_volume_price in", values, "firstVolumePrice");
            return (Criteria) this;
        }

        public Criteria andFirstVolumePriceNotIn(List<BigDecimal> values) {
            addCriterion("first_volume_price not in", values, "firstVolumePrice");
            return (Criteria) this;
        }

        public Criteria andFirstVolumePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("first_volume_price between", value1, value2, "firstVolumePrice");
            return (Criteria) this;
        }

        public Criteria andFirstVolumePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("first_volume_price not between", value1, value2, "firstVolumePrice");
            return (Criteria) this;
        }

        public Criteria andSecondVolumeRateIsNull() {
            addCriterion("second_volume_rate is null");
            return (Criteria) this;
        }

        public Criteria andSecondVolumeRateIsNotNull() {
            addCriterion("second_volume_rate is not null");
            return (Criteria) this;
        }

        public Criteria andSecondVolumeRateEqualTo(BigDecimal value) {
            addCriterion("second_volume_rate =", value, "secondVolumeRate");
            return (Criteria) this;
        }

        public Criteria andSecondVolumeRateNotEqualTo(BigDecimal value) {
            addCriterion("second_volume_rate <>", value, "secondVolumeRate");
            return (Criteria) this;
        }

        public Criteria andSecondVolumeRateGreaterThan(BigDecimal value) {
            addCriterion("second_volume_rate >", value, "secondVolumeRate");
            return (Criteria) this;
        }

        public Criteria andSecondVolumeRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("second_volume_rate >=", value, "secondVolumeRate");
            return (Criteria) this;
        }

        public Criteria andSecondVolumeRateLessThan(BigDecimal value) {
            addCriterion("second_volume_rate <", value, "secondVolumeRate");
            return (Criteria) this;
        }

        public Criteria andSecondVolumeRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("second_volume_rate <=", value, "secondVolumeRate");
            return (Criteria) this;
        }

        public Criteria andSecondVolumeRateIn(List<BigDecimal> values) {
            addCriterion("second_volume_rate in", values, "secondVolumeRate");
            return (Criteria) this;
        }

        public Criteria andSecondVolumeRateNotIn(List<BigDecimal> values) {
            addCriterion("second_volume_rate not in", values, "secondVolumeRate");
            return (Criteria) this;
        }

        public Criteria andSecondVolumeRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("second_volume_rate between", value1, value2, "secondVolumeRate");
            return (Criteria) this;
        }

        public Criteria andSecondVolumeRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("second_volume_rate not between", value1, value2, "secondVolumeRate");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeIsNull() {
            addCriterion("delivery_time is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeIsNotNull() {
            addCriterion("delivery_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeEqualTo(Date value) {
            addCriterion("delivery_time =", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeNotEqualTo(Date value) {
            addCriterion("delivery_time <>", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeGreaterThan(Date value) {
            addCriterion("delivery_time >", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("delivery_time >=", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeLessThan(Date value) {
            addCriterion("delivery_time <", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeLessThanOrEqualTo(Date value) {
            addCriterion("delivery_time <=", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeIn(List<Date> values) {
            addCriterion("delivery_time in", values, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeNotIn(List<Date> values) {
            addCriterion("delivery_time not in", values, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeBetween(Date value1, Date value2) {
            addCriterion("delivery_time between", value1, value2, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeNotBetween(Date value1, Date value2) {
            addCriterion("delivery_time not between", value1, value2, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryStatusIsNull() {
            addCriterion("delivery_status is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryStatusIsNotNull() {
            addCriterion("delivery_status is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryStatusEqualTo(String value) {
            addCriterion("delivery_status =", value, "deliveryStatus");
            return (Criteria) this;
        }

        public Criteria andDeliveryStatusNotEqualTo(String value) {
            addCriterion("delivery_status <>", value, "deliveryStatus");
            return (Criteria) this;
        }

        public Criteria andDeliveryStatusGreaterThan(String value) {
            addCriterion("delivery_status >", value, "deliveryStatus");
            return (Criteria) this;
        }

        public Criteria andDeliveryStatusGreaterThanOrEqualTo(String value) {
            addCriterion("delivery_status >=", value, "deliveryStatus");
            return (Criteria) this;
        }

        public Criteria andDeliveryStatusLessThan(String value) {
            addCriterion("delivery_status <", value, "deliveryStatus");
            return (Criteria) this;
        }

        public Criteria andDeliveryStatusLessThanOrEqualTo(String value) {
            addCriterion("delivery_status <=", value, "deliveryStatus");
            return (Criteria) this;
        }

        public Criteria andDeliveryStatusLike(String value) {
            addCriterion("delivery_status like", value, "deliveryStatus");
            return (Criteria) this;
        }

        public Criteria andDeliveryStatusNotLike(String value) {
            addCriterion("delivery_status not like", value, "deliveryStatus");
            return (Criteria) this;
        }

        public Criteria andDeliveryStatusIn(List<String> values) {
            addCriterion("delivery_status in", values, "deliveryStatus");
            return (Criteria) this;
        }

        public Criteria andDeliveryStatusNotIn(List<String> values) {
            addCriterion("delivery_status not in", values, "deliveryStatus");
            return (Criteria) this;
        }

        public Criteria andDeliveryStatusBetween(String value1, String value2) {
            addCriterion("delivery_status between", value1, value2, "deliveryStatus");
            return (Criteria) this;
        }

        public Criteria andDeliveryStatusNotBetween(String value1, String value2) {
            addCriterion("delivery_status not between", value1, value2, "deliveryStatus");
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