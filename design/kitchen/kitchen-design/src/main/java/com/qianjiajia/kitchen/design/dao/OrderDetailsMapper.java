package com.qianjiajia.kitchen.design.dao;

import com.qianjiajia.kitchen.design.domain.OrderDetails;
import com.qianjiajia.kitchen.design.domain.OrderDetailsExample;
import com.qianjiajia.kitchen.design.query.OrderDetailsQuery;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderDetailsMapper {
    long countByExample(OrderDetailsExample example);

    int deleteByExample(OrderDetailsExample example);

    int deleteByPrimaryKey(String id);

    int insert(OrderDetails record);

    int insertSelective(OrderDetails record);

    List<OrderDetails> selectByExample(OrderDetailsExample example);

    OrderDetails selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") OrderDetails record, @Param("example") OrderDetailsExample example);

    int updateByExample(@Param("record") OrderDetails record, @Param("example") OrderDetailsExample example);

    int updateByPrimaryKeySelective(OrderDetails record);

    int updateByPrimaryKey(OrderDetails record);

    OrderDetails getByOrderDetailsId(String orderDetailsId);

    List<OrderDetailsQuery> getAll(OrderDetailsQuery orderDetailsQuery);

    List<OrderDetails> queryList(String ordersId);
}