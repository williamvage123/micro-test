package org.example.player.messaging;

import org.example.player.entity.Event;
import org.example.player.service.PlayerService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class EventConsumer {

    private final PlayerService playerService;

    public EventConsumer(PlayerService playerService) {
        this.playerService = playerService;
    }

    @RabbitListener(queues = "${rabbitmq.queue}")
    public void receiveMessage(Event event) {
        System.out.println("Received event: " + event.getDescription());
    }
}
