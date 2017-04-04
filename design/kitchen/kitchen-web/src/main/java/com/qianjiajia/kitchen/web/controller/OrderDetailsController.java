package com.qianjiajia.kitchen.web.controller;

import com.qianjiajia.kitchen.common.result.MessageResult;
import com.qianjiajia.kitchen.common.result.PageResult;
import com.qianjiajia.kitchen.design.domain.OrderDetails;
import com.qianjiajia.kitchen.design.query.OrderDetailsQuery;
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

/**
 * @author qianjiajia
 * @version 1.0
 * @email qianjiajia_2013@126.com
 * @Date 2017-04-04 21:43
 * @Description 订单详情控制器
 */
@Api("订单控制器")
@RequestMapping("/orderDetails")
@Controller
public class OrderDetailsController {

    @Autowired
    private IOrderDetailsService orderDetailsService;

    @ApiOperation(value = "订单详情")
    @ResponseBody
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public MessageResult save (@RequestBody @ApiParam OrderDetails orderDetails, String productId){
        orderDetailsService.save(orderDetails,productId);
        return MessageResult.getSuccessInstance();
    }

    @ApiOperation(value = "只显示商品图片")
    @ResponseBody
    @RequestMapping(value = "/query",method = RequestMethod.GET)
    public MessageResult query(OrderDetailsQuery orderDetailsQuery){
        PageResult pageResult = orderDetailsService.query(orderDetailsQuery);
        return MessageResult.getSuccessInstance(pageResult);
    }

    @ApiOperation(value = "显示商品图片,价格,名称")
    @ResponseBody
    @RequestMapping(value = "/queryById",method = RequestMethod.GET)
    public MessageResult queryById(String id){
        OrderDetails orderDetails = orderDetailsService.getByOrderDetailsId(id);
        return MessageResult.getSuccessInstance(orderDetails);
    }

}