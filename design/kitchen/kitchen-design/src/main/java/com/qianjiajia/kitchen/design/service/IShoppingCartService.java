package com.qianjiajia.kitchen.design.service;

import com.qianjiajia.kitchen.common.result.MessageResult;
import com.qianjiajia.kitchen.design.domain.OrderDetailsModify;
import com.qianjiajia.kitchen.design.domain.ShoppingCart;
import com.qianjiajia.kitchen.design.query.ShopQueryView;

import java.util.List;

/**
 * @author qianjiajia
 * @version 1.0
 * @Date 2017-02-28 23:21
 */
public interface IShoppingCartService {

    /**
     * 添加商品到购物车
     * 判断用户的购物车是否为空
     * 为空----创建一个购物车对象
     * 不为空---添加商品到购物车
     *
     */
    void save(String orderId);


    void saveProductToShop(String productId);

    void updateOrder(String orderId);

    /**
     * 删除一种商品,或者数量-1
     */
    void deleteProduct(String productId);

    /**
     * 清空购物车
     */
    void emptyShoppingCart();

    /**
     * 更新
     */
    void update(String productId);



    /**
     * 查看购物车
     */
    OrderDetailsModify query();

    String queryId(ShoppingCart shoppingCart);




    void updateNumber(String orderId, String productId);

    void updateStatus(String orderId);

    MessageResult deleteProductNow(String orderId, String productId);

    MessageResult updateNumberPlus(String orderId, String productId);

    MessageResult updateNumberMinus(String orderId, String productId);

    List<ShopQueryView> queryShop();
}
