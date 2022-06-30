package com.example.springboot;

import com.example.springboot.bean.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import javax.swing.*;

@SpringBootTest
class SpringbootApplicationTests {

    @Autowired
    Person person;

    // IOC容器
    @Autowired
    ApplicationContext ioc;

    @Test
    void contextLoads() {
        System.out.println(person);
    }

    // 测试IOC容器是否包含指定bean
    @Test
    public void testHelloService(){
        boolean exists = ioc.containsBean("helloService");
        System.out.println(exists);
    }
}
