package com.qf.user.dao;

import com.qf.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface UserDao {

    @Select("select * from user where email=#{email} and password=#{password}")
    User loginUser(@Param(value = "email") String email,@Param(value = "password") String password);
}
