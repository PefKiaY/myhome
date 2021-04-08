package com.home.cn.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HomeShopExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HomeShopExample() {
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

        public Criteria andShopIdIsNull() {
            addCriterion("shop_id is null");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNotNull() {
            addCriterion("shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopIdEqualTo(Long value) {
            addCriterion("shop_id =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(Long value) {
            addCriterion("shop_id <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(Long value) {
            addCriterion("shop_id >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(Long value) {
            addCriterion("shop_id >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(Long value) {
            addCriterion("shop_id <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(Long value) {
            addCriterion("shop_id <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<Long> values) {
            addCriterion("shop_id in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<Long> values) {
            addCriterion("shop_id not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(Long value1, Long value2) {
            addCriterion("shop_id between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(Long value1, Long value2) {
            addCriterion("shop_id not between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNull() {
            addCriterion("shop_name is null");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNotNull() {
            addCriterion("shop_name is not null");
            return (Criteria) this;
        }

        public Criteria andShopNameEqualTo(String value) {
            addCriterion("shop_name =", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotEqualTo(String value) {
            addCriterion("shop_name <>", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThan(String value) {
            addCriterion("shop_name >", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThanOrEqualTo(String value) {
            addCriterion("shop_name >=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThan(String value) {
            addCriterion("shop_name <", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThanOrEqualTo(String value) {
            addCriterion("shop_name <=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLike(String value) {
            addCriterion("shop_name like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotLike(String value) {
            addCriterion("shop_name not like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameIn(List<String> values) {
            addCriterion("shop_name in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotIn(List<String> values) {
            addCriterion("shop_name not in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameBetween(String value1, String value2) {
            addCriterion("shop_name between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotBetween(String value1, String value2) {
            addCriterion("shop_name not between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopAddrIsNull() {
            addCriterion("shop_addr is null");
            return (Criteria) this;
        }

        public Criteria andShopAddrIsNotNull() {
            addCriterion("shop_addr is not null");
            return (Criteria) this;
        }

        public Criteria andShopAddrEqualTo(String value) {
            addCriterion("shop_addr =", value, "shopAddr");
            return (Criteria) this;
        }

        public Criteria andShopAddrNotEqualTo(String value) {
            addCriterion("shop_addr <>", value, "shopAddr");
            return (Criteria) this;
        }

        public Criteria andShopAddrGreaterThan(String value) {
            addCriterion("shop_addr >", value, "shopAddr");
            return (Criteria) this;
        }

        public Criteria andShopAddrGreaterThanOrEqualTo(String value) {
            addCriterion("shop_addr >=", value, "shopAddr");
            return (Criteria) this;
        }

        public Criteria andShopAddrLessThan(String value) {
            addCriterion("shop_addr <", value, "shopAddr");
            return (Criteria) this;
        }

        public Criteria andShopAddrLessThanOrEqualTo(String value) {
            addCriterion("shop_addr <=", value, "shopAddr");
            return (Criteria) this;
        }

        public Criteria andShopAddrLike(String value) {
            addCriterion("shop_addr like", value, "shopAddr");
            return (Criteria) this;
        }

        public Criteria andShopAddrNotLike(String value) {
            addCriterion("shop_addr not like", value, "shopAddr");
            return (Criteria) this;
        }

        public Criteria andShopAddrIn(List<String> values) {
            addCriterion("shop_addr in", values, "shopAddr");
            return (Criteria) this;
        }

        public Criteria andShopAddrNotIn(List<String> values) {
            addCriterion("shop_addr not in", values, "shopAddr");
            return (Criteria) this;
        }

        public Criteria andShopAddrBetween(String value1, String value2) {
            addCriterion("shop_addr between", value1, value2, "shopAddr");
            return (Criteria) this;
        }

        public Criteria andShopAddrNotBetween(String value1, String value2) {
            addCriterion("shop_addr not between", value1, value2, "shopAddr");
            return (Criteria) this;
        }

        public Criteria andShopScopeIsNull() {
            addCriterion("shop_scope is null");
            return (Criteria) this;
        }

        public Criteria andShopScopeIsNotNull() {
            addCriterion("shop_scope is not null");
            return (Criteria) this;
        }

        public Criteria andShopScopeEqualTo(String value) {
            addCriterion("shop_scope =", value, "shopScope");
            return (Criteria) this;
        }

        public Criteria andShopScopeNotEqualTo(String value) {
            addCriterion("shop_scope <>", value, "shopScope");
            return (Criteria) this;
        }

        public Criteria andShopScopeGreaterThan(String value) {
            addCriterion("shop_scope >", value, "shopScope");
            return (Criteria) this;
        }

        public Criteria andShopScopeGreaterThanOrEqualTo(String value) {
            addCriterion("shop_scope >=", value, "shopScope");
            return (Criteria) this;
        }

        public Criteria andShopScopeLessThan(String value) {
            addCriterion("shop_scope <", value, "shopScope");
            return (Criteria) this;
        }

        public Criteria andShopScopeLessThanOrEqualTo(String value) {
            addCriterion("shop_scope <=", value, "shopScope");
            return (Criteria) this;
        }

        public Criteria andShopScopeLike(String value) {
            addCriterion("shop_scope like", value, "shopScope");
            return (Criteria) this;
        }

        public Criteria andShopScopeNotLike(String value) {
            addCriterion("shop_scope not like", value, "shopScope");
            return (Criteria) this;
        }

        public Criteria andShopScopeIn(List<String> values) {
            addCriterion("shop_scope in", values, "shopScope");
            return (Criteria) this;
        }

        public Criteria andShopScopeNotIn(List<String> values) {
            addCriterion("shop_scope not in", values, "shopScope");
            return (Criteria) this;
        }

        public Criteria andShopScopeBetween(String value1, String value2) {
            addCriterion("shop_scope between", value1, value2, "shopScope");
            return (Criteria) this;
        }

        public Criteria andShopScopeNotBetween(String value1, String value2) {
            addCriterion("shop_scope not between", value1, value2, "shopScope");
            return (Criteria) this;
        }

        public Criteria andShopLeaderIsNull() {
            addCriterion("shop_leader is null");
            return (Criteria) this;
        }

        public Criteria andShopLeaderIsNotNull() {
            addCriterion("shop_leader is not null");
            return (Criteria) this;
        }

        public Criteria andShopLeaderEqualTo(String value) {
            addCriterion("shop_leader =", value, "shopLeader");
            return (Criteria) this;
        }

        public Criteria andShopLeaderNotEqualTo(String value) {
            addCriterion("shop_leader <>", value, "shopLeader");
            return (Criteria) this;
        }

        public Criteria andShopLeaderGreaterThan(String value) {
            addCriterion("shop_leader >", value, "shopLeader");
            return (Criteria) this;
        }

        public Criteria andShopLeaderGreaterThanOrEqualTo(String value) {
            addCriterion("shop_leader >=", value, "shopLeader");
            return (Criteria) this;
        }

        public Criteria andShopLeaderLessThan(String value) {
            addCriterion("shop_leader <", value, "shopLeader");
            return (Criteria) this;
        }

        public Criteria andShopLeaderLessThanOrEqualTo(String value) {
            addCriterion("shop_leader <=", value, "shopLeader");
            return (Criteria) this;
        }

        public Criteria andShopLeaderLike(String value) {
            addCriterion("shop_leader like", value, "shopLeader");
            return (Criteria) this;
        }

        public Criteria andShopLeaderNotLike(String value) {
            addCriterion("shop_leader not like", value, "shopLeader");
            return (Criteria) this;
        }

        public Criteria andShopLeaderIn(List<String> values) {
            addCriterion("shop_leader in", values, "shopLeader");
            return (Criteria) this;
        }

        public Criteria andShopLeaderNotIn(List<String> values) {
            addCriterion("shop_leader not in", values, "shopLeader");
            return (Criteria) this;
        }

        public Criteria andShopLeaderBetween(String value1, String value2) {
            addCriterion("shop_leader between", value1, value2, "shopLeader");
            return (Criteria) this;
        }

        public Criteria andShopLeaderNotBetween(String value1, String value2) {
            addCriterion("shop_leader not between", value1, value2, "shopLeader");
            return (Criteria) this;
        }

        public Criteria andShopLeaderPhoneIsNull() {
            addCriterion("shop_leader_phone is null");
            return (Criteria) this;
        }

        public Criteria andShopLeaderPhoneIsNotNull() {
            addCriterion("shop_leader_phone is not null");
            return (Criteria) this;
        }

        public Criteria andShopLeaderPhoneEqualTo(String value) {
            addCriterion("shop_leader_phone =", value, "shopLeaderPhone");
            return (Criteria) this;
        }

        public Criteria andShopLeaderPhoneNotEqualTo(String value) {
            addCriterion("shop_leader_phone <>", value, "shopLeaderPhone");
            return (Criteria) this;
        }

        public Criteria andShopLeaderPhoneGreaterThan(String value) {
            addCriterion("shop_leader_phone >", value, "shopLeaderPhone");
            return (Criteria) this;
        }

        public Criteria andShopLeaderPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("shop_leader_phone >=", value, "shopLeaderPhone");
            return (Criteria) this;
        }

        public Criteria andShopLeaderPhoneLessThan(String value) {
            addCriterion("shop_leader_phone <", value, "shopLeaderPhone");
            return (Criteria) this;
        }

        public Criteria andShopLeaderPhoneLessThanOrEqualTo(String value) {
            addCriterion("shop_leader_phone <=", value, "shopLeaderPhone");
            return (Criteria) this;
        }

        public Criteria andShopLeaderPhoneLike(String value) {
            addCriterion("shop_leader_phone like", value, "shopLeaderPhone");
            return (Criteria) this;
        }

        public Criteria andShopLeaderPhoneNotLike(String value) {
            addCriterion("shop_leader_phone not like", value, "shopLeaderPhone");
            return (Criteria) this;
        }

        public Criteria andShopLeaderPhoneIn(List<String> values) {
            addCriterion("shop_leader_phone in", values, "shopLeaderPhone");
            return (Criteria) this;
        }

        public Criteria andShopLeaderPhoneNotIn(List<String> values) {
            addCriterion("shop_leader_phone not in", values, "shopLeaderPhone");
            return (Criteria) this;
        }

        public Criteria andShopLeaderPhoneBetween(String value1, String value2) {
            addCriterion("shop_leader_phone between", value1, value2, "shopLeaderPhone");
            return (Criteria) this;
        }

        public Criteria andShopLeaderPhoneNotBetween(String value1, String value2) {
            addCriterion("shop_leader_phone not between", value1, value2, "shopLeaderPhone");
            return (Criteria) this;
        }

        public Criteria andShopContactIsNull() {
            addCriterion("shop_contact is null");
            return (Criteria) this;
        }

        public Criteria andShopContactIsNotNull() {
            addCriterion("shop_contact is not null");
            return (Criteria) this;
        }

        public Criteria andShopContactEqualTo(String value) {
            addCriterion("shop_contact =", value, "shopContact");
            return (Criteria) this;
        }

        public Criteria andShopContactNotEqualTo(String value) {
            addCriterion("shop_contact <>", value, "shopContact");
            return (Criteria) this;
        }

        public Criteria andShopContactGreaterThan(String value) {
            addCriterion("shop_contact >", value, "shopContact");
            return (Criteria) this;
        }

        public Criteria andShopContactGreaterThanOrEqualTo(String value) {
            addCriterion("shop_contact >=", value, "shopContact");
            return (Criteria) this;
        }

        public Criteria andShopContactLessThan(String value) {
            addCriterion("shop_contact <", value, "shopContact");
            return (Criteria) this;
        }

        public Criteria andShopContactLessThanOrEqualTo(String value) {
            addCriterion("shop_contact <=", value, "shopContact");
            return (Criteria) this;
        }

        public Criteria andShopContactLike(String value) {
            addCriterion("shop_contact like", value, "shopContact");
            return (Criteria) this;
        }

        public Criteria andShopContactNotLike(String value) {
            addCriterion("shop_contact not like", value, "shopContact");
            return (Criteria) this;
        }

        public Criteria andShopContactIn(List<String> values) {
            addCriterion("shop_contact in", values, "shopContact");
            return (Criteria) this;
        }

        public Criteria andShopContactNotIn(List<String> values) {
            addCriterion("shop_contact not in", values, "shopContact");
            return (Criteria) this;
        }

        public Criteria andShopContactBetween(String value1, String value2) {
            addCriterion("shop_contact between", value1, value2, "shopContact");
            return (Criteria) this;
        }

        public Criteria andShopContactNotBetween(String value1, String value2) {
            addCriterion("shop_contact not between", value1, value2, "shopContact");
            return (Criteria) this;
        }

        public Criteria andLogoIsNull() {
            addCriterion("logo is null");
            return (Criteria) this;
        }

        public Criteria andLogoIsNotNull() {
            addCriterion("logo is not null");
            return (Criteria) this;
        }

        public Criteria andLogoEqualTo(String value) {
            addCriterion("logo =", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotEqualTo(String value) {
            addCriterion("logo <>", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThan(String value) {
            addCriterion("logo >", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoGreaterThanOrEqualTo(String value) {
            addCriterion("logo >=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThan(String value) {
            addCriterion("logo <", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLessThanOrEqualTo(String value) {
            addCriterion("logo <=", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoLike(String value) {
            addCriterion("logo like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotLike(String value) {
            addCriterion("logo not like", value, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoIn(List<String> values) {
            addCriterion("logo in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotIn(List<String> values) {
            addCriterion("logo not in", values, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoBetween(String value1, String value2) {
            addCriterion("logo between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andLogoNotBetween(String value1, String value2) {
            addCriterion("logo not between", value1, value2, "logo");
            return (Criteria) this;
        }

        public Criteria andShopRemarkIsNull() {
            addCriterion("shop_remark is null");
            return (Criteria) this;
        }

        public Criteria andShopRemarkIsNotNull() {
            addCriterion("shop_remark is not null");
            return (Criteria) this;
        }

        public Criteria andShopRemarkEqualTo(String value) {
            addCriterion("shop_remark =", value, "shopRemark");
            return (Criteria) this;
        }

        public Criteria andShopRemarkNotEqualTo(String value) {
            addCriterion("shop_remark <>", value, "shopRemark");
            return (Criteria) this;
        }

        public Criteria andShopRemarkGreaterThan(String value) {
            addCriterion("shop_remark >", value, "shopRemark");
            return (Criteria) this;
        }

        public Criteria andShopRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("shop_remark >=", value, "shopRemark");
            return (Criteria) this;
        }

        public Criteria andShopRemarkLessThan(String value) {
            addCriterion("shop_remark <", value, "shopRemark");
            return (Criteria) this;
        }

        public Criteria andShopRemarkLessThanOrEqualTo(String value) {
            addCriterion("shop_remark <=", value, "shopRemark");
            return (Criteria) this;
        }

        public Criteria andShopRemarkLike(String value) {
            addCriterion("shop_remark like", value, "shopRemark");
            return (Criteria) this;
        }

        public Criteria andShopRemarkNotLike(String value) {
            addCriterion("shop_remark not like", value, "shopRemark");
            return (Criteria) this;
        }

        public Criteria andShopRemarkIn(List<String> values) {
            addCriterion("shop_remark in", values, "shopRemark");
            return (Criteria) this;
        }

        public Criteria andShopRemarkNotIn(List<String> values) {
            addCriterion("shop_remark not in", values, "shopRemark");
            return (Criteria) this;
        }

        public Criteria andShopRemarkBetween(String value1, String value2) {
            addCriterion("shop_remark between", value1, value2, "shopRemark");
            return (Criteria) this;
        }

        public Criteria andShopRemarkNotBetween(String value1, String value2) {
            addCriterion("shop_remark not between", value1, value2, "shopRemark");
            return (Criteria) this;
        }

        public Criteria andEffectStartTimeIsNull() {
            addCriterion("effect_start_time is null");
            return (Criteria) this;
        }

        public Criteria andEffectStartTimeIsNotNull() {
            addCriterion("effect_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andEffectStartTimeEqualTo(Date value) {
            addCriterion("effect_start_time =", value, "effectStartTime");
            return (Criteria) this;
        }

        public Criteria andEffectStartTimeNotEqualTo(Date value) {
            addCriterion("effect_start_time <>", value, "effectStartTime");
            return (Criteria) this;
        }

        public Criteria andEffectStartTimeGreaterThan(Date value) {
            addCriterion("effect_start_time >", value, "effectStartTime");
            return (Criteria) this;
        }

        public Criteria andEffectStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("effect_start_time >=", value, "effectStartTime");
            return (Criteria) this;
        }

        public Criteria andEffectStartTimeLessThan(Date value) {
            addCriterion("effect_start_time <", value, "effectStartTime");
            return (Criteria) this;
        }

        public Criteria andEffectStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("effect_start_time <=", value, "effectStartTime");
            return (Criteria) this;
        }

        public Criteria andEffectStartTimeIn(List<Date> values) {
            addCriterion("effect_start_time in", values, "effectStartTime");
            return (Criteria) this;
        }

        public Criteria andEffectStartTimeNotIn(List<Date> values) {
            addCriterion("effect_start_time not in", values, "effectStartTime");
            return (Criteria) this;
        }

        public Criteria andEffectStartTimeBetween(Date value1, Date value2) {
            addCriterion("effect_start_time between", value1, value2, "effectStartTime");
            return (Criteria) this;
        }

        public Criteria andEffectStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("effect_start_time not between", value1, value2, "effectStartTime");
            return (Criteria) this;
        }

        public Criteria andEffectEndTimeIsNull() {
            addCriterion("effect_end_time is null");
            return (Criteria) this;
        }

        public Criteria andEffectEndTimeIsNotNull() {
            addCriterion("effect_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEffectEndTimeEqualTo(Date value) {
            addCriterion("effect_end_time =", value, "effectEndTime");
            return (Criteria) this;
        }

        public Criteria andEffectEndTimeNotEqualTo(Date value) {
            addCriterion("effect_end_time <>", value, "effectEndTime");
            return (Criteria) this;
        }

        public Criteria andEffectEndTimeGreaterThan(Date value) {
            addCriterion("effect_end_time >", value, "effectEndTime");
            return (Criteria) this;
        }

        public Criteria andEffectEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("effect_end_time >=", value, "effectEndTime");
            return (Criteria) this;
        }

        public Criteria andEffectEndTimeLessThan(Date value) {
            addCriterion("effect_end_time <", value, "effectEndTime");
            return (Criteria) this;
        }

        public Criteria andEffectEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("effect_end_time <=", value, "effectEndTime");
            return (Criteria) this;
        }

        public Criteria andEffectEndTimeIn(List<Date> values) {
            addCriterion("effect_end_time in", values, "effectEndTime");
            return (Criteria) this;
        }

        public Criteria andEffectEndTimeNotIn(List<Date> values) {
            addCriterion("effect_end_time not in", values, "effectEndTime");
            return (Criteria) this;
        }

        public Criteria andEffectEndTimeBetween(Date value1, Date value2) {
            addCriterion("effect_end_time between", value1, value2, "effectEndTime");
            return (Criteria) this;
        }

        public Criteria andEffectEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("effect_end_time not between", value1, value2, "effectEndTime");
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

        public Criteria andCreatTimeIsNull() {
            addCriterion("creat_time is null");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIsNotNull() {
            addCriterion("creat_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreatTimeEqualTo(Date value) {
            addCriterion("creat_time =", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotEqualTo(Date value) {
            addCriterion("creat_time <>", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeGreaterThan(Date value) {
            addCriterion("creat_time >", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("creat_time >=", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeLessThan(Date value) {
            addCriterion("creat_time <", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeLessThanOrEqualTo(Date value) {
            addCriterion("creat_time <=", value, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeIn(List<Date> values) {
            addCriterion("creat_time in", values, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotIn(List<Date> values) {
            addCriterion("creat_time not in", values, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeBetween(Date value1, Date value2) {
            addCriterion("creat_time between", value1, value2, "creatTime");
            return (Criteria) this;
        }

        public Criteria andCreatTimeNotBetween(Date value1, Date value2) {
            addCriterion("creat_time not between", value1, value2, "creatTime");
            return (Criteria) this;
        }

        public Criteria andModifierIsNull() {
            addCriterion("modifier is null");
            return (Criteria) this;
        }

        public Criteria andModifierIsNotNull() {
            addCriterion("modifier is not null");
            return (Criteria) this;
        }

        public Criteria andModifierEqualTo(Long value) {
            addCriterion("modifier =", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotEqualTo(Long value) {
            addCriterion("modifier <>", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThan(Long value) {
            addCriterion("modifier >", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierGreaterThanOrEqualTo(Long value) {
            addCriterion("modifier >=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThan(Long value) {
            addCriterion("modifier <", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierLessThanOrEqualTo(Long value) {
            addCriterion("modifier <=", value, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierIn(List<Long> values) {
            addCriterion("modifier in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotIn(List<Long> values) {
            addCriterion("modifier not in", values, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierBetween(Long value1, Long value2) {
            addCriterion("modifier between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifierNotBetween(Long value1, Long value2) {
            addCriterion("modifier not between", value1, value2, "modifier");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("modify_time is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("modify_time =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("modify_time <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("modify_time >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_time >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("modify_time <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("modify_time <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("modify_time in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("modify_time not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("modify_time between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("modify_time not between", value1, value2, "modifyTime");
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