package com.qianjiajia.kitchen.design.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExample() {
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

        public Criteria andPutawayDateIsNull() {
            addCriterion("PUTAWAY_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPutawayDateIsNotNull() {
            addCriterion("PUTAWAY_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPutawayDateEqualTo(Date value) {
            addCriterion("PUTAWAY_DATE =", value, "putawayDate");
            return (Criteria) this;
        }

        public Criteria andPutawayDateNotEqualTo(Date value) {
            addCriterion("PUTAWAY_DATE <>", value, "putawayDate");
            return (Criteria) this;
        }

        public Criteria andPutawayDateGreaterThan(Date value) {
            addCriterion("PUTAWAY_DATE >", value, "putawayDate");
            return (Criteria) this;
        }

        public Criteria andPutawayDateGreaterThanOrEqualTo(Date value) {
            addCriterion("PUTAWAY_DATE >=", value, "putawayDate");
            return (Criteria) this;
        }

        public Criteria andPutawayDateLessThan(Date value) {
            addCriterion("PUTAWAY_DATE <", value, "putawayDate");
            return (Criteria) this;
        }

        public Criteria andPutawayDateLessThanOrEqualTo(Date value) {
            addCriterion("PUTAWAY_DATE <=", value, "putawayDate");
            return (Criteria) this;
        }

        public Criteria andPutawayDateIn(List<Date> values) {
            addCriterion("PUTAWAY_DATE in", values, "putawayDate");
            return (Criteria) this;
        }

        public Criteria andPutawayDateNotIn(List<Date> values) {
            addCriterion("PUTAWAY_DATE not in", values, "putawayDate");
            return (Criteria) this;
        }

        public Criteria andPutawayDateBetween(Date value1, Date value2) {
            addCriterion("PUTAWAY_DATE between", value1, value2, "putawayDate");
            return (Criteria) this;
        }

        public Criteria andPutawayDateNotBetween(Date value1, Date value2) {
            addCriterion("PUTAWAY_DATE not between", value1, value2, "putawayDate");
            return (Criteria) this;
        }

        public Criteria andKindsIsNull() {
            addCriterion("KINDS is null");
            return (Criteria) this;
        }

        public Criteria andKindsIsNotNull() {
            addCriterion("KINDS is not null");
            return (Criteria) this;
        }

        public Criteria andKindsEqualTo(String value) {
            addCriterion("KINDS =", value, "kinds");
            return (Criteria) this;
        }

        public Criteria andKindsNotEqualTo(String value) {
            addCriterion("KINDS <>", value, "kinds");
            return (Criteria) this;
        }

        public Criteria andKindsGreaterThan(String value) {
            addCriterion("KINDS >", value, "kinds");
            return (Criteria) this;
        }

        public Criteria andKindsGreaterThanOrEqualTo(String value) {
            addCriterion("KINDS >=", value, "kinds");
            return (Criteria) this;
        }

        public Criteria andKindsLessThan(String value) {
            addCriterion("KINDS <", value, "kinds");
            return (Criteria) this;
        }

        public Criteria andKindsLessThanOrEqualTo(String value) {
            addCriterion("KINDS <=", value, "kinds");
            return (Criteria) this;
        }

        public Criteria andKindsLike(String value) {
            addCriterion("KINDS like", value, "kinds");
            return (Criteria) this;
        }

        public Criteria andKindsNotLike(String value) {
            addCriterion("KINDS not like", value, "kinds");
            return (Criteria) this;
        }

        public Criteria andKindsIn(List<String> values) {
            addCriterion("KINDS in", values, "kinds");
            return (Criteria) this;
        }

        public Criteria andKindsNotIn(List<String> values) {
            addCriterion("KINDS not in", values, "kinds");
            return (Criteria) this;
        }

        public Criteria andKindsBetween(String value1, String value2) {
            addCriterion("KINDS between", value1, value2, "kinds");
            return (Criteria) this;
        }

        public Criteria andKindsNotBetween(String value1, String value2) {
            addCriterion("KINDS not between", value1, value2, "kinds");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("PRODUCT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("PRODUCT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("PRODUCT_NAME =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("PRODUCT_NAME <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("PRODUCT_NAME >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_NAME >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("PRODUCT_NAME <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_NAME <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("PRODUCT_NAME like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("PRODUCT_NAME not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("PRODUCT_NAME in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("PRODUCT_NAME not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("PRODUCT_NAME between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_NAME not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductImageUrlIsNull() {
            addCriterion("PRODUCT_IMAGE_URL is null");
            return (Criteria) this;
        }

        public Criteria andProductImageUrlIsNotNull() {
            addCriterion("PRODUCT_IMAGE_URL is not null");
            return (Criteria) this;
        }

        public Criteria andProductImageUrlEqualTo(String value) {
            addCriterion("PRODUCT_IMAGE_URL =", value, "productImageUrl");
            return (Criteria) this;
        }

        public Criteria andProductImageUrlNotEqualTo(String value) {
            addCriterion("PRODUCT_IMAGE_URL <>", value, "productImageUrl");
            return (Criteria) this;
        }

        public Criteria andProductImageUrlGreaterThan(String value) {
            addCriterion("PRODUCT_IMAGE_URL >", value, "productImageUrl");
            return (Criteria) this;
        }

        public Criteria andProductImageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_IMAGE_URL >=", value, "productImageUrl");
            return (Criteria) this;
        }

        public Criteria andProductImageUrlLessThan(String value) {
            addCriterion("PRODUCT_IMAGE_URL <", value, "productImageUrl");
            return (Criteria) this;
        }

        public Criteria andProductImageUrlLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_IMAGE_URL <=", value, "productImageUrl");
            return (Criteria) this;
        }

        public Criteria andProductImageUrlLike(String value) {
            addCriterion("PRODUCT_IMAGE_URL like", value, "productImageUrl");
            return (Criteria) this;
        }

        public Criteria andProductImageUrlNotLike(String value) {
            addCriterion("PRODUCT_IMAGE_URL not like", value, "productImageUrl");
            return (Criteria) this;
        }

        public Criteria andProductImageUrlIn(List<String> values) {
            addCriterion("PRODUCT_IMAGE_URL in", values, "productImageUrl");
            return (Criteria) this;
        }

        public Criteria andProductImageUrlNotIn(List<String> values) {
            addCriterion("PRODUCT_IMAGE_URL not in", values, "productImageUrl");
            return (Criteria) this;
        }

        public Criteria andProductImageUrlBetween(String value1, String value2) {
            addCriterion("PRODUCT_IMAGE_URL between", value1, value2, "productImageUrl");
            return (Criteria) this;
        }

        public Criteria andProductImageUrlNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_IMAGE_URL not between", value1, value2, "productImageUrl");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Short value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Short value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Short value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Short value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Short value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Short> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Short> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Short value1, Short value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Short value1, Short value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andProductTypesIsNull() {
            addCriterion("PRODUCT_TYPES is null");
            return (Criteria) this;
        }

        public Criteria andProductTypesIsNotNull() {
            addCriterion("PRODUCT_TYPES is not null");
            return (Criteria) this;
        }

        public Criteria andProductTypesEqualTo(String value) {
            addCriterion("PRODUCT_TYPES =", value, "productTypes");
            return (Criteria) this;
        }

        public Criteria andProductTypesNotEqualTo(String value) {
            addCriterion("PRODUCT_TYPES <>", value, "productTypes");
            return (Criteria) this;
        }

        public Criteria andProductTypesGreaterThan(String value) {
            addCriterion("PRODUCT_TYPES >", value, "productTypes");
            return (Criteria) this;
        }

        public Criteria andProductTypesGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_TYPES >=", value, "productTypes");
            return (Criteria) this;
        }

        public Criteria andProductTypesLessThan(String value) {
            addCriterion("PRODUCT_TYPES <", value, "productTypes");
            return (Criteria) this;
        }

        public Criteria andProductTypesLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_TYPES <=", value, "productTypes");
            return (Criteria) this;
        }

        public Criteria andProductTypesLike(String value) {
            addCriterion("PRODUCT_TYPES like", value, "productTypes");
            return (Criteria) this;
        }

        public Criteria andProductTypesNotLike(String value) {
            addCriterion("PRODUCT_TYPES not like", value, "productTypes");
            return (Criteria) this;
        }

        public Criteria andProductTypesIn(List<String> values) {
            addCriterion("PRODUCT_TYPES in", values, "productTypes");
            return (Criteria) this;
        }

        public Criteria andProductTypesNotIn(List<String> values) {
            addCriterion("PRODUCT_TYPES not in", values, "productTypes");
            return (Criteria) this;
        }

        public Criteria andProductTypesBetween(String value1, String value2) {
            addCriterion("PRODUCT_TYPES between", value1, value2, "productTypes");
            return (Criteria) this;
        }

        public Criteria andProductTypesNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_TYPES not between", value1, value2, "productTypes");
            return (Criteria) this;
        }

        public Criteria andProducerIsNull() {
            addCriterion("PRODUCER is null");
            return (Criteria) this;
        }

        public Criteria andProducerIsNotNull() {
            addCriterion("PRODUCER is not null");
            return (Criteria) this;
        }

        public Criteria andProducerEqualTo(String value) {
            addCriterion("PRODUCER =", value, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerNotEqualTo(String value) {
            addCriterion("PRODUCER <>", value, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerGreaterThan(String value) {
            addCriterion("PRODUCER >", value, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCER >=", value, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerLessThan(String value) {
            addCriterion("PRODUCER <", value, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerLessThanOrEqualTo(String value) {
            addCriterion("PRODUCER <=", value, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerLike(String value) {
            addCriterion("PRODUCER like", value, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerNotLike(String value) {
            addCriterion("PRODUCER not like", value, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerIn(List<String> values) {
            addCriterion("PRODUCER in", values, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerNotIn(List<String> values) {
            addCriterion("PRODUCER not in", values, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerBetween(String value1, String value2) {
            addCriterion("PRODUCER between", value1, value2, "producer");
            return (Criteria) this;
        }

        public Criteria andProducerNotBetween(String value1, String value2) {
            addCriterion("PRODUCER not between", value1, value2, "producer");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("ADDRESS =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("ADDRESS <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("ADDRESS >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("ADDRESS <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("ADDRESS like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("ADDRESS not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("ADDRESS in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("ADDRESS not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("ADDRESS between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("ADDRESS not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andDescribedIsNull() {
            addCriterion("DESCRIBED is null");
            return (Criteria) this;
        }

        public Criteria andDescribedIsNotNull() {
            addCriterion("DESCRIBED is not null");
            return (Criteria) this;
        }

        public Criteria andDescribedEqualTo(String value) {
            addCriterion("DESCRIBED =", value, "described");
            return (Criteria) this;
        }

        public Criteria andDescribedNotEqualTo(String value) {
            addCriterion("DESCRIBED <>", value, "described");
            return (Criteria) this;
        }

        public Criteria andDescribedGreaterThan(String value) {
            addCriterion("DESCRIBED >", value, "described");
            return (Criteria) this;
        }

        public Criteria andDescribedGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIBED >=", value, "described");
            return (Criteria) this;
        }

        public Criteria andDescribedLessThan(String value) {
            addCriterion("DESCRIBED <", value, "described");
            return (Criteria) this;
        }

        public Criteria andDescribedLessThanOrEqualTo(String value) {
            addCriterion("DESCRIBED <=", value, "described");
            return (Criteria) this;
        }

        public Criteria andDescribedLike(String value) {
            addCriterion("DESCRIBED like", value, "described");
            return (Criteria) this;
        }

        public Criteria andDescribedNotLike(String value) {
            addCriterion("DESCRIBED not like", value, "described");
            return (Criteria) this;
        }

        public Criteria andDescribedIn(List<String> values) {
            addCriterion("DESCRIBED in", values, "described");
            return (Criteria) this;
        }

        public Criteria andDescribedNotIn(List<String> values) {
            addCriterion("DESCRIBED not in", values, "described");
            return (Criteria) this;
        }

        public Criteria andDescribedBetween(String value1, String value2) {
            addCriterion("DESCRIBED between", value1, value2, "described");
            return (Criteria) this;
        }

        public Criteria andDescribedNotBetween(String value1, String value2) {
            addCriterion("DESCRIBED not between", value1, value2, "described");
            return (Criteria) this;
        }

        public Criteria andProductionDateIsNull() {
            addCriterion("PRODUCTION_DATE is null");
            return (Criteria) this;
        }

        public Criteria andProductionDateIsNotNull() {
            addCriterion("PRODUCTION_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andProductionDateEqualTo(Date value) {
            addCriterion("PRODUCTION_DATE =", value, "productionDate");
            return (Criteria) this;
        }

        public Criteria andProductionDateNotEqualTo(Date value) {
            addCriterion("PRODUCTION_DATE <>", value, "productionDate");
            return (Criteria) this;
        }

        public Criteria andProductionDateGreaterThan(Date value) {
            addCriterion("PRODUCTION_DATE >", value, "productionDate");
            return (Criteria) this;
        }

        public Criteria andProductionDateGreaterThanOrEqualTo(Date value) {
            addCriterion("PRODUCTION_DATE >=", value, "productionDate");
            return (Criteria) this;
        }

        public Criteria andProductionDateLessThan(Date value) {
            addCriterion("PRODUCTION_DATE <", value, "productionDate");
            return (Criteria) this;
        }

        public Criteria andProductionDateLessThanOrEqualTo(Date value) {
            addCriterion("PRODUCTION_DATE <=", value, "productionDate");
            return (Criteria) this;
        }

        public Criteria andProductionDateIn(List<Date> values) {
            addCriterion("PRODUCTION_DATE in", values, "productionDate");
            return (Criteria) this;
        }

        public Criteria andProductionDateNotIn(List<Date> values) {
            addCriterion("PRODUCTION_DATE not in", values, "productionDate");
            return (Criteria) this;
        }

        public Criteria andProductionDateBetween(Date value1, Date value2) {
            addCriterion("PRODUCTION_DATE between", value1, value2, "productionDate");
            return (Criteria) this;
        }

        public Criteria andProductionDateNotBetween(Date value1, Date value2) {
            addCriterion("PRODUCTION_DATE not between", value1, value2, "productionDate");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("PRICE is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("PRICE =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("PRICE <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("PRICE >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRICE >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("PRICE <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRICE <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("PRICE in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("PRICE not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRICE between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRICE not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceIsNull() {
            addCriterion("DISCOUNT_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceIsNotNull() {
            addCriterion("DISCOUNT_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceEqualTo(BigDecimal value) {
            addCriterion("DISCOUNT_PRICE =", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceNotEqualTo(BigDecimal value) {
            addCriterion("DISCOUNT_PRICE <>", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceGreaterThan(BigDecimal value) {
            addCriterion("DISCOUNT_PRICE >", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DISCOUNT_PRICE >=", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceLessThan(BigDecimal value) {
            addCriterion("DISCOUNT_PRICE <", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DISCOUNT_PRICE <=", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceIn(List<BigDecimal> values) {
            addCriterion("DISCOUNT_PRICE in", values, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceNotIn(List<BigDecimal> values) {
            addCriterion("DISCOUNT_PRICE not in", values, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DISCOUNT_PRICE between", value1, value2, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DISCOUNT_PRICE not between", value1, value2, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andIsDiscountIsNull() {
            addCriterion("IS_DISCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andIsDiscountIsNotNull() {
            addCriterion("IS_DISCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andIsDiscountEqualTo(Short value) {
            addCriterion("IS_DISCOUNT =", value, "isDiscount");
            return (Criteria) this;
        }

        public Criteria andIsDiscountNotEqualTo(Short value) {
            addCriterion("IS_DISCOUNT <>", value, "isDiscount");
            return (Criteria) this;
        }

        public Criteria andIsDiscountGreaterThan(Short value) {
            addCriterion("IS_DISCOUNT >", value, "isDiscount");
            return (Criteria) this;
        }

        public Criteria andIsDiscountGreaterThanOrEqualTo(Short value) {
            addCriterion("IS_DISCOUNT >=", value, "isDiscount");
            return (Criteria) this;
        }

        public Criteria andIsDiscountLessThan(Short value) {
            addCriterion("IS_DISCOUNT <", value, "isDiscount");
            return (Criteria) this;
        }

        public Criteria andIsDiscountLessThanOrEqualTo(Short value) {
            addCriterion("IS_DISCOUNT <=", value, "isDiscount");
            return (Criteria) this;
        }

        public Criteria andIsDiscountIn(List<Short> values) {
            addCriterion("IS_DISCOUNT in", values, "isDiscount");
            return (Criteria) this;
        }

        public Criteria andIsDiscountNotIn(List<Short> values) {
            addCriterion("IS_DISCOUNT not in", values, "isDiscount");
            return (Criteria) this;
        }

        public Criteria andIsDiscountBetween(Short value1, Short value2) {
            addCriterion("IS_DISCOUNT between", value1, value2, "isDiscount");
            return (Criteria) this;
        }

        public Criteria andIsDiscountNotBetween(Short value1, Short value2) {
            addCriterion("IS_DISCOUNT not between", value1, value2, "isDiscount");
            return (Criteria) this;
        }

        public Criteria andLimitNumberIsNull() {
            addCriterion("LIMIT_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andLimitNumberIsNotNull() {
            addCriterion("LIMIT_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andLimitNumberEqualTo(Integer value) {
            addCriterion("LIMIT_NUMBER =", value, "limitNumber");
            return (Criteria) this;
        }

        public Criteria andLimitNumberNotEqualTo(Integer value) {
            addCriterion("LIMIT_NUMBER <>", value, "limitNumber");
            return (Criteria) this;
        }

        public Criteria andLimitNumberGreaterThan(Integer value) {
            addCriterion("LIMIT_NUMBER >", value, "limitNumber");
            return (Criteria) this;
        }

        public Criteria andLimitNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("LIMIT_NUMBER >=", value, "limitNumber");
            return (Criteria) this;
        }

        public Criteria andLimitNumberLessThan(Integer value) {
            addCriterion("LIMIT_NUMBER <", value, "limitNumber");
            return (Criteria) this;
        }

        public Criteria andLimitNumberLessThanOrEqualTo(Integer value) {
            addCriterion("LIMIT_NUMBER <=", value, "limitNumber");
            return (Criteria) this;
        }

        public Criteria andLimitNumberIn(List<Integer> values) {
            addCriterion("LIMIT_NUMBER in", values, "limitNumber");
            return (Criteria) this;
        }

        public Criteria andLimitNumberNotIn(List<Integer> values) {
            addCriterion("LIMIT_NUMBER not in", values, "limitNumber");
            return (Criteria) this;
        }

        public Criteria andLimitNumberBetween(Integer value1, Integer value2) {
            addCriterion("LIMIT_NUMBER between", value1, value2, "limitNumber");
            return (Criteria) this;
        }

        public Criteria andLimitNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("LIMIT_NUMBER not between", value1, value2, "limitNumber");
            return (Criteria) this;
        }

        public Criteria andKindNumberIsNull() {
            addCriterion("KIND_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andKindNumberIsNotNull() {
            addCriterion("KIND_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andKindNumberEqualTo(Short value) {
            addCriterion("KIND_NUMBER =", value, "kindNumber");
            return (Criteria) this;
        }

        public Criteria andKindNumberNotEqualTo(Short value) {
            addCriterion("KIND_NUMBER <>", value, "kindNumber");
            return (Criteria) this;
        }

        public Criteria andKindNumberGreaterThan(Short value) {
            addCriterion("KIND_NUMBER >", value, "kindNumber");
            return (Criteria) this;
        }

        public Criteria andKindNumberGreaterThanOrEqualTo(Short value) {
            addCriterion("KIND_NUMBER >=", value, "kindNumber");
            return (Criteria) this;
        }

        public Criteria andKindNumberLessThan(Short value) {
            addCriterion("KIND_NUMBER <", value, "kindNumber");
            return (Criteria) this;
        }

        public Criteria andKindNumberLessThanOrEqualTo(Short value) {
            addCriterion("KIND_NUMBER <=", value, "kindNumber");
            return (Criteria) this;
        }

        public Criteria andKindNumberIn(List<Short> values) {
            addCriterion("KIND_NUMBER in", values, "kindNumber");
            return (Criteria) this;
        }

        public Criteria andKindNumberNotIn(List<Short> values) {
            addCriterion("KIND_NUMBER not in", values, "kindNumber");
            return (Criteria) this;
        }

        public Criteria andKindNumberBetween(Short value1, Short value2) {
            addCriterion("KIND_NUMBER between", value1, value2, "kindNumber");
            return (Criteria) this;
        }

        public Criteria andKindNumberNotBetween(Short value1, Short value2) {
            addCriterion("KIND_NUMBER not between", value1, value2, "kindNumber");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("START_DATE is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("START_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(Date value) {
            addCriterion("START_DATE =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterion("START_DATE <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterion("START_DATE >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("START_DATE >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterion("START_DATE <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterion("START_DATE <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterion("START_DATE in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterion("START_DATE not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterion("START_DATE between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterion("START_DATE not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Date value) {
            addCriterion("END_DATE =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterion("END_DATE <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterion("END_DATE >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("END_DATE >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterion("END_DATE <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterion("END_DATE <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterion("END_DATE in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterion("END_DATE not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterion("END_DATE between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterion("END_DATE not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andCarriageIsNull() {
            addCriterion("CARRIAGE is null");
            return (Criteria) this;
        }

        public Criteria andCarriageIsNotNull() {
            addCriterion("CARRIAGE is not null");
            return (Criteria) this;
        }

        public Criteria andCarriageEqualTo(BigDecimal value) {
            addCriterion("CARRIAGE =", value, "carriage");
            return (Criteria) this;
        }

        public Criteria andCarriageNotEqualTo(BigDecimal value) {
            addCriterion("CARRIAGE <>", value, "carriage");
            return (Criteria) this;
        }

        public Criteria andCarriageGreaterThan(BigDecimal value) {
            addCriterion("CARRIAGE >", value, "carriage");
            return (Criteria) this;
        }

        public Criteria andCarriageGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CARRIAGE >=", value, "carriage");
            return (Criteria) this;
        }

        public Criteria andCarriageLessThan(BigDecimal value) {
            addCriterion("CARRIAGE <", value, "carriage");
            return (Criteria) this;
        }

        public Criteria andCarriageLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CARRIAGE <=", value, "carriage");
            return (Criteria) this;
        }

        public Criteria andCarriageIn(List<BigDecimal> values) {
            addCriterion("CARRIAGE in", values, "carriage");
            return (Criteria) this;
        }

        public Criteria andCarriageNotIn(List<BigDecimal> values) {
            addCriterion("CARRIAGE not in", values, "carriage");
            return (Criteria) this;
        }

        public Criteria andCarriageBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CARRIAGE between", value1, value2, "carriage");
            return (Criteria) this;
        }

        public Criteria andCarriageNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CARRIAGE not between", value1, value2, "carriage");
            return (Criteria) this;
        }

        public Criteria andIsGroupBuyIsNull() {
            addCriterion("IS_GROUP_BUY is null");
            return (Criteria) this;
        }

        public Criteria andIsGroupBuyIsNotNull() {
            addCriterion("IS_GROUP_BUY is not null");
            return (Criteria) this;
        }

        public Criteria andIsGroupBuyEqualTo(Short value) {
            addCriterion("IS_GROUP_BUY =", value, "isGroupBuy");
            return (Criteria) this;
        }

        public Criteria andIsGroupBuyNotEqualTo(Short value) {
            addCriterion("IS_GROUP_BUY <>", value, "isGroupBuy");
            return (Criteria) this;
        }

        public Criteria andIsGroupBuyGreaterThan(Short value) {
            addCriterion("IS_GROUP_BUY >", value, "isGroupBuy");
            return (Criteria) this;
        }

        public Criteria andIsGroupBuyGreaterThanOrEqualTo(Short value) {
            addCriterion("IS_GROUP_BUY >=", value, "isGroupBuy");
            return (Criteria) this;
        }

        public Criteria andIsGroupBuyLessThan(Short value) {
            addCriterion("IS_GROUP_BUY <", value, "isGroupBuy");
            return (Criteria) this;
        }

        public Criteria andIsGroupBuyLessThanOrEqualTo(Short value) {
            addCriterion("IS_GROUP_BUY <=", value, "isGroupBuy");
            return (Criteria) this;
        }

        public Criteria andIsGroupBuyIn(List<Short> values) {
            addCriterion("IS_GROUP_BUY in", values, "isGroupBuy");
            return (Criteria) this;
        }

        public Criteria andIsGroupBuyNotIn(List<Short> values) {
            addCriterion("IS_GROUP_BUY not in", values, "isGroupBuy");
            return (Criteria) this;
        }

        public Criteria andIsGroupBuyBetween(Short value1, Short value2) {
            addCriterion("IS_GROUP_BUY between", value1, value2, "isGroupBuy");
            return (Criteria) this;
        }

        public Criteria andIsGroupBuyNotBetween(Short value1, Short value2) {
            addCriterion("IS_GROUP_BUY not between", value1, value2, "isGroupBuy");
            return (Criteria) this;
        }

        public Criteria andGroupBuyPriceIsNull() {
            addCriterion("GROUP_BUY_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andGroupBuyPriceIsNotNull() {
            addCriterion("GROUP_BUY_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andGroupBuyPriceEqualTo(BigDecimal value) {
            addCriterion("GROUP_BUY_PRICE =", value, "groupBuyPrice");
            return (Criteria) this;
        }

        public Criteria andGroupBuyPriceNotEqualTo(BigDecimal value) {
            addCriterion("GROUP_BUY_PRICE <>", value, "groupBuyPrice");
            return (Criteria) this;
        }

        public Criteria andGroupBuyPriceGreaterThan(BigDecimal value) {
            addCriterion("GROUP_BUY_PRICE >", value, "groupBuyPrice");
            return (Criteria) this;
        }

        public Criteria andGroupBuyPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GROUP_BUY_PRICE >=", value, "groupBuyPrice");
            return (Criteria) this;
        }

        public Criteria andGroupBuyPriceLessThan(BigDecimal value) {
            addCriterion("GROUP_BUY_PRICE <", value, "groupBuyPrice");
            return (Criteria) this;
        }

        public Criteria andGroupBuyPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GROUP_BUY_PRICE <=", value, "groupBuyPrice");
            return (Criteria) this;
        }

        public Criteria andGroupBuyPriceIn(List<BigDecimal> values) {
            addCriterion("GROUP_BUY_PRICE in", values, "groupBuyPrice");
            return (Criteria) this;
        }

        public Criteria andGroupBuyPriceNotIn(List<BigDecimal> values) {
            addCriterion("GROUP_BUY_PRICE not in", values, "groupBuyPrice");
            return (Criteria) this;
        }

        public Criteria andGroupBuyPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GROUP_BUY_PRICE between", value1, value2, "groupBuyPrice");
            return (Criteria) this;
        }

        public Criteria andGroupBuyPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GROUP_BUY_PRICE not between", value1, value2, "groupBuyPrice");
            return (Criteria) this;
        }

        public Criteria andGroupBuyPersonNumberIsNull() {
            addCriterion("GROUP_BUY_PERSON_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andGroupBuyPersonNumberIsNotNull() {
            addCriterion("GROUP_BUY_PERSON_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andGroupBuyPersonNumberEqualTo(Integer value) {
            addCriterion("GROUP_BUY_PERSON_NUMBER =", value, "groupBuyPersonNumber");
            return (Criteria) this;
        }

        public Criteria andGroupBuyPersonNumberNotEqualTo(Integer value) {
            addCriterion("GROUP_BUY_PERSON_NUMBER <>", value, "groupBuyPersonNumber");
            return (Criteria) this;
        }

        public Criteria andGroupBuyPersonNumberGreaterThan(Integer value) {
            addCriterion("GROUP_BUY_PERSON_NUMBER >", value, "groupBuyPersonNumber");
            return (Criteria) this;
        }

        public Criteria andGroupBuyPersonNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("GROUP_BUY_PERSON_NUMBER >=", value, "groupBuyPersonNumber");
            return (Criteria) this;
        }

        public Criteria andGroupBuyPersonNumberLessThan(Integer value) {
            addCriterion("GROUP_BUY_PERSON_NUMBER <", value, "groupBuyPersonNumber");
            return (Criteria) this;
        }

        public Criteria andGroupBuyPersonNumberLessThanOrEqualTo(Integer value) {
            addCriterion("GROUP_BUY_PERSON_NUMBER <=", value, "groupBuyPersonNumber");
            return (Criteria) this;
        }

        public Criteria andGroupBuyPersonNumberIn(List<Integer> values) {
            addCriterion("GROUP_BUY_PERSON_NUMBER in", values, "groupBuyPersonNumber");
            return (Criteria) this;
        }

        public Criteria andGroupBuyPersonNumberNotIn(List<Integer> values) {
            addCriterion("GROUP_BUY_PERSON_NUMBER not in", values, "groupBuyPersonNumber");
            return (Criteria) this;
        }

        public Criteria andGroupBuyPersonNumberBetween(Integer value1, Integer value2) {
            addCriterion("GROUP_BUY_PERSON_NUMBER between", value1, value2, "groupBuyPersonNumber");
            return (Criteria) this;
        }

        public Criteria andGroupBuyPersonNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("GROUP_BUY_PERSON_NUMBER not between", value1, value2, "groupBuyPersonNumber");
            return (Criteria) this;
        }

        public Criteria andStartGroupBuyDateIsNull() {
            addCriterion("START_GROUP_BUY_DATE is null");
            return (Criteria) this;
        }

        public Criteria andStartGroupBuyDateIsNotNull() {
            addCriterion("START_GROUP_BUY_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andStartGroupBuyDateEqualTo(Date value) {
            addCriterion("START_GROUP_BUY_DATE =", value, "startGroupBuyDate");
            return (Criteria) this;
        }

        public Criteria andStartGroupBuyDateNotEqualTo(Date value) {
            addCriterion("START_GROUP_BUY_DATE <>", value, "startGroupBuyDate");
            return (Criteria) this;
        }

        public Criteria andStartGroupBuyDateGreaterThan(Date value) {
            addCriterion("START_GROUP_BUY_DATE >", value, "startGroupBuyDate");
            return (Criteria) this;
        }

        public Criteria andStartGroupBuyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("START_GROUP_BUY_DATE >=", value, "startGroupBuyDate");
            return (Criteria) this;
        }

        public Criteria andStartGroupBuyDateLessThan(Date value) {
            addCriterion("START_GROUP_BUY_DATE <", value, "startGroupBuyDate");
            return (Criteria) this;
        }

        public Criteria andStartGroupBuyDateLessThanOrEqualTo(Date value) {
            addCriterion("START_GROUP_BUY_DATE <=", value, "startGroupBuyDate");
            return (Criteria) this;
        }

        public Criteria andStartGroupBuyDateIn(List<Date> values) {
            addCriterion("START_GROUP_BUY_DATE in", values, "startGroupBuyDate");
            return (Criteria) this;
        }

        public Criteria andStartGroupBuyDateNotIn(List<Date> values) {
            addCriterion("START_GROUP_BUY_DATE not in", values, "startGroupBuyDate");
            return (Criteria) this;
        }

        public Criteria andStartGroupBuyDateBetween(Date value1, Date value2) {
            addCriterion("START_GROUP_BUY_DATE between", value1, value2, "startGroupBuyDate");
            return (Criteria) this;
        }

        public Criteria andStartGroupBuyDateNotBetween(Date value1, Date value2) {
            addCriterion("START_GROUP_BUY_DATE not between", value1, value2, "startGroupBuyDate");
            return (Criteria) this;
        }

        public Criteria andEndGroupBuyDateIsNull() {
            addCriterion("END_GROUP_BUY_DATE is null");
            return (Criteria) this;
        }

        public Criteria andEndGroupBuyDateIsNotNull() {
            addCriterion("END_GROUP_BUY_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andEndGroupBuyDateEqualTo(Date value) {
            addCriterion("END_GROUP_BUY_DATE =", value, "endGroupBuyDate");
            return (Criteria) this;
        }

        public Criteria andEndGroupBuyDateNotEqualTo(Date value) {
            addCriterion("END_GROUP_BUY_DATE <>", value, "endGroupBuyDate");
            return (Criteria) this;
        }

        public Criteria andEndGroupBuyDateGreaterThan(Date value) {
            addCriterion("END_GROUP_BUY_DATE >", value, "endGroupBuyDate");
            return (Criteria) this;
        }

        public Criteria andEndGroupBuyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("END_GROUP_BUY_DATE >=", value, "endGroupBuyDate");
            return (Criteria) this;
        }

        public Criteria andEndGroupBuyDateLessThan(Date value) {
            addCriterion("END_GROUP_BUY_DATE <", value, "endGroupBuyDate");
            return (Criteria) this;
        }

        public Criteria andEndGroupBuyDateLessThanOrEqualTo(Date value) {
            addCriterion("END_GROUP_BUY_DATE <=", value, "endGroupBuyDate");
            return (Criteria) this;
        }

        public Criteria andEndGroupBuyDateIn(List<Date> values) {
            addCriterion("END_GROUP_BUY_DATE in", values, "endGroupBuyDate");
            return (Criteria) this;
        }

        public Criteria andEndGroupBuyDateNotIn(List<Date> values) {
            addCriterion("END_GROUP_BUY_DATE not in", values, "endGroupBuyDate");
            return (Criteria) this;
        }

        public Criteria andEndGroupBuyDateBetween(Date value1, Date value2) {
            addCriterion("END_GROUP_BUY_DATE between", value1, value2, "endGroupBuyDate");
            return (Criteria) this;
        }

        public Criteria andEndGroupBuyDateNotBetween(Date value1, Date value2) {
            addCriterion("END_GROUP_BUY_DATE not between", value1, value2, "endGroupBuyDate");
            return (Criteria) this;
        }

        public Criteria andKeyClassIsNull() {
            addCriterion("KEY_CLASS is null");
            return (Criteria) this;
        }

        public Criteria andKeyClassIsNotNull() {
            addCriterion("KEY_CLASS is not null");
            return (Criteria) this;
        }

        public Criteria andKeyClassEqualTo(String value) {
            addCriterion("KEY_CLASS =", value, "keyClass");
            return (Criteria) this;
        }

        public Criteria andKeyClassNotEqualTo(String value) {
            addCriterion("KEY_CLASS <>", value, "keyClass");
            return (Criteria) this;
        }

        public Criteria andKeyClassGreaterThan(String value) {
            addCriterion("KEY_CLASS >", value, "keyClass");
            return (Criteria) this;
        }

        public Criteria andKeyClassGreaterThanOrEqualTo(String value) {
            addCriterion("KEY_CLASS >=", value, "keyClass");
            return (Criteria) this;
        }

        public Criteria andKeyClassLessThan(String value) {
            addCriterion("KEY_CLASS <", value, "keyClass");
            return (Criteria) this;
        }

        public Criteria andKeyClassLessThanOrEqualTo(String value) {
            addCriterion("KEY_CLASS <=", value, "keyClass");
            return (Criteria) this;
        }

        public Criteria andKeyClassLike(String value) {
            addCriterion("KEY_CLASS like", value, "keyClass");
            return (Criteria) this;
        }

        public Criteria andKeyClassNotLike(String value) {
            addCriterion("KEY_CLASS not like", value, "keyClass");
            return (Criteria) this;
        }

        public Criteria andKeyClassIn(List<String> values) {
            addCriterion("KEY_CLASS in", values, "keyClass");
            return (Criteria) this;
        }

        public Criteria andKeyClassNotIn(List<String> values) {
            addCriterion("KEY_CLASS not in", values, "keyClass");
            return (Criteria) this;
        }

        public Criteria andKeyClassBetween(String value1, String value2) {
            addCriterion("KEY_CLASS between", value1, value2, "keyClass");
            return (Criteria) this;
        }

        public Criteria andKeyClassNotBetween(String value1, String value2) {
            addCriterion("KEY_CLASS not between", value1, value2, "keyClass");
            return (Criteria) this;
        }

        public Criteria andBigKeyClassIsNull() {
            addCriterion("BIG_KEY_CLASS is null");
            return (Criteria) this;
        }

        public Criteria andBigKeyClassIsNotNull() {
            addCriterion("BIG_KEY_CLASS is not null");
            return (Criteria) this;
        }

        public Criteria andBigKeyClassEqualTo(String value) {
            addCriterion("BIG_KEY_CLASS =", value, "bigKeyClass");
            return (Criteria) this;
        }

        public Criteria andBigKeyClassNotEqualTo(String value) {
            addCriterion("BIG_KEY_CLASS <>", value, "bigKeyClass");
            return (Criteria) this;
        }

        public Criteria andBigKeyClassGreaterThan(String value) {
            addCriterion("BIG_KEY_CLASS >", value, "bigKeyClass");
            return (Criteria) this;
        }

        public Criteria andBigKeyClassGreaterThanOrEqualTo(String value) {
            addCriterion("BIG_KEY_CLASS >=", value, "bigKeyClass");
            return (Criteria) this;
        }

        public Criteria andBigKeyClassLessThan(String value) {
            addCriterion("BIG_KEY_CLASS <", value, "bigKeyClass");
            return (Criteria) this;
        }

        public Criteria andBigKeyClassLessThanOrEqualTo(String value) {
            addCriterion("BIG_KEY_CLASS <=", value, "bigKeyClass");
            return (Criteria) this;
        }

        public Criteria andBigKeyClassLike(String value) {
            addCriterion("BIG_KEY_CLASS like", value, "bigKeyClass");
            return (Criteria) this;
        }

        public Criteria andBigKeyClassNotLike(String value) {
            addCriterion("BIG_KEY_CLASS not like", value, "bigKeyClass");
            return (Criteria) this;
        }

        public Criteria andBigKeyClassIn(List<String> values) {
            addCriterion("BIG_KEY_CLASS in", values, "bigKeyClass");
            return (Criteria) this;
        }

        public Criteria andBigKeyClassNotIn(List<String> values) {
            addCriterion("BIG_KEY_CLASS not in", values, "bigKeyClass");
            return (Criteria) this;
        }

        public Criteria andBigKeyClassBetween(String value1, String value2) {
            addCriterion("BIG_KEY_CLASS between", value1, value2, "bigKeyClass");
            return (Criteria) this;
        }

        public Criteria andBigKeyClassNotBetween(String value1, String value2) {
            addCriterion("BIG_KEY_CLASS not between", value1, value2, "bigKeyClass");
            return (Criteria) this;
        }

        public Criteria andKeywordIsNull() {
            addCriterion("KEYWORD is null");
            return (Criteria) this;
        }

        public Criteria andKeywordIsNotNull() {
            addCriterion("KEYWORD is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordEqualTo(String value) {
            addCriterion("KEYWORD =", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotEqualTo(String value) {
            addCriterion("KEYWORD <>", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordGreaterThan(String value) {
            addCriterion("KEYWORD >", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordGreaterThanOrEqualTo(String value) {
            addCriterion("KEYWORD >=", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLessThan(String value) {
            addCriterion("KEYWORD <", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLessThanOrEqualTo(String value) {
            addCriterion("KEYWORD <=", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordLike(String value) {
            addCriterion("KEYWORD like", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotLike(String value) {
            addCriterion("KEYWORD not like", value, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordIn(List<String> values) {
            addCriterion("KEYWORD in", values, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotIn(List<String> values) {
            addCriterion("KEYWORD not in", values, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordBetween(String value1, String value2) {
            addCriterion("KEYWORD between", value1, value2, "keyword");
            return (Criteria) this;
        }

        public Criteria andKeywordNotBetween(String value1, String value2) {
            addCriterion("KEYWORD not between", value1, value2, "keyword");
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