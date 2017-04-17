package com.qianjiajia.kitchen.design.service.impl;

import com.qianjiajia.kitchen.common.utils.UUIDUtil;
import com.qianjiajia.kitchen.design.dao.SearchQueryMapper;
import com.qianjiajia.kitchen.design.domain.SearchQuery;
import com.qianjiajia.kitchen.design.domain.Users;
import com.qianjiajia.kitchen.design.service.ISearchQueryService;
import com.qianjiajia.kitchen.design.utils.UserLoginUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * @author qianjiajia
 * @version 1.0
 * @email qianjiajia_2013@126.com
 * @Date 2017-04-05 17:54
 * @Description 搜索service接口实现
 */
@Service
public class SearchQueryServiceImpl implements ISearchQueryService{

    @Autowired
    private SearchQueryMapper searchQueryMapper;

    @Transactional
    @Override
    public void save(SearchQuery searchQuery) {
//        if(UserLoginUtils.currentUser.getId().isEmpty() || UserLoginUtils.currentUser.getId() == null){
//            searchQuery.setId(UUIDUtil.getUUID());
//            searchQuery.setSearchTime(new Date());
//            searchQuery.setSearchType(0);
//            searchQueryMapper.insert(searchQuery);
//        }else{
            searchQuery.setId(UUIDUtil.getUUID());
            searchQuery.setSearchTime(new Date());
            searchQuery.setSearchType(1);
            searchQuery.setUserId(UserLoginUtils.currentUser.getId());
            searchQueryMapper.insert(searchQuery);
//        }
    }

    @Transactional
    @Override
    public void delete(String id) {
        searchQueryMapper.deleteByPrimaryKey(id);
    }

    @Transactional
    @Override
    public void deleteAll(String userId) {
        Users users = UserLoginUtils.currentUser;
        userId = users.getId();
        searchQueryMapper.deleteAll(userId);
    }

    @Override
    public SearchQuery queryHistoryN(String userId) {
        Users users = UserLoginUtils.currentUser;
        userId = users.getId();
        SearchQuery searchQuery = searchQueryMapper.queryHistoryN(userId);
        return searchQuery;
    }

    @Override
    public SearchQuery queryHotH() {
        SearchQuery searchQuery = searchQueryMapper.queryHotN();
        return searchQuery;
    }

    @Override
    public List<String> queryHotContentList() {
        return searchQueryMapper.queryContentList();
    }

    @Override
    public List<String> queryHistoryContentList(String userId) {
        Users users = UserLoginUtils.currentUser;
        userId = users.getId();
        return searchQueryMapper.queryHistoryContentList(userId);
    }

    @Override
    public List<SearchQuery> queryHistory(String userId) {
        Users users = UserLoginUtils.currentUser;//加入到缓存中
//        searchQuery.setUserId(users.getId());//获取到当前用户
        List<SearchQuery> searchQueryList = searchQueryMapper.queryHistory(users.getId());
        return searchQueryList;
    }

    @Override
    public List<SearchQuery> queryHot() {
        List<SearchQuery> searchQueryList = searchQueryMapper.queryHot();
         return searchQueryList;
    }
}