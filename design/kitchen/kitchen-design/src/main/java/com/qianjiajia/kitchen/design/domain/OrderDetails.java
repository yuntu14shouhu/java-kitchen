package com.qianjiajia.kitchen.design.domain;

import java.math.BigDecimal;

public class OrderDetails {
    private String id;

    private String orderId;

    private String orderProductName;

    private String orderProductImageUrl;

    private BigDecimal orderPrice;

    private Short orderProductNumber;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getOrderProductName() {
        return orderProductName;
    }

    public void setOrderProductName(String orderProductName) {
        this.orderProductName = orderProductName == null ? null : orderProductName.trim();
    }

    public String getOrderProductImageUrl() {
        return orderProductImageUrl;
    }

    public void setOrderProductImageUrl(String orderProductImageUrl) {
        this.orderProductImageUrl = orderProductImageUrl == null ? null : orderProductImageUrl.trim();
    }

    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
    }

    public Short getOrderProductNumber() {
        return orderProductNumber;
    }

    public void setOrderProductNumber(Short orderProductNumber) {
        this.orderProductNumber = orderProductNumber;
    }
}