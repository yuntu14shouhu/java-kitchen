package com.qianjiajia.kitchen.design.domain;

import lombok.Data;

/**
 * @author qianjiajia
 * @version 1.0
 * @email qianjiajia_2013@126.com
 * @Date 2017-03-18 16:23
 * @Description 热门推荐商品
 */
@Data
public class RecommendProduct {

    private String id;

    private String productName;

    private String productImageUrl;

    private Double price;
}