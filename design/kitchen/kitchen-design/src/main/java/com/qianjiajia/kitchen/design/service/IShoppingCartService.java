package com.qianjiajia.kitchen.design.service;

import com.qianjiajia.kitchen.design.domain.ShoppingCart;

import java.util.List;

/**
 * @author qianjiajia
 * @version 1.0
 * @Date 2017-02-28 23:21
 */
public interface IShoppingCartService {

    /**
     * 创建
     */
    void save(ShoppingCart shoppingCart);

    /**
     * 删除
     */
    void delete(String shopId);

    /**
     * 更新
     */
    void update(ShoppingCart shoppingCart);

    /**
     * 查找
     */
    List<String> query();

    String queryId(ShoppingCart shoppingCart);

}
