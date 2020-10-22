package com.qf.user.controller;

import com.qf.pojo.User;
import com.qf.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("testUser")
    public ModelAndView testUser(User user) {
        System.out.println("come on testUser...");
        System.out.println("user: " + user);
        ModelAndView modelAndView = new ModelAndView();
        return modelAndView;
    }

    @RequestMapping("loginUser")
    @ResponseBody
    public String loginUser(String email, String password, HttpSession session) {
        User loginUser = userService.loginUser(email, password);
        String data = "";
        if (loginUser != null){
            session.setAttribute("userAccount",loginUser.getEmail());
            session.setMaxInactiveInterval(100000);
            data += "success";
        } else {
            data += "failing";
        }
        return data;
    }
}
