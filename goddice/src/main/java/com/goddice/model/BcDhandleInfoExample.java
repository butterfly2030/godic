package com.goddice.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BcDhandleInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BcDhandleInfoExample() {
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

        public Criteria andDhandlerTidIsNull() {
            addCriterion("dhandler_tid is null");
            return (Criteria) this;
        }

        public Criteria andDhandlerTidIsNotNull() {
            addCriterion("dhandler_tid is not null");
            return (Criteria) this;
        }

        public Criteria andDhandlerTidEqualTo(String value) {
            addCriterion("dhandler_tid =", value, "dhandlerTid");
            return (Criteria) this;
        }

        public Criteria andDhandlerTidNotEqualTo(String value) {
            addCriterion("dhandler_tid <>", value, "dhandlerTid");
            return (Criteria) this;
        }

        public Criteria andDhandlerTidGreaterThan(String value) {
            addCriterion("dhandler_tid >", value, "dhandlerTid");
            return (Criteria) this;
        }

        public Criteria andDhandlerTidGreaterThanOrEqualTo(String value) {
            addCriterion("dhandler_tid >=", value, "dhandlerTid");
            return (Criteria) this;
        }

        public Criteria andDhandlerTidLessThan(String value) {
            addCriterion("dhandler_tid <", value, "dhandlerTid");
            return (Criteria) this;
        }

        public Criteria andDhandlerTidLessThanOrEqualTo(String value) {
            addCriterion("dhandler_tid <=", value, "dhandlerTid");
            return (Criteria) this;
        }

        public Criteria andDhandlerTidLike(String value) {
            addCriterion("dhandler_tid like", value, "dhandlerTid");
            return (Criteria) this;
        }

        public Criteria andDhandlerTidNotLike(String value) {
            addCriterion("dhandler_tid not like", value, "dhandlerTid");
            return (Criteria) this;
        }

        public Criteria andDhandlerTidIn(List<String> values) {
            addCriterion("dhandler_tid in", values, "dhandlerTid");
            return (Criteria) this;
        }

        public Criteria andDhandlerTidNotIn(List<String> values) {
            addCriterion("dhandler_tid not in", values, "dhandlerTid");
            return (Criteria) this;
        }

        public Criteria andDhandlerTidBetween(String value1, String value2) {
            addCriterion("dhandler_tid between", value1, value2, "dhandlerTid");
            return (Criteria) this;
        }

        public Criteria andDhandlerTidNotBetween(String value1, String value2) {
            addCriterion("dhandler_tid not between", value1, value2, "dhandlerTid");
            return (Criteria) this;
        }

        public Criteria andJackpotIsNull() {
            addCriterion("jackpot is null");
            return (Criteria) this;
        }

        public Criteria andJackpotIsNotNull() {
            addCriterion("jackpot is not null");
            return (Criteria) this;
        }

        public Criteria andJackpotEqualTo(BigDecimal value) {
            addCriterion("jackpot =", value, "jackpot");
            return (Criteria) this;
        }

        public Criteria andJackpotNotEqualTo(BigDecimal value) {
            addCriterion("jackpot <>", value, "jackpot");
            return (Criteria) this;
        }

        public Criteria andJackpotGreaterThan(BigDecimal value) {
            addCriterion("jackpot >", value, "jackpot");
            return (Criteria) this;
        }

        public Criteria andJackpotGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("jackpot >=", value, "jackpot");
            return (Criteria) this;
        }

        public Criteria andJackpotLessThan(BigDecimal value) {
            addCriterion("jackpot <", value, "jackpot");
            return (Criteria) this;
        }

        public Criteria andJackpotLessThanOrEqualTo(BigDecimal value) {
            addCriterion("jackpot <=", value, "jackpot");
            return (Criteria) this;
        }

        public Criteria andJackpotIn(List<BigDecimal> values) {
            addCriterion("jackpot in", values, "jackpot");
            return (Criteria) this;
        }

        public Criteria andJackpotNotIn(List<BigDecimal> values) {
            addCriterion("jackpot not in", values, "jackpot");
            return (Criteria) this;
        }

        public Criteria andJackpotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("jackpot between", value1, value2, "jackpot");
            return (Criteria) this;
        }

        public Criteria andJackpotNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("jackpot not between", value1, value2, "jackpot");
            return (Criteria) this;
        }

        public Criteria andFirstPrizeNoteIsNull() {
            addCriterion("first_prize_note is null");
            return (Criteria) this;
        }

        public Criteria andFirstPrizeNoteIsNotNull() {
            addCriterion("first_prize_note is not null");
            return (Criteria) this;
        }

        public Criteria andFirstPrizeNoteEqualTo(Long value) {
            addCriterion("first_prize_note =", value, "firstPrizeNote");
            return (Criteria) this;
        }

        public Criteria andFirstPrizeNoteNotEqualTo(Long value) {
            addCriterion("first_prize_note <>", value, "firstPrizeNote");
            return (Criteria) this;
        }

        public Criteria andFirstPrizeNoteGreaterThan(Long value) {
            addCriterion("first_prize_note >", value, "firstPrizeNote");
            return (Criteria) this;
        }

        public Criteria andFirstPrizeNoteGreaterThanOrEqualTo(Long value) {
            addCriterion("first_prize_note >=", value, "firstPrizeNote");
            return (Criteria) this;
        }

        public Criteria andFirstPrizeNoteLessThan(Long value) {
            addCriterion("first_prize_note <", value, "firstPrizeNote");
            return (Criteria) this;
        }

        public Criteria andFirstPrizeNoteLessThanOrEqualTo(Long value) {
            addCriterion("first_prize_note <=", value, "firstPrizeNote");
            return (Criteria) this;
        }

        public Criteria andFirstPrizeNoteIn(List<Long> values) {
            addCriterion("first_prize_note in", values, "firstPrizeNote");
            return (Criteria) this;
        }

        public Criteria andFirstPrizeNoteNotIn(List<Long> values) {
            addCriterion("first_prize_note not in", values, "firstPrizeNote");
            return (Criteria) this;
        }

        public Criteria andFirstPrizeNoteBetween(Long value1, Long value2) {
            addCriterion("first_prize_note between", value1, value2, "firstPrizeNote");
            return (Criteria) this;
        }

        public Criteria andFirstPrizeNoteNotBetween(Long value1, Long value2) {
            addCriterion("first_prize_note not between", value1, value2, "firstPrizeNote");
            return (Criteria) this;
        }

        public Criteria andSecondPrizeNoteIsNull() {
            addCriterion("second_prize_note is null");
            return (Criteria) this;
        }

        public Criteria andSecondPrizeNoteIsNotNull() {
            addCriterion("second_prize_note is not null");
            return (Criteria) this;
        }

        public Criteria andSecondPrizeNoteEqualTo(Long value) {
            addCriterion("second_prize_note =", value, "secondPrizeNote");
            return (Criteria) this;
        }

        public Criteria andSecondPrizeNoteNotEqualTo(Long value) {
            addCriterion("second_prize_note <>", value, "secondPrizeNote");
            return (Criteria) this;
        }

        public Criteria andSecondPrizeNoteGreaterThan(Long value) {
            addCriterion("second_prize_note >", value, "secondPrizeNote");
            return (Criteria) this;
        }

        public Criteria andSecondPrizeNoteGreaterThanOrEqualTo(Long value) {
            addCriterion("second_prize_note >=", value, "secondPrizeNote");
            return (Criteria) this;
        }

        public Criteria andSecondPrizeNoteLessThan(Long value) {
            addCriterion("second_prize_note <", value, "secondPrizeNote");
            return (Criteria) this;
        }

        public Criteria andSecondPrizeNoteLessThanOrEqualTo(Long value) {
            addCriterion("second_prize_note <=", value, "secondPrizeNote");
            return (Criteria) this;
        }

        public Criteria andSecondPrizeNoteIn(List<Long> values) {
            addCriterion("second_prize_note in", values, "secondPrizeNote");
            return (Criteria) this;
        }

        public Criteria andSecondPrizeNoteNotIn(List<Long> values) {
            addCriterion("second_prize_note not in", values, "secondPrizeNote");
            return (Criteria) this;
        }

        public Criteria andSecondPrizeNoteBetween(Long value1, Long value2) {
            addCriterion("second_prize_note between", value1, value2, "secondPrizeNote");
            return (Criteria) this;
        }

        public Criteria andSecondPrizeNoteNotBetween(Long value1, Long value2) {
            addCriterion("second_prize_note not between", value1, value2, "secondPrizeNote");
            return (Criteria) this;
        }

        public Criteria andThirdPrizeNoteIsNull() {
            addCriterion("third_prize_note is null");
            return (Criteria) this;
        }

        public Criteria andThirdPrizeNoteIsNotNull() {
            addCriterion("third_prize_note is not null");
            return (Criteria) this;
        }

        public Criteria andThirdPrizeNoteEqualTo(Long value) {
            addCriterion("third_prize_note =", value, "thirdPrizeNote");
            return (Criteria) this;
        }

        public Criteria andThirdPrizeNoteNotEqualTo(Long value) {
            addCriterion("third_prize_note <>", value, "thirdPrizeNote");
            return (Criteria) this;
        }

        public Criteria andThirdPrizeNoteGreaterThan(Long value) {
            addCriterion("third_prize_note >", value, "thirdPrizeNote");
            return (Criteria) this;
        }

        public Criteria andThirdPrizeNoteGreaterThanOrEqualTo(Long value) {
            addCriterion("third_prize_note >=", value, "thirdPrizeNote");
            return (Criteria) this;
        }

        public Criteria andThirdPrizeNoteLessThan(Long value) {
            addCriterion("third_prize_note <", value, "thirdPrizeNote");
            return (Criteria) this;
        }

        public Criteria andThirdPrizeNoteLessThanOrEqualTo(Long value) {
            addCriterion("third_prize_note <=", value, "thirdPrizeNote");
            return (Criteria) this;
        }

        public Criteria andThirdPrizeNoteIn(List<Long> values) {
            addCriterion("third_prize_note in", values, "thirdPrizeNote");
            return (Criteria) this;
        }

        public Criteria andThirdPrizeNoteNotIn(List<Long> values) {
            addCriterion("third_prize_note not in", values, "thirdPrizeNote");
            return (Criteria) this;
        }

        public Criteria andThirdPrizeNoteBetween(Long value1, Long value2) {
            addCriterion("third_prize_note between", value1, value2, "thirdPrizeNote");
            return (Criteria) this;
        }

        public Criteria andThirdPrizeNoteNotBetween(Long value1, Long value2) {
            addCriterion("third_prize_note not between", value1, value2, "thirdPrizeNote");
            return (Criteria) this;
        }

        public Criteria andFourPrizeNoteIsNull() {
            addCriterion("four_prize_note is null");
            return (Criteria) this;
        }

        public Criteria andFourPrizeNoteIsNotNull() {
            addCriterion("four_prize_note is not null");
            return (Criteria) this;
        }

        public Criteria andFourPrizeNoteEqualTo(Long value) {
            addCriterion("four_prize_note =", value, "fourPrizeNote");
            return (Criteria) this;
        }

        public Criteria andFourPrizeNoteNotEqualTo(Long value) {
            addCriterion("four_prize_note <>", value, "fourPrizeNote");
            return (Criteria) this;
        }

        public Criteria andFourPrizeNoteGreaterThan(Long value) {
            addCriterion("four_prize_note >", value, "fourPrizeNote");
            return (Criteria) this;
        }

        public Criteria andFourPrizeNoteGreaterThanOrEqualTo(Long value) {
            addCriterion("four_prize_note >=", value, "fourPrizeNote");
            return (Criteria) this;
        }

        public Criteria andFourPrizeNoteLessThan(Long value) {
            addCriterion("four_prize_note <", value, "fourPrizeNote");
            return (Criteria) this;
        }

        public Criteria andFourPrizeNoteLessThanOrEqualTo(Long value) {
            addCriterion("four_prize_note <=", value, "fourPrizeNote");
            return (Criteria) this;
        }

        public Criteria andFourPrizeNoteIn(List<Long> values) {
            addCriterion("four_prize_note in", values, "fourPrizeNote");
            return (Criteria) this;
        }

        public Criteria andFourPrizeNoteNotIn(List<Long> values) {
            addCriterion("four_prize_note not in", values, "fourPrizeNote");
            return (Criteria) this;
        }

        public Criteria andFourPrizeNoteBetween(Long value1, Long value2) {
            addCriterion("four_prize_note between", value1, value2, "fourPrizeNote");
            return (Criteria) this;
        }

        public Criteria andFourPrizeNoteNotBetween(Long value1, Long value2) {
            addCriterion("four_prize_note not between", value1, value2, "fourPrizeNote");
            return (Criteria) this;
        }

        public Criteria andFivePrizeNoteIsNull() {
            addCriterion("five_prize_note is null");
            return (Criteria) this;
        }

        public Criteria andFivePrizeNoteIsNotNull() {
            addCriterion("five_prize_note is not null");
            return (Criteria) this;
        }

        public Criteria andFivePrizeNoteEqualTo(Long value) {
            addCriterion("five_prize_note =", value, "fivePrizeNote");
            return (Criteria) this;
        }

        public Criteria andFivePrizeNoteNotEqualTo(Long value) {
            addCriterion("five_prize_note <>", value, "fivePrizeNote");
            return (Criteria) this;
        }

        public Criteria andFivePrizeNoteGreaterThan(Long value) {
            addCriterion("five_prize_note >", value, "fivePrizeNote");
            return (Criteria) this;
        }

        public Criteria andFivePrizeNoteGreaterThanOrEqualTo(Long value) {
            addCriterion("five_prize_note >=", value, "fivePrizeNote");
            return (Criteria) this;
        }

        public Criteria andFivePrizeNoteLessThan(Long value) {
            addCriterion("five_prize_note <", value, "fivePrizeNote");
            return (Criteria) this;
        }

        public Criteria andFivePrizeNoteLessThanOrEqualTo(Long value) {
            addCriterion("five_prize_note <=", value, "fivePrizeNote");
            return (Criteria) this;
        }

        public Criteria andFivePrizeNoteIn(List<Long> values) {
            addCriterion("five_prize_note in", values, "fivePrizeNote");
            return (Criteria) this;
        }

        public Criteria andFivePrizeNoteNotIn(List<Long> values) {
            addCriterion("five_prize_note not in", values, "fivePrizeNote");
            return (Criteria) this;
        }

        public Criteria andFivePrizeNoteBetween(Long value1, Long value2) {
            addCriterion("five_prize_note between", value1, value2, "fivePrizeNote");
            return (Criteria) this;
        }

        public Criteria andFivePrizeNoteNotBetween(Long value1, Long value2) {
            addCriterion("five_prize_note not between", value1, value2, "fivePrizeNote");
            return (Criteria) this;
        }

        public Criteria andSixPrizeNoteIsNull() {
            addCriterion("six_prize_note is null");
            return (Criteria) this;
        }

        public Criteria andSixPrizeNoteIsNotNull() {
            addCriterion("six_prize_note is not null");
            return (Criteria) this;
        }

        public Criteria andSixPrizeNoteEqualTo(Long value) {
            addCriterion("six_prize_note =", value, "sixPrizeNote");
            return (Criteria) this;
        }

        public Criteria andSixPrizeNoteNotEqualTo(Long value) {
            addCriterion("six_prize_note <>", value, "sixPrizeNote");
            return (Criteria) this;
        }

        public Criteria andSixPrizeNoteGreaterThan(Long value) {
            addCriterion("six_prize_note >", value, "sixPrizeNote");
            return (Criteria) this;
        }

        public Criteria andSixPrizeNoteGreaterThanOrEqualTo(Long value) {
            addCriterion("six_prize_note >=", value, "sixPrizeNote");
            return (Criteria) this;
        }

        public Criteria andSixPrizeNoteLessThan(Long value) {
            addCriterion("six_prize_note <", value, "sixPrizeNote");
            return (Criteria) this;
        }

        public Criteria andSixPrizeNoteLessThanOrEqualTo(Long value) {
            addCriterion("six_prize_note <=", value, "sixPrizeNote");
            return (Criteria) this;
        }

        public Criteria andSixPrizeNoteIn(List<Long> values) {
            addCriterion("six_prize_note in", values, "sixPrizeNote");
            return (Criteria) this;
        }

        public Criteria andSixPrizeNoteNotIn(List<Long> values) {
            addCriterion("six_prize_note not in", values, "sixPrizeNote");
            return (Criteria) this;
        }

        public Criteria andSixPrizeNoteBetween(Long value1, Long value2) {
            addCriterion("six_prize_note between", value1, value2, "sixPrizeNote");
            return (Criteria) this;
        }

        public Criteria andSixPrizeNoteNotBetween(Long value1, Long value2) {
            addCriterion("six_prize_note not between", value1, value2, "sixPrizeNote");
            return (Criteria) this;
        }

        public Criteria andBettingAmountIsNull() {
            addCriterion("Betting_amount is null");
            return (Criteria) this;
        }

        public Criteria andBettingAmountIsNotNull() {
            addCriterion("Betting_amount is not null");
            return (Criteria) this;
        }

        public Criteria andBettingAmountEqualTo(Long value) {
            addCriterion("Betting_amount =", value, "bettingAmount");
            return (Criteria) this;
        }

        public Criteria andBettingAmountNotEqualTo(Long value) {
            addCriterion("Betting_amount <>", value, "bettingAmount");
            return (Criteria) this;
        }

        public Criteria andBettingAmountGreaterThan(Long value) {
            addCriterion("Betting_amount >", value, "bettingAmount");
            return (Criteria) this;
        }

        public Criteria andBettingAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("Betting_amount >=", value, "bettingAmount");
            return (Criteria) this;
        }

        public Criteria andBettingAmountLessThan(Long value) {
            addCriterion("Betting_amount <", value, "bettingAmount");
            return (Criteria) this;
        }

        public Criteria andBettingAmountLessThanOrEqualTo(Long value) {
            addCriterion("Betting_amount <=", value, "bettingAmount");
            return (Criteria) this;
        }

        public Criteria andBettingAmountIn(List<Long> values) {
            addCriterion("Betting_amount in", values, "bettingAmount");
            return (Criteria) this;
        }

        public Criteria andBettingAmountNotIn(List<Long> values) {
            addCriterion("Betting_amount not in", values, "bettingAmount");
            return (Criteria) this;
        }

        public Criteria andBettingAmountBetween(Long value1, Long value2) {
            addCriterion("Betting_amount between", value1, value2, "bettingAmount");
            return (Criteria) this;
        }

        public Criteria andBettingAmountNotBetween(Long value1, Long value2) {
            addCriterion("Betting_amount not between", value1, value2, "bettingAmount");
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