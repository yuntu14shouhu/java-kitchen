package com.qianjiajia.kitchen.design.service;

import com.qianjiajia.kitchen.common.result.PageResult;
import com.qianjiajia.kitchen.design.domain.Orders;
import com.qianjiajia.kitchen.design.query.OrdersQuery;

/**
 * @author qianjiajia
 * @version 1.0
 * @email qianjiajia_2013@126.com
 * @Date 2017-03-31 10:29
 * @Description 订单service
 */
public interface IOrdersService {

    /**
     * 创建订单
     */
    void save(Orders order, String addressId);

    /**
     * 查询订单----订单列表
     * 此处查询结果包括
     *              -----下单时间
     *              -----订单包含商品的全部图片
     *              -----订单合计
     */
    PageResult query(OrdersQuery ordersQuery);

    /**
     * 删除订单
     */
    void delete(String ordersId);

    /**
     * 根据id查询全部信息
     */
    Orders queryById(String ordersId);

}
