package com.qf.admin.dao;

import com.qf.pojo.Course;

import java.util.List;

public interface CourseDao {
    List<Course> findAllCourse();
}
