package com.qianjiajia.kitchen.design.service;

import java.util.List;
import java.util.Map;

/**
 * @author qianjiajia
 * @version 1.0
 * @email qianjiajia_2013@126.com
 * @Date 2017-04-05 22:13
 * @Description 创建订单
 */
public interface IOrderDetailsModifyService {

    /**
     * 创建商品订单
     */
    void  save(List<String> productId, String addressId);

    /**
     * 订单查询
     */
    Map queryList(String orderId);
}
