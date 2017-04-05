package com.qianjiajia.kitchen.web.controller;

import com.qianjiajia.kitchen.common.result.MessageResult;
import com.qianjiajia.kitchen.design.domain.OrderCommon;
import com.qianjiajia.kitchen.design.domain.OrderDetails;
import com.qianjiajia.kitchen.design.service.IOrderCommonService;
import com.qianjiajia.kitchen.design.service.IOrderDetailsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author qianjiajia
 * @version 1.0
 * @email qianjiajia_2013@126.com
 * @Date 2017-04-04 22:16
 * @Description 订单详情查看控制器
 */
@Api("订单详情查看控制器")
@RequestMapping("/orderDetailsQuery")
@Controller
public class OrderDetailsQueryController {

    @Autowired
    private IOrderCommonService ordersService;

    @Autowired
    private IOrderDetailsService orderDetailsService;

    @ApiOperation(value = "下单")
    @ResponseBody
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public MessageResult save(@RequestBody @ApiParam OrderDetails orderDetails,String productId){
        orderDetailsService.save(orderDetails,productId);
        return MessageResult.getSuccessInstance();
    }

    @ApiOperation(value = "查询")
    @ResponseBody
    @RequestMapping(value = "/query",method = RequestMethod.GET)
    public Map query(){

        OrderDetails orderDetails = new OrderDetails();

        OrderCommon orders = new OrderCommon();

        Map orderDetailsMap = new HashMap();

        Map orderCommonMap = new HashMap();

        Map resultMap = new HashMap();

        List<String> ordersIdList = ordersService.queryOrdersId();

        for (int i = 0;i < ordersIdList.size();i++) {
            //获取订单详情的全部商品list
            List<OrderDetails> productList = orderDetailsService.queryList(ordersIdList.get(i));
            orderDetailsMap.put(ordersIdList.get(i),productList);

            orders = ordersService.queryById(ordersIdList.get(i));
            orderCommonMap.put(i,orders);

//            resultMap.put()
        }

//        list<map(str,Object)>


        return orderDetailsMap;
    }
}