package com.example.Drivers.controller;

import com.example.Drivers.model.Driver;

import com.example.Drivers.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

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

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Driver> find(@PathVariable Integer id) {
        Driver obj = driverService.find(id);
        return ResponseEntity.ok().body(obj);
    }
}
