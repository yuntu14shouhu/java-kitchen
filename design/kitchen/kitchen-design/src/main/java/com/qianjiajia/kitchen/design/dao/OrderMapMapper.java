package com.qianjiajia.kitchen.design.dao;

import com.qianjiajia.kitchen.design.domain.OrderMap;
import com.qianjiajia.kitchen.design.domain.OrderMapExample;
import com.qianjiajia.kitchen.design.query.ShopQueryView;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderMapMapper {
    long countByExample(OrderMapExample example);

    int deleteByExample(OrderMapExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrderMap record);

    int insertSelective(OrderMap record);

    List<OrderMap> selectByExample(OrderMapExample example);

    OrderMap selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrderMap record, @Param("example") OrderMapExample example);

    int updateByExample(@Param("record") OrderMap record, @Param("example") OrderMapExample example);

    int updateByPrimaryKeySelective(OrderMap record);

    int updateByPrimaryKey(OrderMap record);

    OrderMap queryNumber(@Param("orderId") String id, @Param("productId") String productId);

    OrderMap queryMap(@Param("orderId") String orderId,@Param("productId") String productId);

    void deleteByOrderIdAndProductId(@Param("orderId") String orderId, @Param("productId") String productId);

    List<ShopQueryView> queryOrderInfo(String orderId);
}