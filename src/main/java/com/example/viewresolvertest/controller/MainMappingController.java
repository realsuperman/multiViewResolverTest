package com.example.viewresolvertest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainMappingController {
    @GetMapping("hello2")
    public String home(){
        return "hello2.html";
    }
    @GetMapping("hello")
    public String home2(){
        return "hello.jsp";
    }
}
