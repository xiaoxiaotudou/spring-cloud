package com.example.demo.controller;

import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/eureka-consumer")
public class TestController {

    @Autowired
    TestService testService;

    @RequestMapping("/hello")
    public String hello() {
        System.out.println("hello");

        return testService.hello();
    }
}