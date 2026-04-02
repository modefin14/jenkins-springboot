package com.hari.jenkins_springboot.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String test(){
        System.out.println("Executing TestController");
        return "Hello Jenkins Spring boot application from Controller";
    }
}
