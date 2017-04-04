package com.qianjiajia.kitchen.design.dao;

import com.qianjiajia.kitchen.design.domain.Orders;
import com.qianjiajia.kitchen.design.domain.OrdersExample;
import com.qianjiajia.kitchen.design.query.OrdersQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrdersMapper {

    int deleteByPrimaryKey(String id);

    Orders selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);
    long countByExample(OrdersExample example);

    int deleteByExample(OrdersExample example);

    int insert(Orders record);

    int insertSelective(Orders record);

    List<Orders> selectByExample(OrdersExample example);

    int updateByExampleSelective(@Param("record") Orders record, @Param("example") OrdersExample example);

    int updateByExample(@Param("record") Orders record, @Param("example") OrdersExample example);

    List<Orders> getAll(OrdersQuery ordersQuery);

    List<String> getOrdersIdList();

    Orders queryById(String ordersId);
}