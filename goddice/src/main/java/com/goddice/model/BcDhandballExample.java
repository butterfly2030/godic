package com.goddice.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BcDhandballExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BcDhandballExample() {
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

        public Criteria andTidIsNull() {
            addCriterion("tid is null");
            return (Criteria) this;
        }

        public Criteria andTidIsNotNull() {
            addCriterion("tid is not null");
            return (Criteria) this;
        }

        public Criteria andTidEqualTo(String value) {
            addCriterion("tid =", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotEqualTo(String value) {
            addCriterion("tid <>", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThan(String value) {
            addCriterion("tid >", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThanOrEqualTo(String value) {
            addCriterion("tid >=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThan(String value) {
            addCriterion("tid <", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThanOrEqualTo(String value) {
            addCriterion("tid <=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLike(String value) {
            addCriterion("tid like", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotLike(String value) {
            addCriterion("tid not like", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidIn(List<String> values) {
            addCriterion("tid in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotIn(List<String> values) {
            addCriterion("tid not in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidBetween(String value1, String value2) {
            addCriterion("tid between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotBetween(String value1, String value2) {
            addCriterion("tid not between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andVNumberIsNull() {
            addCriterion("v_number is null");
            return (Criteria) this;
        }

        public Criteria andVNumberIsNotNull() {
            addCriterion("v_number is not null");
            return (Criteria) this;
        }

        public Criteria andVNumberEqualTo(String value) {
            addCriterion("v_number =", value, "vNumber");
            return (Criteria) this;
        }

        public Criteria andVNumberNotEqualTo(String value) {
            addCriterion("v_number <>", value, "vNumber");
            return (Criteria) this;
        }

        public Criteria andVNumberGreaterThan(String value) {
            addCriterion("v_number >", value, "vNumber");
            return (Criteria) this;
        }

        public Criteria andVNumberGreaterThanOrEqualTo(String value) {
            addCriterion("v_number >=", value, "vNumber");
            return (Criteria) this;
        }

        public Criteria andVNumberLessThan(String value) {
            addCriterion("v_number <", value, "vNumber");
            return (Criteria) this;
        }

        public Criteria andVNumberLessThanOrEqualTo(String value) {
            addCriterion("v_number <=", value, "vNumber");
            return (Criteria) this;
        }

        public Criteria andVNumberLike(String value) {
            addCriterion("v_number like", value, "vNumber");
            return (Criteria) this;
        }

        public Criteria andVNumberNotLike(String value) {
            addCriterion("v_number not like", value, "vNumber");
            return (Criteria) this;
        }

        public Criteria andVNumberIn(List<String> values) {
            addCriterion("v_number in", values, "vNumber");
            return (Criteria) this;
        }

        public Criteria andVNumberNotIn(List<String> values) {
            addCriterion("v_number not in", values, "vNumber");
            return (Criteria) this;
        }

        public Criteria andVNumberBetween(String value1, String value2) {
            addCriterion("v_number between", value1, value2, "vNumber");
            return (Criteria) this;
        }

        public Criteria andVNumberNotBetween(String value1, String value2) {
            addCriterion("v_number not between", value1, value2, "vNumber");
            return (Criteria) this;
        }

        public Criteria andVPerPosition1IsNull() {
            addCriterion("v_per_position1 is null");
            return (Criteria) this;
        }

        public Criteria andVPerPosition1IsNotNull() {
            addCriterion("v_per_position1 is not null");
            return (Criteria) this;
        }

        public Criteria andVPerPosition1EqualTo(String value) {
            addCriterion("v_per_position1 =", value, "vPerPosition1");
            return (Criteria) this;
        }

        public Criteria andVPerPosition1NotEqualTo(String value) {
            addCriterion("v_per_position1 <>", value, "vPerPosition1");
            return (Criteria) this;
        }

        public Criteria andVPerPosition1GreaterThan(String value) {
            addCriterion("v_per_position1 >", value, "vPerPosition1");
            return (Criteria) this;
        }

        public Criteria andVPerPosition1GreaterThanOrEqualTo(String value) {
            addCriterion("v_per_position1 >=", value, "vPerPosition1");
            return (Criteria) this;
        }

        public Criteria andVPerPosition1LessThan(String value) {
            addCriterion("v_per_position1 <", value, "vPerPosition1");
            return (Criteria) this;
        }

        public Criteria andVPerPosition1LessThanOrEqualTo(String value) {
            addCriterion("v_per_position1 <=", value, "vPerPosition1");
            return (Criteria) this;
        }

        public Criteria andVPerPosition1Like(String value) {
            addCriterion("v_per_position1 like", value, "vPerPosition1");
            return (Criteria) this;
        }

        public Criteria andVPerPosition1NotLike(String value) {
            addCriterion("v_per_position1 not like", value, "vPerPosition1");
            return (Criteria) this;
        }

        public Criteria andVPerPosition1In(List<String> values) {
            addCriterion("v_per_position1 in", values, "vPerPosition1");
            return (Criteria) this;
        }

        public Criteria andVPerPosition1NotIn(List<String> values) {
            addCriterion("v_per_position1 not in", values, "vPerPosition1");
            return (Criteria) this;
        }

        public Criteria andVPerPosition1Between(String value1, String value2) {
            addCriterion("v_per_position1 between", value1, value2, "vPerPosition1");
            return (Criteria) this;
        }

        public Criteria andVPerPosition1NotBetween(String value1, String value2) {
            addCriterion("v_per_position1 not between", value1, value2, "vPerPosition1");
            return (Criteria) this;
        }

        public Criteria andVPerPosition2IsNull() {
            addCriterion("v_per_position2 is null");
            return (Criteria) this;
        }

        public Criteria andVPerPosition2IsNotNull() {
            addCriterion("v_per_position2 is not null");
            return (Criteria) this;
        }

        public Criteria andVPerPosition2EqualTo(String value) {
            addCriterion("v_per_position2 =", value, "vPerPosition2");
            return (Criteria) this;
        }

        public Criteria andVPerPosition2NotEqualTo(String value) {
            addCriterion("v_per_position2 <>", value, "vPerPosition2");
            return (Criteria) this;
        }

        public Criteria andVPerPosition2GreaterThan(String value) {
            addCriterion("v_per_position2 >", value, "vPerPosition2");
            return (Criteria) this;
        }

        public Criteria andVPerPosition2GreaterThanOrEqualTo(String value) {
            addCriterion("v_per_position2 >=", value, "vPerPosition2");
            return (Criteria) this;
        }

        public Criteria andVPerPosition2LessThan(String value) {
            addCriterion("v_per_position2 <", value, "vPerPosition2");
            return (Criteria) this;
        }

        public Criteria andVPerPosition2LessThanOrEqualTo(String value) {
            addCriterion("v_per_position2 <=", value, "vPerPosition2");
            return (Criteria) this;
        }

        public Criteria andVPerPosition2Like(String value) {
            addCriterion("v_per_position2 like", value, "vPerPosition2");
            return (Criteria) this;
        }

        public Criteria andVPerPosition2NotLike(String value) {
            addCriterion("v_per_position2 not like", value, "vPerPosition2");
            return (Criteria) this;
        }

        public Criteria andVPerPosition2In(List<String> values) {
            addCriterion("v_per_position2 in", values, "vPerPosition2");
            return (Criteria) this;
        }

        public Criteria andVPerPosition2NotIn(List<String> values) {
            addCriterion("v_per_position2 not in", values, "vPerPosition2");
            return (Criteria) this;
        }

        public Criteria andVPerPosition2Between(String value1, String value2) {
            addCriterion("v_per_position2 between", value1, value2, "vPerPosition2");
            return (Criteria) this;
        }

        public Criteria andVPerPosition2NotBetween(String value1, String value2) {
            addCriterion("v_per_position2 not between", value1, value2, "vPerPosition2");
            return (Criteria) this;
        }

        public Criteria andVPerPosition3IsNull() {
            addCriterion("v_per_position3 is null");
            return (Criteria) this;
        }

        public Criteria andVPerPosition3IsNotNull() {
            addCriterion("v_per_position3 is not null");
            return (Criteria) this;
        }

        public Criteria andVPerPosition3EqualTo(String value) {
            addCriterion("v_per_position3 =", value, "vPerPosition3");
            return (Criteria) this;
        }

        public Criteria andVPerPosition3NotEqualTo(String value) {
            addCriterion("v_per_position3 <>", value, "vPerPosition3");
            return (Criteria) this;
        }

        public Criteria andVPerPosition3GreaterThan(String value) {
            addCriterion("v_per_position3 >", value, "vPerPosition3");
            return (Criteria) this;
        }

        public Criteria andVPerPosition3GreaterThanOrEqualTo(String value) {
            addCriterion("v_per_position3 >=", value, "vPerPosition3");
            return (Criteria) this;
        }

        public Criteria andVPerPosition3LessThan(String value) {
            addCriterion("v_per_position3 <", value, "vPerPosition3");
            return (Criteria) this;
        }

        public Criteria andVPerPosition3LessThanOrEqualTo(String value) {
            addCriterion("v_per_position3 <=", value, "vPerPosition3");
            return (Criteria) this;
        }

        public Criteria andVPerPosition3Like(String value) {
            addCriterion("v_per_position3 like", value, "vPerPosition3");
            return (Criteria) this;
        }

        public Criteria andVPerPosition3NotLike(String value) {
            addCriterion("v_per_position3 not like", value, "vPerPosition3");
            return (Criteria) this;
        }

        public Criteria andVPerPosition3In(List<String> values) {
            addCriterion("v_per_position3 in", values, "vPerPosition3");
            return (Criteria) this;
        }

        public Criteria andVPerPosition3NotIn(List<String> values) {
            addCriterion("v_per_position3 not in", values, "vPerPosition3");
            return (Criteria) this;
        }

        public Criteria andVPerPosition3Between(String value1, String value2) {
            addCriterion("v_per_position3 between", value1, value2, "vPerPosition3");
            return (Criteria) this;
        }

        public Criteria andVPerPosition3NotBetween(String value1, String value2) {
            addCriterion("v_per_position3 not between", value1, value2, "vPerPosition3");
            return (Criteria) this;
        }

        public Criteria andVPerPosition4IsNull() {
            addCriterion("v_per_position4 is null");
            return (Criteria) this;
        }

        public Criteria andVPerPosition4IsNotNull() {
            addCriterion("v_per_position4 is not null");
            return (Criteria) this;
        }

        public Criteria andVPerPosition4EqualTo(String value) {
            addCriterion("v_per_position4 =", value, "vPerPosition4");
            return (Criteria) this;
        }

        public Criteria andVPerPosition4NotEqualTo(String value) {
            addCriterion("v_per_position4 <>", value, "vPerPosition4");
            return (Criteria) this;
        }

        public Criteria andVPerPosition4GreaterThan(String value) {
            addCriterion("v_per_position4 >", value, "vPerPosition4");
            return (Criteria) this;
        }

        public Criteria andVPerPosition4GreaterThanOrEqualTo(String value) {
            addCriterion("v_per_position4 >=", value, "vPerPosition4");
            return (Criteria) this;
        }

        public Criteria andVPerPosition4LessThan(String value) {
            addCriterion("v_per_position4 <", value, "vPerPosition4");
            return (Criteria) this;
        }

        public Criteria andVPerPosition4LessThanOrEqualTo(String value) {
            addCriterion("v_per_position4 <=", value, "vPerPosition4");
            return (Criteria) this;
        }

        public Criteria andVPerPosition4Like(String value) {
            addCriterion("v_per_position4 like", value, "vPerPosition4");
            return (Criteria) this;
        }

        public Criteria andVPerPosition4NotLike(String value) {
            addCriterion("v_per_position4 not like", value, "vPerPosition4");
            return (Criteria) this;
        }

        public Criteria andVPerPosition4In(List<String> values) {
            addCriterion("v_per_position4 in", values, "vPerPosition4");
            return (Criteria) this;
        }

        public Criteria andVPerPosition4NotIn(List<String> values) {
            addCriterion("v_per_position4 not in", values, "vPerPosition4");
            return (Criteria) this;
        }

        public Criteria andVPerPosition4Between(String value1, String value2) {
            addCriterion("v_per_position4 between", value1, value2, "vPerPosition4");
            return (Criteria) this;
        }

        public Criteria andVPerPosition4NotBetween(String value1, String value2) {
            addCriterion("v_per_position4 not between", value1, value2, "vPerPosition4");
            return (Criteria) this;
        }

        public Criteria andVPerPosition5IsNull() {
            addCriterion("v_per_position5 is null");
            return (Criteria) this;
        }

        public Criteria andVPerPosition5IsNotNull() {
            addCriterion("v_per_position5 is not null");
            return (Criteria) this;
        }

        public Criteria andVPerPosition5EqualTo(String value) {
            addCriterion("v_per_position5 =", value, "vPerPosition5");
            return (Criteria) this;
        }

        public Criteria andVPerPosition5NotEqualTo(String value) {
            addCriterion("v_per_position5 <>", value, "vPerPosition5");
            return (Criteria) this;
        }

        public Criteria andVPerPosition5GreaterThan(String value) {
            addCriterion("v_per_position5 >", value, "vPerPosition5");
            return (Criteria) this;
        }

        public Criteria andVPerPosition5GreaterThanOrEqualTo(String value) {
            addCriterion("v_per_position5 >=", value, "vPerPosition5");
            return (Criteria) this;
        }

        public Criteria andVPerPosition5LessThan(String value) {
            addCriterion("v_per_position5 <", value, "vPerPosition5");
            return (Criteria) this;
        }

        public Criteria andVPerPosition5LessThanOrEqualTo(String value) {
            addCriterion("v_per_position5 <=", value, "vPerPosition5");
            return (Criteria) this;
        }

        public Criteria andVPerPosition5Like(String value) {
            addCriterion("v_per_position5 like", value, "vPerPosition5");
            return (Criteria) this;
        }

        public Criteria andVPerPosition5NotLike(String value) {
            addCriterion("v_per_position5 not like", value, "vPerPosition5");
            return (Criteria) this;
        }

        public Criteria andVPerPosition5In(List<String> values) {
            addCriterion("v_per_position5 in", values, "vPerPosition5");
            return (Criteria) this;
        }

        public Criteria andVPerPosition5NotIn(List<String> values) {
            addCriterion("v_per_position5 not in", values, "vPerPosition5");
            return (Criteria) this;
        }

        public Criteria andVPerPosition5Between(String value1, String value2) {
            addCriterion("v_per_position5 between", value1, value2, "vPerPosition5");
            return (Criteria) this;
        }

        public Criteria andVPerPosition5NotBetween(String value1, String value2) {
            addCriterion("v_per_position5 not between", value1, value2, "vPerPosition5");
            return (Criteria) this;
        }

        public Criteria andVPerPosition6IsNull() {
            addCriterion("v_per_position6 is null");
            return (Criteria) this;
        }

        public Criteria andVPerPosition6IsNotNull() {
            addCriterion("v_per_position6 is not null");
            return (Criteria) this;
        }

        public Criteria andVPerPosition6EqualTo(String value) {
            addCriterion("v_per_position6 =", value, "vPerPosition6");
            return (Criteria) this;
        }

        public Criteria andVPerPosition6NotEqualTo(String value) {
            addCriterion("v_per_position6 <>", value, "vPerPosition6");
            return (Criteria) this;
        }

        public Criteria andVPerPosition6GreaterThan(String value) {
            addCriterion("v_per_position6 >", value, "vPerPosition6");
            return (Criteria) this;
        }

        public Criteria andVPerPosition6GreaterThanOrEqualTo(String value) {
            addCriterion("v_per_position6 >=", value, "vPerPosition6");
            return (Criteria) this;
        }

        public Criteria andVPerPosition6LessThan(String value) {
            addCriterion("v_per_position6 <", value, "vPerPosition6");
            return (Criteria) this;
        }

        public Criteria andVPerPosition6LessThanOrEqualTo(String value) {
            addCriterion("v_per_position6 <=", value, "vPerPosition6");
            return (Criteria) this;
        }

        public Criteria andVPerPosition6Like(String value) {
            addCriterion("v_per_position6 like", value, "vPerPosition6");
            return (Criteria) this;
        }

        public Criteria andVPerPosition6NotLike(String value) {
            addCriterion("v_per_position6 not like", value, "vPerPosition6");
            return (Criteria) this;
        }

        public Criteria andVPerPosition6In(List<String> values) {
            addCriterion("v_per_position6 in", values, "vPerPosition6");
            return (Criteria) this;
        }

        public Criteria andVPerPosition6NotIn(List<String> values) {
            addCriterion("v_per_position6 not in", values, "vPerPosition6");
            return (Criteria) this;
        }

        public Criteria andVPerPosition6Between(String value1, String value2) {
            addCriterion("v_per_position6 between", value1, value2, "vPerPosition6");
            return (Criteria) this;
        }

        public Criteria andVPerPosition6NotBetween(String value1, String value2) {
            addCriterion("v_per_position6 not between", value1, value2, "vPerPosition6");
            return (Criteria) this;
        }

        public Criteria andVSufPosition1IsNull() {
            addCriterion("v_suf_position1 is null");
            return (Criteria) this;
        }

        public Criteria andVSufPosition1IsNotNull() {
            addCriterion("v_suf_position1 is not null");
            return (Criteria) this;
        }

        public Criteria andVSufPosition1EqualTo(String value) {
            addCriterion("v_suf_position1 =", value, "vSufPosition1");
            return (Criteria) this;
        }

        public Criteria andVSufPosition1NotEqualTo(String value) {
            addCriterion("v_suf_position1 <>", value, "vSufPosition1");
            return (Criteria) this;
        }

        public Criteria andVSufPosition1GreaterThan(String value) {
            addCriterion("v_suf_position1 >", value, "vSufPosition1");
            return (Criteria) this;
        }

        public Criteria andVSufPosition1GreaterThanOrEqualTo(String value) {
            addCriterion("v_suf_position1 >=", value, "vSufPosition1");
            return (Criteria) this;
        }

        public Criteria andVSufPosition1LessThan(String value) {
            addCriterion("v_suf_position1 <", value, "vSufPosition1");
            return (Criteria) this;
        }

        public Criteria andVSufPosition1LessThanOrEqualTo(String value) {
            addCriterion("v_suf_position1 <=", value, "vSufPosition1");
            return (Criteria) this;
        }

        public Criteria andVSufPosition1Like(String value) {
            addCriterion("v_suf_position1 like", value, "vSufPosition1");
            return (Criteria) this;
        }

        public Criteria andVSufPosition1NotLike(String value) {
            addCriterion("v_suf_position1 not like", value, "vSufPosition1");
            return (Criteria) this;
        }

        public Criteria andVSufPosition1In(List<String> values) {
            addCriterion("v_suf_position1 in", values, "vSufPosition1");
            return (Criteria) this;
        }

        public Criteria andVSufPosition1NotIn(List<String> values) {
            addCriterion("v_suf_position1 not in", values, "vSufPosition1");
            return (Criteria) this;
        }

        public Criteria andVSufPosition1Between(String value1, String value2) {
            addCriterion("v_suf_position1 between", value1, value2, "vSufPosition1");
            return (Criteria) this;
        }

        public Criteria andVSufPosition1NotBetween(String value1, String value2) {
            addCriterion("v_suf_position1 not between", value1, value2, "vSufPosition1");
            return (Criteria) this;
        }

        public Criteria andDCreateDateIsNull() {
            addCriterion("d_create_date is null");
            return (Criteria) this;
        }

        public Criteria andDCreateDateIsNotNull() {
            addCriterion("d_create_date is not null");
            return (Criteria) this;
        }

        public Criteria andDCreateDateEqualTo(Date value) {
            addCriterion("d_create_date =", value, "dCreateDate");
            return (Criteria) this;
        }

        public Criteria andDCreateDateNotEqualTo(Date value) {
            addCriterion("d_create_date <>", value, "dCreateDate");
            return (Criteria) this;
        }

        public Criteria andDCreateDateGreaterThan(Date value) {
            addCriterion("d_create_date >", value, "dCreateDate");
            return (Criteria) this;
        }

        public Criteria andDCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("d_create_date >=", value, "dCreateDate");
            return (Criteria) this;
        }

        public Criteria andDCreateDateLessThan(Date value) {
            addCriterion("d_create_date <", value, "dCreateDate");
            return (Criteria) this;
        }

        public Criteria andDCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("d_create_date <=", value, "dCreateDate");
            return (Criteria) this;
        }

        public Criteria andDCreateDateIn(List<Date> values) {
            addCriterion("d_create_date in", values, "dCreateDate");
            return (Criteria) this;
        }

        public Criteria andDCreateDateNotIn(List<Date> values) {
            addCriterion("d_create_date not in", values, "dCreateDate");
            return (Criteria) this;
        }

        public Criteria andDCreateDateBetween(Date value1, Date value2) {
            addCriterion("d_create_date between", value1, value2, "dCreateDate");
            return (Criteria) this;
        }

        public Criteria andDCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("d_create_date not between", value1, value2, "dCreateDate");
            return (Criteria) this;
        }

        public Criteria andRemark1IsNull() {
            addCriterion("remark1 is null");
            return (Criteria) this;
        }

        public Criteria andRemark1IsNotNull() {
            addCriterion("remark1 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark1EqualTo(String value) {
            addCriterion("remark1 =", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotEqualTo(String value) {
            addCriterion("remark1 <>", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1GreaterThan(String value) {
            addCriterion("remark1 >", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1GreaterThanOrEqualTo(String value) {
            addCriterion("remark1 >=", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1LessThan(String value) {
            addCriterion("remark1 <", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1LessThanOrEqualTo(String value) {
            addCriterion("remark1 <=", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1Like(String value) {
            addCriterion("remark1 like", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotLike(String value) {
            addCriterion("remark1 not like", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1In(List<String> values) {
            addCriterion("remark1 in", values, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotIn(List<String> values) {
            addCriterion("remark1 not in", values, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1Between(String value1, String value2) {
            addCriterion("remark1 between", value1, value2, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotBetween(String value1, String value2) {
            addCriterion("remark1 not between", value1, value2, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark2IsNull() {
            addCriterion("remark2 is null");
            return (Criteria) this;
        }

        public Criteria andRemark2IsNotNull() {
            addCriterion("remark2 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark2EqualTo(String value) {
            addCriterion("remark2 =", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotEqualTo(String value) {
            addCriterion("remark2 <>", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2GreaterThan(String value) {
            addCriterion("remark2 >", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2GreaterThanOrEqualTo(String value) {
            addCriterion("remark2 >=", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2LessThan(String value) {
            addCriterion("remark2 <", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2LessThanOrEqualTo(String value) {
            addCriterion("remark2 <=", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2Like(String value) {
            addCriterion("remark2 like", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotLike(String value) {
            addCriterion("remark2 not like", value, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2In(List<String> values) {
            addCriterion("remark2 in", values, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotIn(List<String> values) {
            addCriterion("remark2 not in", values, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2Between(String value1, String value2) {
            addCriterion("remark2 between", value1, value2, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark2NotBetween(String value1, String value2) {
            addCriterion("remark2 not between", value1, value2, "remark2");
            return (Criteria) this;
        }

        public Criteria andRemark3IsNull() {
            addCriterion("remark3 is null");
            return (Criteria) this;
        }

        public Criteria andRemark3IsNotNull() {
            addCriterion("remark3 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark3EqualTo(String value) {
            addCriterion("remark3 =", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3NotEqualTo(String value) {
            addCriterion("remark3 <>", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3GreaterThan(String value) {
            addCriterion("remark3 >", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3GreaterThanOrEqualTo(String value) {
            addCriterion("remark3 >=", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3LessThan(String value) {
            addCriterion("remark3 <", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3LessThanOrEqualTo(String value) {
            addCriterion("remark3 <=", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3Like(String value) {
            addCriterion("remark3 like", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3NotLike(String value) {
            addCriterion("remark3 not like", value, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3In(List<String> values) {
            addCriterion("remark3 in", values, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3NotIn(List<String> values) {
            addCriterion("remark3 not in", values, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3Between(String value1, String value2) {
            addCriterion("remark3 between", value1, value2, "remark3");
            return (Criteria) this;
        }

        public Criteria andRemark3NotBetween(String value1, String value2) {
            addCriterion("remark3 not between", value1, value2, "remark3");
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