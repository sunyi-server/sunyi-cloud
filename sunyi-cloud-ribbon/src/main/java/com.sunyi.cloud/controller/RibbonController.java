package com.sunyi.cloud.controller;

import com.sunyi.cloud.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonController {
    @Autowired
    private RibbonService ribbonService;

    @GetMapping("/hello")
    public String hello(String name) {
        return ribbonService.hello(name);
    }
}
