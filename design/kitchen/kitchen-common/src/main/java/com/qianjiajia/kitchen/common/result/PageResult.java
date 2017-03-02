package com.qianjiajia.kitchen.common.result;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @author qianjiajia
 * @version 1.0
 * @Date 2017-02-28 9:49
 */
@Data
@NoArgsConstructor
public class PageResult<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 每页多少条数据
     */
    private Integer pageSize = 10;

    /**
     * 总记录数目
     */
    private Long total;

    /**
     * 当前页数
     */
    private Integer currentPage = 1;

    /**
     * 总页数
     */
    private Integer page;

    /**
     * 数据
     */
    private List items;

    public PageResult(List items){
        this.items = items;
    }

    public PageResult(List items,Long total, Integer pageSize) {
        this.items = items;
        this.total = total;
        this.page = (int)(((total + pageSize) - 1) / pageSize);
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}