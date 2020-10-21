package com.qf.admin.service.impl;

import com.qf.admin.dao.CourseDao;
import com.qf.admin.service.CourseService;
import com.qf.pojo.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    @Resource
    private CourseDao courseDao;

    @Override
    public List<Course> findAllCourse() {
        return courseDao.findAllCourse();
    }
}
