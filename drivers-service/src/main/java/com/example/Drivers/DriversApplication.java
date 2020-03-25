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
		Driver d1 = new Driver(1, "Wesley Ramos");
		Driver d2 = new Driver(2, "Luiz Mariola");

		driverRepository.saveAll(Arrays.asList(d1, d2));
	}

}
