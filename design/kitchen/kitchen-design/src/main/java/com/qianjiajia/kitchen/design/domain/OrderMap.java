package com.qianjiajia.kitchen.design.domain;

public class OrderMap {
    private String id;

    private String orderId;

    private String productId;

    private Integer productNumer;

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

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public Integer getProductNumer() {
        return productNumer;
    }

    public void setProductNumer(Integer productNumer) {
        this.productNumer = productNumer;
    }
}