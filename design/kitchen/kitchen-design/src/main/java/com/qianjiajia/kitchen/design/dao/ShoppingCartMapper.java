package com.qianjiajia.kitchen.design.dao;

import com.qianjiajia.kitchen.design.domain.ShoppingCart;
import com.qianjiajia.kitchen.design.domain.ShoppingCartExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShoppingCartMapper {
    long countByExample(ShoppingCartExample example);

    int deleteByExample(ShoppingCartExample example);

    int deleteByPrimaryKey(String id);

    int insert(ShoppingCart record);

    int insertSelective(ShoppingCart record);

    List<ShoppingCart> selectByExampleWithBLOBs(ShoppingCartExample example);

    List<ShoppingCart> selectByExample(ShoppingCartExample example);

    ShoppingCart selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ShoppingCart record, @Param("example") ShoppingCartExample example);

    int updateByExampleWithBLOBs(@Param("record") ShoppingCart record, @Param("example") ShoppingCartExample example);

    int updateByExample(@Param("record") ShoppingCart record, @Param("example") ShoppingCartExample example);

    int updateByPrimaryKeySelective(ShoppingCart record);

    int updateByPrimaryKeyWithBLOBs(ShoppingCart record);

    int updateByPrimaryKey(ShoppingCart record);

    ShoppingCart getShopByUserId(String id);

    void save(ShoppingCart shoppingCart);




//    String getOrderIdByUserId(String id);


}