package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// @SpringBootApplication 注解 包含了 @SpringBootConfiguration、 @EnableAutoConfiguration 和 @ComponentScan
// 开启了包扫描 配置 和 自动配置功能
@SpringBootApplication
// 创建一个 Web 层的 Controller
// RestController 注解是 Spring4.0 版本的一个注解，
// 功能相当于，@Controller 注解和 @ResponseBody 注解之和。
@RestController
public class DemoApplication {

    @Value("${my.name}")
    private String name;
    @Value("${my.age}")
    private String age;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    // 用来请求地址的url映射
    @RequestMapping(value = "/hi")
    public String hi() {
        return name + ":" + age;
    }

}
