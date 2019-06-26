package com.sunyi.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClienApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaClienApplication.class, args);
    }
}
