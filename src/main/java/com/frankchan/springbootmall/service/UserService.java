package com.frankchan.springbootmall.service;

import com.frankchan.springbootmall.dto.UserRegisterRequest;
import com.frankchan.springbootmall.model.User;

public interface UserService {
    Integer register(UserRegisterRequest userRegisterRequest);

    User getUserById(Integer userId);
}
