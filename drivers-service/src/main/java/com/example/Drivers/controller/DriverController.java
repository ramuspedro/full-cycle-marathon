package com.example.Drivers.controller;

import com.example.Drivers.model.Driver;

import com.example.Drivers.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/drivers")
public class DriverController {

    @Autowired
    private DriverService driverService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<List<Driver>> index() {
        List<Driver> drivers = driverService.findAll();
        return ResponseEntity.ok().body(drivers);
    }
}
