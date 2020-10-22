package com.qf.admin.controller;

import com.qf.admin.service.AdminService;
import com.qf.pojo.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("admin")
public class AdminController {

    @Autowired
    private AdminService adminService;


    @RequestMapping("testAdmin")
    public ModelAndView testAdmin(Admin admin) {
        System.out.println("come on testUser...");
        System.out.println("admin: " + admin);
        ModelAndView modelAndView = new ModelAndView();
        return modelAndView;
    }

    @RequestMapping("testMenuPage")
    public ModelAndView testMenuPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("behind/videoList.jsp");
        return modelAndView;
    }

    @RequestMapping("loginAdminPageSkip")
    public ModelAndView loginAdminPageSkip() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("test","test");
        modelAndView.setViewName("behind/login.jsp");
        return modelAndView;
    }

    @RequestMapping("login")
    @ResponseBody
    public String login(Admin admin, HttpSession session) {
        Admin findAdmin = adminService.login(admin);

        session.setAttribute("username", admin.getUsername());

        session.setMaxInactiveInterval(1000000);

        String data = "";
        if (findAdmin != null) {
           data += "success";
        } else {
            data += "failing";
        }
        return data;
    }

    @RequestMapping("exit")
    public String exit(HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        String username =(String) session.getAttribute("username");
        System.out.println("username: " + username);
        session.removeAttribute("username");
//        return "redirect: /admin/loginAdminPageSkip";
        return "redirect: /subject/selectAll";
    }
}
