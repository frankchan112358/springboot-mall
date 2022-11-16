package com.frankchan.springbootmall.service.impl;

import com.frankchan.springbootmall.dao.UserDao;
import com.frankchan.springbootmall.dto.UserRegisterRequest;
import com.frankchan.springbootmall.model.User;
import com.frankchan.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }

    @Override public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }
}
