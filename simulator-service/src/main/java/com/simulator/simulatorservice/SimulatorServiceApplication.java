package com.simulator.simulatorservice;


import com.simulator.simulatorservice.RabbitMQ.Sender;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SimulatorServiceApplication implements CommandLineRunner {

	@Value("${queue.sender}")
	private String senderQueue;

	@Autowired
	private Sender sender;

	public static void main(String[] args) {
		SpringApplication.run(SimulatorServiceApplication.class, args);
	}

	@Bean
	public Queue queue() {
		return new Queue(senderQueue, true);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Sending message...");
		sender.send("Esse aqui é o sender");
	}

//	@Override
//	public void run(String... args) throws Exception {
//		File myObj = new File("/home/ramuspedro/projects/full-cycle-marathon/simulator-service/destinations/1.txt");
//		Scanner myReader = new Scanner(myObj);
//		while (myReader.hasNextLine()) {
//			String data = myReader.nextLine();
//			System.out.println(data);
//		}
//		myReader.close();
//	}

}
