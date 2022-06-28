package com.example.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lx
 * @create 2022/06/26
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {

        return "hello world!";
    }
}
