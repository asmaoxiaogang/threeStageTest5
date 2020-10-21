package com.qf.admin.service;

import com.qf.pojo.QueryVo;
import com.qf.pojo.Video;

import java.util.List;

public interface VideoService {
    List<Video> findAllVideo( QueryVo queryVo);

    void saveOrUpdate(Video video);

    void videoDel(int id);

    List<Video> findVideoById(Integer id);
}
