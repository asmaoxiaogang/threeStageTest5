package com.qf.admin.dao;

import com.qf.pojo.Speaker;

import java.util.List;

public interface SpeakerDao {
    List<Speaker> findAllSpeaker();

    void addSpeaker(Speaker speaker);

    void speakerDel(Integer id);

    Speaker findSpeakerById(Integer id);
}
