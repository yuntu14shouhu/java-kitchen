package com.qianjiajia.kitchen.design.domain;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author qianjiajia
 * @version 1.0
 * @email qianjiajia_2013@126.com
 * @Date 2017-03-19 17:39
 * @Description 根据小类别查询商品list
 */
@Data
public class SmallClassProduct {

    private String id;

    private String productName;

    private String productImageUrl;

    private BigDecimal price;
}