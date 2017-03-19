package com.qianjiajia.kitchen.design.service;

import com.qianjiajia.kitchen.common.result.PageResult;
import com.qianjiajia.kitchen.design.domain.*;
import com.qianjiajia.kitchen.design.query.ProductQuery;

import java.util.List;

/**
 * @author qianjiajia
 * @version 1.0
 * @Date 2017-02-28 23:20
 */
public interface IProductService {

    /**
     * 首页滑动商品图片
     */
    List<Product> pageSlide(ProductQuery productQuery);

//    /**
//     * 点击首页滑动图片进入到商品详情介绍
//     */
//    Product pageInfo(Product product);

    /**
     * 添加商品
     */
    void save(Product product);

    /**
     * 查询商品
     * 此处只能查询到商品的一些属性包括：
     * 主图，商品名称，商品价格，商品产地,商品id
     */
    PageResult query(ProductQuery productQuery);

    /**
     * 查询商品
     * 当用户想要查看商品的详情的时候
     * 此处的查询商品，查询的是商品的全部属性
     */
    Product getById(String productId);
    /**
     * 更新商品
     */
    void update(Product product);

    /**
     * 删除商品
     */
    void delete(String productId);

    /**
     * 优惠套餐查询
     */
    List<Product> productIsDiscount(ProductQuery productQuery);

    /**
     * 劲爆团购查询
     */
    List<Product> productIsGroup(ProductQuery productQuery);

    /**
     * 人气推荐查询
     * 根据商品上架日期逆序排序，返回最前面的四条
     */
    List<Product> productByPutawayDate(ProductQuery productQuery);

    /**
     * 根据商品的大类别查询商品
     */
    List<Product> queryByBigClass(String bigClass);

    /**
     * 根据商品的小类别查询商品
     */
    List<SmallClassProduct> queryBySmallClass(String smallClass);

    /**
     *
     * @return
     */
    List<String> getAllBigKeyClass();

    List<String> getAllKeyClass(String bigKeyClass);

    List<PageShow> getAllSlide(Product product);

    List<String> getAllSlide();

    List<DiscountProduct> getAllDiscount(Product product);

    List<GroupProduct> getAllGroup(Product product);

    List<RecommendProduct> getAllRecommend(Product product);
}
