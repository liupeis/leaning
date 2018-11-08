package com.pei.liu.springboot.service;

import com.pei.liu.springboot.mapper.UserMapper;
import com.pei.liu.springboot.model.User;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Slf4j
public class Userservice {

    private static Logger logger = LoggerFactory.getLogger(Userservice.class);

    @Autowired
    private UserMapper userMapper;

    public List<User> getAllUser(){
        log.info("userService.getAllUser:begin");
        return userMapper.getAll();
    }

}
