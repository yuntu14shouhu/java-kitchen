package com.qianjiajia.kitchen.design.service;

import com.qianjiajia.kitchen.design.domain.CnAndEn;
import com.qianjiajia.kitchen.design.domain.Product;

import java.util.List;

/**
 * @author qianjiajia
 * @version 1.0
 * @email qianjiajia_2013@126.com
 * @Date 2017-03-18 14:38
 * @Description 中英文对照
 */
public interface ICnAndEnService {

    List<CnAndEn> all();

    List<String> allEn();

    void save(CnAndEn cnAndEn);

    /**
     * 获取大类别的全部英文名称
     * @return
     */
    List<String> getAllBigClassEnName();

    /**
     * 获取中文名称
     * 根据英文名称
     * @param s
     * @return
     */
    String getClassZhNameByEnName(String s);

    List<String> getAllSmallEnByBigEn();

    List<String> getAllSmallEnByBigZh(String classZhName);

    List<Product> getAllProductBySmallEn(String s);
}
