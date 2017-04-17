package com.qianjiajia.kitchen.design.service.impl;

import com.qianjiajia.kitchen.common.utils.UUIDUtil;
import com.qianjiajia.kitchen.design.dao.ProAndShopMapper;
import com.qianjiajia.kitchen.design.dao.ProductMapper;
import com.qianjiajia.kitchen.design.dao.ShoppingCartMapper;
import com.qianjiajia.kitchen.design.domain.ProAndShop;
import com.qianjiajia.kitchen.design.domain.ShoppingCart;
import com.qianjiajia.kitchen.design.domain.Users;
import com.qianjiajia.kitchen.design.service.IProAndShopService;
import com.qianjiajia.kitchen.design.utils.UserLoginUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.sun.tools.doclint.Entity.nu;

/**
 * @author qianjiajia
 * @version 1.0
 * @email qianjiajia_2013@126.com
 * @Date 2017-04-12 10:26
 * @Description 商品和购物车关联实现表
 */
@Service
public class ProAndShopServiceImpl implements IProAndShopService {

    @Autowired
    private ProAndShopMapper proAndShopMapper;

    @Autowired
    private ShoppingCartMapper shoppingCartMapper;

    private ShoppingCart shoppingCart;

    @Autowired
    private ProductMapper productMapper;

    @Override
    public Map queryByShopId(String shopId) {
        Map resultMap = new HashMap();
        List resultList = new ArrayList();
        List<String> shopIds = proAndShopMapper.queryShopIds();
        List<String> productIds = new ArrayList<>();
        for (int i = 0; i < shopIds.size(); i++) {
            Map numberMap = new HashMap();
            int number = 0;
            if (shopId == shopIds.get(i)) {
                productIds = proAndShopMapper.queryByShopId(shopId);
                for (int j = 0; j < productIds.size(); j++) {
                    number = proAndShopMapper.getNumber(productIds.get(j));
//                   numberMap.put(productMapper.queryProductNameById(productIds.get(i)),number);
                }
            }
            numberMap.put("number", number);
            numberMap.put("productName", productMapper.queryToProduct(productIds.get(i)).getProductName());
            numberMap.put("productImageUrl", productMapper.queryToProduct(productIds.get(i)).getProductImageUrl());
            numberMap.put("productPrice", productMapper.queryToProduct(productIds.get(i)).getPrice());
            resultList.add(numberMap);
            resultMap.put("shopList",resultList);
        }
        return resultMap;
    }

    @Transactional
    @Override
    public void saveProductType(ProAndShop proAndShop) {
        proAndShop.setId(UUIDUtil.getUUID());
        //需要获取到购物车id
//        proAndShop.setShoppingCartId(shoppingCartMapper.query());
        proAndShopMapper.saveProductType(proAndShop);
    }

    @Transactional
    @Override
    public void updateProductNumber(ProAndShop proAndShop) {
        proAndShopMapper.updateProductNumber(proAndShop);
    }

    @Transactional
    @Override
    public void deleteProductType(String proAndShopId) {
        proAndShopMapper.deleteByPrimaryKey(proAndShopId);
    }

    @Override
    public void saveShop(ProAndShop proAndShop) {
        proAndShop.setId(UUIDUtil.getUUID());
        //需要获取到购物车id
        shoppingCart = new ShoppingCart();
        shoppingCartMapper.save(shoppingCart);
        proAndShop.setShoppingCartId(shoppingCart.getId());
        proAndShopMapper.saveShop(proAndShop);
    }

    @Override
    public List<String> queryShopIds() {
        List<String> shopIds = proAndShopMapper.queryShopIds();
        return shopIds;
    }
}