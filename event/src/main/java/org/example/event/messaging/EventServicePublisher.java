package org.example.event.messaging;


import org.example.event.entity.Event;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service

public class EventServicePublisher {

    private final RabbitTemplate rabbitTemplate;

    @Value("${rabbitmq.exchange}")
    private String exchange;

    @Value("${rabbitmq.routingkey}")
    private String routingkey;

    public EventServicePublisher(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendEventMessage(Event event){
        rabbitTemplate.convertAndSend(exchange, routingkey, event);
        System.out.println("Sent event: " + event.getDescription());
    }
}
