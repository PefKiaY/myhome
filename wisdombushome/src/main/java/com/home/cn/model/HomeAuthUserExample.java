package com.home.cn.model;

import java.util.ArrayList;
import java.util.List;

public class HomeAuthUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HomeAuthUserExample() {
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

        public Criteria andUuidIsNull() {
            addCriterion("uuid is null");
            return (Criteria) this;
        }

        public Criteria andUuidIsNotNull() {
            addCriterion("uuid is not null");
            return (Criteria) this;
        }

        public Criteria andUuidEqualTo(Long value) {
            addCriterion("uuid =", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotEqualTo(Long value) {
            addCriterion("uuid <>", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThan(Long value) {
            addCriterion("uuid >", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThanOrEqualTo(Long value) {
            addCriterion("uuid >=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThan(Long value) {
            addCriterion("uuid <", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThanOrEqualTo(Long value) {
            addCriterion("uuid <=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidIn(List<Long> values) {
            addCriterion("uuid in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotIn(List<Long> values) {
            addCriterion("uuid not in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidBetween(Long value1, Long value2) {
            addCriterion("uuid between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotBetween(Long value1, Long value2) {
            addCriterion("uuid not between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andLoginNameIsNull() {
            addCriterion("login_name is null");
            return (Criteria) this;
        }

        public Criteria andLoginNameIsNotNull() {
            addCriterion("login_name is not null");
            return (Criteria) this;
        }

        public Criteria andLoginNameEqualTo(String value) {
            addCriterion("login_name =", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotEqualTo(String value) {
            addCriterion("login_name <>", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThan(String value) {
            addCriterion("login_name >", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThanOrEqualTo(String value) {
            addCriterion("login_name >=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThan(String value) {
            addCriterion("login_name <", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThanOrEqualTo(String value) {
            addCriterion("login_name <=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLike(String value) {
            addCriterion("login_name like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotLike(String value) {
            addCriterion("login_name not like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameIn(List<String> values) {
            addCriterion("login_name in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotIn(List<String> values) {
            addCriterion("login_name not in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameBetween(String value1, String value2) {
            addCriterion("login_name between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotBetween(String value1, String value2) {
            addCriterion("login_name not between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andSaltDensityValueIsNull() {
            addCriterion("salt_density_value is null");
            return (Criteria) this;
        }

        public Criteria andSaltDensityValueIsNotNull() {
            addCriterion("salt_density_value is not null");
            return (Criteria) this;
        }

        public Criteria andSaltDensityValueEqualTo(String value) {
            addCriterion("salt_density_value =", value, "saltDensityValue");
            return (Criteria) this;
        }

        public Criteria andSaltDensityValueNotEqualTo(String value) {
            addCriterion("salt_density_value <>", value, "saltDensityValue");
            return (Criteria) this;
        }

        public Criteria andSaltDensityValueGreaterThan(String value) {
            addCriterion("salt_density_value >", value, "saltDensityValue");
            return (Criteria) this;
        }

        public Criteria andSaltDensityValueGreaterThanOrEqualTo(String value) {
            addCriterion("salt_density_value >=", value, "saltDensityValue");
            return (Criteria) this;
        }

        public Criteria andSaltDensityValueLessThan(String value) {
            addCriterion("salt_density_value <", value, "saltDensityValue");
            return (Criteria) this;
        }

        public Criteria andSaltDensityValueLessThanOrEqualTo(String value) {
            addCriterion("salt_density_value <=", value, "saltDensityValue");
            return (Criteria) this;
        }

        public Criteria andSaltDensityValueLike(String value) {
            addCriterion("salt_density_value like", value, "saltDensityValue");
            return (Criteria) this;
        }

        public Criteria andSaltDensityValueNotLike(String value) {
            addCriterion("salt_density_value not like", value, "saltDensityValue");
            return (Criteria) this;
        }

        public Criteria andSaltDensityValueIn(List<String> values) {
            addCriterion("salt_density_value in", values, "saltDensityValue");
            return (Criteria) this;
        }

        public Criteria andSaltDensityValueNotIn(List<String> values) {
            addCriterion("salt_density_value not in", values, "saltDensityValue");
            return (Criteria) this;
        }

        public Criteria andSaltDensityValueBetween(String value1, String value2) {
            addCriterion("salt_density_value between", value1, value2, "saltDensityValue");
            return (Criteria) this;
        }

        public Criteria andSaltDensityValueNotBetween(String value1, String value2) {
            addCriterion("salt_density_value not between", value1, value2, "saltDensityValue");
            return (Criteria) this;
        }

        public Criteria andPlotCodeIsNull() {
            addCriterion("plot_code is null");
            return (Criteria) this;
        }

        public Criteria andPlotCodeIsNotNull() {
            addCriterion("plot_code is not null");
            return (Criteria) this;
        }

        public Criteria andPlotCodeEqualTo(Long value) {
            addCriterion("plot_code =", value, "plotCode");
            return (Criteria) this;
        }

        public Criteria andPlotCodeNotEqualTo(Long value) {
            addCriterion("plot_code <>", value, "plotCode");
            return (Criteria) this;
        }

        public Criteria andPlotCodeGreaterThan(Long value) {
            addCriterion("plot_code >", value, "plotCode");
            return (Criteria) this;
        }

        public Criteria andPlotCodeGreaterThanOrEqualTo(Long value) {
            addCriterion("plot_code >=", value, "plotCode");
            return (Criteria) this;
        }

        public Criteria andPlotCodeLessThan(Long value) {
            addCriterion("plot_code <", value, "plotCode");
            return (Criteria) this;
        }

        public Criteria andPlotCodeLessThanOrEqualTo(Long value) {
            addCriterion("plot_code <=", value, "plotCode");
            return (Criteria) this;
        }

        public Criteria andPlotCodeIn(List<Long> values) {
            addCriterion("plot_code in", values, "plotCode");
            return (Criteria) this;
        }

        public Criteria andPlotCodeNotIn(List<Long> values) {
            addCriterion("plot_code not in", values, "plotCode");
            return (Criteria) this;
        }

        public Criteria andPlotCodeBetween(Long value1, Long value2) {
            addCriterion("plot_code between", value1, value2, "plotCode");
            return (Criteria) this;
        }

        public Criteria andPlotCodeNotBetween(Long value1, Long value2) {
            addCriterion("plot_code not between", value1, value2, "plotCode");
            return (Criteria) this;
        }

        public Criteria andPlotNameIsNull() {
            addCriterion("plot_name is null");
            return (Criteria) this;
        }

        public Criteria andPlotNameIsNotNull() {
            addCriterion("plot_name is not null");
            return (Criteria) this;
        }

        public Criteria andPlotNameEqualTo(String value) {
            addCriterion("plot_name =", value, "plotName");
            return (Criteria) this;
        }

        public Criteria andPlotNameNotEqualTo(String value) {
            addCriterion("plot_name <>", value, "plotName");
            return (Criteria) this;
        }

        public Criteria andPlotNameGreaterThan(String value) {
            addCriterion("plot_name >", value, "plotName");
            return (Criteria) this;
        }

        public Criteria andPlotNameGreaterThanOrEqualTo(String value) {
            addCriterion("plot_name >=", value, "plotName");
            return (Criteria) this;
        }

        public Criteria andPlotNameLessThan(String value) {
            addCriterion("plot_name <", value, "plotName");
            return (Criteria) this;
        }

        public Criteria andPlotNameLessThanOrEqualTo(String value) {
            addCriterion("plot_name <=", value, "plotName");
            return (Criteria) this;
        }

        public Criteria andPlotNameLike(String value) {
            addCriterion("plot_name like", value, "plotName");
            return (Criteria) this;
        }

        public Criteria andPlotNameNotLike(String value) {
            addCriterion("plot_name not like", value, "plotName");
            return (Criteria) this;
        }

        public Criteria andPlotNameIn(List<String> values) {
            addCriterion("plot_name in", values, "plotName");
            return (Criteria) this;
        }

        public Criteria andPlotNameNotIn(List<String> values) {
            addCriterion("plot_name not in", values, "plotName");
            return (Criteria) this;
        }

        public Criteria andPlotNameBetween(String value1, String value2) {
            addCriterion("plot_name between", value1, value2, "plotName");
            return (Criteria) this;
        }

        public Criteria andPlotNameNotBetween(String value1, String value2) {
            addCriterion("plot_name not between", value1, value2, "plotName");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNull() {
            addCriterion("shop_id is null");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNotNull() {
            addCriterion("shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopIdEqualTo(String value) {
            addCriterion("shop_id =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(String value) {
            addCriterion("shop_id <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(String value) {
            addCriterion("shop_id >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(String value) {
            addCriterion("shop_id >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(String value) {
            addCriterion("shop_id <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(String value) {
            addCriterion("shop_id <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLike(String value) {
            addCriterion("shop_id like", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotLike(String value) {
            addCriterion("shop_id not like", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<String> values) {
            addCriterion("shop_id in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<String> values) {
            addCriterion("shop_id not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(String value1, String value2) {
            addCriterion("shop_id between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(String value1, String value2) {
            addCriterion("shop_id not between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("user_type is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("user_type is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(Short value) {
            addCriterion("user_type =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(Short value) {
            addCriterion("user_type <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(Short value) {
            addCriterion("user_type >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("user_type >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(Short value) {
            addCriterion("user_type <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(Short value) {
            addCriterion("user_type <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<Short> values) {
            addCriterion("user_type in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<Short> values) {
            addCriterion("user_type not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(Short value1, Short value2) {
            addCriterion("user_type between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(Short value1, Short value2) {
            addCriterion("user_type not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneIsNull() {
            addCriterion("mobile_phone is null");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneIsNotNull() {
            addCriterion("mobile_phone is not null");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneEqualTo(String value) {
            addCriterion("mobile_phone =", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotEqualTo(String value) {
            addCriterion("mobile_phone <>", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneGreaterThan(String value) {
            addCriterion("mobile_phone >", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("mobile_phone >=", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneLessThan(String value) {
            addCriterion("mobile_phone <", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneLessThanOrEqualTo(String value) {
            addCriterion("mobile_phone <=", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneLike(String value) {
            addCriterion("mobile_phone like", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotLike(String value) {
            addCriterion("mobile_phone not like", value, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneIn(List<String> values) {
            addCriterion("mobile_phone in", values, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotIn(List<String> values) {
            addCriterion("mobile_phone not in", values, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneBetween(String value1, String value2) {
            addCriterion("mobile_phone between", value1, value2, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andMobilePhoneNotBetween(String value1, String value2) {
            addCriterion("mobile_phone not between", value1, value2, "mobilePhone");
            return (Criteria) this;
        }

        public Criteria andUserStatusIsNull() {
            addCriterion("user_status is null");
            return (Criteria) this;
        }

        public Criteria andUserStatusIsNotNull() {
            addCriterion("user_status is not null");
            return (Criteria) this;
        }

        public Criteria andUserStatusEqualTo(Short value) {
            addCriterion("user_status =", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotEqualTo(Short value) {
            addCriterion("user_status <>", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusGreaterThan(Short value) {
            addCriterion("user_status >", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("user_status >=", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLessThan(Short value) {
            addCriterion("user_status <", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusLessThanOrEqualTo(Short value) {
            addCriterion("user_status <=", value, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusIn(List<Short> values) {
            addCriterion("user_status in", values, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotIn(List<Short> values) {
            addCriterion("user_status not in", values, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusBetween(Short value1, Short value2) {
            addCriterion("user_status between", value1, value2, "userStatus");
            return (Criteria) this;
        }

        public Criteria andUserStatusNotBetween(Short value1, Short value2) {
            addCriterion("user_status not between", value1, value2, "userStatus");
            return (Criteria) this;
        }

        public Criteria andDateFromIsNull() {
            addCriterion("date_from is null");
            return (Criteria) this;
        }

        public Criteria andDateFromIsNotNull() {
            addCriterion("date_from is not null");
            return (Criteria) this;
        }

        public Criteria andDateFromEqualTo(String value) {
            addCriterion("date_from =", value, "dateFrom");
            return (Criteria) this;
        }

        public Criteria andDateFromNotEqualTo(String value) {
            addCriterion("date_from <>", value, "dateFrom");
            return (Criteria) this;
        }

        public Criteria andDateFromGreaterThan(String value) {
            addCriterion("date_from >", value, "dateFrom");
            return (Criteria) this;
        }

        public Criteria andDateFromGreaterThanOrEqualTo(String value) {
            addCriterion("date_from >=", value, "dateFrom");
            return (Criteria) this;
        }

        public Criteria andDateFromLessThan(String value) {
            addCriterion("date_from <", value, "dateFrom");
            return (Criteria) this;
        }

        public Criteria andDateFromLessThanOrEqualTo(String value) {
            addCriterion("date_from <=", value, "dateFrom");
            return (Criteria) this;
        }

        public Criteria andDateFromLike(String value) {
            addCriterion("date_from like", value, "dateFrom");
            return (Criteria) this;
        }

        public Criteria andDateFromNotLike(String value) {
            addCriterion("date_from not like", value, "dateFrom");
            return (Criteria) this;
        }

        public Criteria andDateFromIn(List<String> values) {
            addCriterion("date_from in", values, "dateFrom");
            return (Criteria) this;
        }

        public Criteria andDateFromNotIn(List<String> values) {
            addCriterion("date_from not in", values, "dateFrom");
            return (Criteria) this;
        }

        public Criteria andDateFromBetween(String value1, String value2) {
            addCriterion("date_from between", value1, value2, "dateFrom");
            return (Criteria) this;
        }

        public Criteria andDateFromNotBetween(String value1, String value2) {
            addCriterion("date_from not between", value1, value2, "dateFrom");
            return (Criteria) this;
        }

        public Criteria andDateToIsNull() {
            addCriterion("date_to is null");
            return (Criteria) this;
        }

        public Criteria andDateToIsNotNull() {
            addCriterion("date_to is not null");
            return (Criteria) this;
        }

        public Criteria andDateToEqualTo(String value) {
            addCriterion("date_to =", value, "dateTo");
            return (Criteria) this;
        }

        public Criteria andDateToNotEqualTo(String value) {
            addCriterion("date_to <>", value, "dateTo");
            return (Criteria) this;
        }

        public Criteria andDateToGreaterThan(String value) {
            addCriterion("date_to >", value, "dateTo");
            return (Criteria) this;
        }

        public Criteria andDateToGreaterThanOrEqualTo(String value) {
            addCriterion("date_to >=", value, "dateTo");
            return (Criteria) this;
        }

        public Criteria andDateToLessThan(String value) {
            addCriterion("date_to <", value, "dateTo");
            return (Criteria) this;
        }

        public Criteria andDateToLessThanOrEqualTo(String value) {
            addCriterion("date_to <=", value, "dateTo");
            return (Criteria) this;
        }

        public Criteria andDateToLike(String value) {
            addCriterion("date_to like", value, "dateTo");
            return (Criteria) this;
        }

        public Criteria andDateToNotLike(String value) {
            addCriterion("date_to not like", value, "dateTo");
            return (Criteria) this;
        }

        public Criteria andDateToIn(List<String> values) {
            addCriterion("date_to in", values, "dateTo");
            return (Criteria) this;
        }

        public Criteria andDateToNotIn(List<String> values) {
            addCriterion("date_to not in", values, "dateTo");
            return (Criteria) this;
        }

        public Criteria andDateToBetween(String value1, String value2) {
            addCriterion("date_to between", value1, value2, "dateTo");
            return (Criteria) this;
        }

        public Criteria andDateToNotBetween(String value1, String value2) {
            addCriterion("date_to not between", value1, value2, "dateTo");
            return (Criteria) this;
        }

        public Criteria andActivedateIsNull() {
            addCriterion("activedate is null");
            return (Criteria) this;
        }

        public Criteria andActivedateIsNotNull() {
            addCriterion("activedate is not null");
            return (Criteria) this;
        }

        public Criteria andActivedateEqualTo(String value) {
            addCriterion("activedate =", value, "activedate");
            return (Criteria) this;
        }

        public Criteria andActivedateNotEqualTo(String value) {
            addCriterion("activedate <>", value, "activedate");
            return (Criteria) this;
        }

        public Criteria andActivedateGreaterThan(String value) {
            addCriterion("activedate >", value, "activedate");
            return (Criteria) this;
        }

        public Criteria andActivedateGreaterThanOrEqualTo(String value) {
            addCriterion("activedate >=", value, "activedate");
            return (Criteria) this;
        }

        public Criteria andActivedateLessThan(String value) {
            addCriterion("activedate <", value, "activedate");
            return (Criteria) this;
        }

        public Criteria andActivedateLessThanOrEqualTo(String value) {
            addCriterion("activedate <=", value, "activedate");
            return (Criteria) this;
        }

        public Criteria andActivedateLike(String value) {
            addCriterion("activedate like", value, "activedate");
            return (Criteria) this;
        }

        public Criteria andActivedateNotLike(String value) {
            addCriterion("activedate not like", value, "activedate");
            return (Criteria) this;
        }

        public Criteria andActivedateIn(List<String> values) {
            addCriterion("activedate in", values, "activedate");
            return (Criteria) this;
        }

        public Criteria andActivedateNotIn(List<String> values) {
            addCriterion("activedate not in", values, "activedate");
            return (Criteria) this;
        }

        public Criteria andActivedateBetween(String value1, String value2) {
            addCriterion("activedate between", value1, value2, "activedate");
            return (Criteria) this;
        }

        public Criteria andActivedateNotBetween(String value1, String value2) {
            addCriterion("activedate not between", value1, value2, "activedate");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNull() {
            addCriterion("enddate is null");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNotNull() {
            addCriterion("enddate is not null");
            return (Criteria) this;
        }

        public Criteria andEnddateEqualTo(String value) {
            addCriterion("enddate =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(String value) {
            addCriterion("enddate <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(String value) {
            addCriterion("enddate >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(String value) {
            addCriterion("enddate >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(String value) {
            addCriterion("enddate <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(String value) {
            addCriterion("enddate <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLike(String value) {
            addCriterion("enddate like", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotLike(String value) {
            addCriterion("enddate not like", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateIn(List<String> values) {
            addCriterion("enddate in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotIn(List<String> values) {
            addCriterion("enddate not in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(String value1, String value2) {
            addCriterion("enddate between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(String value1, String value2) {
            addCriterion("enddate not between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("creator is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("creator is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(Long value) {
            addCriterion("creator =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(Long value) {
            addCriterion("creator <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(Long value) {
            addCriterion("creator >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(Long value) {
            addCriterion("creator >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(Long value) {
            addCriterion("creator <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(Long value) {
            addCriterion("creator <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<Long> values) {
            addCriterion("creator in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<Long> values) {
            addCriterion("creator not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(Long value1, Long value2) {
            addCriterion("creator between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(Long value1, Long value2) {
            addCriterion("creator not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andTimeCreatedIsNull() {
            addCriterion("time_created is null");
            return (Criteria) this;
        }

        public Criteria andTimeCreatedIsNotNull() {
            addCriterion("time_created is not null");
            return (Criteria) this;
        }

        public Criteria andTimeCreatedEqualTo(String value) {
            addCriterion("time_created =", value, "timeCreated");
            return (Criteria) this;
        }

        public Criteria andTimeCreatedNotEqualTo(String value) {
            addCriterion("time_created <>", value, "timeCreated");
            return (Criteria) this;
        }

        public Criteria andTimeCreatedGreaterThan(String value) {
            addCriterion("time_created >", value, "timeCreated");
            return (Criteria) this;
        }

        public Criteria andTimeCreatedGreaterThanOrEqualTo(String value) {
            addCriterion("time_created >=", value, "timeCreated");
            return (Criteria) this;
        }

        public Criteria andTimeCreatedLessThan(String value) {
            addCriterion("time_created <", value, "timeCreated");
            return (Criteria) this;
        }

        public Criteria andTimeCreatedLessThanOrEqualTo(String value) {
            addCriterion("time_created <=", value, "timeCreated");
            return (Criteria) this;
        }

        public Criteria andTimeCreatedLike(String value) {
            addCriterion("time_created like", value, "timeCreated");
            return (Criteria) this;
        }

        public Criteria andTimeCreatedNotLike(String value) {
            addCriterion("time_created not like", value, "timeCreated");
            return (Criteria) this;
        }

        public Criteria andTimeCreatedIn(List<String> values) {
            addCriterion("time_created in", values, "timeCreated");
            return (Criteria) this;
        }

        public Criteria andTimeCreatedNotIn(List<String> values) {
            addCriterion("time_created not in", values, "timeCreated");
            return (Criteria) this;
        }

        public Criteria andTimeCreatedBetween(String value1, String value2) {
            addCriterion("time_created between", value1, value2, "timeCreated");
            return (Criteria) this;
        }

        public Criteria andTimeCreatedNotBetween(String value1, String value2) {
            addCriterion("time_created not between", value1, value2, "timeCreated");
            return (Criteria) this;
        }

        public Criteria andWhoModifiedIsNull() {
            addCriterion("who_modified is null");
            return (Criteria) this;
        }

        public Criteria andWhoModifiedIsNotNull() {
            addCriterion("who_modified is not null");
            return (Criteria) this;
        }

        public Criteria andWhoModifiedEqualTo(Long value) {
            addCriterion("who_modified =", value, "whoModified");
            return (Criteria) this;
        }

        public Criteria andWhoModifiedNotEqualTo(Long value) {
            addCriterion("who_modified <>", value, "whoModified");
            return (Criteria) this;
        }

        public Criteria andWhoModifiedGreaterThan(Long value) {
            addCriterion("who_modified >", value, "whoModified");
            return (Criteria) this;
        }

        public Criteria andWhoModifiedGreaterThanOrEqualTo(Long value) {
            addCriterion("who_modified >=", value, "whoModified");
            return (Criteria) this;
        }

        public Criteria andWhoModifiedLessThan(Long value) {
            addCriterion("who_modified <", value, "whoModified");
            return (Criteria) this;
        }

        public Criteria andWhoModifiedLessThanOrEqualTo(Long value) {
            addCriterion("who_modified <=", value, "whoModified");
            return (Criteria) this;
        }

        public Criteria andWhoModifiedIn(List<Long> values) {
            addCriterion("who_modified in", values, "whoModified");
            return (Criteria) this;
        }

        public Criteria andWhoModifiedNotIn(List<Long> values) {
            addCriterion("who_modified not in", values, "whoModified");
            return (Criteria) this;
        }

        public Criteria andWhoModifiedBetween(Long value1, Long value2) {
            addCriterion("who_modified between", value1, value2, "whoModified");
            return (Criteria) this;
        }

        public Criteria andWhoModifiedNotBetween(Long value1, Long value2) {
            addCriterion("who_modified not between", value1, value2, "whoModified");
            return (Criteria) this;
        }

        public Criteria andTimeModifiedIsNull() {
            addCriterion("time_modified is null");
            return (Criteria) this;
        }

        public Criteria andTimeModifiedIsNotNull() {
            addCriterion("time_modified is not null");
            return (Criteria) this;
        }

        public Criteria andTimeModifiedEqualTo(String value) {
            addCriterion("time_modified =", value, "timeModified");
            return (Criteria) this;
        }

        public Criteria andTimeModifiedNotEqualTo(String value) {
            addCriterion("time_modified <>", value, "timeModified");
            return (Criteria) this;
        }

        public Criteria andTimeModifiedGreaterThan(String value) {
            addCriterion("time_modified >", value, "timeModified");
            return (Criteria) this;
        }

        public Criteria andTimeModifiedGreaterThanOrEqualTo(String value) {
            addCriterion("time_modified >=", value, "timeModified");
            return (Criteria) this;
        }

        public Criteria andTimeModifiedLessThan(String value) {
            addCriterion("time_modified <", value, "timeModified");
            return (Criteria) this;
        }

        public Criteria andTimeModifiedLessThanOrEqualTo(String value) {
            addCriterion("time_modified <=", value, "timeModified");
            return (Criteria) this;
        }

        public Criteria andTimeModifiedLike(String value) {
            addCriterion("time_modified like", value, "timeModified");
            return (Criteria) this;
        }

        public Criteria andTimeModifiedNotLike(String value) {
            addCriterion("time_modified not like", value, "timeModified");
            return (Criteria) this;
        }

        public Criteria andTimeModifiedIn(List<String> values) {
            addCriterion("time_modified in", values, "timeModified");
            return (Criteria) this;
        }

        public Criteria andTimeModifiedNotIn(List<String> values) {
            addCriterion("time_modified not in", values, "timeModified");
            return (Criteria) this;
        }

        public Criteria andTimeModifiedBetween(String value1, String value2) {
            addCriterion("time_modified between", value1, value2, "timeModified");
            return (Criteria) this;
        }

        public Criteria andTimeModifiedNotBetween(String value1, String value2) {
            addCriterion("time_modified not between", value1, value2, "timeModified");
            return (Criteria) this;
        }

        public Criteria andChannelIsNull() {
            addCriterion("channel is null");
            return (Criteria) this;
        }

        public Criteria andChannelIsNotNull() {
            addCriterion("channel is not null");
            return (Criteria) this;
        }

        public Criteria andChannelEqualTo(String value) {
            addCriterion("channel =", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotEqualTo(String value) {
            addCriterion("channel <>", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThan(String value) {
            addCriterion("channel >", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThanOrEqualTo(String value) {
            addCriterion("channel >=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThan(String value) {
            addCriterion("channel <", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThanOrEqualTo(String value) {
            addCriterion("channel <=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLike(String value) {
            addCriterion("channel like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotLike(String value) {
            addCriterion("channel not like", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelIn(List<String> values) {
            addCriterion("channel in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotIn(List<String> values) {
            addCriterion("channel not in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelBetween(String value1, String value2) {
            addCriterion("channel between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotBetween(String value1, String value2) {
            addCriterion("channel not between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("source like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andUserImgIsNull() {
            addCriterion("user_img is null");
            return (Criteria) this;
        }

        public Criteria andUserImgIsNotNull() {
            addCriterion("user_img is not null");
            return (Criteria) this;
        }

        public Criteria andUserImgEqualTo(String value) {
            addCriterion("user_img =", value, "userImg");
            return (Criteria) this;
        }

        public Criteria andUserImgNotEqualTo(String value) {
            addCriterion("user_img <>", value, "userImg");
            return (Criteria) this;
        }

        public Criteria andUserImgGreaterThan(String value) {
            addCriterion("user_img >", value, "userImg");
            return (Criteria) this;
        }

        public Criteria andUserImgGreaterThanOrEqualTo(String value) {
            addCriterion("user_img >=", value, "userImg");
            return (Criteria) this;
        }

        public Criteria andUserImgLessThan(String value) {
            addCriterion("user_img <", value, "userImg");
            return (Criteria) this;
        }

        public Criteria andUserImgLessThanOrEqualTo(String value) {
            addCriterion("user_img <=", value, "userImg");
            return (Criteria) this;
        }

        public Criteria andUserImgLike(String value) {
            addCriterion("user_img like", value, "userImg");
            return (Criteria) this;
        }

        public Criteria andUserImgNotLike(String value) {
            addCriterion("user_img not like", value, "userImg");
            return (Criteria) this;
        }

        public Criteria andUserImgIn(List<String> values) {
            addCriterion("user_img in", values, "userImg");
            return (Criteria) this;
        }

        public Criteria andUserImgNotIn(List<String> values) {
            addCriterion("user_img not in", values, "userImg");
            return (Criteria) this;
        }

        public Criteria andUserImgBetween(String value1, String value2) {
            addCriterion("user_img between", value1, value2, "userImg");
            return (Criteria) this;
        }

        public Criteria andUserImgNotBetween(String value1, String value2) {
            addCriterion("user_img not between", value1, value2, "userImg");
            return (Criteria) this;
        }

        public Criteria andUserExt2IsNull() {
            addCriterion("user_ext2 is null");
            return (Criteria) this;
        }

        public Criteria andUserExt2IsNotNull() {
            addCriterion("user_ext2 is not null");
            return (Criteria) this;
        }

        public Criteria andUserExt2EqualTo(String value) {
            addCriterion("user_ext2 =", value, "userExt2");
            return (Criteria) this;
        }

        public Criteria andUserExt2NotEqualTo(String value) {
            addCriterion("user_ext2 <>", value, "userExt2");
            return (Criteria) this;
        }

        public Criteria andUserExt2GreaterThan(String value) {
            addCriterion("user_ext2 >", value, "userExt2");
            return (Criteria) this;
        }

        public Criteria andUserExt2GreaterThanOrEqualTo(String value) {
            addCriterion("user_ext2 >=", value, "userExt2");
            return (Criteria) this;
        }

        public Criteria andUserExt2LessThan(String value) {
            addCriterion("user_ext2 <", value, "userExt2");
            return (Criteria) this;
        }

        public Criteria andUserExt2LessThanOrEqualTo(String value) {
            addCriterion("user_ext2 <=", value, "userExt2");
            return (Criteria) this;
        }

        public Criteria andUserExt2Like(String value) {
            addCriterion("user_ext2 like", value, "userExt2");
            return (Criteria) this;
        }

        public Criteria andUserExt2NotLike(String value) {
            addCriterion("user_ext2 not like", value, "userExt2");
            return (Criteria) this;
        }

        public Criteria andUserExt2In(List<String> values) {
            addCriterion("user_ext2 in", values, "userExt2");
            return (Criteria) this;
        }

        public Criteria andUserExt2NotIn(List<String> values) {
            addCriterion("user_ext2 not in", values, "userExt2");
            return (Criteria) this;
        }

        public Criteria andUserExt2Between(String value1, String value2) {
            addCriterion("user_ext2 between", value1, value2, "userExt2");
            return (Criteria) this;
        }

        public Criteria andUserExt2NotBetween(String value1, String value2) {
            addCriterion("user_ext2 not between", value1, value2, "userExt2");
            return (Criteria) this;
        }

        public Criteria andUserExt3IsNull() {
            addCriterion("user_ext3 is null");
            return (Criteria) this;
        }

        public Criteria andUserExt3IsNotNull() {
            addCriterion("user_ext3 is not null");
            return (Criteria) this;
        }

        public Criteria andUserExt3EqualTo(String value) {
            addCriterion("user_ext3 =", value, "userExt3");
            return (Criteria) this;
        }

        public Criteria andUserExt3NotEqualTo(String value) {
            addCriterion("user_ext3 <>", value, "userExt3");
            return (Criteria) this;
        }

        public Criteria andUserExt3GreaterThan(String value) {
            addCriterion("user_ext3 >", value, "userExt3");
            return (Criteria) this;
        }

        public Criteria andUserExt3GreaterThanOrEqualTo(String value) {
            addCriterion("user_ext3 >=", value, "userExt3");
            return (Criteria) this;
        }

        public Criteria andUserExt3LessThan(String value) {
            addCriterion("user_ext3 <", value, "userExt3");
            return (Criteria) this;
        }

        public Criteria andUserExt3LessThanOrEqualTo(String value) {
            addCriterion("user_ext3 <=", value, "userExt3");
            return (Criteria) this;
        }

        public Criteria andUserExt3Like(String value) {
            addCriterion("user_ext3 like", value, "userExt3");
            return (Criteria) this;
        }

        public Criteria andUserExt3NotLike(String value) {
            addCriterion("user_ext3 not like", value, "userExt3");
            return (Criteria) this;
        }

        public Criteria andUserExt3In(List<String> values) {
            addCriterion("user_ext3 in", values, "userExt3");
            return (Criteria) this;
        }

        public Criteria andUserExt3NotIn(List<String> values) {
            addCriterion("user_ext3 not in", values, "userExt3");
            return (Criteria) this;
        }

        public Criteria andUserExt3Between(String value1, String value2) {
            addCriterion("user_ext3 between", value1, value2, "userExt3");
            return (Criteria) this;
        }

        public Criteria andUserExt3NotBetween(String value1, String value2) {
            addCriterion("user_ext3 not between", value1, value2, "userExt3");
            return (Criteria) this;
        }

        public Criteria andUserExt4IsNull() {
            addCriterion("user_ext4 is null");
            return (Criteria) this;
        }

        public Criteria andUserExt4IsNotNull() {
            addCriterion("user_ext4 is not null");
            return (Criteria) this;
        }

        public Criteria andUserExt4EqualTo(String value) {
            addCriterion("user_ext4 =", value, "userExt4");
            return (Criteria) this;
        }

        public Criteria andUserExt4NotEqualTo(String value) {
            addCriterion("user_ext4 <>", value, "userExt4");
            return (Criteria) this;
        }

        public Criteria andUserExt4GreaterThan(String value) {
            addCriterion("user_ext4 >", value, "userExt4");
            return (Criteria) this;
        }

        public Criteria andUserExt4GreaterThanOrEqualTo(String value) {
            addCriterion("user_ext4 >=", value, "userExt4");
            return (Criteria) this;
        }

        public Criteria andUserExt4LessThan(String value) {
            addCriterion("user_ext4 <", value, "userExt4");
            return (Criteria) this;
        }

        public Criteria andUserExt4LessThanOrEqualTo(String value) {
            addCriterion("user_ext4 <=", value, "userExt4");
            return (Criteria) this;
        }

        public Criteria andUserExt4Like(String value) {
            addCriterion("user_ext4 like", value, "userExt4");
            return (Criteria) this;
        }

        public Criteria andUserExt4NotLike(String value) {
            addCriterion("user_ext4 not like", value, "userExt4");
            return (Criteria) this;
        }

        public Criteria andUserExt4In(List<String> values) {
            addCriterion("user_ext4 in", values, "userExt4");
            return (Criteria) this;
        }

        public Criteria andUserExt4NotIn(List<String> values) {
            addCriterion("user_ext4 not in", values, "userExt4");
            return (Criteria) this;
        }

        public Criteria andUserExt4Between(String value1, String value2) {
            addCriterion("user_ext4 between", value1, value2, "userExt4");
            return (Criteria) this;
        }

        public Criteria andUserExt4NotBetween(String value1, String value2) {
            addCriterion("user_ext4 not between", value1, value2, "userExt4");
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