package com.frankchan.springbootmall.service;

import com.frankchan.springbootmall.constant.ProductCategory;
import com.frankchan.springbootmall.dto.ProductRequest;
import com.frankchan.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductCategory category, String search);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProduct(Integer productId);

}
