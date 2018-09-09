package com.goddice.model;

import java.util.ArrayList;
import java.util.List;

public class Sys3DStandardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Sys3DStandardExample() {
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

        public Criteria andHundredsIsNull() {
            addCriterion("hundreds is null");
            return (Criteria) this;
        }

        public Criteria andHundredsIsNotNull() {
            addCriterion("hundreds is not null");
            return (Criteria) this;
        }

        public Criteria andHundredsEqualTo(Integer value) {
            addCriterion("hundreds =", value, "hundreds");
            return (Criteria) this;
        }

        public Criteria andHundredsNotEqualTo(Integer value) {
            addCriterion("hundreds <>", value, "hundreds");
            return (Criteria) this;
        }

        public Criteria andHundredsGreaterThan(Integer value) {
            addCriterion("hundreds >", value, "hundreds");
            return (Criteria) this;
        }

        public Criteria andHundredsGreaterThanOrEqualTo(Integer value) {
            addCriterion("hundreds >=", value, "hundreds");
            return (Criteria) this;
        }

        public Criteria andHundredsLessThan(Integer value) {
            addCriterion("hundreds <", value, "hundreds");
            return (Criteria) this;
        }

        public Criteria andHundredsLessThanOrEqualTo(Integer value) {
            addCriterion("hundreds <=", value, "hundreds");
            return (Criteria) this;
        }

        public Criteria andHundredsIn(List<Integer> values) {
            addCriterion("hundreds in", values, "hundreds");
            return (Criteria) this;
        }

        public Criteria andHundredsNotIn(List<Integer> values) {
            addCriterion("hundreds not in", values, "hundreds");
            return (Criteria) this;
        }

        public Criteria andHundredsBetween(Integer value1, Integer value2) {
            addCriterion("hundreds between", value1, value2, "hundreds");
            return (Criteria) this;
        }

        public Criteria andHundredsNotBetween(Integer value1, Integer value2) {
            addCriterion("hundreds not between", value1, value2, "hundreds");
            return (Criteria) this;
        }

        public Criteria andDecadeIsNull() {
            addCriterion("decade is null");
            return (Criteria) this;
        }

        public Criteria andDecadeIsNotNull() {
            addCriterion("decade is not null");
            return (Criteria) this;
        }

        public Criteria andDecadeEqualTo(Integer value) {
            addCriterion("decade =", value, "decade");
            return (Criteria) this;
        }

        public Criteria andDecadeNotEqualTo(Integer value) {
            addCriterion("decade <>", value, "decade");
            return (Criteria) this;
        }

        public Criteria andDecadeGreaterThan(Integer value) {
            addCriterion("decade >", value, "decade");
            return (Criteria) this;
        }

        public Criteria andDecadeGreaterThanOrEqualTo(Integer value) {
            addCriterion("decade >=", value, "decade");
            return (Criteria) this;
        }

        public Criteria andDecadeLessThan(Integer value) {
            addCriterion("decade <", value, "decade");
            return (Criteria) this;
        }

        public Criteria andDecadeLessThanOrEqualTo(Integer value) {
            addCriterion("decade <=", value, "decade");
            return (Criteria) this;
        }

        public Criteria andDecadeIn(List<Integer> values) {
            addCriterion("decade in", values, "decade");
            return (Criteria) this;
        }

        public Criteria andDecadeNotIn(List<Integer> values) {
            addCriterion("decade not in", values, "decade");
            return (Criteria) this;
        }

        public Criteria andDecadeBetween(Integer value1, Integer value2) {
            addCriterion("decade between", value1, value2, "decade");
            return (Criteria) this;
        }

