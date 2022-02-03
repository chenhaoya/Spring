package com.ch.mapper;

import com.ch.pojo.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface UserMapper {
    @Select("select * from user")
    List<User> selectUser();
    int addUser(User user);
    int deleteUser(int id);
}
