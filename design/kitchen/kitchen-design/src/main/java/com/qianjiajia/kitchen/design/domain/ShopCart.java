//package com.qianjiajia.kitchen.design.domain;
//
//import java.util.Iterator;
//import java.util.LinkedHashMap;
//import java.util.Map;
//
///**
// * @author qianjiajia
// * @version 1.0
// * @email qianjiajia_2013@126.com
// * @Date 2017-04-22 16:19
// * @Description 购物车类---------
// *                  其中含有加入购物车方法，
// *                  购物车容器LinkedHashMap，
// *                  清空购物车，删除购物车中的其中一个商品
// */
//public class ShopCart {
//
//    /*
//	 * 使用LinkedHashMap来充当购物车的容器，
//	 * String：商品的ID，product_id
//	 * ShopCartItem：购物选项，
//	 */
//    Map<String,ShopCartItem> shopCartMap = new LinkedHashMap<String,ShopCartItem>();
//
//    //向购物车中添加商品
//    public void addProduct(ShopCartItem shopCartItem){
//        //查看map中是否已经有该key值的存在了
//        if(shopCartMap.containsKey(shopCartItem.getProduct().getId())){
//            //购物车中已经存在了，则向shopCartItem中添加商品的数量和改变总价
//            ShopCartItem sci = shopCartMap.get(shopCartItem.getProduct().getId());
//            //商品数量加1
//            sci.setCount(sci.getCount()+shopCartItem.getCount());
//            //总价
//            sci.setAllTotalMoney(sci.getAllTotalMoney()+shopCartItem.getProduct().getPrice());
//        }else{
//            //购物车中不存在
//            shopCartMap.put(shopCartItem.getProduct().getId(),shopCartItem);
//        }
//    }
//
//    //删除某种商品，一个一个的删除，直到没有该商品
//    public void deleteProduct(String productId){
//        ShopCartItem shopCartItem = shopCartMap.get(productId);
//        if(shopCartItem.getCount() == 1){
//            //只剩下一种商品的时候，直接从map中一出该项即可
//            shopCartMap.remove(productId);
//        }else{
//            //直接删除一种商品，那么应该修改该书籍的数量，价格
//            shopCartItem.setAllTotalMoney(shopCartItem.getAllTotalMoney() - shopCartItem.getAllTotalMoney()/shopCartItem.getCount());
//            shopCartItem.setCount(shopCartItem.getCount() - 1);
//        }
//    }
//
//    //清空购物车
//    public void clearShopCart(){
//        shopCartMap.clear();
//    }
//
//    //获取购物车总的价格
//    public double getAllPrice(){
//        double allPrice = 0;
//        Iterator<ShopCartItem> iterator = shopCartMap.values().iterator();
//        while (iterator.hasNext()){
//            ShopCartItem shopCartItem = iterator.next();
//            allPrice += shopCartItem.getAllTotalMoney();
//        }
//        return allPrice;
//    }
//
//
//    public Map getShopCartMap(){
//        return shopCartMap;
//    }
//
//}