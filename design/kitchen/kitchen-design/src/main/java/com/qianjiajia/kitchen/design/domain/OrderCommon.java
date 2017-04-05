package com.qianjiajia.kitchen.design.domain;

import java.math.BigDecimal;
import java.util.Date;

public class OrderCommon {
    private String id;

    private String orderConsigneeName;

    private String orderConsigneePhone;

    private String orderConsigneeAddress;

    private BigDecimal orderCarriage;

    private Short orderStatus;

    private Date orderCreateDate;

    private String orderRef;

    private BigDecimal orderActualPayment;

    private BigDecimal orderTotalPayment;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getOrderConsigneeName() {
        return orderConsigneeName;
    }

    public void setOrderConsigneeName(String orderConsigneeName) {
        this.orderConsigneeName = orderConsigneeName == null ? null : orderConsigneeName.trim();
    }

    public String getOrderConsigneePhone() {
        return orderConsigneePhone;
    }

    public void setOrderConsigneePhone(String orderConsigneePhone) {
        this.orderConsigneePhone = orderConsigneePhone == null ? null : orderConsigneePhone.trim();
    }

    public String getOrderConsigneeAddress() {
        return orderConsigneeAddress;
    }

    public void setOrderConsigneeAddress(String orderConsigneeAddress) {
        this.orderConsigneeAddress = orderConsigneeAddress == null ? null : orderConsigneeAddress.trim();
    }

    public BigDecimal getOrderCarriage() {
        return orderCarriage;
    }

    public void setOrderCarriage(BigDecimal orderCarriage) {
        this.orderCarriage = orderCarriage;
    }

    public Short getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Short orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Date getOrderCreateDate() {
        return orderCreateDate;
    }

    public void setOrderCreateDate(Date orderCreateDate) {
        this.orderCreateDate = orderCreateDate;
    }

    public String getOrderRef() {
        return orderRef;
    }

    public void setOrderRef(String orderRef) {
        this.orderRef = orderRef == null ? null : orderRef.trim();
    }

    public BigDecimal getOrderActualPayment() {
        return orderActualPayment;
    }

    public void setOrderActualPayment(BigDecimal orderActualPayment) {
        this.orderActualPayment = orderActualPayment;
    }

    public BigDecimal getOrderTotalPayment() {
        return orderTotalPayment;
    }

    public void setOrderTotalPayment(BigDecimal orderTotalPayment) {
        this.orderTotalPayment = orderTotalPayment;
    }
}