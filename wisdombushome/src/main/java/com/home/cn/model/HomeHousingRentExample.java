package com.home.cn.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HomeHousingRentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HomeHousingRentExample() {
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

        public Criteria andRentTypeIsNull() {
            addCriterion("rent_type is null");
            return (Criteria) this;
        }

        public Criteria andRentTypeIsNotNull() {
            addCriterion("rent_type is not null");
            return (Criteria) this;
        }

        public Criteria andRentTypeEqualTo(Short value) {
            addCriterion("rent_type =", value, "rentType");
            return (Criteria) this;
        }

        public Criteria andRentTypeNotEqualTo(Short value) {
            addCriterion("rent_type <>", value, "rentType");
            return (Criteria) this;
        }

        public Criteria andRentTypeGreaterThan(Short value) {
            addCriterion("rent_type >", value, "rentType");
            return (Criteria) this;
        }

        public Criteria andRentTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("rent_type >=", value, "rentType");
            return (Criteria) this;
        }

        public Criteria andRentTypeLessThan(Short value) {
            addCriterion("rent_type <", value, "rentType");
            return (Criteria) this;
        }

        public Criteria andRentTypeLessThanOrEqualTo(Short value) {
            addCriterion("rent_type <=", value, "rentType");
            return (Criteria) this;
        }

        public Criteria andRentTypeIn(List<Short> values) {
            addCriterion("rent_type in", values, "rentType");
            return (Criteria) this;
        }

        public Criteria andRentTypeNotIn(List<Short> values) {
            addCriterion("rent_type not in", values, "rentType");
            return (Criteria) this;
        }

        public Criteria andRentTypeBetween(Short value1, Short value2) {
            addCriterion("rent_type between", value1, value2, "rentType");
            return (Criteria) this;
        }

        public Criteria andRentTypeNotBetween(Short value1, Short value2) {
            addCriterion("rent_type not between", value1, value2, "rentType");
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

        public Criteria andRentAddrIsNull() {
            addCriterion("rent_addr is null");
            return (Criteria) this;
        }

        public Criteria andRentAddrIsNotNull() {
            addCriterion("rent_addr is not null");
            return (Criteria) this;
        }

        public Criteria andRentAddrEqualTo(String value) {
            addCriterion("rent_addr =", value, "rentAddr");
            return (Criteria) this;
        }

        public Criteria andRentAddrNotEqualTo(String value) {
            addCriterion("rent_addr <>", value, "rentAddr");
            return (Criteria) this;
        }

        public Criteria andRentAddrGreaterThan(String value) {
            addCriterion("rent_addr >", value, "rentAddr");
            return (Criteria) this;
        }

        public Criteria andRentAddrGreaterThanOrEqualTo(String value) {
            addCriterion("rent_addr >=", value, "rentAddr");
            return (Criteria) this;
        }

        public Criteria andRentAddrLessThan(String value) {
            addCriterion("rent_addr <", value, "rentAddr");
            return (Criteria) this;
        }

        public Criteria andRentAddrLessThanOrEqualTo(String value) {
            addCriterion("rent_addr <=", value, "rentAddr");
            return (Criteria) this;
        }

        public Criteria andRentAddrLike(String value) {
            addCriterion("rent_addr like", value, "rentAddr");
            return (Criteria) this;
        }

        public Criteria andRentAddrNotLike(String value) {
            addCriterion("rent_addr not like", value, "rentAddr");
            return (Criteria) this;
        }

        public Criteria andRentAddrIn(List<String> values) {
            addCriterion("rent_addr in", values, "rentAddr");
            return (Criteria) this;
        }

        public Criteria andRentAddrNotIn(List<String> values) {
            addCriterion("rent_addr not in", values, "rentAddr");
            return (Criteria) this;
        }

        public Criteria andRentAddrBetween(String value1, String value2) {
            addCriterion("rent_addr between", value1, value2, "rentAddr");
            return (Criteria) this;
        }

        public Criteria andRentAddrNotBetween(String value1, String value2) {
            addCriterion("rent_addr not between", value1, value2, "rentAddr");
            return (Criteria) this;
        }

        public Criteria andRoomIsNull() {
            addCriterion("room is null");
            return (Criteria) this;
        }

        public Criteria andRoomIsNotNull() {
            addCriterion("room is not null");
            return (Criteria) this;
        }

        public Criteria andRoomEqualTo(Short value) {
            addCriterion("room =", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomNotEqualTo(Short value) {
            addCriterion("room <>", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomGreaterThan(Short value) {
            addCriterion("room >", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomGreaterThanOrEqualTo(Short value) {
            addCriterion("room >=", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomLessThan(Short value) {
            addCriterion("room <", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomLessThanOrEqualTo(Short value) {
            addCriterion("room <=", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomIn(List<Short> values) {
            addCriterion("room in", values, "room");
            return (Criteria) this;
        }

        public Criteria andRoomNotIn(List<Short> values) {
            addCriterion("room not in", values, "room");
            return (Criteria) this;
        }

        public Criteria andRoomBetween(Short value1, Short value2) {
            addCriterion("room between", value1, value2, "room");
            return (Criteria) this;
        }

        public Criteria andRoomNotBetween(Short value1, Short value2) {
            addCriterion("room not between", value1, value2, "room");
            return (Criteria) this;
        }

        public Criteria andLivingRoomIsNull() {
            addCriterion("living_room is null");
            return (Criteria) this;
        }

        public Criteria andLivingRoomIsNotNull() {
            addCriterion("living_room is not null");
            return (Criteria) this;
        }

        public Criteria andLivingRoomEqualTo(Short value) {
            addCriterion("living_room =", value, "livingRoom");
            return (Criteria) this;
        }

        public Criteria andLivingRoomNotEqualTo(Short value) {
            addCriterion("living_room <>", value, "livingRoom");
            return (Criteria) this;
        }

        public Criteria andLivingRoomGreaterThan(Short value) {
            addCriterion("living_room >", value, "livingRoom");
            return (Criteria) this;
        }

        public Criteria andLivingRoomGreaterThanOrEqualTo(Short value) {
            addCriterion("living_room >=", value, "livingRoom");
            return (Criteria) this;
        }

        public Criteria andLivingRoomLessThan(Short value) {
            addCriterion("living_room <", value, "livingRoom");
            return (Criteria) this;
        }

        public Criteria andLivingRoomLessThanOrEqualTo(Short value) {
            addCriterion("living_room <=", value, "livingRoom");
            return (Criteria) this;
        }

        public Criteria andLivingRoomIn(List<Short> values) {
            addCriterion("living_room in", values, "livingRoom");
            return (Criteria) this;
        }

        public Criteria andLivingRoomNotIn(List<Short> values) {
            addCriterion("living_room not in", values, "livingRoom");
            return (Criteria) this;
        }

        public Criteria andLivingRoomBetween(Short value1, Short value2) {
            addCriterion("living_room between", value1, value2, "livingRoom");
            return (Criteria) this;
        }

        public Criteria andLivingRoomNotBetween(Short value1, Short value2) {
            addCriterion("living_room not between", value1, value2, "livingRoom");
            return (Criteria) this;
        }

        public Criteria andToiletIsNull() {
            addCriterion("toilet is null");
            return (Criteria) this;
        }

        public Criteria andToiletIsNotNull() {
            addCriterion("toilet is not null");
            return (Criteria) this;
        }

        public Criteria andToiletEqualTo(Short value) {
            addCriterion("toilet =", value, "toilet");
            return (Criteria) this;
        }

        public Criteria andToiletNotEqualTo(Short value) {
            addCriterion("toilet <>", value, "toilet");
            return (Criteria) this;
        }

        public Criteria andToiletGreaterThan(Short value) {
            addCriterion("toilet >", value, "toilet");
            return (Criteria) this;
        }

        public Criteria andToiletGreaterThanOrEqualTo(Short value) {
            addCriterion("toilet >=", value, "toilet");
            return (Criteria) this;
        }

        public Criteria andToiletLessThan(Short value) {
            addCriterion("toilet <", value, "toilet");
            return (Criteria) this;
        }

        public Criteria andToiletLessThanOrEqualTo(Short value) {
            addCriterion("toilet <=", value, "toilet");
            return (Criteria) this;
        }

        public Criteria andToiletIn(List<Short> values) {
            addCriterion("toilet in", values, "toilet");
            return (Criteria) this;
        }

        public Criteria andToiletNotIn(List<Short> values) {
            addCriterion("toilet not in", values, "toilet");
            return (Criteria) this;
        }

        public Criteria andToiletBetween(Short value1, Short value2) {
            addCriterion("toilet between", value1, value2, "toilet");
            return (Criteria) this;
        }

        public Criteria andToiletNotBetween(Short value1, Short value2) {
            addCriterion("toilet not between", value1, value2, "toilet");
            return (Criteria) this;
        }

        public Criteria andM2IsNull() {
            addCriterion("m2 is null");
            return (Criteria) this;
        }

        public Criteria andM2IsNotNull() {
            addCriterion("m2 is not null");
            return (Criteria) this;
        }

        public Criteria andM2EqualTo(Short value) {
            addCriterion("m2 =", value, "m2");
            return (Criteria) this;
        }

        public Criteria andM2NotEqualTo(Short value) {
            addCriterion("m2 <>", value, "m2");
            return (Criteria) this;
        }

        public Criteria andM2GreaterThan(Short value) {
            addCriterion("m2 >", value, "m2");
            return (Criteria) this;
        }

        public Criteria andM2GreaterThanOrEqualTo(Short value) {
            addCriterion("m2 >=", value, "m2");
            return (Criteria) this;
        }

        public Criteria andM2LessThan(Short value) {
            addCriterion("m2 <", value, "m2");
            return (Criteria) this;
        }

        public Criteria andM2LessThanOrEqualTo(Short value) {
            addCriterion("m2 <=", value, "m2");
            return (Criteria) this;
        }

        public Criteria andM2In(List<Short> values) {
            addCriterion("m2 in", values, "m2");
            return (Criteria) this;
        }

        public Criteria andM2NotIn(List<Short> values) {
            addCriterion("m2 not in", values, "m2");
            return (Criteria) this;
        }

        public Criteria andM2Between(Short value1, Short value2) {
            addCriterion("m2 between", value1, value2, "m2");
            return (Criteria) this;
        }

        public Criteria andM2NotBetween(Short value1, Short value2) {
            addCriterion("m2 not between", value1, value2, "m2");
            return (Criteria) this;
        }

        public Criteria andFlowIsNull() {
            addCriterion("flow is null");
            return (Criteria) this;
        }

        public Criteria andFlowIsNotNull() {
            addCriterion("flow is not null");
            return (Criteria) this;
        }

        public Criteria andFlowEqualTo(Short value) {
            addCriterion("flow =", value, "flow");
            return (Criteria) this;
        }

        public Criteria andFlowNotEqualTo(Short value) {
            addCriterion("flow <>", value, "flow");
            return (Criteria) this;
        }

        public Criteria andFlowGreaterThan(Short value) {
            addCriterion("flow >", value, "flow");
            return (Criteria) this;
        }

        public Criteria andFlowGreaterThanOrEqualTo(Short value) {
            addCriterion("flow >=", value, "flow");
            return (Criteria) this;
        }

        public Criteria andFlowLessThan(Short value) {
            addCriterion("flow <", value, "flow");
            return (Criteria) this;
        }

        public Criteria andFlowLessThanOrEqualTo(Short value) {
            addCriterion("flow <=", value, "flow");
            return (Criteria) this;
        }

        public Criteria andFlowIn(List<Short> values) {
            addCriterion("flow in", values, "flow");
            return (Criteria) this;
        }

        public Criteria andFlowNotIn(List<Short> values) {
            addCriterion("flow not in", values, "flow");
            return (Criteria) this;
        }

        public Criteria andFlowBetween(Short value1, Short value2) {
            addCriterion("flow between", value1, value2, "flow");
            return (Criteria) this;
        }

        public Criteria andFlowNotBetween(Short value1, Short value2) {
            addCriterion("flow not between", value1, value2, "flow");
            return (Criteria) this;
        }

        public Criteria andFlowCountIsNull() {
            addCriterion("flow_count is null");
            return (Criteria) this;
        }

        public Criteria andFlowCountIsNotNull() {
            addCriterion("flow_count is not null");
            return (Criteria) this;
        }

        public Criteria andFlowCountEqualTo(Short value) {
            addCriterion("flow_count =", value, "flowCount");
            return (Criteria) this;
        }

        public Criteria andFlowCountNotEqualTo(Short value) {
            addCriterion("flow_count <>", value, "flowCount");
            return (Criteria) this;
        }

        public Criteria andFlowCountGreaterThan(Short value) {
            addCriterion("flow_count >", value, "flowCount");
            return (Criteria) this;
        }

        public Criteria andFlowCountGreaterThanOrEqualTo(Short value) {
            addCriterion("flow_count >=", value, "flowCount");
            return (Criteria) this;
        }

        public Criteria andFlowCountLessThan(Short value) {
            addCriterion("flow_count <", value, "flowCount");
            return (Criteria) this;
        }

        public Criteria andFlowCountLessThanOrEqualTo(Short value) {
            addCriterion("flow_count <=", value, "flowCount");
            return (Criteria) this;
        }

        public Criteria andFlowCountIn(List<Short> values) {
            addCriterion("flow_count in", values, "flowCount");
            return (Criteria) this;
        }

        public Criteria andFlowCountNotIn(List<Short> values) {
            addCriterion("flow_count not in", values, "flowCount");
            return (Criteria) this;
        }

        public Criteria andFlowCountBetween(Short value1, Short value2) {
            addCriterion("flow_count between", value1, value2, "flowCount");
            return (Criteria) this;
        }

        public Criteria andFlowCountNotBetween(Short value1, Short value2) {
            addCriterion("flow_count not between", value1, value2, "flowCount");
            return (Criteria) this;
        }

        public Criteria andHousingDirectionIsNull() {
            addCriterion("housing_direction is null");
            return (Criteria) this;
        }

        public Criteria andHousingDirectionIsNotNull() {
            addCriterion("housing_direction is not null");
            return (Criteria) this;
        }

        public Criteria andHousingDirectionEqualTo(Short value) {
            addCriterion("housing_direction =", value, "housingDirection");
            return (Criteria) this;
        }

        public Criteria andHousingDirectionNotEqualTo(Short value) {
            addCriterion("housing_direction <>", value, "housingDirection");
            return (Criteria) this;
        }

        public Criteria andHousingDirectionGreaterThan(Short value) {
            addCriterion("housing_direction >", value, "housingDirection");
            return (Criteria) this;
        }

        public Criteria andHousingDirectionGreaterThanOrEqualTo(Short value) {
            addCriterion("housing_direction >=", value, "housingDirection");
            return (Criteria) this;
        }

        public Criteria andHousingDirectionLessThan(Short value) {
            addCriterion("housing_direction <", value, "housingDirection");
            return (Criteria) this;
        }

        public Criteria andHousingDirectionLessThanOrEqualTo(Short value) {
            addCriterion("housing_direction <=", value, "housingDirection");
            return (Criteria) this;
        }

        public Criteria andHousingDirectionIn(List<Short> values) {
            addCriterion("housing_direction in", values, "housingDirection");
            return (Criteria) this;
        }

        public Criteria andHousingDirectionNotIn(List<Short> values) {
            addCriterion("housing_direction not in", values, "housingDirection");
            return (Criteria) this;
        }

        public Criteria andHousingDirectionBetween(Short value1, Short value2) {
            addCriterion("housing_direction between", value1, value2, "housingDirection");
            return (Criteria) this;
        }

        public Criteria andHousingDirectionNotBetween(Short value1, Short value2) {
            addCriterion("housing_direction not between", value1, value2, "housingDirection");
            return (Criteria) this;
        }

        public Criteria andHousingDIsNull() {
            addCriterion("housing_d is null");
            return (Criteria) this;
        }

        public Criteria andHousingDIsNotNull() {
            addCriterion("housing_d is not null");
            return (Criteria) this;
        }

        public Criteria andHousingDEqualTo(Short value) {
            addCriterion("housing_d =", value, "housingD");
            return (Criteria) this;
        }

        public Criteria andHousingDNotEqualTo(Short value) {
            addCriterion("housing_d <>", value, "housingD");
            return (Criteria) this;
        }

        public Criteria andHousingDGreaterThan(Short value) {
            addCriterion("housing_d >", value, "housingD");
            return (Criteria) this;
        }

        public Criteria andHousingDGreaterThanOrEqualTo(Short value) {
            addCriterion("housing_d >=", value, "housingD");
            return (Criteria) this;
        }

        public Criteria andHousingDLessThan(Short value) {
            addCriterion("housing_d <", value, "housingD");
            return (Criteria) this;
        }

        public Criteria andHousingDLessThanOrEqualTo(Short value) {
            addCriterion("housing_d <=", value, "housingD");
            return (Criteria) this;
        }

        public Criteria andHousingDIn(List<Short> values) {
            addCriterion("housing_d in", values, "housingD");
            return (Criteria) this;
        }

        public Criteria andHousingDNotIn(List<Short> values) {
            addCriterion("housing_d not in", values, "housingD");
            return (Criteria) this;
        }

        public Criteria andHousingDBetween(Short value1, Short value2) {
            addCriterion("housing_d between", value1, value2, "housingD");
            return (Criteria) this;
        }

        public Criteria andHousingDNotBetween(Short value1, Short value2) {
            addCriterion("housing_d not between", value1, value2, "housingD");
            return (Criteria) this;
        }

        public Criteria andHousingTypeIsNull() {
            addCriterion("housing_type is null");
            return (Criteria) this;
        }

        public Criteria andHousingTypeIsNotNull() {
            addCriterion("housing_type is not null");
            return (Criteria) this;
        }

        public Criteria andHousingTypeEqualTo(Short value) {
            addCriterion("housing_type =", value, "housingType");
            return (Criteria) this;
        }

        public Criteria andHousingTypeNotEqualTo(Short value) {
            addCriterion("housing_type <>", value, "housingType");
            return (Criteria) this;
        }

        public Criteria andHousingTypeGreaterThan(Short value) {
            addCriterion("housing_type >", value, "housingType");
            return (Criteria) this;
        }

        public Criteria andHousingTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("housing_type >=", value, "housingType");
            return (Criteria) this;
        }

        public Criteria andHousingTypeLessThan(Short value) {
            addCriterion("housing_type <", value, "housingType");
            return (Criteria) this;
        }

        public Criteria andHousingTypeLessThanOrEqualTo(Short value) {
            addCriterion("housing_type <=", value, "housingType");
            return (Criteria) this;
        }

        public Criteria andHousingTypeIn(List<Short> values) {
            addCriterion("housing_type in", values, "housingType");
            return (Criteria) this;
        }

        public Criteria andHousingTypeNotIn(List<Short> values) {
            addCriterion("housing_type not in", values, "housingType");
            return (Criteria) this;
        }

        public Criteria andHousingTypeBetween(Short value1, Short value2) {
            addCriterion("housing_type between", value1, value2, "housingType");
            return (Criteria) this;
        }

        public Criteria andHousingTypeNotBetween(Short value1, Short value2) {
            addCriterion("housing_type not between", value1, value2, "housingType");
            return (Criteria) this;
        }

        public Criteria andHousingConfigIsNull() {
            addCriterion("housing_config is null");
            return (Criteria) this;
        }

        public Criteria andHousingConfigIsNotNull() {
            addCriterion("housing_config is not null");
            return (Criteria) this;
        }

        public Criteria andHousingConfigEqualTo(String value) {
            addCriterion("housing_config =", value, "housingConfig");
            return (Criteria) this;
        }

        public Criteria andHousingConfigNotEqualTo(String value) {
            addCriterion("housing_config <>", value, "housingConfig");
            return (Criteria) this;
        }

        public Criteria andHousingConfigGreaterThan(String value) {
            addCriterion("housing_config >", value, "housingConfig");
            return (Criteria) this;
        }

        public Criteria andHousingConfigGreaterThanOrEqualTo(String value) {
            addCriterion("housing_config >=", value, "housingConfig");
            return (Criteria) this;
        }

        public Criteria andHousingConfigLessThan(String value) {
            addCriterion("housing_config <", value, "housingConfig");
            return (Criteria) this;
        }

        public Criteria andHousingConfigLessThanOrEqualTo(String value) {
            addCriterion("housing_config <=", value, "housingConfig");
            return (Criteria) this;
        }

        public Criteria andHousingConfigLike(String value) {
            addCriterion("housing_config like", value, "housingConfig");
            return (Criteria) this;
        }

        public Criteria andHousingConfigNotLike(String value) {
            addCriterion("housing_config not like", value, "housingConfig");
            return (Criteria) this;
        }

        public Criteria andHousingConfigIn(List<String> values) {
            addCriterion("housing_config in", values, "housingConfig");
            return (Criteria) this;
        }

        public Criteria andHousingConfigNotIn(List<String> values) {
            addCriterion("housing_config not in", values, "housingConfig");
            return (Criteria) this;
        }

        public Criteria andHousingConfigBetween(String value1, String value2) {
            addCriterion("housing_config between", value1, value2, "housingConfig");
            return (Criteria) this;
        }

        public Criteria andHousingConfigNotBetween(String value1, String value2) {
            addCriterion("housing_config not between", value1, value2, "housingConfig");
            return (Criteria) this;
        }

        public Criteria andPayIsNull() {
            addCriterion("pay is null");
            return (Criteria) this;
        }

        public Criteria andPayIsNotNull() {
            addCriterion("pay is not null");
            return (Criteria) this;
        }

        public Criteria andPayEqualTo(Integer value) {
            addCriterion("pay =", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayNotEqualTo(Integer value) {
            addCriterion("pay <>", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayGreaterThan(Integer value) {
            addCriterion("pay >", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay >=", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayLessThan(Integer value) {
            addCriterion("pay <", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayLessThanOrEqualTo(Integer value) {
            addCriterion("pay <=", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayIn(List<Integer> values) {
            addCriterion("pay in", values, "pay");
            return (Criteria) this;
        }

        public Criteria andPayNotIn(List<Integer> values) {
            addCriterion("pay not in", values, "pay");
            return (Criteria) this;
        }

        public Criteria andPayBetween(Integer value1, Integer value2) {
            addCriterion("pay between", value1, value2, "pay");
            return (Criteria) this;
        }

        public Criteria andPayNotBetween(Integer value1, Integer value2) {
            addCriterion("pay not between", value1, value2, "pay");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNull() {
            addCriterion("pay_type is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNotNull() {
            addCriterion("pay_type is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeEqualTo(Integer value) {
            addCriterion("pay_type =", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotEqualTo(Integer value) {
            addCriterion("pay_type <>", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThan(Integer value) {
            addCriterion("pay_type >", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_type >=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThan(Integer value) {
            addCriterion("pay_type <", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThanOrEqualTo(Integer value) {
            addCriterion("pay_type <=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIn(List<Integer> values) {
            addCriterion("pay_type in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotIn(List<Integer> values) {
            addCriterion("pay_type not in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeBetween(Integer value1, Integer value2) {
            addCriterion("pay_type between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_type not between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andRentTitleIsNull() {
            addCriterion("rent_title is null");
            return (Criteria) this;
        }

        public Criteria andRentTitleIsNotNull() {
            addCriterion("rent_title is not null");
            return (Criteria) this;
        }

        public Criteria andRentTitleEqualTo(String value) {
            addCriterion("rent_title =", value, "rentTitle");
            return (Criteria) this;
        }

        public Criteria andRentTitleNotEqualTo(String value) {
            addCriterion("rent_title <>", value, "rentTitle");
            return (Criteria) this;
        }

        public Criteria andRentTitleGreaterThan(String value) {
            addCriterion("rent_title >", value, "rentTitle");
            return (Criteria) this;
        }

        public Criteria andRentTitleGreaterThanOrEqualTo(String value) {
            addCriterion("rent_title >=", value, "rentTitle");
            return (Criteria) this;
        }

        public Criteria andRentTitleLessThan(String value) {
            addCriterion("rent_title <", value, "rentTitle");
            return (Criteria) this;
        }

        public Criteria andRentTitleLessThanOrEqualTo(String value) {
            addCriterion("rent_title <=", value, "rentTitle");
            return (Criteria) this;
        }

        public Criteria andRentTitleLike(String value) {
            addCriterion("rent_title like", value, "rentTitle");
            return (Criteria) this;
        }

        public Criteria andRentTitleNotLike(String value) {
            addCriterion("rent_title not like", value, "rentTitle");
            return (Criteria) this;
        }

        public Criteria andRentTitleIn(List<String> values) {
            addCriterion("rent_title in", values, "rentTitle");
            return (Criteria) this;
        }

        public Criteria andRentTitleNotIn(List<String> values) {
            addCriterion("rent_title not in", values, "rentTitle");
            return (Criteria) this;
        }

        public Criteria andRentTitleBetween(String value1, String value2) {
            addCriterion("rent_title between", value1, value2, "rentTitle");
            return (Criteria) this;
        }

        public Criteria andRentTitleNotBetween(String value1, String value2) {
            addCriterion("rent_title not between", value1, value2, "rentTitle");
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