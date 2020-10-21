package com.qf.admin.service;

import com.qf.pojo.Speaker;

import java.util.List;

public interface SpeakerService {
    List<Speaker> findAllSpeaker();

    void addSpeaker(Speaker speaker);

    void speakerDel(Integer id);

    Speaker findSpeakerById(Integer id);
}
