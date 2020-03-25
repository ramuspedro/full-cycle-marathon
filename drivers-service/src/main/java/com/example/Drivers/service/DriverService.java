package com.example.Drivers.service;

import com.example.Drivers.model.Driver;
import com.example.Drivers.repository.DriverRepository;
import com.example.Drivers.service.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class DriverService {

    @Autowired
    private DriverRepository repo;

    public List<Driver> findAll() {
        return repo.findAll();
    }

    public Driver find(Integer id) {
        Optional<Driver> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Driver.class.getName()));
    }
}
