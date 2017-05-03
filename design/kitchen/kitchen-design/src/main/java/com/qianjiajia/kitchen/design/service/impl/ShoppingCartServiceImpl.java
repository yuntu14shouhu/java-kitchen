package com.qianjiajia.kitchen.design.service.impl;

import com.qianjiajia.kitchen.common.utils.UUIDUtil;
import com.qianjiajia.kitchen.design.dao.OrderDetailsModifyMapper;
import com.qianjiajia.kitchen.design.dao.ProductMapper;
import com.qianjiajia.kitchen.design.dao.ShoppingCartMapper;
import com.qianjiajia.kitchen.design.domain.OrderDetailsModify;
import com.qianjiajia.kitchen.design.domain.ShoppingCart;
import com.qianjiajia.kitchen.design.service.IOrderDetailsModifyService;
import com.qianjiajia.kitchen.design.service.IShoppingCartService;
import com.qianjiajia.kitchen.design.utils.UserLoginUtils;
import com.sun.tools.corba.se.idl.constExpr.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @Autowired
    private OrderDetailsModifyMapper orderDetailsModifyMapper;

    @Autowired
    private ProductMapper productMapper;

    @Autowired
    private IOrderDetailsModifyService orderDetailsModifyService;

    Map<String,Integer> productIdAndNumberMap = new HashMap<>();

    @Transactional
    @Override
    public void saveProductToShop(String productId) {

//        1----购物车中没有商品时
//        生成状态为""的订单，productId传进去
        ShoppingCart shoppingCart = shoppingCartMapper.getShopByUserId(UserLoginUtils.currentUser.getId());
        orderDetailsModifyService.saveStatusZero(productId);
        OrderDetailsModify orderDetailsModify = orderDetailsModifyService.queryStatusZero();
        shoppingCart.setOrderIdList(orderDetailsModify.getId());
//        shoppingCart.setUserId(UserLoginUtils.currentUser.getId());
        shoppingCartMapper.updateByPrimaryKey(shoppingCart);
        //购物车已经存在商品的时候,查询到订单状态为0的订单
        OrderDetailsModify orderDetailsModify1 = orderDetailsModifyService.queryStatusZero();

        if(orderDetailsModify1 != null){
//            updateOrder(orderDetailsModify.getId());
            if(productIdAndNumberMap.containsKey(orderDetailsModify1.getOrderProductId())){
                //商品已经存在了
                int num = productIdAndNumberMap.get(orderDetailsModify1.getOrderProductId());
                orderDetailsModify1.setOrderProductNumber(orderDetailsModify1.getOrderProductNumber() + num);
            }else {
                //不存在新添加的商品时
                productIdAndNumberMap.put(productId,orderDetailsModify1.getOrderProductNumber());
            }

        }

    }

    @Override
    public void updateOrder(String orderId) {

    }


    @Transactional
    @Override
    public void save(String orderId) {

        //根据用户id获取购物车id
        ShoppingCart shoppingCart = shoppingCartMapper.getShopByUserId(UserLoginUtils.currentUser.getId());
        if (shoppingCart == null) {
            shoppingCart = new ShoppingCart();
            shoppingCart.setId(UUIDUtil.getUUID());
            shoppingCart.setUserId(UserLoginUtils.currentUser.getId());

            shoppingCart.setOrderIdList(orderId);

            shoppingCartMapper.save(shoppingCart);
        } else {
            //把订单list取出来
            String orderIds = shoppingCart.getOrderIdList() == null ? "" : shoppingCart.getOrderIdList();
            StringBuffer orderList = new StringBuffer(orderIds);
            orderList.append(",").append(orderId);
            shoppingCart.setOrderIdList(orderList.toString());
            shoppingCartMapper.save(shoppingCart);
//            String[] a = orderIds.split(",");
        }
    }


    @Transactional
    @Override
    public void deleteProduct(String productId) {
        int num = productIdAndNumberMap.get(productId);
        if(num == 1){
            productIdAndNumberMap.remove(productId);
        }else {
            //修改商品数量
            OrderDetailsModify orderDetailsModify = orderDetailsModifyMapper.getById(orderDetailsModifyMapper.getProductId(productId));
            num = orderDetailsModify.getOrderProductNumber() - 1;
            //修改合计
            orderDetailsModify.setOrderTotalPayment(orderDetailsModify.getOrderTotalPayment().subtract(productMapper.queryToProduct(productId).getPrice()));
        }
    }

    @Transactional
    @Override
    public void emptyShoppingCart() {
        productIdAndNumberMap.clear();
    }

    @Override
    public void update(String productId) {

    }

    @Override
    public OrderDetailsModify query() {

        return orderDetailsModifyService.queryStatusZero();
    }

    @Override
    public String queryId(ShoppingCart shoppingCart) {
        return null;
    }

//    @Transactional
//    @Override
//    public void update(String productId) {
//        //根据用户获取订单id
//        String orderIdList = shoppingCartMapper.getOrderIdByUserId(UserLoginUtils.currentUser.getId());
//        String[] orderIds = orderIdList.split(",");
//        String orderId = null;
//        for (int i = 0;i < orderIds.length;i++){
//
//            OrderDetailsModify orderDetailsModify = orderDetailsModifyMapper.getById(orderIds[i]);
//            if(StringUtils.isEmpty(orderDetailsModify.getOrderStatus())){
//                orderId = orderDetailsModify.getId();
//                break;
//            }
//
//        }
//        //没有订单或者订单已经全部生效
//        if(StringUtils.isEmpty(orderId)){
//            OrderDetailsModify orderDetailsModify = new OrderDetailsModify();
//            orderDetailsModify.setId(UUIDUtil.getUUID());
//            orderDetailsModify.setOrderProductId(productId);
//            orderDetailsModifyMapper.save(orderDetailsModify);
//            //添加到购物车
//            save(orderDetailsModify.getId());
//        }else {
//            OrderDetailsModify orderDetailsModify = orderDetailsModifyMapper.getById(orderId);
//            //查询全部商品id
//            //如果商品id已经存在，则更新数量
//            //如果商品id不存在，则将商品id添加进去
//            String ptoductIdList = orderDetailsModify.getOrderProductId();
//            String[] productIds = ptoductIdList.split(",");
//            for (int j = 0 ; j < productIds.length;j++){
//                if(productId.equals(productIds[i])){
//                    Product product =
//                    orderDetailsModify.setOrderProductNumber();
//                }
//            }
//        }
//        shoppingCartMapper.updateByPrimaryKey(shoppingCart);
//    }
//
//    @Override
//    public List<String> query() {
//        return shoppingCartMapper.query();
//    }
//
//    @Override
//    public String queryId(ShoppingCart shoppingCart) {
//        return shoppingCartMapper.queryId(shoppingCart);
//    }
}