package com.qf.user.service;

import com.qf.pojo.User;

public interface UserService {
    User loginUser(String email, String password);
}
