package com.qf.admin.dao;

import com.qf.pojo.QueryVo;
import com.qf.pojo.Video;

import java.util.List;

public interface VideoDao {

    List<Video> findAllVideo(QueryVo queryVo);

    void saveOrUpdate(Video video);

    void videoDel(int id);

    List<Video> findVideoById(Integer id);
}
