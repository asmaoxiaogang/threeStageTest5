package com.qf.user.service.impl;

import com.qf.pojo.Subject;
import com.qf.user.dao.UserSubjectDao;
import com.qf.user.service.UserSubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectServiceImpl implements UserSubjectService {

    @Autowired
    private UserSubjectDao subjectDao;

    @Override
    public List<Subject> selectAll() {
        return subjectDao.selectAll();
    }
}
