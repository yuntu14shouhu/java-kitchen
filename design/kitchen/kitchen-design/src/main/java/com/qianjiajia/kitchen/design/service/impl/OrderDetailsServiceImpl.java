package com.qianjiajia.kitchen.design.service.impl;

import com.qianjiajia.kitchen.common.result.PageResult;
import com.qianjiajia.kitchen.common.utils.UUIDUtil;
import com.qianjiajia.kitchen.design.dao.OrderDetailsMapper;
import com.qianjiajia.kitchen.design.dao.OrdersMapper;
import com.qianjiajia.kitchen.design.dao.ProductMapper;
import com.qianjiajia.kitchen.design.domain.OrderDetails;
import com.qianjiajia.kitchen.design.domain.Orders;
import com.qianjiajia.kitchen.design.domain.Product;
import com.qianjiajia.kitchen.design.query.OrderDetailsQuery;
import com.qianjiajia.kitchen.design.service.IOrderDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qianjiajia
 * @version 1.0
 * @email qianjiajia_2013@126.com
 * @Date 2017-03-31 13:55
 * @Description 订单详情接口实现类
 */
@Service
public class OrderDetailsServiceImpl implements IOrderDetailsService{

    @Autowired
    private OrderDetailsMapper orderDetailsMapper;

    @Autowired
    private ProductMapper productMapper;

    private Product product;

    @Transactional
    @Override
    public void save(OrderDetails orderDetails,String productId) {

        List<String> productIdList = productMapper.getProductIdList();

        orderDetails.setId(UUIDUtil.getUUID());

        for(int i = 0; i < productIdList.size(); i++){
            if(productId.equals(productIdList.get(i))){
                product = productMapper.getById(productId);
                orderDetails.setOrderProductName(product.getProductName());
                orderDetails.setOrderProductImageUrl(product.getProductImageUrl());
                orderDetails.setOrderPrice(product.getPrice());
            }
        }
        orderDetailsMapper.insert(orderDetails);
    }

    @Override
    public PageResult query(OrderDetailsQuery orderDetailsQuery) {
        List<OrderDetailsQuery> orderDetailsQueryList = orderDetailsMapper.getAll(orderDetailsQuery);
        return new PageResult(orderDetailsQueryList);
    }

    @Override
    public OrderDetails getByOrderDetailsId(String orderDetailsId) {
        return orderDetailsMapper.getByOrderDetailsId(orderDetailsId);
    }

    @Transactional
    @Override
    public void delete(String ordersDetailsId) {
        orderDetailsMapper.deleteByPrimaryKey(ordersDetailsId);
    }
}