package com.qianjiajia.kitchen.design.service.impl;

import com.qianjiajia.kitchen.common.utils.UUIDUtil;
import com.qianjiajia.kitchen.design.dao.ShoppingCartMapper;
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

    @Override
    public List<ShoppingCart> getAppointedProduct(int status, String usersId) {
        return shoppingCartMapper.query(status,usersId);
    }

    @Override
    public List<ShoppingCart> getByUsersIdAllProduct(String usersId) {
        return shoppingCartMapper.queryByUserId(usersId);
    }

    @Override
    public ShoppingCart queryByProductId(int status, String productId, String usersId) {
        return shoppingCartMapper.queryByProductId(status,productId,usersId);
    }

    @Override
    @Transactional
    public void delete(int status, String productId, String usersId) {
         shoppingCartMapper.deleteByStatusAndProduct(status,productId,usersId);
    }

    @Override
    @Transactional
    public void deleteAll(String usersId, int status) {
         shoppingCartMapper.deleteByStatus(usersId,status);
    }

    @Override
    @Transactional
    public void saveById(String id) {
        shoppingCartMapper.updateNumber(id);
    }

    @Override
    @Transactional
    public void save(ShoppingCart shoppingCart) {
        shoppingCart.setId(UUIDUtil.getUUID());
       shoppingCartMapper.insert(shoppingCart);
    }

    @Override
    @Transactional
    public void updateStatus(String id) {
        shoppingCartMapper.updateStatus(id);
    }

    @Override
    @Transactional
    public void updateNumber(String id) {
        shoppingCartMapper.updateNumber(id);
    }
}