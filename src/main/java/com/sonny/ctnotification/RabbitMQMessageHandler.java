package com.sonny.ctnotification;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class RabbitMQMessageHandler {

    @RabbitListener(queues = "notification.send")
    public void lireMessage(Compte message){
        log.info("Nouveau message {}", message);
    }
}
