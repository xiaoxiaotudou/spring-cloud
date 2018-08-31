package com.example.demo.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "eureka-service")
public interface TestService {

    @RequestMapping("/eureka-service/hello")
    String hello();
}
