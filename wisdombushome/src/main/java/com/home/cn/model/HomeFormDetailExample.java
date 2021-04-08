package com.home.cn.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HomeFormDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HomeFormDetailExample() {
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
            addCriterion("UUID is null");
            return (Criteria) this;
        }

        public Criteria andUuidIsNotNull() {
            addCriterion("UUID is not null");
            return (Criteria) this;
        }

        public Criteria andUuidEqualTo(Long value) {
            addCriterion("UUID =", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotEqualTo(Long value) {
            addCriterion("UUID <>", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThan(Long value) {
            addCriterion("UUID >", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThanOrEqualTo(Long value) {
            addCriterion("UUID >=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThan(Long value) {
            addCriterion("UUID <", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThanOrEqualTo(Long value) {
            addCriterion("UUID <=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidIn(List<Long> values) {
            addCriterion("UUID in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotIn(List<Long> values) {
            addCriterion("UUID not in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidBetween(Long value1, Long value2) {
            addCriterion("UUID between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotBetween(Long value1, Long value2) {
            addCriterion("UUID not between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeIsNull() {
            addCriterion("identity_type is null");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeIsNotNull() {
            addCriterion("identity_type is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeEqualTo(Short value) {
            addCriterion("identity_type =", value, "identityType");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeNotEqualTo(Short value) {
            addCriterion("identity_type <>", value, "identityType");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeGreaterThan(Short value) {
            addCriterion("identity_type >", value, "identityType");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("identity_type >=", value, "identityType");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeLessThan(Short value) {
            addCriterion("identity_type <", value, "identityType");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeLessThanOrEqualTo(Short value) {
            addCriterion("identity_type <=", value, "identityType");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeIn(List<Short> values) {
            addCriterion("identity_type in", values, "identityType");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeNotIn(List<Short> values) {
            addCriterion("identity_type not in", values, "identityType");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeBetween(Short value1, Short value2) {
            addCriterion("identity_type between", value1, value2, "identityType");
            return (Criteria) this;
        }

        public Criteria andIdentityTypeNotBetween(Short value1, Short value2) {
            addCriterion("identity_type not between", value1, value2, "identityType");
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

        public Criteria andAddrIsNull() {
            addCriterion("addr is null");
            return (Criteria) this;
        }

        public Criteria andAddrIsNotNull() {
            addCriterion("addr is not null");
            return (Criteria) this;
        }

        public Criteria andAddrEqualTo(String value) {
            addCriterion("addr =", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotEqualTo(String value) {
            addCriterion("addr <>", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrGreaterThan(String value) {
            addCriterion("addr >", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrGreaterThanOrEqualTo(String value) {
            addCriterion("addr >=", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLessThan(String value) {
            addCriterion("addr <", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLessThanOrEqualTo(String value) {
            addCriterion("addr <=", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLike(String value) {
            addCriterion("addr like", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotLike(String value) {
            addCriterion("addr not like", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrIn(List<String> values) {
            addCriterion("addr in", values, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotIn(List<String> values) {
            addCriterion("addr not in", values, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrBetween(String value1, String value2) {
            addCriterion("addr between", value1, value2, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotBetween(String value1, String value2) {
            addCriterion("addr not between", value1, value2, "addr");
            return (Criteria) this;
        }

        public Criteria andGoodsUpIsNull() {
            addCriterion("goods_up is null");
            return (Criteria) this;
        }

        public Criteria andGoodsUpIsNotNull() {
            addCriterion("goods_up is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsUpEqualTo(Integer value) {
            addCriterion("goods_up =", value, "goodsUp");
            return (Criteria) this;
        }

        public Criteria andGoodsUpNotEqualTo(Integer value) {
            addCriterion("goods_up <>", value, "goodsUp");
            return (Criteria) this;
        }

        public Criteria andGoodsUpGreaterThan(Integer value) {
            addCriterion("goods_up >", value, "goodsUp");
            return (Criteria) this;
        }

        public Criteria andGoodsUpGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_up >=", value, "goodsUp");
            return (Criteria) this;
        }

        public Criteria andGoodsUpLessThan(Integer value) {
            addCriterion("goods_up <", value, "goodsUp");
            return (Criteria) this;
        }

        public Criteria andGoodsUpLessThanOrEqualTo(Integer value) {
            addCriterion("goods_up <=", value, "goodsUp");
            return (Criteria) this;
        }

        public Criteria andGoodsUpIn(List<Integer> values) {
            addCriterion("goods_up in", values, "goodsUp");
            return (Criteria) this;
        }

        public Criteria andGoodsUpNotIn(List<Integer> values) {
            addCriterion("goods_up not in", values, "goodsUp");
            return (Criteria) this;
        }

        public Criteria andGoodsUpBetween(Integer value1, Integer value2) {
            addCriterion("goods_up between", value1, value2, "goodsUp");
            return (Criteria) this;
        }

        public Criteria andGoodsUpNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_up not between", value1, value2, "goodsUp");
            return (Criteria) this;
        }

        public Criteria andGoodsMiddleIsNull() {
            addCriterion("goods_middle is null");
            return (Criteria) this;
        }

        public Criteria andGoodsMiddleIsNotNull() {
            addCriterion("goods_middle is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsMiddleEqualTo(Integer value) {
            addCriterion("goods_middle =", value, "goodsMiddle");
            return (Criteria) this;
        }

        public Criteria andGoodsMiddleNotEqualTo(Integer value) {
            addCriterion("goods_middle <>", value, "goodsMiddle");
            return (Criteria) this;
        }

        public Criteria andGoodsMiddleGreaterThan(Integer value) {
            addCriterion("goods_middle >", value, "goodsMiddle");
            return (Criteria) this;
        }

        public Criteria andGoodsMiddleGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_middle >=", value, "goodsMiddle");
            return (Criteria) this;
        }

        public Criteria andGoodsMiddleLessThan(Integer value) {
            addCriterion("goods_middle <", value, "goodsMiddle");
            return (Criteria) this;
        }

        public Criteria andGoodsMiddleLessThanOrEqualTo(Integer value) {
            addCriterion("goods_middle <=", value, "goodsMiddle");
            return (Criteria) this;
        }

        public Criteria andGoodsMiddleIn(List<Integer> values) {
            addCriterion("goods_middle in", values, "goodsMiddle");
            return (Criteria) this;
        }

        public Criteria andGoodsMiddleNotIn(List<Integer> values) {
            addCriterion("goods_middle not in", values, "goodsMiddle");
            return (Criteria) this;
        }

        public Criteria andGoodsMiddleBetween(Integer value1, Integer value2) {
            addCriterion("goods_middle between", value1, value2, "goodsMiddle");
            return (Criteria) this;
        }

        public Criteria andGoodsMiddleNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_middle not between", value1, value2, "goodsMiddle");
            return (Criteria) this;
        }

        public Criteria andGoodsLastIsNull() {
            addCriterion("goods_last is null");
            return (Criteria) this;
        }

        public Criteria andGoodsLastIsNotNull() {
            addCriterion("goods_last is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsLastEqualTo(Integer value) {
            addCriterion("goods_last =", value, "goodsLast");
            return (Criteria) this;
        }

        public Criteria andGoodsLastNotEqualTo(Integer value) {
            addCriterion("goods_last <>", value, "goodsLast");
            return (Criteria) this;
        }

        public Criteria andGoodsLastGreaterThan(Integer value) {
            addCriterion("goods_last >", value, "goodsLast");
            return (Criteria) this;
        }

        public Criteria andGoodsLastGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_last >=", value, "goodsLast");
            return (Criteria) this;
        }

        public Criteria andGoodsLastLessThan(Integer value) {
            addCriterion("goods_last <", value, "goodsLast");
            return (Criteria) this;
        }

        public Criteria andGoodsLastLessThanOrEqualTo(Integer value) {
            addCriterion("goods_last <=", value, "goodsLast");
            return (Criteria) this;
        }

        public Criteria andGoodsLastIn(List<Integer> values) {
            addCriterion("goods_last in", values, "goodsLast");
            return (Criteria) this;
        }

        public Criteria andGoodsLastNotIn(List<Integer> values) {
            addCriterion("goods_last not in", values, "goodsLast");
            return (Criteria) this;
        }

        public Criteria andGoodsLastBetween(Integer value1, Integer value2) {
            addCriterion("goods_last between", value1, value2, "goodsLast");
            return (Criteria) this;
        }

        public Criteria andGoodsLastNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_last not between", value1, value2, "goodsLast");
            return (Criteria) this;
        }

        public Criteria andFormTitleIsNull() {
            addCriterion("form_title is null");
            return (Criteria) this;
        }

        public Criteria andFormTitleIsNotNull() {
            addCriterion("form_title is not null");
            return (Criteria) this;
        }

        public Criteria andFormTitleEqualTo(String value) {
            addCriterion("form_title =", value, "formTitle");
            return (Criteria) this;
        }

        public Criteria andFormTitleNotEqualTo(String value) {
            addCriterion("form_title <>", value, "formTitle");
            return (Criteria) this;
        }

        public Criteria andFormTitleGreaterThan(String value) {
            addCriterion("form_title >", value, "formTitle");
            return (Criteria) this;
        }

        public Criteria andFormTitleGreaterThanOrEqualTo(String value) {
            addCriterion("form_title >=", value, "formTitle");
            return (Criteria) this;
        }

        public Criteria andFormTitleLessThan(String value) {
            addCriterion("form_title <", value, "formTitle");
            return (Criteria) this;
        }

        public Criteria andFormTitleLessThanOrEqualTo(String value) {
            addCriterion("form_title <=", value, "formTitle");
            return (Criteria) this;
        }

        public Criteria andFormTitleLike(String value) {
            addCriterion("form_title like", value, "formTitle");
            return (Criteria) this;
        }

        public Criteria andFormTitleNotLike(String value) {
            addCriterion("form_title not like", value, "formTitle");
            return (Criteria) this;
        }

        public Criteria andFormTitleIn(List<String> values) {
            addCriterion("form_title in", values, "formTitle");
            return (Criteria) this;
        }

        public Criteria andFormTitleNotIn(List<String> values) {
            addCriterion("form_title not in", values, "formTitle");
            return (Criteria) this;
        }

        public Criteria andFormTitleBetween(String value1, String value2) {
            addCriterion("form_title between", value1, value2, "formTitle");
            return (Criteria) this;
        }

        public Criteria andFormTitleNotBetween(String value1, String value2) {
            addCriterion("form_title not between", value1, value2, "formTitle");
            return (Criteria) this;
        }

        public Criteria andConnectorIsNull() {
            addCriterion("connector is null");
            return (Criteria) this;
        }

        public Criteria andConnectorIsNotNull() {
            addCriterion("connector is not null");
            return (Criteria) this;
        }

        public Criteria andConnectorEqualTo(String value) {
            addCriterion("connector =", value, "connector");
            return (Criteria) this;
        }

        public Criteria andConnectorNotEqualTo(String value) {
            addCriterion("connector <>", value, "connector");
            return (Criteria) this;
        }

        public Criteria andConnectorGreaterThan(String value) {
            addCriterion("connector >", value, "connector");
            return (Criteria) this;
        }

        public Criteria andConnectorGreaterThanOrEqualTo(String value) {
            addCriterion("connector >=", value, "connector");
            return (Criteria) this;
        }

        public Criteria andConnectorLessThan(String value) {
            addCriterion("connector <", value, "connector");
            return (Criteria) this;
        }

        public Criteria andConnectorLessThanOrEqualTo(String value) {
            addCriterion("connector <=", value, "connector");
            return (Criteria) this;
        }

        public Criteria andConnectorLike(String value) {
            addCriterion("connector like", value, "connector");
            return (Criteria) this;
        }

        public Criteria andConnectorNotLike(String value) {
            addCriterion("connector not like", value, "connector");
            return (Criteria) this;
        }

        public Criteria andConnectorIn(List<String> values) {
            addCriterion("connector in", values, "connector");
            return (Criteria) this;
        }

        public Criteria andConnectorNotIn(List<String> values) {
            addCriterion("connector not in", values, "connector");
            return (Criteria) this;
        }

        public Criteria andConnectorBetween(String value1, String value2) {
            addCriterion("connector between", value1, value2, "connector");
            return (Criteria) this;
        }

        public Criteria andConnectorNotBetween(String value1, String value2) {
            addCriterion("connector not between", value1, value2, "connector");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andCorpIdIsNull() {
            addCriterion("corp_id is null");
            return (Criteria) this;
        }

        public Criteria andCorpIdIsNotNull() {
            addCriterion("corp_id is not null");
            return (Criteria) this;
        }

        public Criteria andCorpIdEqualTo(Long value) {
            addCriterion("corp_id =", value, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdNotEqualTo(Long value) {
            addCriterion("corp_id <>", value, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdGreaterThan(Long value) {
            addCriterion("corp_id >", value, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdGreaterThanOrEqualTo(Long value) {
            addCriterion("corp_id >=", value, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdLessThan(Long value) {
            addCriterion("corp_id <", value, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdLessThanOrEqualTo(Long value) {
            addCriterion("corp_id <=", value, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdIn(List<Long> values) {
            addCriterion("corp_id in", values, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdNotIn(List<Long> values) {
            addCriterion("corp_id not in", values, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdBetween(Long value1, Long value2) {
            addCriterion("corp_id between", value1, value2, "corpId");
            return (Criteria) this;
        }

        public Criteria andCorpIdNotBetween(Long value1, Long value2) {
            addCriterion("corp_id not between", value1, value2, "corpId");
            return (Criteria) this;
        }

        public Criteria andEffEndTimeIsNull() {
            addCriterion("eff_end_time is null");
            return (Criteria) this;
        }

        public Criteria andEffEndTimeIsNotNull() {
            addCriterion("eff_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEffEndTimeEqualTo(Date value) {
            addCriterion("eff_end_time =", value, "effEndTime");
            return (Criteria) this;
        }

        public Criteria andEffEndTimeNotEqualTo(Date value) {
            addCriterion("eff_end_time <>", value, "effEndTime");
            return (Criteria) this;
        }

        public Criteria andEffEndTimeGreaterThan(Date value) {
            addCriterion("eff_end_time >", value, "effEndTime");
            return (Criteria) this;
        }

        public Criteria andEffEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("eff_end_time >=", value, "effEndTime");
            return (Criteria) this;
        }

        public Criteria andEffEndTimeLessThan(Date value) {
            addCriterion("eff_end_time <", value, "effEndTime");
            return (Criteria) this;
        }

        public Criteria andEffEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("eff_end_time <=", value, "effEndTime");
            return (Criteria) this;
        }

        public Criteria andEffEndTimeIn(List<Date> values) {
            addCriterion("eff_end_time in", values, "effEndTime");
            return (Criteria) this;
        }

        public Criteria andEffEndTimeNotIn(List<Date> values) {
            addCriterion("eff_end_time not in", values, "effEndTime");
            return (Criteria) this;
        }

        public Criteria andEffEndTimeBetween(Date value1, Date value2) {
            addCriterion("eff_end_time between", value1, value2, "effEndTime");
            return (Criteria) this;
        }

        public Criteria andEffEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("eff_end_time not between", value1, value2, "effEndTime");
            return (Criteria) this;
        }

        public Criteria andEffStartTimeIsNull() {
            addCriterion("eff_start_time is null");
            return (Criteria) this;
        }

        public Criteria andEffStartTimeIsNotNull() {
            addCriterion("eff_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andEffStartTimeEqualTo(Date value) {
            addCriterion("eff_start_time =", value, "effStartTime");
            return (Criteria) this;
        }

        public Criteria andEffStartTimeNotEqualTo(Date value) {
            addCriterion("eff_start_time <>", value, "effStartTime");
            return (Criteria) this;
        }

        public Criteria andEffStartTimeGreaterThan(Date value) {
            addCriterion("eff_start_time >", value, "effStartTime");
            return (Criteria) this;
        }

        public Criteria andEffStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("eff_start_time >=", value, "effStartTime");
            return (Criteria) this;
        }

        public Criteria andEffStartTimeLessThan(Date value) {
            addCriterion("eff_start_time <", value, "effStartTime");
            return (Criteria) this;
        }

        public Criteria andEffStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("eff_start_time <=", value, "effStartTime");
            return (Criteria) this;
        }

        public Criteria andEffStartTimeIn(List<Date> values) {
            addCriterion("eff_start_time in", values, "effStartTime");
            return (Criteria) this;
        }

        public Criteria andEffStartTimeNotIn(List<Date> values) {
            addCriterion("eff_start_time not in", values, "effStartTime");
            return (Criteria) this;
        }

        public Criteria andEffStartTimeBetween(Date value1, Date value2) {
            addCriterion("eff_start_time between", value1, value2, "effStartTime");
            return (Criteria) this;
        }

        public Criteria andEffStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("eff_start_time not between", value1, value2, "effStartTime");
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