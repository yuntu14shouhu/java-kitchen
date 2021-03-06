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
        Map<String,Integer> numMap = new HashMap();
        for (String id : productIds) {
//            numMap.put(id,);

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
    public void saveOrder(Map<String, Integer> productIdAndNumber, String addressId) {

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
        resultMap.put("product", productList);
        resultMap.put("details", orderDetailsModify);
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
    public Map queryOrders(String userId) {

        //根据用户id获取全部订单id
        Users users = UserLoginUtils.currentUser;//加入到缓存中
        userId = users.getId();
        List<String> orderDetailsModifies = orderDetailsModifyMapper.queryOrders(userId);

        List<Map<String,Object>> resultList = new ArrayList<>();

        Map resultMap = new HashMap();

        for(int i = 0; i < orderDetailsModifies.size();i++){

            OrderDetailsModify orderDetailsModifyList = orderDetailsModifyMapper.getById(orderDetailsModifies.get(i));
            //根据订单id获取商品id
            String ids = orderDetailsModifyMapper.getProductId(orderDetailsModifies.get(i));
            //对商品ids进行拆分
            String[] idArr = ids.split(",");

            Map imgMap = new HashMap();
            List imgList = new ArrayList<>();
            for(int k = 0; k < idArr.length; k++){
                //根据商品id查询到对应的商品
                Product product = productMapper.queryToProduct(idArr[k]);
                imgList.add(product);
            }

            imgMap.put("id",orderDetailsModifies.get(i));
            imgMap.put("date",orderDetailsModifyList.getOrderCreateDate());
            imgMap.put("total",orderDetailsModifyList.getOrderTotalPayment());
            imgMap.put("product",imgList);
            resultList.add(imgMap);
            resultMap.put("order",resultList);
            //resultMap.put(orderDetailsModifies.get(i),imgMap);
        }
        return resultMap;
    }

    @Transactional
    @Override
    public OrderDetailsModify saveStatusZero(String productId) {
        orderDetailsModify = new OrderDetailsModify();
        orderDetailsModify.setId(UUIDUtil.getUUID());
        orderDetailsModify.setOrderProductNumber(1);
        orderDetailsModify.setUserId(UserLoginUtils.currentUser.getId());
        orderDetailsModify.setOrderProductId(productId);
        orderDetailsModify.setOrderStatus("0");
        orderDetailsModifyMapper.save(orderDetailsModify);
        return orderDetailsModify;
    }

    @Override
    public OrderDetailsModify queryStatusZero() {

        return orderDetailsModifyMapper.queryStatusZero();
    }


}