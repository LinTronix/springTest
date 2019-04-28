package com.example.demo.controllers;

import com.example.demo.services.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.annotation.Target;
@Controller
public class HelloController {
    @Autowired
private HelloService helloService;
    @GetMapping("/")
    @ResponseBody
    public String helloWorld(){
        return helloService.getHello();
    }

    @GetMapping("/test")
    @ResponseBody
public String test(){
        return "test";
    }



}
