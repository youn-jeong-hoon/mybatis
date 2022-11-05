package com.example.demo;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface UserDao {
    int insert(User user);
    @Update("update user set user_name = #{userName} where user_id = #{userId}")
    int update(User user);
}
