package com.qianjiajia.kitchen.design.service.impl;

import com.qianjiajia.kitchen.common.exception.ApiExceptionCode;
import com.qianjiajia.kitchen.common.result.MessageResult;
import com.qianjiajia.kitchen.common.utils.UUIDUtil;
import com.qianjiajia.kitchen.design.dao.OrderDetailsModifyMapper;
import com.qianjiajia.kitchen.design.dao.OrderMapMapper;
import com.qianjiajia.kitchen.design.dao.ProductMapper;
import com.qianjiajia.kitchen.design.dao.ShoppingCartMapper;
import com.qianjiajia.kitchen.design.domain.OrderDetailsModify;
import com.qianjiajia.kitchen.design.domain.OrderMap;
import com.qianjiajia.kitchen.design.domain.ShoppingCart;
import com.qianjiajia.kitchen.design.query.ShopQueryView;
import com.qianjiajia.kitchen.design.service.IOrderDetailsModifyService;
import com.qianjiajia.kitchen.design.service.IShoppingCartService;
import com.qianjiajia.kitchen.design.utils.UserLoginUtils;
import com.sun.tools.corba.se.idl.constExpr.Or;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

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
    private OrderMapMapper orderMapMapper;

    @Autowired
    private IOrderDetailsModifyService orderDetailsModifyService;

    Map<String,Integer> productIdAndNumberMap = new HashMap<>();

    @Transactional
    @Override
    public void saveProductToShop(String productId) {

//        1----购物车中没有商品时
//        生成状态为"0"的订单，productId传进去
        ShoppingCart shoppingCart = shoppingCartMapper.getShopByUserId(UserLoginUtils.currentUser.getId());
        boolean isExistZeroStatusOrder = false;
        OrderDetailsModify statusZeroOrder = null;
        if(!StringUtils.isEmpty(shoppingCart.getOrderIdList())){
            //购物车不为空
            String orderList = shoppingCart.getOrderIdList();
            //1,orderList="fdsafsafd"; 2 orderList="fdsafd,fdsafd"
            String[] orderArr=null;
            System.out.println(orderList.indexOf(",")+"===========================");
            if(orderList.indexOf(",")==-1){
                orderArr=new String[1];
                orderArr[0]=orderList;
            }else {
                orderArr = orderList.split(",");
            }

            for(int i = 0,j=orderArr.length;i<j;i++){
                String tmpOrderId = orderArr[i];
                OrderDetailsModify  o  = orderDetailsModifyMapper.getById(tmpOrderId);
                if("0".equals(o.getOrderStatus())){
                    //状态为0的订单
                    isExistZeroStatusOrder = true;
                    statusZeroOrder = o;
                    System.out.println(o.getOrderStatus()+"----------");
                break;
            }

            }
        }

        if(isExistZeroStatusOrder){
            //存在为0状态的订单
            //1--判断是否存在传进来的商品id，已经存在，就数量+1，不存在，把商品id添加到productIds，数量默认为1

            String productIds = statusZeroOrder.getOrderProductId();
            String[] productIdArr = productIds.split(",");
            boolean isExistPid = false;
            for (int i = 0; i < productIdArr.length;i++){
                if(productId.equals(productIdArr[i])){
                    OrderMap orderMap =  orderMapMapper.queryNumber(statusZeroOrder.getId(),productId);
                    orderMap.setProductNumer(orderMap.getProductNumer()+1);
                    orderMapMapper.updateByPrimaryKey(orderMap);
                    isExistPid = true;
                    break;
                }
            }
            if(!isExistPid){
                OrderMap orderMap = new OrderMap();
                orderMap.setId(UUIDUtil.getUUID());
                orderMap.setOrderId(statusZeroOrder.getId());
                orderMap.setProductId(productId);
                orderMap.setProductNumer(1);
                orderMapMapper.insert(orderMap);

                StringBuffer sb = new StringBuffer(statusZeroOrder.getOrderProductId());

                sb.append(",");
                sb.append(productId);
                statusZeroOrder.setOrderProductId(sb.toString());
                orderDetailsModifyMapper.updateByPrimaryKeyWithBLOBs(statusZeroOrder);
            }

        }else{
            //不存在状态为0的订单
            //绑定当前操作的用户，，并且把商品id添加到productIdList
            OrderDetailsModify orderDetailsModify = new OrderDetailsModify();
            orderDetailsModify.setId(UUIDUtil.getUUID());
            orderDetailsModify.setOrderStatus("0");
            orderDetailsModify.setUserId(UserLoginUtils.currentUser.getId());
            orderDetailsModify.setOrderProductId(productId);
            orderDetailsModifyMapper.insert(orderDetailsModify);
            if(!StringUtils.isEmpty(shoppingCart.getOrderIdList())){

                shoppingCart.setOrderIdList(shoppingCart.getOrderIdList()+","+orderDetailsModify.getId());
                shoppingCartMapper.updateByPrimaryKey(shoppingCart);
            }else {
                shoppingCart.setOrderIdList(orderDetailsModify.getId());
                shoppingCartMapper.updateByPrimaryKey(shoppingCart);
            }

            OrderMap orderMap = new OrderMap();
            orderMap.setId(UUIDUtil.getUUID());
            orderMap.setOrderId(orderDetailsModify.getId());
            orderMap.setProductId(productId);
            orderMap.setProductNumer(1);
            orderMapMapper.insert(orderMap);


        }
        /*orderDetailsModifyService.saveStatusZero(productId);
        OrderDetailsModify orderDetailsModify = orderDetailsModifyService.queryStatusZero();
        shoppingCart.setOrderIdList(orderDetailsModify.getId());
//        shoppingCart.setUserId(UserLoginUtils.currentUser.getId());
        shoppingCartMapper.updateByPrimaryKey(shoppingCart);
        //购物车已经存在商品的时候,查询到订单状态为0的订单
        OrderDetailsModify orderDetailsModify1 = orderDetailsModifyService.queryStatusZero();

        if(orderDetailsModify1 != null){
//             updateOrder(orderDetailsModify.getId());
                if(productIdAndNumberMap.containsKey(orderDetailsModify1.getOrderProductId())){
                    //商品已经存在了
                int num = productIdAndNumberMap.get(orderDetailsModify1.getOrderProductId());
                orderDetailsModify1.setOrderProductNumber(orderDetailsModify1.getOrderProductNumber() + num);
            }else {
                //不存在新添加的商品时
                productIdAndNumberMap.put(productId,orderDetailsModify1.getOrderProductNumber());
            }

        }*/

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

    @Transactional
    @Override
    public void updateNumber(String orderId, String productId) {

    }

    @Transactional
    @Override
    public void updateStatus(String orderId) {

    }

    @Transactional
    @Override
    public MessageResult deleteProductNow(String orderId, String productId) {
        if (StringUtils.isEmpty(orderId)||StringUtils.isEmpty(productId)){
            return MessageResult.getSuccessInstance(ApiExceptionCode.PARAM_EXCEPTION);
        }

        OrderDetailsModify orderDetailsModify = orderDetailsModifyMapper.getById(orderId);

        if(orderDetailsModify == null) {
            return MessageResult.getSuccessInstance(ApiExceptionCode.PARAM_EXCEPTION);
        }

        String products= orderDetailsModify.getOrderProductId();
        String[] productIds = products.split(",");
        StringBuilder sb = new StringBuilder();

        if(productIds.length == 1){
            ShoppingCart shoppingCart = shoppingCartMapper.getShopByUserId(UserLoginUtils.currentUser.getId());
            orderDetailsModifyMapper.deleteByPrimaryKey(orderId);
            shoppingCart.setOrderIdList("");
            shoppingCartMapper.updateByPrimaryKey(shoppingCart);

        }else if(productIds.length >= 2){
            for (int i = 0;i <productIds.length;i++){
                if(!productId.equals(productIds[i])){
                    sb.append(productIds[i]).append(",");
                }
            }
            sb.deleteCharAt(sb.length()-1);
            orderDetailsModify.setOrderProductId(sb.toString());
            orderDetailsModifyMapper.updateByPrimaryKeyWithBLOBs(orderDetailsModify);
        }
        orderMapMapper.deleteByOrderIdAndProductId(orderId,productId);
        return MessageResult.getSuccessInstance();
    }

    @Transactional
    @Override
    public MessageResult updateNumberPlus(String orderId, String productId) {
        if (StringUtils.isEmpty(orderId)||StringUtils.isEmpty(productId)){
            return MessageResult.getSuccessInstance(ApiExceptionCode.PARAM_EXCEPTION);
        }
        OrderMap orderMap = orderMapMapper.queryMap(orderId,productId);
        if(orderMap == null){
            return MessageResult.getSuccessInstance(ApiExceptionCode.PARAM_EXCEPTION);
        }
        orderMap.setProductNumer(orderMap.getProductNumer()+1);
        orderMapMapper.updateByPrimaryKey(orderMap);
        System.out.println(orderMap.getProductNumer());
        return MessageResult.getSuccessInstance();
    }

    @Transactional
    @Override
    public MessageResult updateNumberMinus(String orderId, String productId) {

        if (StringUtils.isEmpty(orderId)||StringUtils.isEmpty(productId)){
            return MessageResult.getSuccessInstance(ApiExceptionCode.PARAM_EXCEPTION);
        }
        OrderMap orderMap = orderMapMapper.queryMap(orderId,productId);
        if(orderMap == null){
            return MessageResult.getSuccessInstance(ApiExceptionCode.PARAM_EXCEPTION);
        }
        if(orderMap.getProductNumer() <= 1){
            return MessageResult.getSuccessInstance(ApiExceptionCode.PARAM_EXCEPTION);
        }
            orderMap.setProductNumer(orderMap.getProductNumer()-1);
            orderMapMapper.updateByPrimaryKey(orderMap);
            System.out.println(orderMap.getProductNumer());


        return MessageResult.getSuccessInstance();
    }

    @Override
    public List<ShopQueryView> queryShop() {
        ShoppingCart shoppingCart = shoppingCartMapper.getShopByUserId(UserLoginUtils.currentUser.getId());
        String orderId=shoppingCart.getOrderIdList();
        List<ShopQueryView> shopQueryViewList= orderMapMapper.queryOrderInfo(orderId);
        return shopQueryViewList;
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