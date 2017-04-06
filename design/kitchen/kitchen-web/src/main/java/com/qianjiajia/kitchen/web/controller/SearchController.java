package com.qianjiajia.kitchen.web.controller;

import com.qianjiajia.kitchen.common.result.MessageResult;
import com.qianjiajia.kitchen.design.domain.SearchQuery;
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

    @ApiOperation(value = "最近搜索")
    @ResponseBody
    @RequestMapping(value = "/queryHistory", method = RequestMethod.GET)
    public MessageResult queryHistory(String userId) {
        List<SearchQuery> searchQueryList = searchQueryService.queryHistory(userId);
        return MessageResult.getSuccessInstance(searchQueryList);
    }

    @ApiOperation(value = "热门搜索")
    @ResponseBody
    @RequestMapping(value = "/queryHot", method = RequestMethod.GET)
    public MessageResult queryHot() {
        List<SearchQuery> searchQueryList = searchQueryService.queryHot();
        return MessageResult.getSuccessInstance(searchQueryList);
    }

    @ApiOperation(value = "最近搜索+热门搜索")
    @ResponseBody
    @RequestMapping(value = "/queryHistoryAndHot", method = RequestMethod.GET)
    public Map query(String userId){
        Map resultMap = new HashMap();
        List<SearchQuery> searchHistoryList = searchQueryService.queryHistory(userId);
        List<SearchQuery> searchHotList = searchQueryService.queryHot();
        resultMap.put("searchHistoryList",searchHistoryList);
        resultMap.put("searchHotList",searchHotList);
        return resultMap;
    }


}