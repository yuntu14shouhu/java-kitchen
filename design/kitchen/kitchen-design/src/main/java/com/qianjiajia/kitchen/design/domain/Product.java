package com.qianjiajia.kitchen.design.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Product {
    private String id;

    private Date putawayDate;

    private String kinds;

    private String productName;

    private String productImageUrl;

    private Short status;

    private String productTypes;

    private String producer;

    private String address;

    private String described;

    private Date productionDate;

    private BigDecimal price;

    private BigDecimal discountPrice;

    private Short isDiscount;

    private Integer limitNumber;

    private Short kindNumber;

    private Date startDate;

    private Date endDate;

    private BigDecimal carriage;

    private Short isGroupBuy;

    private BigDecimal groupBuyPrice;

    private Integer groupBuyPersonNumber;

    private Date startGroupBuyDate;

    private Date endGroupBuyDate;

    private String keyClass;

    private String bigKeyClass;

    private String keyword;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Date getPutawayDate() {
        return putawayDate;
    }

    public void setPutawayDate(Date putawayDate) {
        this.putawayDate = putawayDate;
    }

    public String getKinds() {
        return kinds;
    }

    public void setKinds(String kinds) {
        this.kinds = kinds == null ? null : kinds.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getProductImageUrl() {
        return productImageUrl;
    }

    public void setProductImageUrl(String productImageUrl) {
        this.productImageUrl = productImageUrl == null ? null : productImageUrl.trim();
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getProductTypes() {
        return productTypes;
    }

    public void setProductTypes(String productTypes) {
        this.productTypes = productTypes == null ? null : productTypes.trim();
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer == null ? null : producer.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getDescribed() {
        return described;
    }

    public void setDescribed(String described) {
        this.described = described == null ? null : described.trim();
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(BigDecimal discountPrice) {
        this.discountPrice = discountPrice;
    }

    public Short getIsDiscount() {
        return isDiscount;
    }

    public void setIsDiscount(Short isDiscount) {
        this.isDiscount = isDiscount;
    }

    public Integer getLimitNumber() {
        return limitNumber;
    }

    public void setLimitNumber(Integer limitNumber) {
        this.limitNumber = limitNumber;
    }

    public Short getKindNumber() {
        return kindNumber;
    }

    public void setKindNumber(Short kindNumber) {
        this.kindNumber = kindNumber;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public BigDecimal getCarriage() {
        return carriage;
    }

    public void setCarriage(BigDecimal carriage) {
        this.carriage = carriage;
    }

    public Short getIsGroupBuy() {
        return isGroupBuy;
    }

    public void setIsGroupBuy(Short isGroupBuy) {
        this.isGroupBuy = isGroupBuy;
    }

    public BigDecimal getGroupBuyPrice() {
        return groupBuyPrice;
    }

    public void setGroupBuyPrice(BigDecimal groupBuyPrice) {
        this.groupBuyPrice = groupBuyPrice;
    }

    public Integer getGroupBuyPersonNumber() {
        return groupBuyPersonNumber;
    }

    public void setGroupBuyPersonNumber(Integer groupBuyPersonNumber) {
        this.groupBuyPersonNumber = groupBuyPersonNumber;
    }

    public Date getStartGroupBuyDate() {
        return startGroupBuyDate;
    }

    public void setStartGroupBuyDate(Date startGroupBuyDate) {
        this.startGroupBuyDate = startGroupBuyDate;
    }

    public Date getEndGroupBuyDate() {
        return endGroupBuyDate;
    }

    public void setEndGroupBuyDate(Date endGroupBuyDate) {
        this.endGroupBuyDate = endGroupBuyDate;
    }

    public String getKeyClass() {
        return keyClass;
    }

    public void setKeyClass(String keyClass) {
        this.keyClass = keyClass == null ? null : keyClass.trim();
    }

    public String getBigKeyClass() {
        return bigKeyClass;
    }

    public void setBigKeyClass(String bigKeyClass) {
        this.bigKeyClass = bigKeyClass == null ? null : bigKeyClass.trim();
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }
}