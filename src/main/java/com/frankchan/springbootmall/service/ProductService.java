package com.frankchan.springbootmall.service;

import com.frankchan.springbootmall.dto.ProductRequest;
import com.frankchan.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
