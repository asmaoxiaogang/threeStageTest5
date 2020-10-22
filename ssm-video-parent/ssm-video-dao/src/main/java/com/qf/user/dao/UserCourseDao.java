package com.qf.user.dao;

import com.qf.pojo.Course;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserCourseDao {

    List<Course> course(Integer id);
}
