package com.gyf.web.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController//声明Rest风格的控制器
@EnableAutoConfiguration//自动配置，相当于写了spring的配置文件
public class HelloController {
    @RequestMapping("hello/{name}")
    @ResponseBody
    public String hello(@PathVariable("name") String name){
        System.out.println(name);

        return  name + " Hello World";
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloController.class,args);
    }

}