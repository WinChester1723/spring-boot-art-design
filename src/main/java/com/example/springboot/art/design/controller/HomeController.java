package com.example.springboot.art.design.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/web")
public class HomeController {

    @GetMapping("/home")
    public String home(){
        return "home";
    }

    @GetMapping("/testHome")
    public String testHome(){
        return "home_page";
    }

    @GetMapping("/test")
    public String test(){
        return "test";
    }
}
