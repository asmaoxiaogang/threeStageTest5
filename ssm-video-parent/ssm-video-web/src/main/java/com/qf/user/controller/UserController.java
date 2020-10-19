package com.qf.user.controller;

import com.qf.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("user")
public class UserController {

    @RequestMapping("testUser")
    public ModelAndView testUser(User user) {
        System.out.println("come on testUser...");
        System.out.println("user: " + user);
        ModelAndView modelAndView = new ModelAndView();
        return modelAndView;
    }
}
