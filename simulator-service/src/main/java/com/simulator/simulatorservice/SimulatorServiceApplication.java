package com.simulator.simulatorservice;


import com.simulator.simulatorservice.file.FileReader;
import com.simulator.simulatorservice.rabbitmq.Sender;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Scanner;

@SpringBootApplication
public class SimulatorServiceApplication implements CommandLineRunner {

	@Value("${queue.position}")
	private String positionQueue;

	@Autowired
	private Sender sender;

	public static void main(String[] args) {
		SpringApplication.run(SimulatorServiceApplication.class, args);
	}

	@Bean
	public Queue queue() {
		return new Queue(positionQueue, true);
	}

	@Bean
	public MessageConverter jsonMessageConverter(){
		return new Jackson2JsonMessageConverter();
	}

//	@Override
//	public void run(String... args) throws Exception {
//		System.out.println("Sending message...");
//		sender.send("Esse aqui é o sender");
//	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("Running");

//		FileReader file = new FileReader();
//
//		Scanner myReader = file.reader("1");
//
//		while (myReader.hasNextLine()) {
//			String[] data = myReader.nextLine().split(",");
//			// lat 0
//			// lng 1
//			// create entity to send order, lat, lng
//			System.out.println(data);
//		}
//
//		myReader.close();
	}

}
