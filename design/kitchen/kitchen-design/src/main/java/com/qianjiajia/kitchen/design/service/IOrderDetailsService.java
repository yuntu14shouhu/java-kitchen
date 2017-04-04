package com.qianjiajia.kitchen.design.service;

import com.qianjiajia.kitchen.common.result.PageResult;
import com.qianjiajia.kitchen.design.domain.OrderDetails;
import com.qianjiajia.kitchen.design.query.OrderDetailsQuery;

/**
 * @author qianjiajia
 * @version 1.0
 * @email qianjiajia_2013@126.com
 * @Date 2017-03-31 13:41
 * @Description 订单详情service
 */
public interface IOrderDetailsService {

    /**
     * 下单
     */
    void save(OrderDetails orderDetails,String productId);

    /**
     * 查询订单----订单列表
     * 此处查询结果包括
     *              -----下单时间
     *              -----订单包含商品的全部图片
     *              -----订单合计
     */
    PageResult query(OrderDetailsQuery orderDetailsQuery);

    /**
     * 查询订单----订单详情
     * 此处查询出订单的全部信息
     */
    OrderDetails getByOrderDetailsId(String orderDetailsId);

    /**
     * 删除订单
     */
    void delete(String ordersDetailsId);
}