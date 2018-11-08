package com.pei.liu.springboot.web.controller;

import com.pei.liu.springboot.model.User;
import com.pei.liu.springboot.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private Userservice userservice;

    @RequestMapping(value = "/user/getAll",method = RequestMethod.GET)
    public List<User> getAll(){
        return userservice.getAllUser();
    }

}
