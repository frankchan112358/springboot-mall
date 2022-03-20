package com.frankchan.springbootmall.dao;

import com.frankchan.springbootmall.dto.ProductRequest;
import com.frankchan.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProduct(Integer productId);
}
