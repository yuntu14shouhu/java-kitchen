package com.qianjiajia.kitchen.web.controller;

import com.qianjiajia.kitchen.common.result.MessageResult;
import com.qianjiajia.kitchen.design.domain.ShoppingCart;
import com.qianjiajia.kitchen.design.service.IShoppingCartService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author qianjiajia
 * @version 1.0
 * @Date 2017-02-28 23:10
 * @Description 购物车控制器
 */
@Api("购物车控制器")
@RequestMapping("/shoppingCart")
@Controller
public class ShoppingCartController {

    @Autowired
    private IShoppingCartService shoppingCartService;

    private Logger logger = LoggerFactory.getLogger(getClass());

    @ApiOperation(value = "购物车查询----根据购物车状态，用户id查询购物车")
    @ResponseBody
    @RequestMapping(value = "/query",method = RequestMethod.GET)
    public MessageResult query(int status,String usersId){
        List<ShoppingCart> shoppingCarts = shoppingCartService.getAppointedProduct(status,usersId);
        return MessageResult.getSuccessInstance(shoppingCarts);
    }

    @ApiOperation(value = "购物车查询----根据用户id获取购物车中的所有商品")
    @ResponseBody
    @RequestMapping(value = "/queryByUserId",method = RequestMethod.GET)
    public MessageResult queryByUserId(String usersId){
        List<ShoppingCart> shoppingCarts = shoppingCartService.getByUsersIdAllProduct(usersId);
        return MessageResult.getSuccessInstance(shoppingCarts);
    }

    @ApiOperation(value = "购物车查询----根据购物车状态，商品id，用户id查询购物")
    @ResponseBody
    @RequestMapping(value = "/queryByProductId",method = RequestMethod.GET)
    public MessageResult queryByProductId(int status,String productId,String usersId){
        ShoppingCart shoppingCart = shoppingCartService.queryByProductId(status,productId,usersId);
        return MessageResult.getSuccessInstance(shoppingCart);
    }

    @ApiOperation(value = "购物车删除----根据购物车状态，商品id，用户id删除购物车")
    @ResponseBody
    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public MessageResult delete(int status,String productId,String usersId){
        shoppingCartService.delete(status,productId,usersId);
        return MessageResult.getSuccessInstance();
    }

    @ApiOperation(value = "购物车删除----根据用户id，购物车状态删除购物车")
    @ResponseBody
    @RequestMapping(value = "/deleteAll",method = RequestMethod.GET)
    public MessageResult deleteAll(String usersId,int status){
        shoppingCartService.deleteAll(usersId,status);
        return MessageResult.getSuccessInstance();
    }

    @ApiOperation(value = "购物车添加----该商品已经存在")
    @ResponseBody
    @RequestMapping(value = "/saveById",method = RequestMethod.POST)
    public MessageResult saveById(@RequestBody @ApiParam String id){
        shoppingCartService.saveById(id);
        return MessageResult.getSuccessInstance();
    }

    @ApiOperation(value = "购物车添加----商品不存在")
    @ResponseBody
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public MessageResult save(@RequestBody @ApiParam ShoppingCart shoppingCart){
        shoppingCartService.save(shoppingCart);
        return MessageResult.getSuccessInstance();
    }

    @ApiOperation(value = "购物车修改----修改购物车状态")
    @ResponseBody
    @RequestMapping(value = "/updateStatus",method = RequestMethod.POST)
    public MessageResult update(String id){
        shoppingCartService.updateStatus(id);
        return MessageResult.getSuccessInstance();
    }

    @ApiOperation(value = "购物车修改----修改商品数量")
    @ResponseBody
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public MessageResult updateNumber(String id){
        shoppingCartService.updateNumber(id);
        return MessageResult.getSuccessInstance();
    }

}