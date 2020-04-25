package com.example.orderservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/order")
public class OrderController {
    @RequestMapping(value = "", method = RequestMethod.POST)
    public String index() {
        return "Get order";
    }
}
