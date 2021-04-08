package com.home.cn.model;

import java.util.ArrayList;
import java.util.List;

public class HomeHousingAttaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HomeHousingAttaExample() {
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

        public Criteria andFormIdIsNull() {
            addCriterion("form_id is null");
            return (Criteria) this;
        }

        public Criteria andFormIdIsNotNull() {
            addCriterion("form_id is not null");
            return (Criteria) this;
        }

        public Criteria andFormIdEqualTo(Long value) {
            addCriterion("form_id =", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdNotEqualTo(Long value) {
            addCriterion("form_id <>", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdGreaterThan(Long value) {
            addCriterion("form_id >", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdGreaterThanOrEqualTo(Long value) {
            addCriterion("form_id >=", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdLessThan(Long value) {
            addCriterion("form_id <", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdLessThanOrEqualTo(Long value) {
            addCriterion("form_id <=", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdIn(List<Long> values) {
            addCriterion("form_id in", values, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdNotIn(List<Long> values) {
            addCriterion("form_id not in", values, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdBetween(Long value1, Long value2) {
            addCriterion("form_id between", value1, value2, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdNotBetween(Long value1, Long value2) {
            addCriterion("form_id not between", value1, value2, "formId");
            return (Criteria) this;
        }

        public Criteria andAttaTypeIsNull() {
            addCriterion("atta_type is null");
            return (Criteria) this;
        }

        public Criteria andAttaTypeIsNotNull() {
            addCriterion("atta_type is not null");
            return (Criteria) this;
        }

        public Criteria andAttaTypeEqualTo(Short value) {
            addCriterion("atta_type =", value, "attaType");
            return (Criteria) this;
        }

        public Criteria andAttaTypeNotEqualTo(Short value) {
            addCriterion("atta_type <>", value, "attaType");
            return (Criteria) this;
        }

        public Criteria andAttaTypeGreaterThan(Short value) {
            addCriterion("atta_type >", value, "attaType");
            return (Criteria) this;
        }

        public Criteria andAttaTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("atta_type >=", value, "attaType");
            return (Criteria) this;
        }

        public Criteria andAttaTypeLessThan(Short value) {
            addCriterion("atta_type <", value, "attaType");
            return (Criteria) this;
        }

        public Criteria andAttaTypeLessThanOrEqualTo(Short value) {
            addCriterion("atta_type <=", value, "attaType");
            return (Criteria) this;
        }

        public Criteria andAttaTypeIn(List<Short> values) {
            addCriterion("atta_type in", values, "attaType");
            return (Criteria) this;
        }

        public Criteria andAttaTypeNotIn(List<Short> values) {
            addCriterion("atta_type not in", values, "attaType");
            return (Criteria) this;
        }

        public Criteria andAttaTypeBetween(Short value1, Short value2) {
            addCriterion("atta_type between", value1, value2, "attaType");
            return (Criteria) this;
        }

        public Criteria andAttaTypeNotBetween(Short value1, Short value2) {
            addCriterion("atta_type not between", value1, value2, "attaType");
            return (Criteria) this;
        }

        public Criteria andAttaUrlIsNull() {
            addCriterion("atta_url is null");
            return (Criteria) this;
        }

        public Criteria andAttaUrlIsNotNull() {
            addCriterion("atta_url is not null");
            return (Criteria) this;
        }

        public Criteria andAttaUrlEqualTo(String value) {
            addCriterion("atta_url =", value, "attaUrl");
            return (Criteria) this;
        }

        public Criteria andAttaUrlNotEqualTo(String value) {
            addCriterion("atta_url <>", value, "attaUrl");
            return (Criteria) this;
        }

        public Criteria andAttaUrlGreaterThan(String value) {
            addCriterion("atta_url >", value, "attaUrl");
            return (Criteria) this;
        }

        public Criteria andAttaUrlGreaterThanOrEqualTo(String value) {
            addCriterion("atta_url >=", value, "attaUrl");
            return (Criteria) this;
        }

        public Criteria andAttaUrlLessThan(String value) {
            addCriterion("atta_url <", value, "attaUrl");
            return (Criteria) this;
        }

        public Criteria andAttaUrlLessThanOrEqualTo(String value) {
            addCriterion("atta_url <=", value, "attaUrl");
            return (Criteria) this;
        }

        public Criteria andAttaUrlLike(String value) {
            addCriterion("atta_url like", value, "attaUrl");
            return (Criteria) this;
        }

        public Criteria andAttaUrlNotLike(String value) {
            addCriterion("atta_url not like", value, "attaUrl");
            return (Criteria) this;
        }

        public Criteria andAttaUrlIn(List<String> values) {
            addCriterion("atta_url in", values, "attaUrl");
            return (Criteria) this;
        }

        public Criteria andAttaUrlNotIn(List<String> values) {
            addCriterion("atta_url not in", values, "attaUrl");
            return (Criteria) this;
        }

        public Criteria andAttaUrlBetween(String value1, String value2) {
            addCriterion("atta_url between", value1, value2, "attaUrl");
            return (Criteria) this;
        }

        public Criteria andAttaUrlNotBetween(String value1, String value2) {
            addCriterion("atta_url not between", value1, value2, "attaUrl");
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