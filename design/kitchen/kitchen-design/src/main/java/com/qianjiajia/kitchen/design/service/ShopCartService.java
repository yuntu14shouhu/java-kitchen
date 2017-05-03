package com.qianjiajia.kitchen.design.service;

import com.qianjiajia.kitchen.design.domain.ShopCartItem;

import java.util.Map;

/**
 * @author qianjiajia
 * @version 1.0
 * @email qianjiajia_2013@126.com
 * @Date 2017-04-24 10:23
 */
public interface ShopCartService {

    void addProduct(ShopCartItem shopCartItem);

    void deleteProduct(String productId);

    void clearShopCart();

    double getAllPrice();

    Map getShopCartMap();
}