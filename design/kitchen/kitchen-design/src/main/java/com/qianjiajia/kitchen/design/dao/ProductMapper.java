package com.qianjiajia.kitchen.design.dao;

import com.qianjiajia.kitchen.design.domain.Product;
import com.qianjiajia.kitchen.design.domain.ProductExample;
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
}