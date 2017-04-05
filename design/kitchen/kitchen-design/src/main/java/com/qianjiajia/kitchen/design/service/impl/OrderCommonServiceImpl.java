package com.qianjiajia.kitchen.design.service.impl;

import com.qianjiajia.kitchen.common.annotation.Page;
import com.qianjiajia.kitchen.common.result.PageResult;
import com.qianjiajia.kitchen.common.utils.UUIDUtil;
import com.qianjiajia.kitchen.design.dao.AddressMapper;
import com.qianjiajia.kitchen.design.dao.OrderCommonMapper;
import com.qianjiajia.kitchen.design.domain.Address;
import com.qianjiajia.kitchen.design.domain.OrderCommon;
import com.qianjiajia.kitchen.design.query.OrderCommonQuery;
import com.qianjiajia.kitchen.design.service.IOrderCommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * @author qianjiajia
 * @version 1.0
 * @email qianjiajia_2013@126.com
 * @Date 2017-03-31 13:54
 * @Description 订单实现类
 */
@Service
public class OrderCommonServiceImpl implements IOrderCommonService {

    @Autowired
    private OrderCommonMapper ordersMapper;

    @Autowired
    private AddressMapper addressMapper;

    private Address address;

    @Transactional
    @Override
    public void save(OrderCommon order, String addressId) {
        List<String> addressIdList = addressMapper.queryIdList();
        order.setId(UUIDUtil.getUUID());//id
        order.setOrderCreateDate(new Date());//下单日期
        order.setOrderRef(UUIDUtil.getUUID());//订单编号
        for (int i =0;i<addressIdList.size();i++){
            if(addressId.equals(addressIdList.get(i))){
                address = addressMapper.getById(addressId);
                order.setOrderConsigneeName(address.getConsigneeName());
                order.setOrderConsigneePhone(address.getConsigneePhone());
                order.setOrderConsigneeAddress(address.getConsigneeAddress());
            }
        }
        ordersMapper.insert(order);
    }

    @Override
    @Page
    public PageResult query(OrderCommonQuery orderCommonQuery) {
        List<OrderCommon> ordersList = ordersMapper.getAll(orderCommonQuery);
        return new PageResult(ordersList);
    }

    @Transactional
    @Override
    public void delete(String ordersId) {
        ordersMapper.deleteByPrimaryKey(ordersId);
    }

    @Override
    public OrderCommon queryById(String ordersId) {
        return ordersMapper.queryById(ordersId);
    }

    @Override
    public List<OrderCommon> queryList(OrderCommon orders) {
        return ordersMapper.queryList(orders);
    }

    @Override
    public OrderCommon queryOrders(OrderCommon orders) {
        return ordersMapper.queryOrders(orders);
    }

    @Override
    public List<String> queryOrdersId() {
        return ordersMapper.queryOrdersId();
    }

}