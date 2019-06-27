package com.sunyi.cloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.jws.HandlerChain;

@Service
public class RibbonService {
    @Autowired
    private RestTemplate restTemplate;

    public String hello(String name) {
        return restTemplate.getForObject("http://eureka-client/hello?name=" + name, String.class);
    }
}
