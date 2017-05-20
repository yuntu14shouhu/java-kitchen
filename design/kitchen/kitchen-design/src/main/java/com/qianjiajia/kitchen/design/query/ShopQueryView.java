package com.qianjiajia.kitchen.design.query;

import com.qianjiajia.kitchen.common.query.BaseQuery;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author qianjiajia
 * @version 1.0
 * @email qianjiajia_2013@126.com
 * @Date 2017-05-21 0:48
 * @Description 购物车查询
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShopQueryView extends BaseQuery {

    private String imageUrl;
    private String productName;
    private BigDecimal price;
    private int productNumber;


}