package com.sunyi.cloud.feign;

import com.sunyi.cloud.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-client",configuration = FeignConfig.class)
public interface EurekaClientFeign {

    @GetMapping("/hello")
    String hello(@RequestParam(value = "name") String name);
}
