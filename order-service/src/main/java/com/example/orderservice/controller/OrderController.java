package com.example.orderservice.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:33493")
@RequestMapping(value = "/order")
public class OrderController {
    @RequestMapping(value = "", method = RequestMethod.POST)
    public String index() {
        return "Get order";
    }
}
