package com.qianjiajia.kitchen.design.service.impl;

import com.qianjiajia.kitchen.common.utils.UUIDUtil;
import com.qianjiajia.kitchen.design.dao.ProductMapper;
import com.qianjiajia.kitchen.design.dao.ShoppingCartMapper;
import com.qianjiajia.kitchen.design.domain.Product;
import com.qianjiajia.kitchen.design.domain.ShoppingCart;
import com.qianjiajia.kitchen.design.service.IShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author qianjiajia
 * @version 1.0
 * @Date 2017-03-01 9:35
 * @Description 购物车
 */
@Service
public class ShoppingCartServiceImpl implements IShoppingCartService {

    @Autowired
    private ShoppingCartMapper shoppingCartMapper;

    @Transactional
    @Override
    public void save(ShoppingCart shoppingCart) {
        shoppingCart.setId(UUIDUtil.getUUID());
        shoppingCartMapper.save(shoppingCart);
    }

    @Transactional
    @Override
    public void delete(String shopId) {
        shoppingCartMapper.deleteByPrimaryKey(shopId);
    }

    @Transactional
    @Override
    public void update(ShoppingCart shoppingCart) {
        shoppingCartMapper.updateByPrimaryKey(shoppingCart);
    }

    @Override
    public List<String> query() {
        return shoppingCartMapper.query();
    }

    @Override
    public String queryId(ShoppingCart shoppingCart) {
        return shoppingCartMapper.queryId(shoppingCart);
    }
}