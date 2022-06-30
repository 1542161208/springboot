package com.example.springboot;

import com.example.springboot.bean.Person;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;


@SpringBootTest
class SpringbootApplicationTests {
    Logger logger = LoggerFactory.getLogger(getClass());

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
    public void testHelloService() {
        boolean exists = ioc.containsBean("helloService");
        System.out.println(exists);
    }

    // slf4j日志
    @Test
    public void testLog() {
        // 日志的级别由低到高:tracce<debug<info<warn<error
        // 可以调整日志的输出级别
        logger.trace("tracce");
        logger.debug("debug");
        // springboot默认给我使用的是info级别的只会输出info级别及其以后的
        logger.info("info");
        logger.warn("warn");
        logger.error("error");
    }
}
