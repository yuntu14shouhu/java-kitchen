package com.qianjiajia.kitchen.web.controller;

import com.qianjiajia.kitchen.common.result.MessageResult;
import com.qianjiajia.kitchen.design.service.IOrderDetailsModifyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @author qianjiajia
 * @version 1.0
 * @email qianjiajia_2013@126.com
 * @Date 2017-04-05 23:05
 * @Description 商品详情控制器
 */
@Api("商品详情控制器")
@RequestMapping("/orderDetailsModify")
@Controller
public class OrderDetailsModifyController {

    @Autowired
    private IOrderDetailsModifyService orderDetailsModifyService;

    @ApiOperation(value = "下单")
    @ResponseBody
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public MessageResult save(@RequestBody @ApiParam List<String> productIds, String addressId){
        orderDetailsModifyService.save(productIds,addressId);
        return MessageResult.getSuccessInstance();
    }

    @ApiOperation(value = "查询详情详情")
    @ResponseBody
    @RequestMapping(value = "/query",method = RequestMethod.GET)
    public Map queryList(String orderId){
        return orderDetailsModifyService.queryOrderDetails(orderId);
    }

    @ApiOperation(value = "下单")
    @ResponseBody
    @RequestMapping(value = "/plus",method = RequestMethod.POST)
    public MessageResult plus(@RequestBody @ApiParam List<String> productIds){
        orderDetailsModifyService.plus(productIds);
        return MessageResult.getSuccessInstance();
    }

    @ApiOperation(value = "下单")
    @ResponseBody
    @RequestMapping(value = "/minus",method = RequestMethod.POST)
    public MessageResult minus(@RequestBody @ApiParam List<String> productIds){
        orderDetailsModifyService.minus(productIds);
        return MessageResult.getSuccessInstance();
    }

    @ApiOperation(value = "查询全部订单")
    @ResponseBody
    @RequestMapping(value = "/queryOrders",method = RequestMethod.GET)
    public Map queryOrders(){
        return orderDetailsModifyService.queryOrders();
    }



}