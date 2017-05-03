package com.qianjiajia.kitchen.design.domain;

public class ShoppingCart {
    private String id;

    private String userId;

    private String orderIdList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getOrderIdList() {
        return orderIdList;
    }

    public void setOrderIdList(String orderIdList) {
        this.orderIdList = orderIdList == null ? null : orderIdList.trim();
    }
}