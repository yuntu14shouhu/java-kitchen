package com.qianjiajia.kitchen.design.domain;

public class ShoppingCart {
    private String id;

    private String userIdShop;

    private String productId;

    private Short status;

    private Short productNumber;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserIdShop() {
        return userIdShop;
    }

    public void setUserIdShop(String userIdShop) {
        this.userIdShop = userIdShop == null ? null : userIdShop.trim();
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Short getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(Short productNumber) {
        this.productNumber = productNumber;
    }
}