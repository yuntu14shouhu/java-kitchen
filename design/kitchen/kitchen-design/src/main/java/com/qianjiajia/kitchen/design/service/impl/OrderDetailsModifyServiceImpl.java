package com.qianjiajia.kitchen.design.service.impl;

import com.qianjiajia.kitchen.common.utils.UUIDUtil;
import com.qianjiajia.kitchen.design.dao.AddressDetailsMapper;
import com.qianjiajia.kitchen.design.dao.OrderDetailsModifyMapper;
import com.qianjiajia.kitchen.design.dao.ProductMapper;
import com.qianjiajia.kitchen.design.domain.AddressDetails;
import com.qianjiajia.kitchen.design.domain.OrderDetailsModify;
import com.qianjiajia.kitchen.design.domain.Product;
import com.qianjiajia.kitchen.design.domain.Users;
import com.qianjiajia.kitchen.design.service.IOrderDetailsModifyService;
import com.qianjiajia.kitchen.design.utils.UserLoginUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.*;

/**
 * @author qianjiajia
 * @version 1.0
 * @email qianjiajia_2013@126.com
 * @Date 2017-04-05 22:14
 * @Description 订单接口实现类
 */
@Service
public class OrderDetailsModifyServiceImpl implements IOrderDetailsModifyService {

    @Autowired
    private OrderDetailsModifyMapper orderDetailsModifyMapper;

    private OrderDetailsModify orderDetailsModify;

    @Autowired
    private AddressDetailsMapper addressMapper;

    private AddressDetails address;

    @Autowired
    private ProductMapper productMapper;

    private Product product;

    @Override
    @Transactional
    public void save(List<String> productIds, String addressId) {

        orderDetailsModify = new OrderDetailsModify();

        orderDetailsModify.setId(UUIDUtil.getUUID());
        orderDetailsModify.setOrderCreateDate(new Date());
        orderDetailsModify.setOrderRef(UUIDUtil.getUUID());
        orderDetailsModify.setOrderCarriage(new BigDecimal(0.00));
        orderDetailsModify.setOrderStatus("1");
        orderDetailsModify.setUserId(UserLoginUtils.currentUser.getId());


        address = addressMapper.getById(addressId);

        orderDetailsModify.setOrderConsigneeName(address.getConsigneeName());
        orderDetailsModify.setOrderConsigneePhone(address.getConsigneePhone());
        orderDetailsModify.setOrderConsigneeAddress(address.getConsigneeAddress());

        orderDetailsModify.setOrderProductNumber(1);

        StringBuffer sb = new StringBuffer();
        if (null == productIds || productIds.isEmpty()) {
            return;
        }
        BigDecimal bigDecimal = new BigDecimal(0);//总和
         //单价*个数
        for (String id : productIds) {
            product = productMapper.getById(id);
            List productList = new ArrayList();
            productList.add(product);

//            BigDecimal bigDecimal1 = product.getPrice();//单价
//            BigDecimal bigDecimal2 = bigDecimal1.multiply(BigDecimal.valueOf(orderDetailsModify.getOrderProductNumber()));

            //计算出商品价格总和--------单价*个数+0
           bigDecimal.add(product.getPrice().multiply(BigDecimal.valueOf(orderDetailsModify.getOrderProductNumber())));
//            bigDecimal.add(product.getPrice());
            sb.append(id);
            sb.append(",");
        }

        //判断是否需要加邮费
        if (bigDecimal.doubleValue() < 60) {
            bigDecimal.add(new BigDecimal(10));//运费为10
        }

        orderDetailsModify.setOrderTotalPayment(bigDecimal);
        orderDetailsModify.setOrderActualPayment(bigDecimal);

        String productIdStr = sb.toString();
        productIdStr.substring(0, productIdStr.length() - 1);
        orderDetailsModify.setOrderProductId(productIdStr);


//        String[] idArr = productIdStr.split(",");
        orderDetailsModifyMapper.insert(orderDetailsModify);
    }

    @Override
    public Map queryOrderDetails(String orderId) {
        /**
         * 订单对象
         * 大字段
         * 取出来
         * 遍历一下
         */
        Map resultMap = new HashMap();

        OrderDetailsModify orderDetailsModify = orderDetailsModifyMapper.getById(orderId);
        String ids = orderDetailsModify.getOrderProductId();
        String[] idArr = ids.split(",");
        List<Product> productList = new ArrayList<>();
        for (String id : idArr) {
            product = productMapper.queryToProduct(id);
            productList.add(product);
        }
        resultMap.put("products", productList);
        resultMap.put("orderDetails", orderDetailsModify);
        return resultMap;
    }

