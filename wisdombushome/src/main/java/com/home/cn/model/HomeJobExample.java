package com.home.cn.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HomeJobExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HomeJobExample() {
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

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andTownIsNull() {
            addCriterion("town is null");
            return (Criteria) this;
        }

        public Criteria andTownIsNotNull() {
            addCriterion("town is not null");
            return (Criteria) this;
        }

        public Criteria andTownEqualTo(String value) {
            addCriterion("town =", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownNotEqualTo(String value) {
            addCriterion("town <>", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownGreaterThan(String value) {
            addCriterion("town >", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownGreaterThanOrEqualTo(String value) {
            addCriterion("town >=", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownLessThan(String value) {
            addCriterion("town <", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownLessThanOrEqualTo(String value) {
            addCriterion("town <=", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownLike(String value) {
            addCriterion("town like", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownNotLike(String value) {
            addCriterion("town not like", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownIn(List<String> values) {
            addCriterion("town in", values, "town");
            return (Criteria) this;
        }

        public Criteria andTownNotIn(List<String> values) {
            addCriterion("town not in", values, "town");
            return (Criteria) this;
        }

        public Criteria andTownBetween(String value1, String value2) {
            addCriterion("town between", value1, value2, "town");
            return (Criteria) this;
        }

        public Criteria andTownNotBetween(String value1, String value2) {
            addCriterion("town not between", value1, value2, "town");
            return (Criteria) this;
        }

        public Criteria andCountyIsNull() {
            addCriterion("county is null");
            return (Criteria) this;
        }

        public Criteria andCountyIsNotNull() {
            addCriterion("county is not null");
            return (Criteria) this;
        }

        public Criteria andCountyEqualTo(String value) {
            addCriterion("county =", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotEqualTo(String value) {
            addCriterion("county <>", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyGreaterThan(String value) {
            addCriterion("county >", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyGreaterThanOrEqualTo(String value) {
            addCriterion("county >=", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLessThan(String value) {
            addCriterion("county <", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLessThanOrEqualTo(String value) {
            addCriterion("county <=", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLike(String value) {
            addCriterion("county like", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotLike(String value) {
            addCriterion("county not like", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyIn(List<String> values) {
            addCriterion("county in", values, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotIn(List<String> values) {
            addCriterion("county not in", values, "county");
            return (Criteria) this;
        }

        public Criteria andCountyBetween(String value1, String value2) {
            addCriterion("county between", value1, value2, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotBetween(String value1, String value2) {
            addCriterion("county not between", value1, value2, "county");
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

        public Criteria andJobKeyIsNull() {
            addCriterion("job_key is null");
            return (Criteria) this;
        }

        public Criteria andJobKeyIsNotNull() {
            addCriterion("job_key is not null");
            return (Criteria) this;
        }

        public Criteria andJobKeyEqualTo(String value) {
            addCriterion("job_key =", value, "jobKey");
            return (Criteria) this;
        }

        public Criteria andJobKeyNotEqualTo(String value) {
            addCriterion("job_key <>", value, "jobKey");
            return (Criteria) this;
        }

        public Criteria andJobKeyGreaterThan(String value) {
            addCriterion("job_key >", value, "jobKey");
            return (Criteria) this;
        }

        public Criteria andJobKeyGreaterThanOrEqualTo(String value) {
            addCriterion("job_key >=", value, "jobKey");
            return (Criteria) this;
        }

        public Criteria andJobKeyLessThan(String value) {
            addCriterion("job_key <", value, "jobKey");
            return (Criteria) this;
        }

        public Criteria andJobKeyLessThanOrEqualTo(String value) {
            addCriterion("job_key <=", value, "jobKey");
            return (Criteria) this;
        }

        public Criteria andJobKeyLike(String value) {
            addCriterion("job_key like", value, "jobKey");
            return (Criteria) this;
        }

        public Criteria andJobKeyNotLike(String value) {
            addCriterion("job_key not like", value, "jobKey");
            return (Criteria) this;
        }

        public Criteria andJobKeyIn(List<String> values) {
            addCriterion("job_key in", values, "jobKey");
            return (Criteria) this;
        }

        public Criteria andJobKeyNotIn(List<String> values) {
            addCriterion("job_key not in", values, "jobKey");
            return (Criteria) this;
        }

        public Criteria andJobKeyBetween(String value1, String value2) {
            addCriterion("job_key between", value1, value2, "jobKey");
            return (Criteria) this;
        }

        public Criteria andJobKeyNotBetween(String value1, String value2) {
            addCriterion("job_key not between", value1, value2, "jobKey");
            return (Criteria) this;
        }

        public Criteria andJobTitleIsNull() {
            addCriterion("job_title is null");
            return (Criteria) this;
        }

        public Criteria andJobTitleIsNotNull() {
            addCriterion("job_title is not null");
            return (Criteria) this;
        }

        public Criteria andJobTitleEqualTo(String value) {
            addCriterion("job_title =", value, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleNotEqualTo(String value) {
            addCriterion("job_title <>", value, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleGreaterThan(String value) {
            addCriterion("job_title >", value, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleGreaterThanOrEqualTo(String value) {
            addCriterion("job_title >=", value, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleLessThan(String value) {
            addCriterion("job_title <", value, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleLessThanOrEqualTo(String value) {
            addCriterion("job_title <=", value, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleLike(String value) {
            addCriterion("job_title like", value, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleNotLike(String value) {
            addCriterion("job_title not like", value, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleIn(List<String> values) {
            addCriterion("job_title in", values, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleNotIn(List<String> values) {
            addCriterion("job_title not in", values, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleBetween(String value1, String value2) {
            addCriterion("job_title between", value1, value2, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleNotBetween(String value1, String value2) {
            addCriterion("job_title not between", value1, value2, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andSalaryUnitIsNull() {
            addCriterion("salary_unit is null");
            return (Criteria) this;
        }

        public Criteria andSalaryUnitIsNotNull() {
            addCriterion("salary_unit is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryUnitEqualTo(String value) {
            addCriterion("salary_unit =", value, "salaryUnit");
            return (Criteria) this;
        }

        public Criteria andSalaryUnitNotEqualTo(String value) {
            addCriterion("salary_unit <>", value, "salaryUnit");
            return (Criteria) this;
        }

        public Criteria andSalaryUnitGreaterThan(String value) {
            addCriterion("salary_unit >", value, "salaryUnit");
            return (Criteria) this;
        }

        public Criteria andSalaryUnitGreaterThanOrEqualTo(String value) {
            addCriterion("salary_unit >=", value, "salaryUnit");
            return (Criteria) this;
        }

        public Criteria andSalaryUnitLessThan(String value) {
            addCriterion("salary_unit <", value, "salaryUnit");
            return (Criteria) this;
        }

        public Criteria andSalaryUnitLessThanOrEqualTo(String value) {
            addCriterion("salary_unit <=", value, "salaryUnit");
            return (Criteria) this;
        }

        public Criteria andSalaryUnitLike(String value) {
            addCriterion("salary_unit like", value, "salaryUnit");
            return (Criteria) this;
        }

        public Criteria andSalaryUnitNotLike(String value) {
            addCriterion("salary_unit not like", value, "salaryUnit");
            return (Criteria) this;
        }

        public Criteria andSalaryUnitIn(List<String> values) {
            addCriterion("salary_unit in", values, "salaryUnit");
            return (Criteria) this;
        }

        public Criteria andSalaryUnitNotIn(List<String> values) {
            addCriterion("salary_unit not in", values, "salaryUnit");
            return (Criteria) this;
        }

        public Criteria andSalaryUnitBetween(String value1, String value2) {
            addCriterion("salary_unit between", value1, value2, "salaryUnit");
            return (Criteria) this;
        }

        public Criteria andSalaryUnitNotBetween(String value1, String value2) {
            addCriterion("salary_unit not between", value1, value2, "salaryUnit");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNull() {
            addCriterion("salary is null");
            return (Criteria) this;
        }

        public Criteria andSalaryIsNotNull() {
            addCriterion("salary is not null");
            return (Criteria) this;
        }

        public Criteria andSalaryEqualTo(Integer value) {
            addCriterion("salary =", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotEqualTo(Integer value) {
            addCriterion("salary <>", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThan(Integer value) {
            addCriterion("salary >", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryGreaterThanOrEqualTo(Integer value) {
            addCriterion("salary >=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThan(Integer value) {
            addCriterion("salary <", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryLessThanOrEqualTo(Integer value) {
            addCriterion("salary <=", value, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryIn(List<Integer> values) {
            addCriterion("salary in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotIn(List<Integer> values) {
            addCriterion("salary not in", values, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryBetween(Integer value1, Integer value2) {
            addCriterion("salary between", value1, value2, "salary");
            return (Criteria) this;
        }

        public Criteria andSalaryNotBetween(Integer value1, Integer value2) {
            addCriterion("salary not between", value1, value2, "salary");
            return (Criteria) this;
        }

        public Criteria andJobRemarkIsNull() {
            addCriterion("job_remark is null");
            return (Criteria) this;
        }

        public Criteria andJobRemarkIsNotNull() {
            addCriterion("job_remark is not null");
            return (Criteria) this;
        }

        public Criteria andJobRemarkEqualTo(String value) {
            addCriterion("job_remark =", value, "jobRemark");
            return (Criteria) this;
        }

        public Criteria andJobRemarkNotEqualTo(String value) {
            addCriterion("job_remark <>", value, "jobRemark");
            return (Criteria) this;
        }

        public Criteria andJobRemarkGreaterThan(String value) {
            addCriterion("job_remark >", value, "jobRemark");
            return (Criteria) this;
        }

        public Criteria andJobRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("job_remark >=", value, "jobRemark");
            return (Criteria) this;
        }

        public Criteria andJobRemarkLessThan(String value) {
            addCriterion("job_remark <", value, "jobRemark");
            return (Criteria) this;
        }

        public Criteria andJobRemarkLessThanOrEqualTo(String value) {
            addCriterion("job_remark <=", value, "jobRemark");
            return (Criteria) this;
        }

        public Criteria andJobRemarkLike(String value) {
            addCriterion("job_remark like", value, "jobRemark");
            return (Criteria) this;
        }

        public Criteria andJobRemarkNotLike(String value) {
            addCriterion("job_remark not like", value, "jobRemark");
            return (Criteria) this;
        }

        public Criteria andJobRemarkIn(List<String> values) {
            addCriterion("job_remark in", values, "jobRemark");
            return (Criteria) this;
        }

        public Criteria andJobRemarkNotIn(List<String> values) {
            addCriterion("job_remark not in", values, "jobRemark");
            return (Criteria) this;
        }

        public Criteria andJobRemarkBetween(String value1, String value2) {
            addCriterion("job_remark between", value1, value2, "jobRemark");
            return (Criteria) this;
        }

        public Criteria andJobRemarkNotBetween(String value1, String value2) {
            addCriterion("job_remark not between", value1, value2, "jobRemark");
            return (Criteria) this;
        }

        public Criteria andAboutUsIsNull() {
            addCriterion("about_us is null");
            return (Criteria) this;
        }

        public Criteria andAboutUsIsNotNull() {
            addCriterion("about_us is not null");
            return (Criteria) this;
        }

        public Criteria andAboutUsEqualTo(String value) {
            addCriterion("about_us =", value, "aboutUs");
            return (Criteria) this;
        }

        public Criteria andAboutUsNotEqualTo(String value) {
            addCriterion("about_us <>", value, "aboutUs");
            return (Criteria) this;
        }

        public Criteria andAboutUsGreaterThan(String value) {
            addCriterion("about_us >", value, "aboutUs");
            return (Criteria) this;
        }

        public Criteria andAboutUsGreaterThanOrEqualTo(String value) {
            addCriterion("about_us >=", value, "aboutUs");
            return (Criteria) this;
        }

        public Criteria andAboutUsLessThan(String value) {
            addCriterion("about_us <", value, "aboutUs");
            return (Criteria) this;
        }

        public Criteria andAboutUsLessThanOrEqualTo(String value) {
            addCriterion("about_us <=", value, "aboutUs");
            return (Criteria) this;
        }

        public Criteria andAboutUsLike(String value) {
            addCriterion("about_us like", value, "aboutUs");
            return (Criteria) this;
        }

        public Criteria andAboutUsNotLike(String value) {
            addCriterion("about_us not like", value, "aboutUs");
            return (Criteria) this;
        }

        public Criteria andAboutUsIn(List<String> values) {
            addCriterion("about_us in", values, "aboutUs");
            return (Criteria) this;
        }

        public Criteria andAboutUsNotIn(List<String> values) {
            addCriterion("about_us not in", values, "aboutUs");
            return (Criteria) this;
        }

        public Criteria andAboutUsBetween(String value1, String value2) {
            addCriterion("about_us between", value1, value2, "aboutUs");
            return (Criteria) this;
        }

        public Criteria andAboutUsNotBetween(String value1, String value2) {
            addCriterion("about_us not between", value1, value2, "aboutUs");
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