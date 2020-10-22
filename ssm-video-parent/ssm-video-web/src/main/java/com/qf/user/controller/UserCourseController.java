package com.qf.user.controller;


import com.qf.pojo.Course;
import com.qf.pojo.Subject;
import com.qf.user.service.UserCourseService;
import com.qf.user.service.UserSubjectService;
import com.qf.user.service.UserVideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("course")
public class UserCourseController {
    @Autowired
    private UserCourseService userCourseService;

    @Autowired
    private UserSubjectService subjectService;


    @RequestMapping("course")
    public String course(Integer id, Model model) {
        System.out.println("come course/course/courseId");
        Integer idAll=null;
        List<Subject> subjectList = subjectService.selectAll(idAll);

        System.err.println("subjectList: " + subjectList);
        System.out.println("size: " + subjectList.size());
//        subject为所有的course科目
//        course为具体某一个subject信息描述
        List<Subject> subjectList1 = subjectService.selectAll(id);

        List<Course> courseList = userCourseService.course(id);

        subjectList1.get(0).setCourseList(courseList);//把对应的course放到subject实体类中
        System.out.println("subjectList1： " + subjectList1.get(0));
        model.addAttribute("subject", subjectList1.get(0));
        model.addAttribute("subjectList" + subjectList);//subjectList：遍历所有的高级课程，为了下拉菜单使用

        return "before/course.jsp";
    }


}


//select *
//        from course,video
//        where subject_id=1
//        and video.course_id=course.id