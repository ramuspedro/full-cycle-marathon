package com.simulator.simulatorservice.rabbitmq;

import com.simulator.simulatorservice.entity.Order;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class Receiver {
    @Autowired
    private Sender sender;

    @RabbitListener(queues = {"${queue.order}"})
    public void receive(@Payload Order order) {

        System.out.println("dest: " + order.getDestination());
        System.out.println("order: " + order.getOrder());

        try {
            for (int i=0; i < 1; i++) {
                sender.send("Esse aqui é o sender: " + order.getDestination());
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("error");
        }
    }
}
