package com.example.springboot.config;

import com.example.springboot.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author lx
 * @create 2022/06/29
 */
// @Configuration:指明当前类是一个配置类,用来替代之前的spring配置文件(bean.xml),SpringBoot推荐使用这种
@Configuration
public class MyAppConfig {
    // 将方法的返回值添加到容器中,就是用来代替之前的Spring配置文件
    @Bean
    public HelloService helloService() {
        return new HelloService();
    }
}
