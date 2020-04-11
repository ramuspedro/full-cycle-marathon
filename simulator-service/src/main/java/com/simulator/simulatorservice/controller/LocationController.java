package com.simulator.simulatorservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocationController {
    @RequestMapping(value = "/update", method = RequestMethod.GET)
    public ResponseEntity<?> updateOrder() {
        return ResponseEntity.ok().build();
    }
}
