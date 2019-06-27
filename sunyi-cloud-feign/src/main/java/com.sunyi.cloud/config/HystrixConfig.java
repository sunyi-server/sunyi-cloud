package com.sunyi.cloud.config;

import com.sunyi.cloud.service.FeignService;
import org.springframework.stereotype.Component;

//熔断器处理
@Component
public class HystrixConfig implements FeignService {

    @Override
    public String hello(String name) {
        return "error!";
    }
}
