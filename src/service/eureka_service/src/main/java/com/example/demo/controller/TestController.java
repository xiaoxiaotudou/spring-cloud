package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/eureka-service")
public class TestController {

    @RequestMapping("/hello")
    public String hello() {

        System.out.println("eureka-service");

        return "hello, eureka-service";
    }
}
