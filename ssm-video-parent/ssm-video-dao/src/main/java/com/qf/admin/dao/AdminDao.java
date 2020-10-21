package com.qf.admin.dao;

import com.qf.pojo.Admin;
import com.qf.pojo.Course;
import com.qf.pojo.Speaker;
import com.qf.pojo.Video;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminDao {

    @Select("select * from admin where username=#{username} and password=#{password}")
    Admin login(Admin admin);
}
