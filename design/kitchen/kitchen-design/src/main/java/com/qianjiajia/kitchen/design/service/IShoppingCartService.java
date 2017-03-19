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
     * 根据购物车状态，用户id查询购物车
     */
    List<ShoppingCart> getAppointedProduct(int status, String usersId);

    /**
     * 根据用户id获取购物车中的所有商品
     */
    List<ShoppingCart> getByUsersIdAllProduct(String usersId);

    /**
     * 根据购物车状态，商品id，用户id查询购物车
     */
    ShoppingCart queryByProductId(int status,String productId,String usersId);

    /**
     * 根据购物车状态，商品id，用户id删除购物车
     */
    void delete(int status,String productId,String usersId);

    /**
     * 根据用户id，购物车状态删除购物车
     */
    void deleteAll(String usersId,int status);

    /**
     * 添加商品到购物车
     * 该商品已经存在
     */
    void saveById(String id);

    /**
     * 添加商品到购物车
     * 商品不存在
     */
    void save(ShoppingCart shoppingCart);

    /**
     * 修改购物车信息
     */
    void updateStatus(String id);

    /**
     *
     */
    void updateNumber(String id);


}
