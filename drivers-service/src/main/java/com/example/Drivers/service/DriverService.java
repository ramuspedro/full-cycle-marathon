package com.example.Drivers.service;

import com.example.Drivers.model.Driver;
import com.example.Drivers.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverService {

    @Autowired
    private DriverRepository repo;

    public List<Driver> findAll() {
        return repo.findAll();
    }
}
