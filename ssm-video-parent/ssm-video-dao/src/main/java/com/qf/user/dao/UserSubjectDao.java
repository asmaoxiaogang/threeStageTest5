package com.qf.user.dao;

import com.qf.pojo.Subject;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserSubjectDao {

    List<Subject> selectAll(Integer id);
}
