package com.frankchan.springbootmall.service.impl;

import com.frankchan.springbootmall.dao.ProductDao;
import com.frankchan.springbootmall.dto.ProductRequest;
import com.frankchan.springbootmall.model.Product;
import com.frankchan.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }

    @Override public Integer createProduct(ProductRequest productRequest) {
        return productDao.createProduct(productRequest);
    }
}
