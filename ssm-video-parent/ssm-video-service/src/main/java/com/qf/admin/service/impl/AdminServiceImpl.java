package com.qf.admin.service.impl;

import com.qf.admin.dao.AdminDao;
import com.qf.admin.service.AdminService;
import com.qf.pojo.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminDao adminDao;


    @Override
    public Admin login(Admin admin) {
        return adminDao.login(admin);
    }

}
