package com.qf.admin.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.admin.service.SpeakerService;
import com.qf.pojo.Speaker;
import com.qf.pojo.Video;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("speaker")
public class SpeakerController {
    @Autowired
    private SpeakerService speakerService;

    @RequestMapping("showSpeakerList")
    public String showSpeakerList(@RequestParam(value = "page",defaultValue = "1") int page,
                                  @RequestParam(value = "pageSize",defaultValue = "5") int pageSize, Model model) {
        PageHelper.startPage(page, pageSize);
        List<Speaker> speakerList = speakerService.findAllSpeaker();
        PageInfo<Speaker> pageInfo = new PageInfo<>(speakerList);
        model.addAttribute("pageInfo", pageInfo);
        model.addAttribute("","");
        model.addAttribute("speakerList", speakerList);
        return "/behind/speakerList.jsp";
    }

    @RequestMapping("addSpeaker")
    public String addSpeaker(Integer id, Model model) {
        System.err.println("id: " + id);
        if (id!=null) {
            Speaker speaker = speakerService.findSpeakerById(id);
            model.addAttribute("speaker", speaker);
        }
        return "/behind/addSpeaker.jsp";
    }

    @RequestMapping("saveOrUpdate")
    public String saveOrUpdate(Speaker speaker) {
        System.out.println("addSpeaker: " + speaker);
        speakerService.addSpeaker(speaker);
        return "redirect: /speaker/showSpeakerList";
    }

    @RequestMapping("speakerDel")
    @ResponseBody
    public String speakerDel(Integer id, String speakerName) {
        System.out.println("come on speakerDel");
        System.out.println("id: " + id);
        System.out.println("speakerName: " + speakerName);
        speakerService.speakerDel(id);
        return "success";
    }


}
