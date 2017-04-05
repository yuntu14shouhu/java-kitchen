package com.qianjiajia.kitchen.design.service.impl;

import com.qianjiajia.kitchen.common.result.PageResult;
import com.qianjiajia.kitchen.common.utils.UUIDUtil;
import com.qianjiajia.kitchen.design.dao.OrderCommonMapper;
import com.qianjiajia.kitchen.design.dao.OrderDetailsMapper;
import com.qianjiajia.kitchen.design.dao.ProductMapper;
import com.qianjiajia.kitchen.design.domain.OrderCommon;
import com.qianjiajia.kitchen.design.domain.OrderDetails;
import com.qianjiajia.kitchen.design.domain.Product;
import com.qianjiajia.kitchen.design.query.OrderDetailsQuery;
import com.qianjiajia.kitchen.design.service.IOrderDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Autowired
    private OrderCommonMapper ordersMapper;

    private OrderCommon orders;

    @Transactional
    @Override
    public void save(OrderDetails orderDetails,String productId) {

        List<String> productIdList = productMapper.getProductIdList();

        List<String> ordersIdList = ordersMapper.getOrdersIdList();

        orderDetails.setId(UUIDUtil.getUUID());

        for(int i = 0; i < productIdList.size(); i++){
            if(productId.equals(productIdList.get(i))){
                product = productMapper.queryToProduct(productId);
                orderDetails.setOrderProductName(product.getProductName());
                orderDetails.setOrderProductImageUrl(product.getProductImageUrl());
                orderDetails.setOrderPrice(product.getPrice());
            }
        }
        for(int j = 0; j < ordersIdList.size(); j++){
            if(orderDetails.getOrderId().equals(ordersIdList.get(j))){
                orders = ordersMapper.queryById(orderDetails.getOrderId());
                orderDetails.setOrderId(orders.getId());
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

    @Override
    public List<OrderDetails> queryList(String ordersId) {
        return orderDetailsMapper.queryList(ordersId);
    }

}