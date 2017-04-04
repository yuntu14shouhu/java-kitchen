package com.qianjiajia.kitchen.design.service.impl;

import com.qianjiajia.kitchen.common.utils.UUIDUtil;
import com.qianjiajia.kitchen.design.dao.CnAndEnMapper;
import com.qianjiajia.kitchen.design.domain.CnAndEn;
import com.qianjiajia.kitchen.design.domain.Product;
import com.qianjiajia.kitchen.design.service.ICnAndEnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author qianjiajia
 * @version 1.0
 * @email qianjiajia_2013@126.com
 * @Date 2017-03-18 14:39
 * @Description 中英文对照
 */
@Service
public class CnAndEnServiceImpl implements ICnAndEnService{

    @Autowired
    private CnAndEnMapper cnAndEnMapper;

    @Override
    public List<CnAndEn> all() {
        return cnAndEnMapper.selectByExample(null);
    }

    @Override
    public List<String> allEn() {
        return cnAndEnMapper.allEn();
    }

    @Transactional
    @Override
    public void save(CnAndEn cnAndEn) {
        cnAndEn.setCnAndEnId(UUIDUtil.getUUID());
        cnAndEnMapper.save(cnAndEn);
    }

    @Override
    public List<String> getAllBigClassEnName() {
        return cnAndEnMapper.getAllEnName();
    }

    @Override
    public String getClassZhNameByEnName(String s) {
        return null;
    }

    @Override
    public List<String> getAllSmallEnByBigEn() {
        return null;
    }

    @Override
    public List<String> getAllSmallEnByBigZh(String classZhName) {
        return null;
    }

    @Override
    public List<Product> getAllProductBySmallEn(String s) {
        return null;
    }
}