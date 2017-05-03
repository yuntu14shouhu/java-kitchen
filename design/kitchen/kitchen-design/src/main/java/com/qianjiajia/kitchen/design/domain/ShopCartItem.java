package com.qianjiajia.kitchen.design.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author qianjiajia
 * @version 1.0
 * @email qianjiajia_2013@126.com
 * @Date 2017-04-22 16:20
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShopCartItem {

    private Product product;

    private Integer count;

    private Double AllTotalMoney;

}