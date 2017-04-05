package com.qianjiajia.kitchen.design.service.impl;

import com.qianjiajia.kitchen.common.utils.UUIDUtil;
import com.qianjiajia.kitchen.design.dao.AddressMapper;
import com.qianjiajia.kitchen.design.dao.OrderDetailsModifyMapper;
import com.qianjiajia.kitchen.design.dao.ProductMapper;
import com.qianjiajia.kitchen.design.domain.Address;
import com.qianjiajia.kitchen.design.domain.OrderDetailsModify;
import com.qianjiajia.kitchen.design.domain.Product;
import com.qianjiajia.kitchen.design.service.IOrderDetailsModifyService;
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
    private AddressMapper addressMapper;

    private Address address;

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


        address = addressMapper.getById(addressId);

        orderDetailsModify.setOrderConsigneeName(address.getConsigneeName());
        orderDetailsModify.setOrderConsigneePhone(address.getConsigneePhone());
        orderDetailsModify.setOrderConsigneeAddress(address.getConsigneeAddress());


        StringBuffer sb = new StringBuffer();
        if(null == productIds || productIds.isEmpty()){
            return;
        }
        BigDecimal bigDecimal = new BigDecimal(0);

        for(String id:productIds)
        {
            product = productMapper.getById(id);
            List productList = new ArrayList();
            productList.add(product);
            //计算出商品价格总和
            bigDecimal.add(product.getPrice());

            sb.append(id);
            sb.append(",");
        }

        //判断是否需要加邮费
        if(bigDecimal.doubleValue() < 60){
            bigDecimal.add(new BigDecimal(10));
        }

        orderDetailsModify.setOrderTotalPayment(bigDecimal);
        orderDetailsModify.setOrderActualPayment(bigDecimal);

        String productIdStr = sb.toString();
        productIdStr.substring(0,productIdStr.length() - 1);
        orderDetailsModify.setOrderProductId(productIdStr);



//        String[] idArr = productIdStr.split(",");
        orderDetailsModifyMapper.insert(orderDetailsModify);
    }

    @Override
    public Map queryList(String orderId) {
        /**
         * 订单对象
         * 大字段
         * 取出来
         * 遍历一下
         */
        Map resultMap = new HashMap();

        OrderDetailsModify orderDetailsModify =  orderDetailsModifyMapper.getById(orderId);
        String ids = orderDetailsModify.getOrderProductId();
        String[] idArr = ids.split(",");
        List<Product> productList = new ArrayList<>();
        for(String id : idArr){
            product = productMapper.queryToProduct(id);
            productList.add(product);
        }
        resultMap.put("products",productList);
        resultMap.put("orderDetails",orderDetailsModify);
        return resultMap;
    }



}