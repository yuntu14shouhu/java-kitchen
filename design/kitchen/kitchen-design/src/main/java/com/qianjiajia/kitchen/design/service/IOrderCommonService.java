package com.qianjiajia.kitchen.design.service;

import com.qianjiajia.kitchen.common.result.PageResult;
import com.qianjiajia.kitchen.design.domain.OrderCommon;
import com.qianjiajia.kitchen.design.query.OrderCommonQuery;

import java.util.List;

/**
 * @author qianjiajia
 * @version 1.0
 * @email qianjiajia_2013@126.com
 * @Date 2017-03-31 10:29
 * @Description 订单service
 */
public interface IOrderCommonService {

    /**
     * 创建订单
     */
    void save(OrderCommon order, String addressId);

    /**
     * 查询订单----订单列表
     * 此处查询结果包括
     *              -----下单时间
     *              -----订单包含商品的全部图片
     *              -----订单合计
     */
    PageResult query(OrderCommonQuery orderCommonQuery);

    /**
     * 删除订单
     */
    void delete(String ordersId);

    /**
     * 根据id查询全部信息
     */
    OrderCommon queryById(String ordersId);

    /**
     *
     */
    List<OrderCommon> queryList(OrderCommon orders);

    OrderCommon queryOrders(OrderCommon orders);

    List<String> queryOrdersId();

}
