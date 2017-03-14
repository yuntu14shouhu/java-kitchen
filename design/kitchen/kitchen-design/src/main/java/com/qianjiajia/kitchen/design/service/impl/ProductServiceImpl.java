package com.qianjiajia.kitchen.design.service.impl;

import com.qianjiajia.kitchen.common.annotation.Page;
import com.qianjiajia.kitchen.common.result.PageResult;
import com.qianjiajia.kitchen.common.utils.UUIDUtil;
import com.qianjiajia.kitchen.design.dao.ProductMapper;
import com.qianjiajia.kitchen.design.domain.Product;
import com.qianjiajia.kitchen.design.query.ProductQuery;
import com.qianjiajia.kitchen.design.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * @author qianjiajia
 * @version 1.0
 * @Date 2017-02-28 23:21
 */
@Service
public class ProductServiceImpl implements IProductService{

    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> pageSlide() {
        return productMapper.getPage();
    }

    @Override
    @Transactional
    public void save(Product product) {
        product.setId(UUIDUtil.getUUID());
        product.setPutawayDate(new Date());
        productMapper.insert(product);
    }

    @Override
    @Page
    public PageResult query(ProductQuery productQuery) {
        List<Product> productList = productMapper.getAll(productQuery);
        return new PageResult(productList);
    }

    @Override
    public Product getById(String productId) {
        return productMapper.getById(productId);
    }

    @Override
    @Transactional
    public void update(Product product) {
      productMapper.updateByPrimaryKey(product);
    }

    @Override
    @Transactional
    public void delete(String productId) {
        productMapper.deleteByPrimaryKey(productId);
    }

    @Override
    @Page
    public PageResult productIsDiscount(ProductQuery productQuery) {
        List<Product> productList = productMapper.productIsDiscount(productQuery);
        return new PageResult(productList);
    }

    @Override
    @Page
    public PageResult productIsGroup(ProductQuery productQuery) {
        List<Product> productList = productMapper.productIsGroup(productQuery);
        return new PageResult(productList);
    }

    @Override
    @Page
    public PageResult productByPutawayDate(ProductQuery productQuery) {
        List<Product> productList = productMapper.productByPutawayDate(productQuery);
        return new PageResult(productList);
    }

    @Override
    public List<Product> queryByBigClass(String bigClass) {
        return productMapper.queryByBigClass(bigClass);
    }

    @Override
    public List<Product> queryBySmallClass(String smallClass) {
        return productMapper.queryBySmallClass(smallClass);
    }


}