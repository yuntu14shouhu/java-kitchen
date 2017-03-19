package com.qianjiajia.kitchen.design.domain;

import lombok.Data;

import java.util.Date;

/**
 * @author qianjiajia
 * @version 1.0
 * @email qianjiajia_2013@126.com
 * @Date 2017-03-18 16:23
 * @Description 团购商品
 */
@Data
public class GroupProduct {

    private String id;

    private String productName;

    private String productImageUrl;

    private Integer isGroup;

    private Double price;

    private Double groupBuyPrice;

    private Double groupBuyPersonNumber;

    private Date startGroupBuyDate;

    private Date endGroupBuyDate;

}