    @Override
    public void plus(List<String> productIds) {

        StringBuffer sb = new StringBuffer();
        if (null == productIds || productIds.isEmpty()) {
            return;
        }
        BigDecimal bigDecimal = new BigDecimal(0);//总和
        BigDecimal bigDecimal2 = new BigDecimal(0);//单价*个数
        for (String productId : productIds) {
            product = productMapper.getById(productId);
            List productList = new ArrayList();
            productList.add(product);

            BigDecimal bigDecimal1 = product.getPrice();//单价
            bigDecimal2 = bigDecimal1.multiply(BigDecimal.valueOf(orderDetailsModify.getOrderProductNumber()));

            //计算出商品价格总和--------单价*个数+0
            bigDecimal = bigDecimal.add(bigDecimal2);

            sb.append(productId);
            sb.append(",");
        }

        //判断是否需要加邮费
        if (bigDecimal.doubleValue() < 60) {
            bigDecimal.add(new BigDecimal(10));//运费为10
        }

        orderDetailsModify.setOrderTotalPayment(bigDecimal);
        orderDetailsModify.setOrderActualPayment(bigDecimal);

        String productIdStr = sb.toString();
        productIdStr.substring(0, productIdStr.length() - 1);
        orderDetailsModify.setOrderProductId(productIdStr);
    }

    @Override
    public void minus(List<String> productIds) {
        StringBuffer sb = new StringBuffer();
        if (null == productIds || productIds.isEmpty()) {
            return;
        }
        BigDecimal bigDecimal = new BigDecimal(0);//总和
        BigDecimal bigDecimal2 = new BigDecimal(0);//单价*个数
        for (String productId : productIds) {
            product = productMapper.getById(productId);
            List productList = new ArrayList();
            productList.add(product);

            BigDecimal bigDecimal1 = product.getPrice();//单价
            bigDecimal2 = bigDecimal1.multiply(BigDecimal.valueOf(orderDetailsModify.getOrderProductNumber()));

            //计算出商品价格总和--------单价*个数+0
            bigDecimal = bigDecimal.add(bigDecimal2);

            sb.append(productId);
            sb.append(",");
        }

        //判断是否需要加邮费
        if (bigDecimal.doubleValue() < 60) {
            bigDecimal.add(new BigDecimal(10));//运费为10
        }

        orderDetailsModify.setOrderTotalPayment(bigDecimal);
        orderDetailsModify.setOrderActualPayment(bigDecimal);

        String productIdStr = sb.toString();
        productIdStr.substring(0, productIdStr.length() - 1);
        orderDetailsModify.setOrderProductId(productIdStr);
    }

    @Override
    public Map queryOrders() {

        //根据用户id获取全部订单id
        Users users = UserLoginUtils.currentUser;//加入到缓存中
        List<String> orderDetailsModifies = orderDetailsModifyMapper.queryOrders(users.getId());

        Map resultMap = new HashMap();

//        List resultList = new ArrayList();

        for(int i = 0; i < orderDetailsModifies.size();i++){

            OrderDetailsModify orderDetailsModifyList = orderDetailsModifyMapper.getById(orderDetailsModifies.get(i));
            //根据订单id获取商品id
            String ids = orderDetailsModifyMapper.getProductId(orderDetailsModifies.get(i));

//            String ids = orderDetailsModifies.get(i).getOrderProductId();

            //对商品ids进行拆分
            String[] idArr = ids.split(",");

            Map imgMap = new HashMap();
            List<String> imgList = new ArrayList<>();
            for(int k = 0; k < idArr.length; k++){
                //根据商品id查询到对应的商品

                String img = productMapper.queryToProduct(idArr[k]).getProductImageUrl();
                imgList.add(img);
                imgMap.put("imgList",imgList);
                imgMap.put("date",orderDetailsModifyList.getOrderCreateDate());
                imgMap.put("total",orderDetailsModifyList.getOrderTotalPayment());
            }
            resultMap.put(orderDetailsModifies.get(i),imgMap);
//            Map productMap = new HashMap();
//            List<String> imgList = new ArrayList<>();
//            for (int j = 0; j < productList.size(); j++){
//                String img = product.getProductImageUrl();
//                imgList.add(img);
//                productMap.put("imgList",imgList);
//                productMap.put("date",orderDetailsModifyList.getOrderCreateDate());
//                productMap.put("total",orderDetailsModifyList.getOrderTotalPayment());
//            }
//            resultMap.put("",productMap);
//            resultList.add(resultMap);
//            resultList.add(imgList);
        }

        return resultMap;
    }

//    public static void main(String[] args) {
//        BigDecimal bigDecimal1 = new BigDecimal(3);//单价
//        BigDecimal bigDecimal2 = new BigDecimal(4);//个数
//        BigDecimal bigDecimal3 = new BigDecimal(0);
//        int i = 3;//运费
//        bigDecimal3 = bigDecimal1.multiply(bigDecimal2);
//
//        if(bigDecimal3.doubleValue() > 20) {
//
//            bigDecimal3 = bigDecimal3.add(BigDecimal.valueOf(i));
//        }
//        System.out.println(bigDecimal3);
//    }

}