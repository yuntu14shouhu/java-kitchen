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
     * 订单详情查询
     */
    Map queryOrderDetails(String orderId);

    /**
     * 点击+号，商品数量发生改变，重新计算价格
     */
    void plus(List<String> productIds);

    /**
     * 点击-号，商品数量发生改变，重新计算价格
     */
    void minus(List<String> productIds);

    /**
     * 查询全部订单对象
     * 只显示-----
     * 下单时间，订单全部商品图片，订单合计
     */
    List queryOrders(String userId);

    /**
     * 查询全部订单
     * 只显示-----
     * 下单时间，订单全部商品图片，订单合计
     */
}
