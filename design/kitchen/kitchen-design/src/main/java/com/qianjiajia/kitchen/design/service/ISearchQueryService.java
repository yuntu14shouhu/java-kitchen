package com.qianjiajia.kitchen.design.service;

import com.qianjiajia.kitchen.design.domain.SearchQuery;

import java.util.List;

/**
 * @author qianjiajia
 * @version 1.0
 * @email qianjiajia_2013@126.com
 * @Date 2017-04-05 17:53
 * @Description 搜索service
 */
public interface ISearchQueryService {

    /**
     * 保存搜索记录
     */
    void save(SearchQuery searchQuery);

    /**
     * 删除一条搜索记录
     */
    void delete(String id);

    /**
     * 最近搜索
     */
    List<SearchQuery> queryHistory(String userId);

    /**
     * 人气搜索
     */
    List<SearchQuery> queryHot();

    void deleteAll(String userId);
}
