package com.frankchan.springbootmall.service.impl;

import com.frankchan.springbootmall.dao.ProductDao;
import com.frankchan.springbootmall.dto.ProductQueryParams;
import com.frankchan.springbootmall.dto.ProductRequest;
import com.frankchan.springbootmall.model.Product;
import com.frankchan.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override public Integer countProducts(ProductQueryParams productQueryParams) {
        return productDao.countProducts(productQueryParams);
    }

    @Override public List<Product> getProducts(ProductQueryParams productQueryParams) {
        return productDao.getProducts(productQueryParams);
    }

    @Override public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }

    @Override public Integer createProduct(ProductRequest productRequest) {
        return productDao.createProduct(productRequest);
    }

    @Override public void updateProduct(Integer productId, ProductRequest productRequest) {
        productDao.updateProduct(productId, productRequest);
    }

    @Override public void deleteProduct(Integer productId) {
        productDao.deleteProduct(productId);
    }
}
