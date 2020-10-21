package com.qf.admin.service.impl;

import com.qf.admin.dao.VideoDao;
import com.qf.admin.service.VideoService;
import com.qf.pojo.QueryVo;
import com.qf.pojo.Video;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class VideoServiceImpl implements VideoService {

    @Autowired
    @Resource
    private VideoDao videoDao;

    @Override
    public List<Video> findAllVideo( QueryVo queryVo) {
        return videoDao.findAllVideo(queryVo);
    }

    @Override
    public void saveOrUpdate(Video video) {
        videoDao.saveOrUpdate(video);
    }

    @Override
    public void videoDel(int id) {
        videoDao.videoDel(id);
    }

    @Override
    public List<Video> findVideoById(Integer id) {
        return videoDao.findVideoById(id);
    }
}
