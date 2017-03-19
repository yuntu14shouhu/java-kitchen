package com.qianjiajia.kitchen.design.dao;

import com.qianjiajia.kitchen.design.domain.*;
import com.qianjiajia.kitchen.design.query.ProductQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductMapper {
    long countByExample(ProductExample example);

    int deleteByExample(ProductExample example);

    int deleteByPrimaryKey(String id);

    int insert(Product record);

    int insertSelective(Product record);

    List<Product> selectByExample(ProductExample example);

    Product selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Product record, @Param("example") ProductExample example);

    int updateByExample(@Param("record") Product record, @Param("example") ProductExample example);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);

    List<Product> getAll(ProductQuery productQuery);

    Product getById(String productId);

    List<Product> productIsDiscount(ProductQuery productQuery);

    List<Product> productIsGroup(ProductQuery productQuery);

    List<Product> productByPutawayDate(ProductQuery productQuery);

    List<Product> queryByBigClass(@Param("bigKeyClass") String bigClass);

    List<SmallClassProduct> queryBySmallClass(String smallClass);

    List<Product> getPage(ProductQuery productQuery);

    List<String> getBigClassData();

    List<String> getKeyClass(String bigKeyClass);

    List<PageShow> getSlide1(Product product);

    List<String> getSlide();

    List<DiscountProduct> getDiscount(Product product);

    List<GroupProduct> getGroup(Product product);

    List<RecommendProduct> getRecommend(Product product);
}