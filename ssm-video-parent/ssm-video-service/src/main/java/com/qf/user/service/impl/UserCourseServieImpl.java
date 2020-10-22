package com.qf.user.service.impl;

import com.qf.pojo.Course;
import com.qf.user.dao.UserCourseDao;
import com.qf.user.service.UserCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserCourseServieImpl implements UserCourseService {
    @Autowired
    private UserCourseDao userCourseDao;


    @Override
    public List<Course> course(Integer id) {
        return userCourseDao.course(id);
    }
}
