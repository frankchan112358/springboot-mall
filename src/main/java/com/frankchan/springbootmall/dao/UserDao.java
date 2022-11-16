package com.frankchan.springbootmall.dao;

import com.frankchan.springbootmall.dto.UserRegisterRequest;
import com.frankchan.springbootmall.model.User;

public interface UserDao {
    Integer createUser(UserRegisterRequest userRegisterRequest);

    User getUserById(Integer userId);
}
