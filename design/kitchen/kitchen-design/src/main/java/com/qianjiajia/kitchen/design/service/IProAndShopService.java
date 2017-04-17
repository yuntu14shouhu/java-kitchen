package com.qianjiajia.kitchen.design.service;

import com.qianjiajia.kitchen.design.domain.ProAndShop;

import java.util.List;
import java.util.Map;

/**
 * @author qianjiajia
 * @version 1.0
 * @email qianjiajia_2013@126.com
 * @Date 2017-04-12 10:26
 * @Description 商品和购物车关联表
 */
public interface IProAndShopService {

    /**
     * 根据购物车id查询购物车详情
     */
    Map queryByShopId(String shopId);

    /**
     * 向已存在的购物车里面添加一种购物车中原本不存在的商品
     * 购物车id已经存在
     */
    void saveProductType(ProAndShop proAndShop);

    /**
     * 更新在已存在的购物车中的商品的数量
     */
    void updateProductNumber(ProAndShop proAndShop);

    /**
     * 删除购物车里面的一种商品
     */
    void deleteProductType(String proAndShopId);

    /**
     * 当用户新建了一个购物车后
     * 购物车id不存在
     * 会把购物车id和商品id
     * 保存在购物车和商品映射表中
     */
    void saveShop(ProAndShop proAndShop);

    /**
     * 查询到全部购物车ids
     */
    List<String> queryShopIds();


}
