package com.qf.admin.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.admin.service.CourseService;
import com.qf.admin.service.SpeakerService;
import com.qf.admin.service.VideoService;
import com.qf.pojo.Course;
import com.qf.pojo.QueryVo;
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
@RequestMapping("video")
public class VideoController {

    @Autowired
    private VideoService videoService;

    @Autowired
    private CourseService courseService;

    @Autowired
    private SpeakerService speakerService;

    @RequestMapping("list")
    public String list(@RequestParam(value = "page",defaultValue = "1") int page,
                       @RequestParam(value = "pageSize",defaultValue = "6") int pageSize, Model model, QueryVo queryVo) {
        PageHelper.startPage(page, pageSize);

        List<Video> videoList = videoService.findAllVideo(queryVo);

        List<Course> courseList = courseService.findAllCourse();

        List<Speaker> speakerList = speakerService.findAllSpeaker();

        PageInfo<Video> pageInfo = new PageInfo<>(videoList);

        model.addAttribute("pageInfo", pageInfo);

        model.addAttribute("videoList", videoList);

        model.addAttribute("courseList", courseList);

        model.addAttribute("speakerList", speakerList);

        return "behind/videoList.jsp";
    }

    @RequestMapping("addVideo")
    public String addVideo(Model model, Integer id) {
        List<Speaker> speakerList = speakerService.findAllSpeaker();
        List<Course> courseList = courseService.findAllCourse();
        model.addAttribute("speakerList", speakerList);
        model.addAttribute("courseList", courseList);
        if (id != null){
            List<Video> videoList = videoService.findVideoById(id);
            Video video = videoList.get(0);
            model.addAttribute("video", video);
        }

        return "/behind/addVideo.jsp";
    }

    @RequestMapping("saveOrUpdate")
    public String saveOrUpdate(Video video){
        System.out.println("come on saveOrUpdate..." + video.getId());

        videoService.saveOrUpdate(video);
        return "redirect: /video/list";
    }

    @RequestMapping("videoDel")
    @ResponseBody
    public String videoDel(int id) {
        videoService.videoDel(id);
        return "success";
    }

    @RequestMapping("edit")
    public String edit(Integer id, Model model, QueryVo queryVo) {
        System.out.println("come on edit...");
        System.out.println("edit Id: " + id);
        List<Video> videoList = videoService.findAllVideo(queryVo);
        model.addAttribute("videoList", videoList);
        return "/behind/modifyVideo.jsp";
    }

    @RequestMapping("modifyVideo")
    public String modifyVideo(Video video) {
        System.out.println("come on video...");
        System.out.println("video" + video);
//        videoService.modifyVideo(video);
        return "/behind/videoList.jsp";
    }

    @RequestMapping("delBatchVideos")
    @ResponseBody
    public String delBatchVideos(Integer delNum) {
        System.out.println("come on delBatchVideos...");
        System.out.println("delNum" + delNum);

        return "";
    }

}
