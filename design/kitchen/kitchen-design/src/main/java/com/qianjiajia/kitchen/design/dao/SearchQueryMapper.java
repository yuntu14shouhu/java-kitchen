package com.qianjiajia.kitchen.design.dao;

import com.qianjiajia.kitchen.design.domain.SearchQuery;
import com.qianjiajia.kitchen.design.domain.SearchQueryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SearchQueryMapper {
    long countByExample(SearchQueryExample example);

    int deleteByExample(SearchQueryExample example);

    int deleteByPrimaryKey(String id);

    int insert(SearchQuery record);

    int insertSelective(SearchQuery record);

    List<SearchQuery> selectByExample(SearchQueryExample example);

    SearchQuery selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SearchQuery record, @Param("example") SearchQueryExample example);

    int updateByExample(@Param("record") SearchQuery record, @Param("example") SearchQueryExample example);

    int updateByPrimaryKeySelective(SearchQuery record);

    int updateByPrimaryKey(SearchQuery record);

    List<SearchQuery> queryHistory(String usersId);

    List<SearchQuery> queryHot();

    void deleteAll(String userId);

    SearchQuery queryHistoryN(String userId);

    SearchQuery queryHotN();

    List<String> queryContentList();

    List<String> queryHistoryContentList(String id);
}