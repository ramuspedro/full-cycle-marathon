package com.simulator.simulatorservice.rabbitmq;

import com.simulator.simulatorservice.entity.Destination;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Sender {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private Queue queue;

    public void send(Destination data) {
        rabbitTemplate.convertAndSend(this.queue.getName(), data);
    }
}
