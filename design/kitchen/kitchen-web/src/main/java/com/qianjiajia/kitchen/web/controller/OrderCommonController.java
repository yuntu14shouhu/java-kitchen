package com.qianjiajia.kitchen.web.controller;

import com.qianjiajia.kitchen.common.result.MessageResult;
import com.qianjiajia.kitchen.common.result.PageResult;
import com.qianjiajia.kitchen.design.domain.OrderCommon;
import com.qianjiajia.kitchen.design.query.OrderCommonQuery;
import com.qianjiajia.kitchen.design.service.IOrderCommonService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author qianjiajia
 * @version 1.0
 * @email qianjiajia_2013@126.com
 * @Date 2017-04-04 17:02
 * @Description 订单控制器
 */
@Api("订单控制器")
@RequestMapping("/ordercommon")
@Controller
public class OrderCommonController {

    @Autowired
    private IOrderCommonService ordersService;

    @ApiOperation(value = "下单")
    @ResponseBody
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public MessageResult save (@RequestBody @ApiParam OrderCommon orders, String addressId){
        ordersService.save(orders,addressId);
        return MessageResult.getSuccessInstance();
    }

    @ApiOperation(value = "查询订单")
    @ResponseBody
    @RequestMapping(value = "/query",method = RequestMethod.GET)
    public MessageResult query(OrderCommonQuery orderCommonQuery){
        PageResult pageResult = ordersService.query(orderCommonQuery);
        return MessageResult.getSuccessInstance(pageResult);
    }

    @ApiOperation(value = "删除订单")
    @ResponseBody
    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public MessageResult delete(String ordersId){
        ordersService.delete(ordersId);
        return MessageResult.getSuccessInstance();
    }

    @ApiOperation(value = "根据id查询订单")
    @ResponseBody
    @RequestMapping(value = "/queryById",method = RequestMethod.GET)
    public MessageResult queryById(String ordersId){
        OrderCommon orders = ordersService.queryById(ordersId);
        return MessageResult.getSuccessInstance(orders);
    }


}