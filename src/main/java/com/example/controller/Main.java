package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="/api/v1")
public class Main {
    @GetMapping("/test")
    public String showHomePage(){
        return "index";
    }
}
