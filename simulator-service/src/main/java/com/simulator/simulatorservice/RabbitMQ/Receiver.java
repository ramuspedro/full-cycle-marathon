package com.simulator.simulatorservice.RabbitMQ;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class Receiver {
    @RabbitListener(queues = {"${queue.receiver}"})
    public void receive(@Payload String fileBody) {
        System.out.println("Order: " + fileBody);
    }
}
