package com.qf.admin.controller;

import com.qf.admin.service.CourseService;
import com.qf.pojo.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping("showCourseList")
    public ModelAndView showCourseList() {
        ModelAndView modelAndView = new ModelAndView();
        List<Course> courseList = courseService.findAllCourse();
        return modelAndView;
    }
}
