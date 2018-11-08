package com.pei.liu.springboot;

import com.pei.liu.springboot.service.Userservice;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Log4j2
public class SpringbootApplicationTests {



    @Autowired
    Userservice userservice;

    @Test
    public void contextLoads() {
    }
    @Test
    public void getAllUser(){
        log.info("11111111:{}",userservice.getAllUser());
    }
}
