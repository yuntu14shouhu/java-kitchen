package com.qianjiajia.kitchen.design.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OrderDetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderDetailsExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("ORDER_ID =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("ORDER_ID <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("ORDER_ID >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_ID >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("ORDER_ID <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("ORDER_ID <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("ORDER_ID like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("ORDER_ID not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("ORDER_ID in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("ORDER_ID not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("ORDER_ID between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("ORDER_ID not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderProductNameIsNull() {
            addCriterion("ORDER_PRODUCT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andOrderProductNameIsNotNull() {
            addCriterion("ORDER_PRODUCT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andOrderProductNameEqualTo(String value) {
            addCriterion("ORDER_PRODUCT_NAME =", value, "orderProductName");
            return (Criteria) this;
        }

        public Criteria andOrderProductNameNotEqualTo(String value) {
            addCriterion("ORDER_PRODUCT_NAME <>", value, "orderProductName");
            return (Criteria) this;
        }

        public Criteria andOrderProductNameGreaterThan(String value) {
            addCriterion("ORDER_PRODUCT_NAME >", value, "orderProductName");
            return (Criteria) this;
        }

        public Criteria andOrderProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_PRODUCT_NAME >=", value, "orderProductName");
            return (Criteria) this;
        }

        public Criteria andOrderProductNameLessThan(String value) {
            addCriterion("ORDER_PRODUCT_NAME <", value, "orderProductName");
            return (Criteria) this;
        }

        public Criteria andOrderProductNameLessThanOrEqualTo(String value) {
            addCriterion("ORDER_PRODUCT_NAME <=", value, "orderProductName");
            return (Criteria) this;
        }

        public Criteria andOrderProductNameLike(String value) {
            addCriterion("ORDER_PRODUCT_NAME like", value, "orderProductName");
            return (Criteria) this;
        }

        public Criteria andOrderProductNameNotLike(String value) {
            addCriterion("ORDER_PRODUCT_NAME not like", value, "orderProductName");
            return (Criteria) this;
        }

        public Criteria andOrderProductNameIn(List<String> values) {
            addCriterion("ORDER_PRODUCT_NAME in", values, "orderProductName");
            return (Criteria) this;
        }

        public Criteria andOrderProductNameNotIn(List<String> values) {
            addCriterion("ORDER_PRODUCT_NAME not in", values, "orderProductName");
            return (Criteria) this;
        }

        public Criteria andOrderProductNameBetween(String value1, String value2) {
            addCriterion("ORDER_PRODUCT_NAME between", value1, value2, "orderProductName");
            return (Criteria) this;
        }

        public Criteria andOrderProductNameNotBetween(String value1, String value2) {
            addCriterion("ORDER_PRODUCT_NAME not between", value1, value2, "orderProductName");
            return (Criteria) this;
        }

        public Criteria andOrderProductImageUrlIsNull() {
            addCriterion("ORDER_PRODUCT_IMAGE_URL is null");
            return (Criteria) this;
        }

        public Criteria andOrderProductImageUrlIsNotNull() {
            addCriterion("ORDER_PRODUCT_IMAGE_URL is not null");
            return (Criteria) this;
        }

        public Criteria andOrderProductImageUrlEqualTo(String value) {
            addCriterion("ORDER_PRODUCT_IMAGE_URL =", value, "orderProductImageUrl");
            return (Criteria) this;
        }

        public Criteria andOrderProductImageUrlNotEqualTo(String value) {
            addCriterion("ORDER_PRODUCT_IMAGE_URL <>", value, "orderProductImageUrl");
            return (Criteria) this;
        }

        public Criteria andOrderProductImageUrlGreaterThan(String value) {
            addCriterion("ORDER_PRODUCT_IMAGE_URL >", value, "orderProductImageUrl");
            return (Criteria) this;
        }

        public Criteria andOrderProductImageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_PRODUCT_IMAGE_URL >=", value, "orderProductImageUrl");
            return (Criteria) this;
        }

        public Criteria andOrderProductImageUrlLessThan(String value) {
            addCriterion("ORDER_PRODUCT_IMAGE_URL <", value, "orderProductImageUrl");
            return (Criteria) this;
        }

        public Criteria andOrderProductImageUrlLessThanOrEqualTo(String value) {
            addCriterion("ORDER_PRODUCT_IMAGE_URL <=", value, "orderProductImageUrl");
            return (Criteria) this;
        }

        public Criteria andOrderProductImageUrlLike(String value) {
            addCriterion("ORDER_PRODUCT_IMAGE_URL like", value, "orderProductImageUrl");
            return (Criteria) this;
        }

        public Criteria andOrderProductImageUrlNotLike(String value) {
            addCriterion("ORDER_PRODUCT_IMAGE_URL not like", value, "orderProductImageUrl");
            return (Criteria) this;
        }

        public Criteria andOrderProductImageUrlIn(List<String> values) {
            addCriterion("ORDER_PRODUCT_IMAGE_URL in", values, "orderProductImageUrl");
            return (Criteria) this;
        }

        public Criteria andOrderProductImageUrlNotIn(List<String> values) {
            addCriterion("ORDER_PRODUCT_IMAGE_URL not in", values, "orderProductImageUrl");
            return (Criteria) this;
        }

        public Criteria andOrderProductImageUrlBetween(String value1, String value2) {
            addCriterion("ORDER_PRODUCT_IMAGE_URL between", value1, value2, "orderProductImageUrl");
            return (Criteria) this;
        }

        public Criteria andOrderProductImageUrlNotBetween(String value1, String value2) {
            addCriterion("ORDER_PRODUCT_IMAGE_URL not between", value1, value2, "orderProductImageUrl");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIsNull() {
            addCriterion("ORDER_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIsNotNull() {
            addCriterion("ORDER_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPriceEqualTo(BigDecimal value) {
            addCriterion("ORDER_PRICE =", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotEqualTo(BigDecimal value) {
            addCriterion("ORDER_PRICE <>", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceGreaterThan(BigDecimal value) {
            addCriterion("ORDER_PRICE >", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ORDER_PRICE >=", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceLessThan(BigDecimal value) {
            addCriterion("ORDER_PRICE <", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ORDER_PRICE <=", value, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceIn(List<BigDecimal> values) {
            addCriterion("ORDER_PRICE in", values, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotIn(List<BigDecimal> values) {
            addCriterion("ORDER_PRICE not in", values, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORDER_PRICE between", value1, value2, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORDER_PRICE not between", value1, value2, "orderPrice");
            return (Criteria) this;
        }

        public Criteria andOrderProductNumberIsNull() {
            addCriterion("ORDER_PRODUCT_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andOrderProductNumberIsNotNull() {
            addCriterion("ORDER_PRODUCT_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andOrderProductNumberEqualTo(Short value) {
            addCriterion("ORDER_PRODUCT_NUMBER =", value, "orderProductNumber");
            return (Criteria) this;
        }

        public Criteria andOrderProductNumberNotEqualTo(Short value) {
            addCriterion("ORDER_PRODUCT_NUMBER <>", value, "orderProductNumber");
            return (Criteria) this;
        }

        public Criteria andOrderProductNumberGreaterThan(Short value) {
            addCriterion("ORDER_PRODUCT_NUMBER >", value, "orderProductNumber");
            return (Criteria) this;
        }

        public Criteria andOrderProductNumberGreaterThanOrEqualTo(Short value) {
            addCriterion("ORDER_PRODUCT_NUMBER >=", value, "orderProductNumber");
            return (Criteria) this;
        }

        public Criteria andOrderProductNumberLessThan(Short value) {
            addCriterion("ORDER_PRODUCT_NUMBER <", value, "orderProductNumber");
            return (Criteria) this;
        }

        public Criteria andOrderProductNumberLessThanOrEqualTo(Short value) {
            addCriterion("ORDER_PRODUCT_NUMBER <=", value, "orderProductNumber");
            return (Criteria) this;
        }

        public Criteria andOrderProductNumberIn(List<Short> values) {
            addCriterion("ORDER_PRODUCT_NUMBER in", values, "orderProductNumber");
            return (Criteria) this;
        }

        public Criteria andOrderProductNumberNotIn(List<Short> values) {
            addCriterion("ORDER_PRODUCT_NUMBER not in", values, "orderProductNumber");
            return (Criteria) this;
        }

        public Criteria andOrderProductNumberBetween(Short value1, Short value2) {
            addCriterion("ORDER_PRODUCT_NUMBER between", value1, value2, "orderProductNumber");
            return (Criteria) this;
        }

        public Criteria andOrderProductNumberNotBetween(Short value1, Short value2) {
            addCriterion("ORDER_PRODUCT_NUMBER not between", value1, value2, "orderProductNumber");
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