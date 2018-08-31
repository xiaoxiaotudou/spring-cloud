package com.example.demo.controller;

import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/eureka-consumer-feign")
public class TestController {

    @Autowired
    TestService testService;

    @RequestMapping("/hello")
    public String hello() {

        return testService.hello();
    }
}