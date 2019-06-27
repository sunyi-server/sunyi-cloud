package com.sunyi.cloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
    @Autowired
    private FeignService feignService;

    public String hello(String name){
        return feignService.hello(name);
    }
}
