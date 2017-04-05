package com.qianjiajia.kitchen.design.service;

import com.qianjiajia.kitchen.design.domain.OrderCommon;
import com.qianjiajia.kitchen.design.domain.OrderDetails;

/**
 * @author qianjiajia
 * @version 1.0
 * @email qianjiajia_2013@126.com
 * @Date 2017-04-05 10:14
 * @Description 订单详情接口
 */
public interface IOrderDetailsQueryService {

    /**
     * 下单-----
     */
    void save(OrderCommon orders, OrderDetails orderDetails);

    /**
     * 查看订单详情
     */
    
}