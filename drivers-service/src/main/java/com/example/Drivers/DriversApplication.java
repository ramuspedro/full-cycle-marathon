package com.example.Drivers;

import com.example.Drivers.model.Driver;
import com.example.Drivers.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.UUID;

@SpringBootApplication
public class DriversApplication implements CommandLineRunner {

	@Autowired
	public DriverRepository driverRepository;

	public static void main(String[] args) {
		SpringApplication.run(DriversApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Driver d1 = new Driver(UUID.fromString("45688cd6-7a27-4a7b-89c5-a9b604eefe2f"), "Wesley Ramos");
		Driver d2 = new Driver(UUID.fromString("9a118e4d-821a-44c7-accc-fa99ac4be01a"), "Luiz Mariola");

		driverRepository.saveAll(Arrays.asList(d1, d2));
	}

}
