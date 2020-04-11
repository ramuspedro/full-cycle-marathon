package com.simulator.simulatorservice.massagingrabbitmq;

import java.util.concurrent.CountDownLatch;

import com.simulator.simulatorservice.model.Order;
import com.simulator.simulatorservice.model.RequestObject;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

    private CountDownLatch latch = new CountDownLatch(1);

    @RabbitListener(queues = MessagingRabbitApplication.queueName)
    public void receiveMessage(Order message) {
        System.out.println("\n****************************\n");
        System.out.println(message.getOrder());
        latch.countDown();
    }

    public CountDownLatch getLatch() {
        return latch;
    }

}