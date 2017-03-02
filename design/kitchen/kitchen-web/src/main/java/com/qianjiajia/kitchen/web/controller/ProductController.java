package com.qianjiajia.kitchen.web.controller;

import com.qianjiajia.kitchen.common.result.MessageResult;
import com.qianjiajia.kitchen.common.result.PageResult;
import com.qianjiajia.kitchen.design.domain.Product;
import com.qianjiajia.kitchen.design.query.ProductQuery;
import com.qianjiajia.kitchen.design.service.IProductService;
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
 * @Date 2017-02-28 23:10
 * @Description 商品控制器
 */
@Api("商品控制器")
@RequestMapping("/product")
@Controller
public class ProductController {

    @Autowired
    private IProductService productService;

    @ApiOperation(value = "商品查询")
    @ResponseBody
    @RequestMapping(value = "/query",method = RequestMethod.GET)
    public MessageResult query(ProductQuery productQuery){
        PageResult pageResult = productService.query(productQuery);
        return MessageResult.getSuccessInstance(pageResult);
    }

    @ApiOperation(value = "商品详情查询")
    @ResponseBody
    @RequestMapping(value = "/getById",method = RequestMethod.GET)
    public MessageResult queryById(String productId){
        Product product = productService.getById(productId);
        return MessageResult.getSuccessInstance(product);
    }

    @ApiOperation(value = "商品添加")
    @ResponseBody
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public MessageResult save(@RequestBody @ApiParam Product product){
        productService.save(product);
        return MessageResult.getSuccessInstance();
    }

    @ApiOperation(value = "商品删除")
    @ResponseBody
    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public MessageResult delete(String id){
        productService.delete(id);
        return MessageResult.getSuccessInstance();
    }

    @ApiOperation(value = "商品更新")
    @ResponseBody
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public MessageResult update(@RequestBody Product product){
        productService.update(product);
        return MessageResult.getSuccessInstance();
    }
}