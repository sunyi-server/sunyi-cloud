package com.sunyi.cloud.controller;

import com.sunyi.cloud.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${server.port}")
    private String port;
    @Autowired
    private HelloService helloService;

    @GetMapping("/hello")
    public String hello(String name) {
        return helloService.hello(name) + port;
    }
}
