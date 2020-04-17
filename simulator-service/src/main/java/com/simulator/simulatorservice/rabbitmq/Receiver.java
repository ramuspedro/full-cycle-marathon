package com.simulator.simulatorservice.rabbitmq;

import com.simulator.simulatorservice.entity.Destination;
import com.simulator.simulatorservice.entity.Order;
import com.simulator.simulatorservice.file.FileReader;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class Receiver {
    @Autowired
    private Sender sender;

//    @Autowired
//    private FileReader file;

    @RabbitListener(queues = {"${queue.order}"})
    public void receive(@Payload Order order) {

        System.out.println("dest: " + order.getDestination());
        System.out.println("order: " + order.getOrder());

        try {
            FileReader file = new FileReader();
            Scanner myReader = file.reader(order.getDestination().toString());

            while (myReader.hasNextLine()) {
                String[] data = myReader.nextLine().split(",");
                System.out.println(data.toString());
                String lat = data[0];
                String lng = data[1];

                Destination destination = new Destination(order.getOrder(), lat, lng);
                sender.send(destination);
                Thread.sleep(1000);
            }

            myReader.close();

//            for (int i=0; i < 1; i++) {
//                sender.send("Esse aqui é o sender: " + order.getDestination());
//                Thread.sleep(1000);
//            }

        } catch (Exception e) {
            System.out.println("error");
        }
    }


}
