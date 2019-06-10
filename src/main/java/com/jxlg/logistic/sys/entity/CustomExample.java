package com.jxlg.logistic.sys.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CustomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomExample() {
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

        public Criteria andCstCodeIsNull() {
            addCriterion("cst_code is null");
            return (Criteria) this;
        }

        public Criteria andCstCodeIsNotNull() {
            addCriterion("cst_code is not null");
            return (Criteria) this;
        }

        public Criteria andCstCodeEqualTo(String value) {
            addCriterion("cst_code =", value, "cstCode");
            return (Criteria) this;
        }

        public Criteria andCstCodeNotEqualTo(String value) {
            addCriterion("cst_code <>", value, "cstCode");
            return (Criteria) this;
        }

        public Criteria andCstCodeGreaterThan(String value) {
            addCriterion("cst_code >", value, "cstCode");
            return (Criteria) this;
        }

        public Criteria andCstCodeGreaterThanOrEqualTo(String value) {
            addCriterion("cst_code >=", value, "cstCode");
            return (Criteria) this;
        }

        public Criteria andCstCodeLessThan(String value) {
            addCriterion("cst_code <", value, "cstCode");
            return (Criteria) this;
        }

        public Criteria andCstCodeLessThanOrEqualTo(String value) {
            addCriterion("cst_code <=", value, "cstCode");
            return (Criteria) this;
        }

        public Criteria andCstCodeLike(String value) {
            addCriterion("cst_code like", value, "cstCode");
            return (Criteria) this;
        }

        public Criteria andCstCodeNotLike(String value) {
            addCriterion("cst_code not like", value, "cstCode");
            return (Criteria) this;
        }

        public Criteria andCstCodeIn(List<String> values) {
            addCriterion("cst_code in", values, "cstCode");
            return (Criteria) this;
        }

        public Criteria andCstCodeNotIn(List<String> values) {
            addCriterion("cst_code not in", values, "cstCode");
            return (Criteria) this;
        }

        public Criteria andCstCodeBetween(String value1, String value2) {
            addCriterion("cst_code between", value1, value2, "cstCode");
            return (Criteria) this;
        }

        public Criteria andCstCodeNotBetween(String value1, String value2) {
            addCriterion("cst_code not between", value1, value2, "cstCode");
            return (Criteria) this;
        }

        public Criteria andCstNameIsNull() {
            addCriterion("cst_name is null");
            return (Criteria) this;
        }

        public Criteria andCstNameIsNotNull() {
            addCriterion("cst_name is not null");
            return (Criteria) this;
        }

        public Criteria andCstNameEqualTo(String value) {
            addCriterion("cst_name =", value, "cstName");
            return (Criteria) this;
        }

        public Criteria andCstNameNotEqualTo(String value) {
            addCriterion("cst_name <>", value, "cstName");
            return (Criteria) this;
        }

        public Criteria andCstNameGreaterThan(String value) {
            addCriterion("cst_name >", value, "cstName");
            return (Criteria) this;
        }

        public Criteria andCstNameGreaterThanOrEqualTo(String value) {
            addCriterion("cst_name >=", value, "cstName");
            return (Criteria) this;
        }

        public Criteria andCstNameLessThan(String value) {
            addCriterion("cst_name <", value, "cstName");
            return (Criteria) this;
        }

        public Criteria andCstNameLessThanOrEqualTo(String value) {
            addCriterion("cst_name <=", value, "cstName");
            return (Criteria) this;
        }

        public Criteria andCstNameLike(String value) {
            addCriterion("cst_name like", value, "cstName");
            return (Criteria) this;
        }

        public Criteria andCstNameNotLike(String value) {
            addCriterion("cst_name not like", value, "cstName");
            return (Criteria) this;
        }

        public Criteria andCstNameIn(List<String> values) {
            addCriterion("cst_name in", values, "cstName");
            return (Criteria) this;
        }

        public Criteria andCstNameNotIn(List<String> values) {
            addCriterion("cst_name not in", values, "cstName");
            return (Criteria) this;
        }

        public Criteria andCstNameBetween(String value1, String value2) {
            addCriterion("cst_name between", value1, value2, "cstName");
            return (Criteria) this;
        }

        public Criteria andCstNameNotBetween(String value1, String value2) {
            addCriterion("cst_name not between", value1, value2, "cstName");
            return (Criteria) this;
        }

        public Criteria andCstPasswordIsNull() {
            addCriterion("cst_password is null");
            return (Criteria) this;
        }

        public Criteria andCstPasswordIsNotNull() {
            addCriterion("cst_password is not null");
            return (Criteria) this;
        }

        public Criteria andCstPasswordEqualTo(String value) {
            addCriterion("cst_password =", value, "cstPassword");
            return (Criteria) this;
        }

        public Criteria andCstPasswordNotEqualTo(String value) {
            addCriterion("cst_password <>", value, "cstPassword");
            return (Criteria) this;
        }

        public Criteria andCstPasswordGreaterThan(String value) {
            addCriterion("cst_password >", value, "cstPassword");
            return (Criteria) this;
        }

        public Criteria andCstPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("cst_password >=", value, "cstPassword");
            return (Criteria) this;
        }

        public Criteria andCstPasswordLessThan(String value) {
            addCriterion("cst_password <", value, "cstPassword");
            return (Criteria) this;
        }

        public Criteria andCstPasswordLessThanOrEqualTo(String value) {
            addCriterion("cst_password <=", value, "cstPassword");
            return (Criteria) this;
        }

        public Criteria andCstPasswordLike(String value) {
            addCriterion("cst_password like", value, "cstPassword");
            return (Criteria) this;
        }

        public Criteria andCstPasswordNotLike(String value) {
            addCriterion("cst_password not like", value, "cstPassword");
            return (Criteria) this;
        }

        public Criteria andCstPasswordIn(List<String> values) {
            addCriterion("cst_password in", values, "cstPassword");
            return (Criteria) this;
        }

        public Criteria andCstPasswordNotIn(List<String> values) {
            addCriterion("cst_password not in", values, "cstPassword");
            return (Criteria) this;
        }

        public Criteria andCstPasswordBetween(String value1, String value2) {
            addCriterion("cst_password between", value1, value2, "cstPassword");
            return (Criteria) this;
        }

        public Criteria andCstPasswordNotBetween(String value1, String value2) {
            addCriterion("cst_password not between", value1, value2, "cstPassword");
            return (Criteria) this;
        }

        public Criteria andCstBirthdayIsNull() {
            addCriterion("cst_birthday is null");
            return (Criteria) this;
        }

        public Criteria andCstBirthdayIsNotNull() {
            addCriterion("cst_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andCstBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("cst_birthday =", value, "cstBirthday");
            return (Criteria) this;
        }

        public Criteria andCstBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("cst_birthday <>", value, "cstBirthday");
            return (Criteria) this;
        }

        public Criteria andCstBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("cst_birthday >", value, "cstBirthday");
            return (Criteria) this;
        }

        public Criteria andCstBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cst_birthday >=", value, "cstBirthday");
            return (Criteria) this;
        }

        public Criteria andCstBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("cst_birthday <", value, "cstBirthday");
            return (Criteria) this;
        }

        public Criteria andCstBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("cst_birthday <=", value, "cstBirthday");
            return (Criteria) this;
        }

        public Criteria andCstBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("cst_birthday in", values, "cstBirthday");
            return (Criteria) this;
        }

        public Criteria andCstBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("cst_birthday not in", values, "cstBirthday");
            return (Criteria) this;
        }

        public Criteria andCstBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cst_birthday between", value1, value2, "cstBirthday");
            return (Criteria) this;
        }

        public Criteria andCstBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("cst_birthday not between", value1, value2, "cstBirthday");
            return (Criteria) this;
        }

        public Criteria andCstSexIsNull() {
            addCriterion("cst_sex is null");
            return (Criteria) this;
        }

        public Criteria andCstSexIsNotNull() {
            addCriterion("cst_sex is not null");
            return (Criteria) this;
        }

        public Criteria andCstSexEqualTo(String value) {
            addCriterion("cst_sex =", value, "cstSex");
            return (Criteria) this;
        }

        public Criteria andCstSexNotEqualTo(String value) {
            addCriterion("cst_sex <>", value, "cstSex");
            return (Criteria) this;
        }

        public Criteria andCstSexGreaterThan(String value) {
            addCriterion("cst_sex >", value, "cstSex");
            return (Criteria) this;
        }

        public Criteria andCstSexGreaterThanOrEqualTo(String value) {
            addCriterion("cst_sex >=", value, "cstSex");
            return (Criteria) this;
        }

        public Criteria andCstSexLessThan(String value) {
            addCriterion("cst_sex <", value, "cstSex");
            return (Criteria) this;
        }

        public Criteria andCstSexLessThanOrEqualTo(String value) {
            addCriterion("cst_sex <=", value, "cstSex");
            return (Criteria) this;
        }

        public Criteria andCstSexLike(String value) {
            addCriterion("cst_sex like", value, "cstSex");
            return (Criteria) this;
        }

        public Criteria andCstSexNotLike(String value) {
            addCriterion("cst_sex not like", value, "cstSex");
            return (Criteria) this;
        }

        public Criteria andCstSexIn(List<String> values) {
            addCriterion("cst_sex in", values, "cstSex");
            return (Criteria) this;
        }

        public Criteria andCstSexNotIn(List<String> values) {
            addCriterion("cst_sex not in", values, "cstSex");
            return (Criteria) this;
        }

        public Criteria andCstSexBetween(String value1, String value2) {
            addCriterion("cst_sex between", value1, value2, "cstSex");
            return (Criteria) this;
        }

        public Criteria andCstSexNotBetween(String value1, String value2) {
            addCriterion("cst_sex not between", value1, value2, "cstSex");
            return (Criteria) this;
        }

        public Criteria andCstEmailIsNull() {
            addCriterion("cst_email is null");
            return (Criteria) this;
        }

        public Criteria andCstEmailIsNotNull() {
            addCriterion("cst_email is not null");
            return (Criteria) this;
        }

        public Criteria andCstEmailEqualTo(String value) {
            addCriterion("cst_email =", value, "cstEmail");
            return (Criteria) this;
        }

        public Criteria andCstEmailNotEqualTo(String value) {
            addCriterion("cst_email <>", value, "cstEmail");
            return (Criteria) this;
        }

        public Criteria andCstEmailGreaterThan(String value) {
            addCriterion("cst_email >", value, "cstEmail");
            return (Criteria) this;
        }

        public Criteria andCstEmailGreaterThanOrEqualTo(String value) {
            addCriterion("cst_email >=", value, "cstEmail");
            return (Criteria) this;
        }

        public Criteria andCstEmailLessThan(String value) {
            addCriterion("cst_email <", value, "cstEmail");
            return (Criteria) this;
        }

        public Criteria andCstEmailLessThanOrEqualTo(String value) {
            addCriterion("cst_email <=", value, "cstEmail");
            return (Criteria) this;
        }

        public Criteria andCstEmailLike(String value) {
            addCriterion("cst_email like", value, "cstEmail");
            return (Criteria) this;
        }

        public Criteria andCstEmailNotLike(String value) {
            addCriterion("cst_email not like", value, "cstEmail");
            return (Criteria) this;
        }

        public Criteria andCstEmailIn(List<String> values) {
            addCriterion("cst_email in", values, "cstEmail");
            return (Criteria) this;
        }

        public Criteria andCstEmailNotIn(List<String> values) {
            addCriterion("cst_email not in", values, "cstEmail");
            return (Criteria) this;
        }

        public Criteria andCstEmailBetween(String value1, String value2) {
            addCriterion("cst_email between", value1, value2, "cstEmail");
            return (Criteria) this;
        }

        public Criteria andCstEmailNotBetween(String value1, String value2) {
            addCriterion("cst_email not between", value1, value2, "cstEmail");
            return (Criteria) this;
        }

        public Criteria andCstPhoneIsNull() {
            addCriterion("cst_phone is null");
            return (Criteria) this;
        }

        public Criteria andCstPhoneIsNotNull() {
            addCriterion("cst_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCstPhoneEqualTo(String value) {
            addCriterion("cst_phone =", value, "cstPhone");
            return (Criteria) this;
        }

        public Criteria andCstPhoneNotEqualTo(String value) {
            addCriterion("cst_phone <>", value, "cstPhone");
            return (Criteria) this;
        }

        public Criteria andCstPhoneGreaterThan(String value) {
            addCriterion("cst_phone >", value, "cstPhone");
            return (Criteria) this;
        }

        public Criteria andCstPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("cst_phone >=", value, "cstPhone");
            return (Criteria) this;
        }

        public Criteria andCstPhoneLessThan(String value) {
            addCriterion("cst_phone <", value, "cstPhone");
            return (Criteria) this;
        }

        public Criteria andCstPhoneLessThanOrEqualTo(String value) {
            addCriterion("cst_phone <=", value, "cstPhone");
            return (Criteria) this;
        }

        public Criteria andCstPhoneLike(String value) {
            addCriterion("cst_phone like", value, "cstPhone");
            return (Criteria) this;
        }

        public Criteria andCstPhoneNotLike(String value) {
            addCriterion("cst_phone not like", value, "cstPhone");
            return (Criteria) this;
        }

        public Criteria andCstPhoneIn(List<String> values) {
            addCriterion("cst_phone in", values, "cstPhone");
            return (Criteria) this;
        }

        public Criteria andCstPhoneNotIn(List<String> values) {
            addCriterion("cst_phone not in", values, "cstPhone");
            return (Criteria) this;
        }

        public Criteria andCstPhoneBetween(String value1, String value2) {
            addCriterion("cst_phone between", value1, value2, "cstPhone");
            return (Criteria) this;
        }

        public Criteria andCstPhoneNotBetween(String value1, String value2) {
            addCriterion("cst_phone not between", value1, value2, "cstPhone");
            return (Criteria) this;
        }

        public Criteria andCstAddressIsNull() {
            addCriterion("cst_address is null");
            return (Criteria) this;
        }

        public Criteria andCstAddressIsNotNull() {
            addCriterion("cst_address is not null");
            return (Criteria) this;
        }

        public Criteria andCstAddressEqualTo(String value) {
            addCriterion("cst_address =", value, "cstAddress");
            return (Criteria) this;
        }

        public Criteria andCstAddressNotEqualTo(String value) {
            addCriterion("cst_address <>", value, "cstAddress");
            return (Criteria) this;
        }

        public Criteria andCstAddressGreaterThan(String value) {
            addCriterion("cst_address >", value, "cstAddress");
            return (Criteria) this;
        }

        public Criteria andCstAddressGreaterThanOrEqualTo(String value) {
            addCriterion("cst_address >=", value, "cstAddress");
            return (Criteria) this;
        }

        public Criteria andCstAddressLessThan(String value) {
            addCriterion("cst_address <", value, "cstAddress");
            return (Criteria) this;
        }

        public Criteria andCstAddressLessThanOrEqualTo(String value) {
            addCriterion("cst_address <=", value, "cstAddress");
            return (Criteria) this;
        }

        public Criteria andCstAddressLike(String value) {
            addCriterion("cst_address like", value, "cstAddress");
            return (Criteria) this;
        }

        public Criteria andCstAddressNotLike(String value) {
            addCriterion("cst_address not like", value, "cstAddress");
            return (Criteria) this;
        }

        public Criteria andCstAddressIn(List<String> values) {
            addCriterion("cst_address in", values, "cstAddress");
            return (Criteria) this;
        }

        public Criteria andCstAddressNotIn(List<String> values) {
            addCriterion("cst_address not in", values, "cstAddress");
            return (Criteria) this;
        }

        public Criteria andCstAddressBetween(String value1, String value2) {
            addCriterion("cst_address between", value1, value2, "cstAddress");
            return (Criteria) this;
        }

        public Criteria andCstAddressNotBetween(String value1, String value2) {
            addCriterion("cst_address not between", value1, value2, "cstAddress");
            return (Criteria) this;
        }

        public Criteria andCstIdcardIsNull() {
            addCriterion("cst_idcard is null");
            return (Criteria) this;
        }

        public Criteria andCstIdcardIsNotNull() {
            addCriterion("cst_idcard is not null");
            return (Criteria) this;
        }

        public Criteria andCstIdcardEqualTo(String value) {
            addCriterion("cst_idcard =", value, "cstIdcard");
            return (Criteria) this;
        }

        public Criteria andCstIdcardNotEqualTo(String value) {
            addCriterion("cst_idcard <>", value, "cstIdcard");
            return (Criteria) this;
        }

        public Criteria andCstIdcardGreaterThan(String value) {
            addCriterion("cst_idcard >", value, "cstIdcard");
            return (Criteria) this;
        }

        public Criteria andCstIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("cst_idcard >=", value, "cstIdcard");
            return (Criteria) this;
        }

        public Criteria andCstIdcardLessThan(String value) {
            addCriterion("cst_idcard <", value, "cstIdcard");
            return (Criteria) this;
        }

        public Criteria andCstIdcardLessThanOrEqualTo(String value) {
            addCriterion("cst_idcard <=", value, "cstIdcard");
            return (Criteria) this;
        }

        public Criteria andCstIdcardLike(String value) {
            addCriterion("cst_idcard like", value, "cstIdcard");
            return (Criteria) this;
        }

        public Criteria andCstIdcardNotLike(String value) {
            addCriterion("cst_idcard not like", value, "cstIdcard");
            return (Criteria) this;
        }

        public Criteria andCstIdcardIn(List<String> values) {
            addCriterion("cst_idcard in", values, "cstIdcard");
            return (Criteria) this;
        }

        public Criteria andCstIdcardNotIn(List<String> values) {
            addCriterion("cst_idcard not in", values, "cstIdcard");
            return (Criteria) this;
        }

        public Criteria andCstIdcardBetween(String value1, String value2) {
            addCriterion("cst_idcard between", value1, value2, "cstIdcard");
            return (Criteria) this;
        }

        public Criteria andCstIdcardNotBetween(String value1, String value2) {
            addCriterion("cst_idcard not between", value1, value2, "cstIdcard");
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

        public Criteria andCstStatusIsNull() {
            addCriterion("cst_status is null");
            return (Criteria) this;
        }

        public Criteria andCstStatusIsNotNull() {
            addCriterion("cst_status is not null");
            return (Criteria) this;
        }

        public Criteria andCstStatusEqualTo(String value) {
            addCriterion("cst_status =", value, "cstStatus");
            return (Criteria) this;
        }

        public Criteria andCstStatusNotEqualTo(String value) {
            addCriterion("cst_status <>", value, "cstStatus");
            return (Criteria) this;
        }

        public Criteria andCstStatusGreaterThan(String value) {
            addCriterion("cst_status >", value, "cstStatus");
            return (Criteria) this;
        }

        public Criteria andCstStatusGreaterThanOrEqualTo(String value) {
            addCriterion("cst_status >=", value, "cstStatus");
            return (Criteria) this;
        }

        public Criteria andCstStatusLessThan(String value) {
            addCriterion("cst_status <", value, "cstStatus");
            return (Criteria) this;
        }

        public Criteria andCstStatusLessThanOrEqualTo(String value) {
            addCriterion("cst_status <=", value, "cstStatus");
            return (Criteria) this;
        }

        public Criteria andCstStatusLike(String value) {
            addCriterion("cst_status like", value, "cstStatus");
            return (Criteria) this;
        }

        public Criteria andCstStatusNotLike(String value) {
            addCriterion("cst_status not like", value, "cstStatus");
            return (Criteria) this;
        }

        public Criteria andCstStatusIn(List<String> values) {
            addCriterion("cst_status in", values, "cstStatus");
            return (Criteria) this;
        }

        public Criteria andCstStatusNotIn(List<String> values) {
            addCriterion("cst_status not in", values, "cstStatus");
            return (Criteria) this;
        }

        public Criteria andCstStatusBetween(String value1, String value2) {
            addCriterion("cst_status between", value1, value2, "cstStatus");
            return (Criteria) this;
        }

        public Criteria andCstStatusNotBetween(String value1, String value2) {
            addCriterion("cst_status not between", value1, value2, "cstStatus");
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