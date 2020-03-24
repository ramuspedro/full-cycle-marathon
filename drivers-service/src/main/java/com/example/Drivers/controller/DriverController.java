package com.example.Drivers.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/drivers")
public class DriverController {
    @RequestMapping("")
    public String index() {
        return "This will return all the drivers";
    }
}
