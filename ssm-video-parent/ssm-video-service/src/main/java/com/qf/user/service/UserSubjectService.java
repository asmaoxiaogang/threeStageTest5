package com.qf.user.service;

import com.qf.pojo.Subject;

import java.util.List;

public interface UserSubjectService {
    List<Subject> selectAll(Integer id);
}
