package com.qianjiajia.kitchen.design.domain;

import lombok.Data;

import java.util.Date;

/**
 * @author qianjiajia
 * @version 1.0
 * @email qianjiajia_2013@126.com
 * @Date 2017-03-18 16:23
 * @Description 打折商品
 */
@Data
public class DiscountProduct {

    private String id;

    private String productName;

    private String productImageUrl;

    private Integer isDiscount;

    private Double price;

    private Double discountPrice;

    private Date startDate;

    private Date endDate;

}