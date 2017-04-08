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

    List<Product> queryBySmallClass(String smallClass);

    List<Product> getPage(ProductQuery productQuery);

    List<String> getBigClassData();

    List<String> getKeyClass(String bigKeyClass);

    List<Product> getSlide1(Product product);

    List<String> getSlide();

    List<Product> getDiscount(Product product);

    List<Product> getGroup(Product product);

    List<Product> getRecommend(Product product);

    List<String> queryProductId();

    Product queryToProduct(String productId);

    List<String> getProductIdList();

    List<ProductQuery> fuzzyQuery(ProductQuery productQuery);

    List<ProductQuery> fuzzyQueryProductName(String s);
}