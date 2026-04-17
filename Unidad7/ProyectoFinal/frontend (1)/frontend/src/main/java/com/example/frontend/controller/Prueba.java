package com.example.frontend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Prueba {
    @GetMapping("/")
    public String home(){
        return "index";
    }
}
