package com.sunyi.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//开启多个项目可同时启动

@RestController
public class HelloController {

    @Value("${server.port}")
    String port;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public Object hello(String name) {
        System.out.println("eureka-client" + port + "：" + name);
        return port+"："+name;
    }
}

