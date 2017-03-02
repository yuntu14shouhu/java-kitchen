package com.qianjiajia.kitchen.common.query;

import lombok.Data;

/**
 * @author qianjiajia
 * @version 1.0
 * @Date 2017-02-28 9:38
 * @Description 通用查询对象
 */
@Data
public class BaseQuery {
    /**
     * 每页多少条数据
     */
    private Integer pageSize = 10;

    /**
     * 页码
     */
    private Integer page = 1;

    public int getFirstResult(){
        return (getPage() - 1) * getPageSize();
    }

}