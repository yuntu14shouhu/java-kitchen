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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @ApiOperation(value = "优惠套餐")
    @ResponseBody
    @RequestMapping(value = "/productIsDiscount",method = RequestMethod.GET)
    public MessageResult productIsDiscount(ProductQuery productQuery){
        List<Product> productList = productService.productIsDiscount(productQuery);
        return MessageResult.getSuccessInstance(productList);
    }

    @ApiOperation(value = "劲爆团购")
    @ResponseBody
    @RequestMapping(value = "/productIsGroup",method = RequestMethod.GET)
    public MessageResult productIsGroup(ProductQuery productQuery){
        List<Product> productList = productService.productIsGroup(productQuery);
        return MessageResult.getSuccessInstance(productList);
    }

    @ApiOperation(value = "人气推荐")
    @ResponseBody
    @RequestMapping(value = "/productByPutawayDate",method = RequestMethod.GET)
    public MessageResult productByPutawayDate (ProductQuery productQuery){
        List<Product> productList = productService.productByPutawayDate(productQuery);
        return MessageResult.getSuccessInstance(productList);
    }

    @ApiOperation(value = "根据商品的大类别查询商品")
    @ResponseBody
    @RequestMapping(value = "/queryByBigClass",method = RequestMethod.GET)
    public MessageResult queryByBigClass(String bigClass){
        List<Product> productList = productService.queryByBigClass(bigClass);
        return MessageResult.getSuccessInstance(productList);
    }

    @ApiOperation(value = "根据商品的小类别查询商品")
    @ResponseBody
    @RequestMapping(value = "/queryBySmallClass",method = RequestMethod.GET)
    public MessageResult queryBySmallClass(String smallClass){
        List<Product> productList = productService.queryBySmallClass(smallClass);
        return MessageResult.getSuccessInstance(productList);
    }

    @ApiOperation(value = "首页滑动商品图片")
    @ResponseBody
    @RequestMapping(value = "/pageSlide",method = RequestMethod.GET)
    public MessageResult pageSlide(ProductQuery productQuery){
        List<Product> productList = productService.pageSlide(productQuery);
        return MessageResult.getSuccessInstance(productList);
    }

    @ApiOperation(value = "分类")
    @ResponseBody
    @RequestMapping(value = "/queryType",method = RequestMethod.GET)
    public Object queryType(String s){
        List list = new ArrayList();
        Map<String ,Object> map = new HashMap<>();
        map.put("bigKeyClass",queryByBigClass(s));
        map.put("smallKeyClass",queryBySmallClass(s));
        list.add(map);
        return list;
    }

    @ApiOperation(value = "首页")
    @ResponseBody
    @RequestMapping(value = "/page",method = RequestMethod.GET)
    public Object page(ProductQuery productQuery){
        ProductQuery productQuery1 = new ProductQuery();
        if(productQuery.getIsDiscount() != null && productQuery.getIsDiscount() == 1){
          return   productIsDiscount(productQuery);
        }else if(productQuery.getIsGroupBuy() != null &&productQuery.getIsGroupBuy() == 1){
            return productIsGroup(productQuery);
        }else if(productQuery.getKeyword() != null && productQuery.getKeyword().equals("首页")){
            return pageSlide(productQuery);
        }else if(productQuery.equals(productQuery1)){
            return productByPutawayDate(productQuery);
        }else {
            return null;
        }
    }

}