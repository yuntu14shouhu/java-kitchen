package com.qianjiajia.kitchen.design.dao;

import com.qianjiajia.kitchen.design.domain.OrderCommon;
import com.qianjiajia.kitchen.design.domain.OrderCommonExample;
import com.qianjiajia.kitchen.design.query.OrderCommonQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderCommonMapper {
    long countByExample(OrderCommonExample example);

    int deleteByExample(OrderCommonExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrderCommon record);

    int insertSelective(OrderCommon record);

    List<OrderCommon> selectByExample(OrderCommonExample example);

    OrderCommon selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrderCommon record, @Param("example") OrderCommonExample example);

    int updateByExample(@Param("record") OrderCommon record, @Param("example") OrderCommonExample example);

    int updateByPrimaryKeySelective(OrderCommon record);

    int updateByPrimaryKey(OrderCommon record);

    List<OrderCommon> getAll(OrderCommonQuery orderCommonQuery);

    List<String> getOrdersIdList();

    OrderCommon queryById(String ordersId);

    List<OrderCommon> queryList(OrderCommon orders);

    OrderCommon queryOrders(OrderCommon orders);

    List<String> queryOrdersId();
}