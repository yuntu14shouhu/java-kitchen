package com.qianjiajia.kitchen.design.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SearchQueryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SearchQueryExample() {
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

        public Criteria andSearchTypeIsNull() {
            addCriterion("SEARCH_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSearchTypeIsNotNull() {
            addCriterion("SEARCH_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSearchTypeEqualTo(Integer value) {
            addCriterion("SEARCH_TYPE =", value, "searchType");
            return (Criteria) this;
        }

        public Criteria andSearchTypeNotEqualTo(Integer value) {
            addCriterion("SEARCH_TYPE <>", value, "searchType");
            return (Criteria) this;
        }

        public Criteria andSearchTypeGreaterThan(Integer value) {
            addCriterion("SEARCH_TYPE >", value, "searchType");
            return (Criteria) this;
        }

        public Criteria andSearchTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("SEARCH_TYPE >=", value, "searchType");
            return (Criteria) this;
        }

        public Criteria andSearchTypeLessThan(Integer value) {
            addCriterion("SEARCH_TYPE <", value, "searchType");
            return (Criteria) this;
        }

        public Criteria andSearchTypeLessThanOrEqualTo(Integer value) {
            addCriterion("SEARCH_TYPE <=", value, "searchType");
            return (Criteria) this;
        }

        public Criteria andSearchTypeIn(List<Integer> values) {
            addCriterion("SEARCH_TYPE in", values, "searchType");
            return (Criteria) this;
        }

        public Criteria andSearchTypeNotIn(List<Integer> values) {
            addCriterion("SEARCH_TYPE not in", values, "searchType");
            return (Criteria) this;
        }

        public Criteria andSearchTypeBetween(Integer value1, Integer value2) {
            addCriterion("SEARCH_TYPE between", value1, value2, "searchType");
            return (Criteria) this;
        }

        public Criteria andSearchTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("SEARCH_TYPE not between", value1, value2, "searchType");
            return (Criteria) this;
        }

        public Criteria andSearchContentIsNull() {
            addCriterion("SEARCH_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andSearchContentIsNotNull() {
            addCriterion("SEARCH_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andSearchContentEqualTo(String value) {
            addCriterion("SEARCH_CONTENT =", value, "searchContent");
            return (Criteria) this;
        }

        public Criteria andSearchContentNotEqualTo(String value) {
            addCriterion("SEARCH_CONTENT <>", value, "searchContent");
            return (Criteria) this;
        }

        public Criteria andSearchContentGreaterThan(String value) {
            addCriterion("SEARCH_CONTENT >", value, "searchContent");
            return (Criteria) this;
        }

        public Criteria andSearchContentGreaterThanOrEqualTo(String value) {
            addCriterion("SEARCH_CONTENT >=", value, "searchContent");
            return (Criteria) this;
        }

        public Criteria andSearchContentLessThan(String value) {
            addCriterion("SEARCH_CONTENT <", value, "searchContent");
            return (Criteria) this;
        }

        public Criteria andSearchContentLessThanOrEqualTo(String value) {
            addCriterion("SEARCH_CONTENT <=", value, "searchContent");
            return (Criteria) this;
        }

        public Criteria andSearchContentLike(String value) {
            addCriterion("SEARCH_CONTENT like", value, "searchContent");
            return (Criteria) this;
        }

        public Criteria andSearchContentNotLike(String value) {
            addCriterion("SEARCH_CONTENT not like", value, "searchContent");
            return (Criteria) this;
        }

        public Criteria andSearchContentIn(List<String> values) {
            addCriterion("SEARCH_CONTENT in", values, "searchContent");
            return (Criteria) this;
        }

        public Criteria andSearchContentNotIn(List<String> values) {
            addCriterion("SEARCH_CONTENT not in", values, "searchContent");
            return (Criteria) this;
        }

        public Criteria andSearchContentBetween(String value1, String value2) {
            addCriterion("SEARCH_CONTENT between", value1, value2, "searchContent");
            return (Criteria) this;
        }

        public Criteria andSearchContentNotBetween(String value1, String value2) {
            addCriterion("SEARCH_CONTENT not between", value1, value2, "searchContent");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("USER_ID like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("USER_ID not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andSearchTimeIsNull() {
            addCriterion("SEARCH_TIME is null");
            return (Criteria) this;
        }

        public Criteria andSearchTimeIsNotNull() {
            addCriterion("SEARCH_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andSearchTimeEqualTo(Date value) {
            addCriterion("SEARCH_TIME =", value, "searchTime");
            return (Criteria) this;
        }

        public Criteria andSearchTimeNotEqualTo(Date value) {
            addCriterion("SEARCH_TIME <>", value, "searchTime");
            return (Criteria) this;
        }

        public Criteria andSearchTimeGreaterThan(Date value) {
            addCriterion("SEARCH_TIME >", value, "searchTime");
            return (Criteria) this;
        }

        public Criteria andSearchTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SEARCH_TIME >=", value, "searchTime");
            return (Criteria) this;
        }

        public Criteria andSearchTimeLessThan(Date value) {
            addCriterion("SEARCH_TIME <", value, "searchTime");
            return (Criteria) this;
        }

        public Criteria andSearchTimeLessThanOrEqualTo(Date value) {
            addCriterion("SEARCH_TIME <=", value, "searchTime");
            return (Criteria) this;
        }

        public Criteria andSearchTimeIn(List<Date> values) {
            addCriterion("SEARCH_TIME in", values, "searchTime");
            return (Criteria) this;
        }

        public Criteria andSearchTimeNotIn(List<Date> values) {
            addCriterion("SEARCH_TIME not in", values, "searchTime");
            return (Criteria) this;
        }

        public Criteria andSearchTimeBetween(Date value1, Date value2) {
            addCriterion("SEARCH_TIME between", value1, value2, "searchTime");
            return (Criteria) this;
        }

        public Criteria andSearchTimeNotBetween(Date value1, Date value2) {
            addCriterion("SEARCH_TIME not between", value1, value2, "searchTime");
            return (Criteria) this;
        }

        public Criteria andSearchNumberIsNull() {
            addCriterion("SEARCH_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andSearchNumberIsNotNull() {
            addCriterion("SEARCH_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andSearchNumberEqualTo(Integer value) {
            addCriterion("SEARCH_NUMBER =", value, "searchNumber");
            return (Criteria) this;
        }

        public Criteria andSearchNumberNotEqualTo(Integer value) {
            addCriterion("SEARCH_NUMBER <>", value, "searchNumber");
            return (Criteria) this;
        }

        public Criteria andSearchNumberGreaterThan(Integer value) {
            addCriterion("SEARCH_NUMBER >", value, "searchNumber");
            return (Criteria) this;
        }

        public Criteria andSearchNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("SEARCH_NUMBER >=", value, "searchNumber");
            return (Criteria) this;
        }

        public Criteria andSearchNumberLessThan(Integer value) {
            addCriterion("SEARCH_NUMBER <", value, "searchNumber");
            return (Criteria) this;
        }

        public Criteria andSearchNumberLessThanOrEqualTo(Integer value) {
            addCriterion("SEARCH_NUMBER <=", value, "searchNumber");
            return (Criteria) this;
        }

        public Criteria andSearchNumberIn(List<Integer> values) {
            addCriterion("SEARCH_NUMBER in", values, "searchNumber");
            return (Criteria) this;
        }

        public Criteria andSearchNumberNotIn(List<Integer> values) {
            addCriterion("SEARCH_NUMBER not in", values, "searchNumber");
            return (Criteria) this;
        }

        public Criteria andSearchNumberBetween(Integer value1, Integer value2) {
            addCriterion("SEARCH_NUMBER between", value1, value2, "searchNumber");
            return (Criteria) this;
        }

        public Criteria andSearchNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("SEARCH_NUMBER not between", value1, value2, "searchNumber");
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