        public Criteria andDecadeNotBetween(Integer value1, Integer value2) {
            addCriterion("decade not between", value1, value2, "decade");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(Integer value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(Integer value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(Integer value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(Integer value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(Integer value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(Integer value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<Integer> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<Integer> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(Integer value1, Integer value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(Integer value1, Integer value2) {
            addCriterion("unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andArrangeIsNull() {
            addCriterion("arrange is null");
            return (Criteria) this;
        }

        public Criteria andArrangeIsNotNull() {
            addCriterion("arrange is not null");
            return (Criteria) this;
        }

        public Criteria andArrangeEqualTo(String value) {
            addCriterion("arrange =", value, "arrange");
            return (Criteria) this;
        }

        public Criteria andArrangeNotEqualTo(String value) {
            addCriterion("arrange <>", value, "arrange");
            return (Criteria) this;
        }

        public Criteria andArrangeGreaterThan(String value) {
            addCriterion("arrange >", value, "arrange");
            return (Criteria) this;
        }

        public Criteria andArrangeGreaterThanOrEqualTo(String value) {
            addCriterion("arrange >=", value, "arrange");
            return (Criteria) this;
        }

        public Criteria andArrangeLessThan(String value) {
            addCriterion("arrange <", value, "arrange");
            return (Criteria) this;
        }

        public Criteria andArrangeLessThanOrEqualTo(String value) {
            addCriterion("arrange <=", value, "arrange");
            return (Criteria) this;
        }

        public Criteria andArrangeLike(String value) {
            addCriterion("arrange like", value, "arrange");
            return (Criteria) this;
        }

        public Criteria andArrangeNotLike(String value) {
            addCriterion("arrange not like", value, "arrange");
            return (Criteria) this;
        }

        public Criteria andArrangeIn(List<String> values) {
            addCriterion("arrange in", values, "arrange");
            return (Criteria) this;
        }

        public Criteria andArrangeNotIn(List<String> values) {
            addCriterion("arrange not in", values, "arrange");
            return (Criteria) this;
        }

        public Criteria andArrangeBetween(String value1, String value2) {
            addCriterion("arrange between", value1, value2, "arrange");
            return (Criteria) this;
        }

        public Criteria andArrangeNotBetween(String value1, String value2) {
            addCriterion("arrange not between", value1, value2, "arrange");
            return (Criteria) this;
        }

        public Criteria andSumIsNull() {
            addCriterion("sum is null");
            return (Criteria) this;
        }

        public Criteria andSumIsNotNull() {
            addCriterion("sum is not null");
            return (Criteria) this;
        }

        public Criteria andSumEqualTo(Integer value) {
            addCriterion("sum =", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumNotEqualTo(Integer value) {
            addCriterion("sum <>", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumGreaterThan(Integer value) {
            addCriterion("sum >", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumGreaterThanOrEqualTo(Integer value) {
            addCriterion("sum >=", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumLessThan(Integer value) {
            addCriterion("sum <", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumLessThanOrEqualTo(Integer value) {
            addCriterion("sum <=", value, "sum");
            return (Criteria) this;
        }

        public Criteria andSumIn(List<Integer> values) {
            addCriterion("sum in", values, "sum");
            return (Criteria) this;
        }

        public Criteria andSumNotIn(List<Integer> values) {
            addCriterion("sum not in", values, "sum");
            return (Criteria) this;
        }

        public Criteria andSumBetween(Integer value1, Integer value2) {
            addCriterion("sum between", value1, value2, "sum");
            return (Criteria) this;
        }

        public Criteria andSumNotBetween(Integer value1, Integer value2) {
            addCriterion("sum not between", value1, value2, "sum");
            return (Criteria) this;
        }

        public Criteria andDistanceIsNull() {
            addCriterion("distance is null");
            return (Criteria) this;
        }

        public Criteria andDistanceIsNotNull() {
            addCriterion("distance is not null");
            return (Criteria) this;
        }

        public Criteria andDistanceEqualTo(Integer value) {
            addCriterion("distance =", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceNotEqualTo(Integer value) {
            addCriterion("distance <>", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceGreaterThan(Integer value) {
            addCriterion("distance >", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("distance >=", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceLessThan(Integer value) {
            addCriterion("distance <", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceLessThanOrEqualTo(Integer value) {
            addCriterion("distance <=", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceIn(List<Integer> values) {
            addCriterion("distance in", values, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceNotIn(List<Integer> values) {
            addCriterion("distance not in", values, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceBetween(Integer value1, Integer value2) {
            addCriterion("distance between", value1, value2, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceNotBetween(Integer value1, Integer value2) {
            addCriterion("distance not between", value1, value2, "distance");
            return (Criteria) this;
        }

        public Criteria andSequenceIsNull() {
            addCriterion("sequence is null");
            return (Criteria) this;
        }

        public Criteria andSequenceIsNotNull() {
            addCriterion("sequence is not null");
            return (Criteria) this;
        }

        public Criteria andSequenceEqualTo(Integer value) {
            addCriterion("sequence =", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceNotEqualTo(Integer value) {
            addCriterion("sequence <>", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceGreaterThan(Integer value) {
            addCriterion("sequence >", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceGreaterThanOrEqualTo(Integer value) {
            addCriterion("sequence >=", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceLessThan(Integer value) {
            addCriterion("sequence <", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceLessThanOrEqualTo(Integer value) {
            addCriterion("sequence <=", value, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceIn(List<Integer> values) {
            addCriterion("sequence in", values, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceNotIn(List<Integer> values) {
            addCriterion("sequence not in", values, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceBetween(Integer value1, Integer value2) {
            addCriterion("sequence between", value1, value2, "sequence");
            return (Criteria) this;
        }

        public Criteria andSequenceNotBetween(Integer value1, Integer value2) {
            addCriterion("sequence not between", value1, value2, "sequence");
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