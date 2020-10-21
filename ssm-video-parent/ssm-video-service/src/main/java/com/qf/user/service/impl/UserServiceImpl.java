package com.qf.user.service.impl;

import com.qf.pojo.User;
import com.qf.user.dao.UserDao;
import com.qf.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User loginUser(String email, String password) {
        return userDao.loginUser(email, password);
    }
}
