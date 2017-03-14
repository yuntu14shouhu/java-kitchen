package com.qianjiajia.kitchen.design.dao;

import com.qianjiajia.kitchen.design.domain.ShoppingCart;
import com.qianjiajia.kitchen.design.domain.ShoppingCartExample;
import com.qianjiajia.kitchen.design.query.ShoppingCartQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShoppingCartMapper {
    long countByExample(ShoppingCartExample example);

    int deleteByExample(ShoppingCartExample example);

    int deleteByPrimaryKey(String id);

    int insert(ShoppingCart record);

    int insertSelective(ShoppingCart record);

    List<ShoppingCart> selectByExample(ShoppingCartExample example);

    ShoppingCart selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ShoppingCart record, @Param("example") ShoppingCartExample example);

    int updateByExample(@Param("record") ShoppingCart record, @Param("example") ShoppingCartExample example);

    int updateByPrimaryKeySelective(ShoppingCart record);

    int updateByPrimaryKey(ShoppingCart record);

    List<ShoppingCart> get(String usersId);

    List<ShoppingCart> getByStatus(ShoppingCartQuery shoppingCartQuery);

    List<ShoppingCart> query(@Param("status") int status, @Param("userId") String usersId);

    List<ShoppingCart> queryByUserId(String usersId);

    ShoppingCart queryByProductId(@Param("status") int status,@Param("productId") String productId,@Param("userId") String usersId);

    int deleteByStatusAndProduct(@Param("status") int status, @Param("productId") String productId,@Param("userId") String usersId);

    int deleteByStatus(@Param("userId") String usersId,@Param("status") int status);

    void updateStatus(String id);

    void updateNumber(String id);
}