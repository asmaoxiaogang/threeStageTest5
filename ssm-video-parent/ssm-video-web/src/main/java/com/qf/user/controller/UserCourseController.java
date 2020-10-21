package com.qf.user.controller;


import com.qf.user.service.UserCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("course")
public class UserCourseController {
    @Autowired
    private UserCourseService userCourseService;

}
