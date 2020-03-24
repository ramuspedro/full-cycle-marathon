package com.example.Drivers.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Health {
    @RequestMapping("/")
    public String index() {
        return "This app is running on port 8081";
    }
}
