package com.qf.user.controller;

import com.qf.pojo.Subject;
import com.qf.user.service.UserSubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("subject")
public class UserSubjectController {

    @Autowired
    private UserSubjectService subjectService;

    @RequestMapping("selectAll")
    public String selectAll(Model model, Integer id) {
        List<Subject> subjectList = subjectService.selectAll(id);
        System.out.println("subjectList" + subjectList);
        model.addAttribute("subjectList", subjectList);


        return "before/index.jsp";
    }
}
