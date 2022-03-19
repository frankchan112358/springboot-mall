package com.frankchan.springbootmall.dao;

import com.frankchan.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
