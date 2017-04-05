package com.qianjiajia.kitchen.design.dao;

import com.qianjiajia.kitchen.design.domain.OrderDetailsModify;
import com.qianjiajia.kitchen.design.domain.OrderDetailsModifyExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderDetailsModifyMapper {
    long countByExample(OrderDetailsModifyExample example);

    int deleteByExample(OrderDetailsModifyExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrderDetailsModify record);

    int insertSelective(OrderDetailsModify record);

    List<OrderDetailsModify> selectByExampleWithBLOBs(OrderDetailsModifyExample example);

    List<OrderDetailsModify> selectByExample(OrderDetailsModifyExample example);

    OrderDetailsModify selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrderDetailsModify record, @Param("example") OrderDetailsModifyExample example);

    int updateByExampleWithBLOBs(@Param("record") OrderDetailsModify record, @Param("example") OrderDetailsModifyExample example);

    int updateByExample(@Param("record") OrderDetailsModify record, @Param("example") OrderDetailsModifyExample example);

    int updateByPrimaryKeySelective(OrderDetailsModify record);

    int updateByPrimaryKeyWithBLOBs(OrderDetailsModify record);

    int updateByPrimaryKey(OrderDetailsModify record);

    OrderDetailsModify getById(String orderId);
}