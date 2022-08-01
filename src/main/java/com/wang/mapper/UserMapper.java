package com.wang.mapper;

import com.wang.pojo.User;
import org.apache.ibatis.annotations.Select;


public interface UserMapper {
    User queryUserByNameAndPassword(User user);

    @Select("select * from user limit 1")
    public User queryTest();
}
