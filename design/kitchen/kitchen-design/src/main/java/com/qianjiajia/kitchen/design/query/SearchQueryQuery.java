package com.qianjiajia.kitchen.design.query;

import com.qianjiajia.kitchen.common.query.BaseQuery;
import com.qianjiajia.kitchen.design.domain.SearchQueryExample;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;
import org.springframework.util.StringUtils;

import java.util.Date;

/**
 * @author qianjiajia
 * @version 1.0
 * @email qianjiajia_2013@126.com
 * @Date 2017-04-05 17:42
 * @Description 搜索查询query
 */
@Data
@ApiModel
@ToString
public class SearchQueryQuery extends BaseQuery {

    /**
     * 搜索id
     */
    @ApiModelProperty("搜索id")
    private String id;

    /**
     * 搜索类型
     */
    @ApiModelProperty("搜索类型")
    private Short searchType;

    /**
     * 搜索内容
     */
    @ApiModelProperty("搜索内容")
    private String searchContent;

    /**
     * 用户id
     */
    @ApiModelProperty("用户id")
    private String userId;

    /**
     * 搜索时间
     */
    @ApiModelProperty("搜索时间")
    private Date searchTime;

    /**
     * 搜索次数
     */
    @ApiModelProperty("搜索次数")
    private Short searchNumber;

    public SearchQueryExample build(){
        SearchQueryExample searchQueryExample = new SearchQueryExample();
        SearchQueryExample.Criteria criteria = searchQueryExample.createCriteria();
        if(!StringUtils.isEmpty(id)){
            criteria.andIdEqualTo(id);
        }
        if(!StringUtils.isEmpty(searchType)){
            criteria.andSearchTypeEqualTo(searchType);
        }
        if(!StringUtils.isEmpty(searchContent)){
            criteria.andSearchContentEqualTo(searchContent);
        }
        if(!StringUtils.isEmpty(userId)){
            criteria.andUserIdEqualTo(userId);
        }
        if(!StringUtils.isEmpty(searchTime)){
            criteria.andSearchTimeEqualTo(searchTime);
        }
        if(!StringUtils.isEmpty(searchNumber)){
            criteria.andSearchNumberEqualTo(searchNumber);
        }
        return searchQueryExample;
    }
}