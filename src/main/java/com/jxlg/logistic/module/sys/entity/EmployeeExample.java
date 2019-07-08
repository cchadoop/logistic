package com.jxlg.logistic.module.sys.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class EmployeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmployeeExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andEmpCodeIsNull() {
            addCriterion("emp_code is null");
            return (Criteria) this;
        }

        public Criteria andEmpCodeIsNotNull() {
            addCriterion("emp_code is not null");
            return (Criteria) this;
        }

        public Criteria andEmpCodeEqualTo(String value) {
            addCriterion("emp_code =", value, "empCode");
            return (Criteria) this;
        }

        public Criteria andEmpCodeNotEqualTo(String value) {
            addCriterion("emp_code <>", value, "empCode");
            return (Criteria) this;
        }

        public Criteria andEmpCodeGreaterThan(String value) {
            addCriterion("emp_code >", value, "empCode");
            return (Criteria) this;
        }

        public Criteria andEmpCodeGreaterThanOrEqualTo(String value) {
            addCriterion("emp_code >=", value, "empCode");
            return (Criteria) this;
        }

        public Criteria andEmpCodeLessThan(String value) {
            addCriterion("emp_code <", value, "empCode");
            return (Criteria) this;
        }

        public Criteria andEmpCodeLessThanOrEqualTo(String value) {
            addCriterion("emp_code <=", value, "empCode");
            return (Criteria) this;
        }

        public Criteria andEmpCodeLike(String value) {
            addCriterion("emp_code like", value, "empCode");
            return (Criteria) this;
        }

        public Criteria andEmpCodeNotLike(String value) {
            addCriterion("emp_code not like", value, "empCode");
            return (Criteria) this;
        }

        public Criteria andEmpCodeIn(List<String> values) {
            addCriterion("emp_code in", values, "empCode");
            return (Criteria) this;
        }

        public Criteria andEmpCodeNotIn(List<String> values) {
            addCriterion("emp_code not in", values, "empCode");
            return (Criteria) this;
        }

        public Criteria andEmpCodeBetween(String value1, String value2) {
            addCriterion("emp_code between", value1, value2, "empCode");
            return (Criteria) this;
        }

        public Criteria andEmpCodeNotBetween(String value1, String value2) {
            addCriterion("emp_code not between", value1, value2, "empCode");
            return (Criteria) this;
        }
        
        public Criteria andEmpAccountIsNull() {
            addCriterion("emp_account is null");
            return (Criteria) this;
        }

        public Criteria andEmpAccountIsNotNull() {
            addCriterion("emp_account is not null");
            return (Criteria) this;
        }

        public Criteria andEmpAccountEqualTo(String value) {
            addCriterion("emp_account =", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpAccountNotEqualTo(String value) {
            addCriterion("emp_account <>", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpAccountGreaterThan(String value) {
            addCriterion("emp_account >", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpAccountGreaterThanOrEqualTo(String value) {
            addCriterion("emp_account >=", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpAccountLessThan(String value) {
            addCriterion("emp_account <", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpAccountLessThanOrEqualTo(String value) {
            addCriterion("emp_account <=", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpAccountLike(String value) {
            addCriterion("emp_account like", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpAccountNotLike(String value) {
            addCriterion("emp_account not like", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpAccountIn(List<String> values) {
            addCriterion("emp_account in", values, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpAccountNotIn(List<String> values) {
            addCriterion("emp_account not in", values, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpAccountBetween(String value1, String value2) {
            addCriterion("emp_account between", value1, value2, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpAccountNotBetween(String value1, String value2) {
            addCriterion("emp_account not between", value1, value2, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameIsNull() {
            addCriterion("emp_name is null");
            return (Criteria) this;
        }

        public Criteria andEmpNameIsNotNull() {
            addCriterion("emp_name is not null");
            return (Criteria) this;
        }

        public Criteria andEmpNameEqualTo(String value) {
            addCriterion("emp_name =", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotEqualTo(String value) {
            addCriterion("emp_name <>", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameGreaterThan(String value) {
            addCriterion("emp_name >", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameGreaterThanOrEqualTo(String value) {
            addCriterion("emp_name >=", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLessThan(String value) {
            addCriterion("emp_name <", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLessThanOrEqualTo(String value) {
            addCriterion("emp_name <=", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameLike(String value) {
            addCriterion("emp_name like", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotLike(String value) {
            addCriterion("emp_name not like", value, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameIn(List<String> values) {
            addCriterion("emp_name in", values, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotIn(List<String> values) {
            addCriterion("emp_name not in", values, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameBetween(String value1, String value2) {
            addCriterion("emp_name between", value1, value2, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpNameNotBetween(String value1, String value2) {
            addCriterion("emp_name not between", value1, value2, "empName");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordIsNull() {
            addCriterion("emp_password is null");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordIsNotNull() {
            addCriterion("emp_password is not null");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordEqualTo(String value) {
            addCriterion("emp_password =", value, "empPassword");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordNotEqualTo(String value) {
            addCriterion("emp_password <>", value, "empPassword");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordGreaterThan(String value) {
            addCriterion("emp_password >", value, "empPassword");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("emp_password >=", value, "empPassword");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordLessThan(String value) {
            addCriterion("emp_password <", value, "empPassword");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordLessThanOrEqualTo(String value) {
            addCriterion("emp_password <=", value, "empPassword");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordLike(String value) {
            addCriterion("emp_password like", value, "empPassword");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordNotLike(String value) {
            addCriterion("emp_password not like", value, "empPassword");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordIn(List<String> values) {
            addCriterion("emp_password in", values, "empPassword");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordNotIn(List<String> values) {
            addCriterion("emp_password not in", values, "empPassword");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordBetween(String value1, String value2) {
            addCriterion("emp_password between", value1, value2, "empPassword");
            return (Criteria) this;
        }

        public Criteria andEmpPasswordNotBetween(String value1, String value2) {
            addCriterion("emp_password not between", value1, value2, "empPassword");
            return (Criteria) this;
        }

        public Criteria andEmpSexIsNull() {
            addCriterion("emp_sex is null");
            return (Criteria) this;
        }

        public Criteria andEmpSexIsNotNull() {
            addCriterion("emp_sex is not null");
            return (Criteria) this;
        }

        public Criteria andEmpSexEqualTo(String value) {
            addCriterion("emp_sex =", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexNotEqualTo(String value) {
            addCriterion("emp_sex <>", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexGreaterThan(String value) {
            addCriterion("emp_sex >", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexGreaterThanOrEqualTo(String value) {
            addCriterion("emp_sex >=", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexLessThan(String value) {
            addCriterion("emp_sex <", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexLessThanOrEqualTo(String value) {
            addCriterion("emp_sex <=", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexLike(String value) {
            addCriterion("emp_sex like", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexNotLike(String value) {
            addCriterion("emp_sex not like", value, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexIn(List<String> values) {
            addCriterion("emp_sex in", values, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexNotIn(List<String> values) {
            addCriterion("emp_sex not in", values, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexBetween(String value1, String value2) {
            addCriterion("emp_sex between", value1, value2, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpSexNotBetween(String value1, String value2) {
            addCriterion("emp_sex not between", value1, value2, "empSex");
            return (Criteria) this;
        }

        public Criteria andEmpBirthdayIsNull() {
            addCriterion("emp_birthday is null");
            return (Criteria) this;
        }

        public Criteria andEmpBirthdayIsNotNull() {
            addCriterion("emp_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andEmpBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("emp_birthday =", value, "empBirthday");
            return (Criteria) this;
        }

        public Criteria andEmpBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("emp_birthday <>", value, "empBirthday");
            return (Criteria) this;
        }

        public Criteria andEmpBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("emp_birthday >", value, "empBirthday");
            return (Criteria) this;
        }

        public Criteria andEmpBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("emp_birthday >=", value, "empBirthday");
            return (Criteria) this;
        }

        public Criteria andEmpBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("emp_birthday <", value, "empBirthday");
            return (Criteria) this;
        }

        public Criteria andEmpBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("emp_birthday <=", value, "empBirthday");
            return (Criteria) this;
        }

        public Criteria andEmpBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("emp_birthday in", values, "empBirthday");
            return (Criteria) this;
        }

        public Criteria andEmpBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("emp_birthday not in", values, "empBirthday");
            return (Criteria) this;
        }

        public Criteria andEmpBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("emp_birthday between", value1, value2, "empBirthday");
            return (Criteria) this;
        }

        public Criteria andEmpBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("emp_birthday not between", value1, value2, "empBirthday");
            return (Criteria) this;
        }

        public Criteria andEmpLiveAddressIsNull() {
            addCriterion("emp_live_address is null");
            return (Criteria) this;
        }

        public Criteria andEmpLiveAddressIsNotNull() {
            addCriterion("emp_live_address is not null");
            return (Criteria) this;
        }

        public Criteria andEmpLiveAddressEqualTo(String value) {
            addCriterion("emp_live_address =", value, "empLiveAddress");
            return (Criteria) this;
        }

        public Criteria andEmpLiveAddressNotEqualTo(String value) {
            addCriterion("emp_live_address <>", value, "empLiveAddress");
            return (Criteria) this;
        }

        public Criteria andEmpLiveAddressGreaterThan(String value) {
            addCriterion("emp_live_address >", value, "empLiveAddress");
            return (Criteria) this;
        }

        public Criteria andEmpLiveAddressGreaterThanOrEqualTo(String value) {
            addCriterion("emp_live_address >=", value, "empLiveAddress");
            return (Criteria) this;
        }

        public Criteria andEmpLiveAddressLessThan(String value) {
            addCriterion("emp_live_address <", value, "empLiveAddress");
            return (Criteria) this;
        }

        public Criteria andEmpLiveAddressLessThanOrEqualTo(String value) {
            addCriterion("emp_live_address <=", value, "empLiveAddress");
            return (Criteria) this;
        }

        public Criteria andEmpLiveAddressLike(String value) {
            addCriterion("emp_live_address like", value, "empLiveAddress");
            return (Criteria) this;
        }

        public Criteria andEmpLiveAddressNotLike(String value) {
            addCriterion("emp_live_address not like", value, "empLiveAddress");
            return (Criteria) this;
        }

        public Criteria andEmpLiveAddressIn(List<String> values) {
            addCriterion("emp_live_address in", values, "empLiveAddress");
            return (Criteria) this;
        }

        public Criteria andEmpLiveAddressNotIn(List<String> values) {
            addCriterion("emp_live_address not in", values, "empLiveAddress");
            return (Criteria) this;
        }

        public Criteria andEmpLiveAddressBetween(String value1, String value2) {
            addCriterion("emp_live_address between", value1, value2, "empLiveAddress");
            return (Criteria) this;
        }

        public Criteria andEmpLiveAddressNotBetween(String value1, String value2) {
            addCriterion("emp_live_address not between", value1, value2, "empLiveAddress");
            return (Criteria) this;
        }

        public Criteria andEmpWorkAddressIsNull() {
            addCriterion("emp_work_address is null");
            return (Criteria) this;
        }

        public Criteria andEmpWorkAddressIsNotNull() {
            addCriterion("emp_work_address is not null");
            return (Criteria) this;
        }

        public Criteria andEmpWorkAddressEqualTo(String value) {
            addCriterion("emp_work_address =", value, "empWorkAddress");
            return (Criteria) this;
        }

        public Criteria andEmpWorkAddressNotEqualTo(String value) {
            addCriterion("emp_work_address <>", value, "empWorkAddress");
            return (Criteria) this;
        }

        public Criteria andEmpWorkAddressGreaterThan(String value) {
            addCriterion("emp_work_address >", value, "empWorkAddress");
            return (Criteria) this;
        }

        public Criteria andEmpWorkAddressGreaterThanOrEqualTo(String value) {
            addCriterion("emp_work_address >=", value, "empWorkAddress");
            return (Criteria) this;
        }

        public Criteria andEmpWorkAddressLessThan(String value) {
            addCriterion("emp_work_address <", value, "empWorkAddress");
            return (Criteria) this;
        }

        public Criteria andEmpWorkAddressLessThanOrEqualTo(String value) {
            addCriterion("emp_work_address <=", value, "empWorkAddress");
            return (Criteria) this;
        }

        public Criteria andEmpWorkAddressLike(String value) {
            addCriterion("emp_work_address like", value, "empWorkAddress");
            return (Criteria) this;
        }

        public Criteria andEmpWorkAddressNotLike(String value) {
            addCriterion("emp_work_address not like", value, "empWorkAddress");
            return (Criteria) this;
        }

        public Criteria andEmpWorkAddressIn(List<String> values) {
            addCriterion("emp_work_address in", values, "empWorkAddress");
            return (Criteria) this;
        }

        public Criteria andEmpWorkAddressNotIn(List<String> values) {
            addCriterion("emp_work_address not in", values, "empWorkAddress");
            return (Criteria) this;
        }

        public Criteria andEmpWorkAddressBetween(String value1, String value2) {
            addCriterion("emp_work_address between", value1, value2, "empWorkAddress");
            return (Criteria) this;
        }

        public Criteria andEmpWorkAddressNotBetween(String value1, String value2) {
            addCriterion("emp_work_address not between", value1, value2, "empWorkAddress");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneIsNull() {
            addCriterion("emp_phone is null");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneIsNotNull() {
            addCriterion("emp_phone is not null");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneEqualTo(String value) {
            addCriterion("emp_phone =", value, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneNotEqualTo(String value) {
            addCriterion("emp_phone <>", value, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneGreaterThan(String value) {
            addCriterion("emp_phone >", value, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("emp_phone >=", value, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneLessThan(String value) {
            addCriterion("emp_phone <", value, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneLessThanOrEqualTo(String value) {
            addCriterion("emp_phone <=", value, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneLike(String value) {
            addCriterion("emp_phone like", value, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneNotLike(String value) {
            addCriterion("emp_phone not like", value, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneIn(List<String> values) {
            addCriterion("emp_phone in", values, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneNotIn(List<String> values) {
            addCriterion("emp_phone not in", values, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneBetween(String value1, String value2) {
            addCriterion("emp_phone between", value1, value2, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpPhoneNotBetween(String value1, String value2) {
            addCriterion("emp_phone not between", value1, value2, "empPhone");
            return (Criteria) this;
        }

        public Criteria andEmpWorktimeIsNull() {
            addCriterion("emp_worktime is null");
            return (Criteria) this;
        }

        public Criteria andEmpWorktimeIsNotNull() {
            addCriterion("emp_worktime is not null");
            return (Criteria) this;
        }

        public Criteria andEmpWorktimeEqualTo(Date value) {
            addCriterionForJDBCDate("emp_worktime =", value, "empWorktime");
            return (Criteria) this;
        }

        public Criteria andEmpWorktimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("emp_worktime <>", value, "empWorktime");
            return (Criteria) this;
        }

        public Criteria andEmpWorktimeGreaterThan(Date value) {
            addCriterionForJDBCDate("emp_worktime >", value, "empWorktime");
            return (Criteria) this;
        }

        public Criteria andEmpWorktimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("emp_worktime >=", value, "empWorktime");
            return (Criteria) this;
        }

        public Criteria andEmpWorktimeLessThan(Date value) {
            addCriterionForJDBCDate("emp_worktime <", value, "empWorktime");
            return (Criteria) this;
        }

        public Criteria andEmpWorktimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("emp_worktime <=", value, "empWorktime");
            return (Criteria) this;
        }

        public Criteria andEmpWorktimeIn(List<Date> values) {
            addCriterionForJDBCDate("emp_worktime in", values, "empWorktime");
            return (Criteria) this;
        }

        public Criteria andEmpWorktimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("emp_worktime not in", values, "empWorktime");
            return (Criteria) this;
        }

        public Criteria andEmpWorktimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("emp_worktime between", value1, value2, "empWorktime");
            return (Criteria) this;
        }

        public Criteria andEmpWorktimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("emp_worktime not between", value1, value2, "empWorktime");
            return (Criteria) this;
        }

        public Criteria andEmpSalaryIsNull() {
            addCriterion("emp_salary is null");
            return (Criteria) this;
        }

        public Criteria andEmpSalaryIsNotNull() {
            addCriterion("emp_salary is not null");
            return (Criteria) this;
        }

        public Criteria andEmpSalaryEqualTo(BigDecimal value) {
            addCriterion("emp_salary =", value, "empSalary");
            return (Criteria) this;
        }

        public Criteria andEmpSalaryNotEqualTo(BigDecimal value) {
            addCriterion("emp_salary <>", value, "empSalary");
            return (Criteria) this;
        }

        public Criteria andEmpSalaryGreaterThan(BigDecimal value) {
            addCriterion("emp_salary >", value, "empSalary");
            return (Criteria) this;
        }

        public Criteria andEmpSalaryGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("emp_salary >=", value, "empSalary");
            return (Criteria) this;
        }

        public Criteria andEmpSalaryLessThan(BigDecimal value) {
            addCriterion("emp_salary <", value, "empSalary");
            return (Criteria) this;
        }

        public Criteria andEmpSalaryLessThanOrEqualTo(BigDecimal value) {
            addCriterion("emp_salary <=", value, "empSalary");
            return (Criteria) this;
        }

        public Criteria andEmpSalaryIn(List<BigDecimal> values) {
            addCriterion("emp_salary in", values, "empSalary");
            return (Criteria) this;
        }

        public Criteria andEmpSalaryNotIn(List<BigDecimal> values) {
            addCriterion("emp_salary not in", values, "empSalary");
            return (Criteria) this;
        }

        public Criteria andEmpSalaryBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("emp_salary between", value1, value2, "empSalary");
            return (Criteria) this;
        }

        public Criteria andEmpSalaryNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("emp_salary not between", value1, value2, "empSalary");
            return (Criteria) this;
        }

        public Criteria andEmpEmailIsNull() {
            addCriterion("emp_email is null");
            return (Criteria) this;
        }

        public Criteria andEmpEmailIsNotNull() {
            addCriterion("emp_email is not null");
            return (Criteria) this;
        }

        public Criteria andEmpEmailEqualTo(String value) {
            addCriterion("emp_email =", value, "empEmail");
            return (Criteria) this;
        }

        public Criteria andEmpEmailNotEqualTo(String value) {
            addCriterion("emp_email <>", value, "empEmail");
            return (Criteria) this;
        }

        public Criteria andEmpEmailGreaterThan(String value) {
            addCriterion("emp_email >", value, "empEmail");
            return (Criteria) this;
        }

        public Criteria andEmpEmailGreaterThanOrEqualTo(String value) {
            addCriterion("emp_email >=", value, "empEmail");
            return (Criteria) this;
        }

        public Criteria andEmpEmailLessThan(String value) {
            addCriterion("emp_email <", value, "empEmail");
            return (Criteria) this;
        }

        public Criteria andEmpEmailLessThanOrEqualTo(String value) {
            addCriterion("emp_email <=", value, "empEmail");
            return (Criteria) this;
        }

        public Criteria andEmpEmailLike(String value) {
            addCriterion("emp_email like", value, "empEmail");
            return (Criteria) this;
        }

        public Criteria andEmpEmailNotLike(String value) {
            addCriterion("emp_email not like", value, "empEmail");
            return (Criteria) this;
        }

        public Criteria andEmpEmailIn(List<String> values) {
            addCriterion("emp_email in", values, "empEmail");
            return (Criteria) this;
        }

        public Criteria andEmpEmailNotIn(List<String> values) {
            addCriterion("emp_email not in", values, "empEmail");
            return (Criteria) this;
        }

        public Criteria andEmpEmailBetween(String value1, String value2) {
            addCriterion("emp_email between", value1, value2, "empEmail");
            return (Criteria) this;
        }

        public Criteria andEmpEmailNotBetween(String value1, String value2) {
            addCriterion("emp_email not between", value1, value2, "empEmail");
            return (Criteria) this;
        }

        public Criteria andEmpIdcardIsNull() {
            addCriterion("emp_idcard is null");
            return (Criteria) this;
        }

        public Criteria andEmpIdcardIsNotNull() {
            addCriterion("emp_idcard is not null");
            return (Criteria) this;
        }

        public Criteria andEmpIdcardEqualTo(String value) {
            addCriterion("emp_idcard =", value, "empIdcard");
            return (Criteria) this;
        }

        public Criteria andEmpIdcardNotEqualTo(String value) {
            addCriterion("emp_idcard <>", value, "empIdcard");
            return (Criteria) this;
        }

        public Criteria andEmpIdcardGreaterThan(String value) {
            addCriterion("emp_idcard >", value, "empIdcard");
            return (Criteria) this;
        }

        public Criteria andEmpIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("emp_idcard >=", value, "empIdcard");
            return (Criteria) this;
        }

        public Criteria andEmpIdcardLessThan(String value) {
            addCriterion("emp_idcard <", value, "empIdcard");
            return (Criteria) this;
        }

        public Criteria andEmpIdcardLessThanOrEqualTo(String value) {
            addCriterion("emp_idcard <=", value, "empIdcard");
            return (Criteria) this;
        }

        public Criteria andEmpIdcardLike(String value) {
            addCriterion("emp_idcard like", value, "empIdcard");
            return (Criteria) this;
        }

        public Criteria andEmpIdcardNotLike(String value) {
            addCriterion("emp_idcard not like", value, "empIdcard");
            return (Criteria) this;
        }

        public Criteria andEmpIdcardIn(List<String> values) {
            addCriterion("emp_idcard in", values, "empIdcard");
            return (Criteria) this;
        }

        public Criteria andEmpIdcardNotIn(List<String> values) {
            addCriterion("emp_idcard not in", values, "empIdcard");
            return (Criteria) this;
        }

        public Criteria andEmpIdcardBetween(String value1, String value2) {
            addCriterion("emp_idcard between", value1, value2, "empIdcard");
            return (Criteria) this;
        }

        public Criteria andEmpIdcardNotBetween(String value1, String value2) {
            addCriterion("emp_idcard not between", value1, value2, "empIdcard");
            return (Criteria) this;
        }

        public Criteria andEmpBankcodeIsNull() {
            addCriterion("emp_bankcode is null");
            return (Criteria) this;
        }

        public Criteria andEmpBankcodeIsNotNull() {
            addCriterion("emp_bankcode is not null");
            return (Criteria) this;
        }

        public Criteria andEmpBankcodeEqualTo(String value) {
            addCriterion("emp_bankcode =", value, "empBankcode");
            return (Criteria) this;
        }

        public Criteria andEmpBankcodeNotEqualTo(String value) {
            addCriterion("emp_bankcode <>", value, "empBankcode");
            return (Criteria) this;
        }

        public Criteria andEmpBankcodeGreaterThan(String value) {
            addCriterion("emp_bankcode >", value, "empBankcode");
            return (Criteria) this;
        }

        public Criteria andEmpBankcodeGreaterThanOrEqualTo(String value) {
            addCriterion("emp_bankcode >=", value, "empBankcode");
            return (Criteria) this;
        }

        public Criteria andEmpBankcodeLessThan(String value) {
            addCriterion("emp_bankcode <", value, "empBankcode");
            return (Criteria) this;
        }

        public Criteria andEmpBankcodeLessThanOrEqualTo(String value) {
            addCriterion("emp_bankcode <=", value, "empBankcode");
            return (Criteria) this;
        }

        public Criteria andEmpBankcodeLike(String value) {
            addCriterion("emp_bankcode like", value, "empBankcode");
            return (Criteria) this;
        }

        public Criteria andEmpBankcodeNotLike(String value) {
            addCriterion("emp_bankcode not like", value, "empBankcode");
            return (Criteria) this;
        }

        public Criteria andEmpBankcodeIn(List<String> values) {
            addCriterion("emp_bankcode in", values, "empBankcode");
            return (Criteria) this;
        }

        public Criteria andEmpBankcodeNotIn(List<String> values) {
            addCriterion("emp_bankcode not in", values, "empBankcode");
            return (Criteria) this;
        }

        public Criteria andEmpBankcodeBetween(String value1, String value2) {
            addCriterion("emp_bankcode between", value1, value2, "empBankcode");
            return (Criteria) this;
        }

        public Criteria andEmpBankcodeNotBetween(String value1, String value2) {
            addCriterion("emp_bankcode not between", value1, value2, "empBankcode");
            return (Criteria) this;
        }

        public Criteria andEmpWorkStatusIsNull() {
            addCriterion("emp_work_status is null");
            return (Criteria) this;
        }

        public Criteria andEmpWorkStatusIsNotNull() {
            addCriterion("emp_work_status is not null");
            return (Criteria) this;
        }

        public Criteria andEmpWorkStatusEqualTo(String value) {
            addCriterion("emp_work_status =", value, "empWorkStatus");
            return (Criteria) this;
        }

        public Criteria andEmpWorkStatusNotEqualTo(String value) {
            addCriterion("emp_work_status <>", value, "empWorkStatus");
            return (Criteria) this;
        }

        public Criteria andEmpWorkStatusGreaterThan(String value) {
            addCriterion("emp_work_status >", value, "empWorkStatus");
            return (Criteria) this;
        }

        public Criteria andEmpWorkStatusGreaterThanOrEqualTo(String value) {
            addCriterion("emp_work_status >=", value, "empWorkStatus");
            return (Criteria) this;
        }

        public Criteria andEmpWorkStatusLessThan(String value) {
            addCriterion("emp_work_status <", value, "empWorkStatus");
            return (Criteria) this;
        }

        public Criteria andEmpWorkStatusLessThanOrEqualTo(String value) {
            addCriterion("emp_work_status <=", value, "empWorkStatus");
            return (Criteria) this;
        }

        public Criteria andEmpWorkStatusLike(String value) {
            addCriterion("emp_work_status like", value, "empWorkStatus");
            return (Criteria) this;
        }

        public Criteria andEmpWorkStatusNotLike(String value) {
            addCriterion("emp_work_status not like", value, "empWorkStatus");
            return (Criteria) this;
        }

        public Criteria andEmpWorkStatusIn(List<String> values) {
            addCriterion("emp_work_status in", values, "empWorkStatus");
            return (Criteria) this;
        }

        public Criteria andEmpWorkStatusNotIn(List<String> values) {
            addCriterion("emp_work_status not in", values, "empWorkStatus");
            return (Criteria) this;
        }

        public Criteria andEmpWorkStatusBetween(String value1, String value2) {
            addCriterion("emp_work_status between", value1, value2, "empWorkStatus");
            return (Criteria) this;
        }

        public Criteria andEmpWorkStatusNotBetween(String value1, String value2) {
            addCriterion("emp_work_status not between", value1, value2, "empWorkStatus");
            return (Criteria) this;
        }

        public Criteria andEmpMarryStatusIsNull() {
            addCriterion("emp_marry_status is null");
            return (Criteria) this;
        }

        public Criteria andEmpMarryStatusIsNotNull() {
            addCriterion("emp_marry_status is not null");
            return (Criteria) this;
        }

        public Criteria andEmpMarryStatusEqualTo(String value) {
            addCriterion("emp_marry_status =", value, "empMarryStatus");
            return (Criteria) this;
        }

        public Criteria andEmpMarryStatusNotEqualTo(String value) {
            addCriterion("emp_marry_status <>", value, "empMarryStatus");
            return (Criteria) this;
        }

        public Criteria andEmpMarryStatusGreaterThan(String value) {
            addCriterion("emp_marry_status >", value, "empMarryStatus");
            return (Criteria) this;
        }

        public Criteria andEmpMarryStatusGreaterThanOrEqualTo(String value) {
            addCriterion("emp_marry_status >=", value, "empMarryStatus");
            return (Criteria) this;
        }

        public Criteria andEmpMarryStatusLessThan(String value) {
            addCriterion("emp_marry_status <", value, "empMarryStatus");
            return (Criteria) this;
        }

        public Criteria andEmpMarryStatusLessThanOrEqualTo(String value) {
            addCriterion("emp_marry_status <=", value, "empMarryStatus");
            return (Criteria) this;
        }

        public Criteria andEmpMarryStatusLike(String value) {
            addCriterion("emp_marry_status like", value, "empMarryStatus");
            return (Criteria) this;
        }

        public Criteria andEmpMarryStatusNotLike(String value) {
            addCriterion("emp_marry_status not like", value, "empMarryStatus");
            return (Criteria) this;
        }

        public Criteria andEmpMarryStatusIn(List<String> values) {
            addCriterion("emp_marry_status in", values, "empMarryStatus");
            return (Criteria) this;
        }

        public Criteria andEmpMarryStatusNotIn(List<String> values) {
            addCriterion("emp_marry_status not in", values, "empMarryStatus");
            return (Criteria) this;
        }

        public Criteria andEmpMarryStatusBetween(String value1, String value2) {
            addCriterion("emp_marry_status between", value1, value2, "empMarryStatus");
            return (Criteria) this;
        }

        public Criteria andEmpMarryStatusNotBetween(String value1, String value2) {
            addCriterion("emp_marry_status not between", value1, value2, "empMarryStatus");
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