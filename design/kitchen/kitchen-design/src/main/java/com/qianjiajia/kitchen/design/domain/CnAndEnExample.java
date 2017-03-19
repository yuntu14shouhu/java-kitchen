package com.qianjiajia.kitchen.design.domain;

import java.util.ArrayList;
import java.util.List;

public class CnAndEnExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CnAndEnExample() {
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

        public Criteria andCnAndEnIdIsNull() {
            addCriterion("CN_AND_EN_ID is null");
            return (Criteria) this;
        }

        public Criteria andCnAndEnIdIsNotNull() {
            addCriterion("CN_AND_EN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCnAndEnIdEqualTo(String value) {
            addCriterion("CN_AND_EN_ID =", value, "cnAndEnId");
            return (Criteria) this;
        }

        public Criteria andCnAndEnIdNotEqualTo(String value) {
            addCriterion("CN_AND_EN_ID <>", value, "cnAndEnId");
            return (Criteria) this;
        }

        public Criteria andCnAndEnIdGreaterThan(String value) {
            addCriterion("CN_AND_EN_ID >", value, "cnAndEnId");
            return (Criteria) this;
        }

        public Criteria andCnAndEnIdGreaterThanOrEqualTo(String value) {
            addCriterion("CN_AND_EN_ID >=", value, "cnAndEnId");
            return (Criteria) this;
        }

        public Criteria andCnAndEnIdLessThan(String value) {
            addCriterion("CN_AND_EN_ID <", value, "cnAndEnId");
            return (Criteria) this;
        }

        public Criteria andCnAndEnIdLessThanOrEqualTo(String value) {
            addCriterion("CN_AND_EN_ID <=", value, "cnAndEnId");
            return (Criteria) this;
        }

        public Criteria andCnAndEnIdLike(String value) {
            addCriterion("CN_AND_EN_ID like", value, "cnAndEnId");
            return (Criteria) this;
        }

        public Criteria andCnAndEnIdNotLike(String value) {
            addCriterion("CN_AND_EN_ID not like", value, "cnAndEnId");
            return (Criteria) this;
        }

        public Criteria andCnAndEnIdIn(List<String> values) {
            addCriterion("CN_AND_EN_ID in", values, "cnAndEnId");
            return (Criteria) this;
        }

        public Criteria andCnAndEnIdNotIn(List<String> values) {
            addCriterion("CN_AND_EN_ID not in", values, "cnAndEnId");
            return (Criteria) this;
        }

        public Criteria andCnAndEnIdBetween(String value1, String value2) {
            addCriterion("CN_AND_EN_ID between", value1, value2, "cnAndEnId");
            return (Criteria) this;
        }

        public Criteria andCnAndEnIdNotBetween(String value1, String value2) {
            addCriterion("CN_AND_EN_ID not between", value1, value2, "cnAndEnId");
            return (Criteria) this;
        }

        public Criteria andBigKeyClassEnIsNull() {
            addCriterion("BIG_KEY_CLASS_EN is null");
            return (Criteria) this;
        }

        public Criteria andBigKeyClassEnIsNotNull() {
            addCriterion("BIG_KEY_CLASS_EN is not null");
            return (Criteria) this;
        }

        public Criteria andBigKeyClassEnEqualTo(String value) {
            addCriterion("BIG_KEY_CLASS_EN =", value, "bigKeyClassEn");
            return (Criteria) this;
        }

        public Criteria andBigKeyClassEnNotEqualTo(String value) {
            addCriterion("BIG_KEY_CLASS_EN <>", value, "bigKeyClassEn");
            return (Criteria) this;
        }

        public Criteria andBigKeyClassEnGreaterThan(String value) {
            addCriterion("BIG_KEY_CLASS_EN >", value, "bigKeyClassEn");
            return (Criteria) this;
        }

        public Criteria andBigKeyClassEnGreaterThanOrEqualTo(String value) {
            addCriterion("BIG_KEY_CLASS_EN >=", value, "bigKeyClassEn");
            return (Criteria) this;
        }

        public Criteria andBigKeyClassEnLessThan(String value) {
            addCriterion("BIG_KEY_CLASS_EN <", value, "bigKeyClassEn");
            return (Criteria) this;
        }

        public Criteria andBigKeyClassEnLessThanOrEqualTo(String value) {
            addCriterion("BIG_KEY_CLASS_EN <=", value, "bigKeyClassEn");
            return (Criteria) this;
        }

        public Criteria andBigKeyClassEnLike(String value) {
            addCriterion("BIG_KEY_CLASS_EN like", value, "bigKeyClassEn");
            return (Criteria) this;
        }

        public Criteria andBigKeyClassEnNotLike(String value) {
            addCriterion("BIG_KEY_CLASS_EN not like", value, "bigKeyClassEn");
            return (Criteria) this;
        }

        public Criteria andBigKeyClassEnIn(List<String> values) {
            addCriterion("BIG_KEY_CLASS_EN in", values, "bigKeyClassEn");
            return (Criteria) this;
        }

        public Criteria andBigKeyClassEnNotIn(List<String> values) {
            addCriterion("BIG_KEY_CLASS_EN not in", values, "bigKeyClassEn");
            return (Criteria) this;
        }

        public Criteria andBigKeyClassEnBetween(String value1, String value2) {
            addCriterion("BIG_KEY_CLASS_EN between", value1, value2, "bigKeyClassEn");
            return (Criteria) this;
        }

        public Criteria andBigKeyClassEnNotBetween(String value1, String value2) {
            addCriterion("BIG_KEY_CLASS_EN not between", value1, value2, "bigKeyClassEn");
            return (Criteria) this;
        }

        public Criteria andBigKeyClassCnIsNull() {
            addCriterion("BIG_KEY_CLASS_CN is null");
            return (Criteria) this;
        }

        public Criteria andBigKeyClassCnIsNotNull() {
            addCriterion("BIG_KEY_CLASS_CN is not null");
            return (Criteria) this;
        }

        public Criteria andBigKeyClassCnEqualTo(String value) {
            addCriterion("BIG_KEY_CLASS_CN =", value, "bigKeyClassCn");
            return (Criteria) this;
        }

        public Criteria andBigKeyClassCnNotEqualTo(String value) {
            addCriterion("BIG_KEY_CLASS_CN <>", value, "bigKeyClassCn");
            return (Criteria) this;
        }

        public Criteria andBigKeyClassCnGreaterThan(String value) {
            addCriterion("BIG_KEY_CLASS_CN >", value, "bigKeyClassCn");
            return (Criteria) this;
        }

        public Criteria andBigKeyClassCnGreaterThanOrEqualTo(String value) {
            addCriterion("BIG_KEY_CLASS_CN >=", value, "bigKeyClassCn");
            return (Criteria) this;
        }

        public Criteria andBigKeyClassCnLessThan(String value) {
            addCriterion("BIG_KEY_CLASS_CN <", value, "bigKeyClassCn");
            return (Criteria) this;
        }

        public Criteria andBigKeyClassCnLessThanOrEqualTo(String value) {
            addCriterion("BIG_KEY_CLASS_CN <=", value, "bigKeyClassCn");
            return (Criteria) this;
        }

        public Criteria andBigKeyClassCnLike(String value) {
            addCriterion("BIG_KEY_CLASS_CN like", value, "bigKeyClassCn");
            return (Criteria) this;
        }

        public Criteria andBigKeyClassCnNotLike(String value) {
            addCriterion("BIG_KEY_CLASS_CN not like", value, "bigKeyClassCn");
            return (Criteria) this;
        }

        public Criteria andBigKeyClassCnIn(List<String> values) {
            addCriterion("BIG_KEY_CLASS_CN in", values, "bigKeyClassCn");
            return (Criteria) this;
        }

        public Criteria andBigKeyClassCnNotIn(List<String> values) {
            addCriterion("BIG_KEY_CLASS_CN not in", values, "bigKeyClassCn");
            return (Criteria) this;
        }

        public Criteria andBigKeyClassCnBetween(String value1, String value2) {
            addCriterion("BIG_KEY_CLASS_CN between", value1, value2, "bigKeyClassCn");
            return (Criteria) this;
        }

        public Criteria andBigKeyClassCnNotBetween(String value1, String value2) {
            addCriterion("BIG_KEY_CLASS_CN not between", value1, value2, "bigKeyClassCn");
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