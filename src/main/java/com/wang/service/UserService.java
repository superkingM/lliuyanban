package com.wang.service;

import com.wang.mapper.UserMapper;
import com.wang.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User queryUserByNameAndPassword(User user) {
        return userMapper.queryUserByNameAndPassword(user);
    }

    public User queryTest() {
        return userMapper.queryTest();
    }
}
