package com.qf.admin.controller;

import com.qf.pojo.Admin;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("admin")
public class AdminController {

    @RequestMapping("testAdmin")
    public ModelAndView testAdmin(Admin admin) {
        System.out.println("come on testUser...");
        System.out.println("admin: " + admin);
        ModelAndView modelAndView = new ModelAndView();
        return modelAndView;
    }
}
