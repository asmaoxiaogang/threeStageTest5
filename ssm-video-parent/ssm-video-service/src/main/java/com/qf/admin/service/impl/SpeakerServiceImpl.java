package com.qf.admin.service.impl;

import com.qf.admin.dao.SpeakerDao;
import com.qf.admin.service.SpeakerService;
import com.qf.pojo.Speaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SpeakerServiceImpl implements SpeakerService {

    @Autowired
    @Resource
    private SpeakerDao speakerDao;

    @Override
    public List<Speaker> findAllSpeaker() {
        return speakerDao.findAllSpeaker();
    }

    @Override
    public void addSpeaker(Speaker speaker) {
        speakerDao.addSpeaker(speaker);
    }

    @Override
    public void speakerDel(Integer id) {
        speakerDao.speakerDel(id);
    }

    @Override
    public Speaker findSpeakerById(Integer id) {
        return speakerDao.findSpeakerById(id);
    }
}
