package com.qianjiajia.kitchen.design.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderDetailsModifyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderDetailsModifyExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneeNameIsNull() {
            addCriterion("ORDER_CONSIGNEE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneeNameIsNotNull() {
            addCriterion("ORDER_CONSIGNEE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneeNameEqualTo(String value) {
            addCriterion("ORDER_CONSIGNEE_NAME =", value, "orderConsigneeName");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneeNameNotEqualTo(String value) {
            addCriterion("ORDER_CONSIGNEE_NAME <>", value, "orderConsigneeName");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneeNameGreaterThan(String value) {
            addCriterion("ORDER_CONSIGNEE_NAME >", value, "orderConsigneeName");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneeNameGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_CONSIGNEE_NAME >=", value, "orderConsigneeName");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneeNameLessThan(String value) {
            addCriterion("ORDER_CONSIGNEE_NAME <", value, "orderConsigneeName");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneeNameLessThanOrEqualTo(String value) {
            addCriterion("ORDER_CONSIGNEE_NAME <=", value, "orderConsigneeName");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneeNameLike(String value) {
            addCriterion("ORDER_CONSIGNEE_NAME like", value, "orderConsigneeName");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneeNameNotLike(String value) {
            addCriterion("ORDER_CONSIGNEE_NAME not like", value, "orderConsigneeName");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneeNameIn(List<String> values) {
            addCriterion("ORDER_CONSIGNEE_NAME in", values, "orderConsigneeName");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneeNameNotIn(List<String> values) {
            addCriterion("ORDER_CONSIGNEE_NAME not in", values, "orderConsigneeName");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneeNameBetween(String value1, String value2) {
            addCriterion("ORDER_CONSIGNEE_NAME between", value1, value2, "orderConsigneeName");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneeNameNotBetween(String value1, String value2) {
            addCriterion("ORDER_CONSIGNEE_NAME not between", value1, value2, "orderConsigneeName");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneePhoneIsNull() {
            addCriterion("ORDER_CONSIGNEE_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneePhoneIsNotNull() {
            addCriterion("ORDER_CONSIGNEE_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneePhoneEqualTo(String value) {
            addCriterion("ORDER_CONSIGNEE_PHONE =", value, "orderConsigneePhone");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneePhoneNotEqualTo(String value) {
            addCriterion("ORDER_CONSIGNEE_PHONE <>", value, "orderConsigneePhone");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneePhoneGreaterThan(String value) {
            addCriterion("ORDER_CONSIGNEE_PHONE >", value, "orderConsigneePhone");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_CONSIGNEE_PHONE >=", value, "orderConsigneePhone");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneePhoneLessThan(String value) {
            addCriterion("ORDER_CONSIGNEE_PHONE <", value, "orderConsigneePhone");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneePhoneLessThanOrEqualTo(String value) {
            addCriterion("ORDER_CONSIGNEE_PHONE <=", value, "orderConsigneePhone");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneePhoneLike(String value) {
            addCriterion("ORDER_CONSIGNEE_PHONE like", value, "orderConsigneePhone");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneePhoneNotLike(String value) {
            addCriterion("ORDER_CONSIGNEE_PHONE not like", value, "orderConsigneePhone");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneePhoneIn(List<String> values) {
            addCriterion("ORDER_CONSIGNEE_PHONE in", values, "orderConsigneePhone");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneePhoneNotIn(List<String> values) {
            addCriterion("ORDER_CONSIGNEE_PHONE not in", values, "orderConsigneePhone");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneePhoneBetween(String value1, String value2) {
            addCriterion("ORDER_CONSIGNEE_PHONE between", value1, value2, "orderConsigneePhone");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneePhoneNotBetween(String value1, String value2) {
            addCriterion("ORDER_CONSIGNEE_PHONE not between", value1, value2, "orderConsigneePhone");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneeAddressIsNull() {
            addCriterion("ORDER_CONSIGNEE_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneeAddressIsNotNull() {
            addCriterion("ORDER_CONSIGNEE_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneeAddressEqualTo(String value) {
            addCriterion("ORDER_CONSIGNEE_ADDRESS =", value, "orderConsigneeAddress");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneeAddressNotEqualTo(String value) {
            addCriterion("ORDER_CONSIGNEE_ADDRESS <>", value, "orderConsigneeAddress");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneeAddressGreaterThan(String value) {
            addCriterion("ORDER_CONSIGNEE_ADDRESS >", value, "orderConsigneeAddress");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneeAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_CONSIGNEE_ADDRESS >=", value, "orderConsigneeAddress");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneeAddressLessThan(String value) {
            addCriterion("ORDER_CONSIGNEE_ADDRESS <", value, "orderConsigneeAddress");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneeAddressLessThanOrEqualTo(String value) {
            addCriterion("ORDER_CONSIGNEE_ADDRESS <=", value, "orderConsigneeAddress");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneeAddressLike(String value) {
            addCriterion("ORDER_CONSIGNEE_ADDRESS like", value, "orderConsigneeAddress");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneeAddressNotLike(String value) {
            addCriterion("ORDER_CONSIGNEE_ADDRESS not like", value, "orderConsigneeAddress");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneeAddressIn(List<String> values) {
            addCriterion("ORDER_CONSIGNEE_ADDRESS in", values, "orderConsigneeAddress");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneeAddressNotIn(List<String> values) {
            addCriterion("ORDER_CONSIGNEE_ADDRESS not in", values, "orderConsigneeAddress");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneeAddressBetween(String value1, String value2) {
            addCriterion("ORDER_CONSIGNEE_ADDRESS between", value1, value2, "orderConsigneeAddress");
            return (Criteria) this;
        }

        public Criteria andOrderConsigneeAddressNotBetween(String value1, String value2) {
            addCriterion("ORDER_CONSIGNEE_ADDRESS not between", value1, value2, "orderConsigneeAddress");
            return (Criteria) this;
        }

        public Criteria andOrderCarriageIsNull() {
            addCriterion("ORDER_CARRIAGE is null");
            return (Criteria) this;
        }

        public Criteria andOrderCarriageIsNotNull() {
            addCriterion("ORDER_CARRIAGE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCarriageEqualTo(BigDecimal value) {
            addCriterion("ORDER_CARRIAGE =", value, "orderCarriage");
            return (Criteria) this;
        }

        public Criteria andOrderCarriageNotEqualTo(BigDecimal value) {
            addCriterion("ORDER_CARRIAGE <>", value, "orderCarriage");
            return (Criteria) this;
        }

        public Criteria andOrderCarriageGreaterThan(BigDecimal value) {
            addCriterion("ORDER_CARRIAGE >", value, "orderCarriage");
            return (Criteria) this;
        }

        public Criteria andOrderCarriageGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ORDER_CARRIAGE >=", value, "orderCarriage");
            return (Criteria) this;
        }

        public Criteria andOrderCarriageLessThan(BigDecimal value) {
            addCriterion("ORDER_CARRIAGE <", value, "orderCarriage");
            return (Criteria) this;
        }

        public Criteria andOrderCarriageLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ORDER_CARRIAGE <=", value, "orderCarriage");
            return (Criteria) this;
        }

        public Criteria andOrderCarriageIn(List<BigDecimal> values) {
            addCriterion("ORDER_CARRIAGE in", values, "orderCarriage");
            return (Criteria) this;
        }

        public Criteria andOrderCarriageNotIn(List<BigDecimal> values) {
            addCriterion("ORDER_CARRIAGE not in", values, "orderCarriage");
            return (Criteria) this;
        }

        public Criteria andOrderCarriageBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORDER_CARRIAGE between", value1, value2, "orderCarriage");
            return (Criteria) this;
        }

        public Criteria andOrderCarriageNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORDER_CARRIAGE not between", value1, value2, "orderCarriage");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("ORDER_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("ORDER_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(String value) {
            addCriterion("ORDER_STATUS =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(String value) {
            addCriterion("ORDER_STATUS <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(String value) {
            addCriterion("ORDER_STATUS >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_STATUS >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(String value) {
            addCriterion("ORDER_STATUS <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(String value) {
            addCriterion("ORDER_STATUS <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLike(String value) {
            addCriterion("ORDER_STATUS like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotLike(String value) {
            addCriterion("ORDER_STATUS not like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<String> values) {
            addCriterion("ORDER_STATUS in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<String> values) {
            addCriterion("ORDER_STATUS not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(String value1, String value2) {
            addCriterion("ORDER_STATUS between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(String value1, String value2) {
            addCriterion("ORDER_STATUS not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderCreateDateIsNull() {
            addCriterion("ORDER_CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andOrderCreateDateIsNotNull() {
            addCriterion("ORDER_CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCreateDateEqualTo(Date value) {
            addCriterion("ORDER_CREATE_DATE =", value, "orderCreateDate");
            return (Criteria) this;
        }

        public Criteria andOrderCreateDateNotEqualTo(Date value) {
            addCriterion("ORDER_CREATE_DATE <>", value, "orderCreateDate");
            return (Criteria) this;
        }

        public Criteria andOrderCreateDateGreaterThan(Date value) {
            addCriterion("ORDER_CREATE_DATE >", value, "orderCreateDate");
            return (Criteria) this;
        }

        public Criteria andOrderCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ORDER_CREATE_DATE >=", value, "orderCreateDate");
            return (Criteria) this;
        }

        public Criteria andOrderCreateDateLessThan(Date value) {
            addCriterion("ORDER_CREATE_DATE <", value, "orderCreateDate");
            return (Criteria) this;
        }

        public Criteria andOrderCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("ORDER_CREATE_DATE <=", value, "orderCreateDate");
            return (Criteria) this;
        }

        public Criteria andOrderCreateDateIn(List<Date> values) {
            addCriterion("ORDER_CREATE_DATE in", values, "orderCreateDate");
            return (Criteria) this;
        }

        public Criteria andOrderCreateDateNotIn(List<Date> values) {
            addCriterion("ORDER_CREATE_DATE not in", values, "orderCreateDate");
            return (Criteria) this;
        }

        public Criteria andOrderCreateDateBetween(Date value1, Date value2) {
            addCriterion("ORDER_CREATE_DATE between", value1, value2, "orderCreateDate");
            return (Criteria) this;
        }

        public Criteria andOrderCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("ORDER_CREATE_DATE not between", value1, value2, "orderCreateDate");
            return (Criteria) this;
        }

        public Criteria andOrderRefIsNull() {
            addCriterion("ORDER_REF is null");
            return (Criteria) this;
        }

        public Criteria andOrderRefIsNotNull() {
            addCriterion("ORDER_REF is not null");
            return (Criteria) this;
        }

        public Criteria andOrderRefEqualTo(String value) {
            addCriterion("ORDER_REF =", value, "orderRef");
            return (Criteria) this;
        }

        public Criteria andOrderRefNotEqualTo(String value) {
            addCriterion("ORDER_REF <>", value, "orderRef");
            return (Criteria) this;
        }

        public Criteria andOrderRefGreaterThan(String value) {
            addCriterion("ORDER_REF >", value, "orderRef");
            return (Criteria) this;
        }

        public Criteria andOrderRefGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_REF >=", value, "orderRef");
            return (Criteria) this;
        }

        public Criteria andOrderRefLessThan(String value) {
            addCriterion("ORDER_REF <", value, "orderRef");
            return (Criteria) this;
        }

        public Criteria andOrderRefLessThanOrEqualTo(String value) {
            addCriterion("ORDER_REF <=", value, "orderRef");
            return (Criteria) this;
        }

        public Criteria andOrderRefLike(String value) {
            addCriterion("ORDER_REF like", value, "orderRef");
            return (Criteria) this;
        }

        public Criteria andOrderRefNotLike(String value) {
            addCriterion("ORDER_REF not like", value, "orderRef");
            return (Criteria) this;
        }

        public Criteria andOrderRefIn(List<String> values) {
            addCriterion("ORDER_REF in", values, "orderRef");
            return (Criteria) this;
        }

        public Criteria andOrderRefNotIn(List<String> values) {
            addCriterion("ORDER_REF not in", values, "orderRef");
            return (Criteria) this;
        }

        public Criteria andOrderRefBetween(String value1, String value2) {
            addCriterion("ORDER_REF between", value1, value2, "orderRef");
            return (Criteria) this;
        }

        public Criteria andOrderRefNotBetween(String value1, String value2) {
            addCriterion("ORDER_REF not between", value1, value2, "orderRef");
            return (Criteria) this;
        }

        public Criteria andOrderActualPaymentIsNull() {
            addCriterion("ORDER_ACTUAL_PAYMENT is null");
            return (Criteria) this;
        }

        public Criteria andOrderActualPaymentIsNotNull() {
            addCriterion("ORDER_ACTUAL_PAYMENT is not null");
            return (Criteria) this;
        }

        public Criteria andOrderActualPaymentEqualTo(BigDecimal value) {
            addCriterion("ORDER_ACTUAL_PAYMENT =", value, "orderActualPayment");
            return (Criteria) this;
        }

        public Criteria andOrderActualPaymentNotEqualTo(BigDecimal value) {
            addCriterion("ORDER_ACTUAL_PAYMENT <>", value, "orderActualPayment");
            return (Criteria) this;
        }

        public Criteria andOrderActualPaymentGreaterThan(BigDecimal value) {
            addCriterion("ORDER_ACTUAL_PAYMENT >", value, "orderActualPayment");
            return (Criteria) this;
        }

        public Criteria andOrderActualPaymentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ORDER_ACTUAL_PAYMENT >=", value, "orderActualPayment");
            return (Criteria) this;
        }

        public Criteria andOrderActualPaymentLessThan(BigDecimal value) {
            addCriterion("ORDER_ACTUAL_PAYMENT <", value, "orderActualPayment");
            return (Criteria) this;
        }

        public Criteria andOrderActualPaymentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ORDER_ACTUAL_PAYMENT <=", value, "orderActualPayment");
            return (Criteria) this;
        }

        public Criteria andOrderActualPaymentIn(List<BigDecimal> values) {
            addCriterion("ORDER_ACTUAL_PAYMENT in", values, "orderActualPayment");
            return (Criteria) this;
        }

        public Criteria andOrderActualPaymentNotIn(List<BigDecimal> values) {
            addCriterion("ORDER_ACTUAL_PAYMENT not in", values, "orderActualPayment");
            return (Criteria) this;
        }

        public Criteria andOrderActualPaymentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORDER_ACTUAL_PAYMENT between", value1, value2, "orderActualPayment");
            return (Criteria) this;
        }

        public Criteria andOrderActualPaymentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORDER_ACTUAL_PAYMENT not between", value1, value2, "orderActualPayment");
            return (Criteria) this;
        }

        public Criteria andOrderTotalPaymentIsNull() {
            addCriterion("ORDER_TOTAL_PAYMENT is null");
            return (Criteria) this;
        }

        public Criteria andOrderTotalPaymentIsNotNull() {
            addCriterion("ORDER_TOTAL_PAYMENT is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTotalPaymentEqualTo(BigDecimal value) {
            addCriterion("ORDER_TOTAL_PAYMENT =", value, "orderTotalPayment");
            return (Criteria) this;
        }

        public Criteria andOrderTotalPaymentNotEqualTo(BigDecimal value) {
            addCriterion("ORDER_TOTAL_PAYMENT <>", value, "orderTotalPayment");
            return (Criteria) this;
        }

        public Criteria andOrderTotalPaymentGreaterThan(BigDecimal value) {
            addCriterion("ORDER_TOTAL_PAYMENT >", value, "orderTotalPayment");
            return (Criteria) this;
        }

        public Criteria andOrderTotalPaymentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ORDER_TOTAL_PAYMENT >=", value, "orderTotalPayment");
            return (Criteria) this;
        }

        public Criteria andOrderTotalPaymentLessThan(BigDecimal value) {
            addCriterion("ORDER_TOTAL_PAYMENT <", value, "orderTotalPayment");
            return (Criteria) this;
        }

        public Criteria andOrderTotalPaymentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ORDER_TOTAL_PAYMENT <=", value, "orderTotalPayment");
            return (Criteria) this;
        }

        public Criteria andOrderTotalPaymentIn(List<BigDecimal> values) {
            addCriterion("ORDER_TOTAL_PAYMENT in", values, "orderTotalPayment");
            return (Criteria) this;
        }

        public Criteria andOrderTotalPaymentNotIn(List<BigDecimal> values) {
            addCriterion("ORDER_TOTAL_PAYMENT not in", values, "orderTotalPayment");
            return (Criteria) this;
        }

        public Criteria andOrderTotalPaymentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORDER_TOTAL_PAYMENT between", value1, value2, "orderTotalPayment");
            return (Criteria) this;
        }

        public Criteria andOrderTotalPaymentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORDER_TOTAL_PAYMENT not between", value1, value2, "orderTotalPayment");
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