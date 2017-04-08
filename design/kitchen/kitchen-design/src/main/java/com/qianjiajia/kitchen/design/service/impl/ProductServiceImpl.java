package com.qianjiajia.kitchen.design.service.impl;

import com.qianjiajia.kitchen.common.annotation.Page;
import com.qianjiajia.kitchen.common.result.PageResult;
import com.qianjiajia.kitchen.common.utils.UUIDUtil;
import com.qianjiajia.kitchen.design.dao.ProductMapper;
import com.qianjiajia.kitchen.design.domain.*;
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
    public List<Product> pageSlide(ProductQuery productQuery) {
        return productMapper.getPage(productQuery);
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
    public List<Product> productIsDiscount(ProductQuery productQuery) {
        List<Product> productList = productMapper.productIsDiscount(productQuery);
        return productList;
    }

    @Override
    @Page
    public List<Product> productIsGroup(ProductQuery productQuery) {
        List<Product> productList = productMapper.productIsGroup(productQuery);
        return productList;
    }

    @Override
    @Page
    public List<Product> productByPutawayDate(ProductQuery productQuery) {
        List<Product> productList = productMapper.productByPutawayDate(productQuery);
        return productList;
    }

    @Override
    public List<Product> queryByBigClass(String bigClass) {
        return productMapper.queryByBigClass(bigClass);
    }

    @Override
    public List<Product> queryBySmallClass(String smallClass) {
        return productMapper.queryBySmallClass(smallClass);
    }

    @Override
    public List<String> getAllBigKeyClass() {
        return productMapper.getBigClassData();
    }

    @Override
    public List<String> getAllKeyClass(String bigKeyClass) {
        return productMapper.getKeyClass(bigKeyClass);
    }

    @Override
    public List<Product> getAllSlide(Product product) {
        return productMapper.getSlide1(product);
    }

    @Override
    public List<String> getAllSlide() {
        return productMapper.getSlide();
    }

    @Override
    public List<Product> getAllDiscount(Product product) {
        return productMapper.getDiscount(product);
    }

    @Override
    public List<Product> getAllGroup(Product product) {
        return productMapper.getGroup(product);
    }

    @Override
    public List<Product> getAllRecommend(Product product) {
        return productMapper.getRecommend(product);
    }

    @Override
    public List<String> queryProductId() {
        return productMapper.queryProductId();
    }

    @Override
    public Product queryToProduct(String  productId) {
        return productMapper.queryToProduct(productId);
    }

    @Override
    public List<ProductQuery> fuzzyQuery(ProductQuery productQuery) {

        return productMapper.fuzzyQuery(productQuery);
    }

    @Override
    public List<ProductQuery> fuzzyQueryProductName(String s) {
        return productMapper.fuzzyQueryProductName(s);
    }

}