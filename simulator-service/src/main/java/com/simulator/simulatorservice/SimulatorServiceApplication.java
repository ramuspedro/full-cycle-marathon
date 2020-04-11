package com.simulator.simulatorservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

@SpringBootApplication
public class SimulatorServiceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SimulatorServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		File myObj = new File("/home/ramuspedro/projects/full-cycle-marathon/simulator-service/destinations/1.txt");
		Scanner myReader = new Scanner(myObj);
		while (myReader.hasNextLine()) {
			String data = myReader.nextLine();
			System.out.println(data);
		}
		myReader.close();
	}

}
