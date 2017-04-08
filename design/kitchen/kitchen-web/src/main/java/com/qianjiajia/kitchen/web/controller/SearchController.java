package com.qianjiajia.kitchen.web.controller;

import com.qianjiajia.kitchen.common.result.MessageResult;
import com.qianjiajia.kitchen.design.domain.SearchQuery;
import com.qianjiajia.kitchen.design.query.ProductQuery;
import com.qianjiajia.kitchen.design.service.IProductService;
import com.qianjiajia.kitchen.design.service.ISearchQueryService;
import com.qianjiajia.kitchen.design.service.IUsersService;
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
 * @email qianjiajia_2013@126.com
 * @Date 2017-04-05 18:10
 * @Description 搜索控制器
 */
@Api("搜索控制器")
@RequestMapping("/search")
@Controller
public class SearchController {

    @Autowired
    private ISearchQueryService searchQueryService;

    @Autowired
    private IProductService productService;


    @Autowired
    private IUsersService usersService;

    @ApiOperation(value = "保存搜索记录")
    @ResponseBody
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public MessageResult save(@RequestBody @ApiParam SearchQuery searchQuery) {
        searchQueryService.save(searchQuery);
        return MessageResult.getSuccessInstance();
    }

    @ApiOperation(value = "删除搜索一条记录")
    @ResponseBody
    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public MessageResult delete(String id) {
        searchQueryService.delete(id);
        return MessageResult.getSuccessInstance();
    }

    @ApiOperation(value = "删除历史搜索记录")
    @ResponseBody
    @RequestMapping(value = "/deleteAll", method = RequestMethod.GET)
    public MessageResult deleteAll(String userId) {
        searchQueryService.deleteAll(userId);
        return MessageResult.getSuccessInstance();
    }

    @ApiOperation(value = "最近搜索---------searchType=1")
    @ResponseBody
    @RequestMapping(value = "/aQueryHistory", method = RequestMethod.GET)
    public List aQueryHistory(String userId) {
        List resultList = new ArrayList();
        List<String> searchContentList = searchQueryService.queryHistoryContentList(userId);
        ProductQuery productQuery = new ProductQuery();
        for(int i = 0;i < searchContentList.size();i++){
            Map map = new HashMap();
            productQuery.setProductName(searchContentList.get(i));
            List<ProductQuery> productList = productService.fuzzyQuery(productQuery);
            map.put("historySearchContent",searchContentList.get(i));
            map.put("productHistoryList",productList);
            resultList.add(map);
        }
        return resultList;
    }

    @ApiOperation(value = "热门搜索------搜索次数需要大于2-----searchType=0")
    @ResponseBody
    @RequestMapping(value = "/bQueryHot", method = RequestMethod.GET)
    public List bQueryHot() {
        List resultList = new ArrayList();
        List<String> searchContentList = searchQueryService.queryHotContentList();
        ProductQuery productQuery = new ProductQuery();
        for(int i = 0;i < searchContentList.size();i++){
            Map map = new HashMap();
            productQuery.setProductName(searchContentList.get(i));
            List<ProductQuery> productList = productService.fuzzyQuery(productQuery);
            map.put("hotSearchContent",searchContentList.get(i));
            map.put("productHotList",productList);
            resultList.add(map);
        }
        return resultList;
    }
}