package com.lad666.artistservice;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.CountDownLatch;

@Component
public class Receiver {


    private CountDownLatch latch = new CountDownLatch(1);

    private RabbitTemplate rabbitTemplate;

    public Receiver(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }


    public void receiveMessage(String message) {
        System.out.println("Received <" + message + ">");
        latch.countDown();

       rabbitTemplate.convertAndSend("message-broker-exchange","sending.microservice.message", "Message from Artist service");

    }

    public CountDownLatch getLatch() {
        return latch;
    }

}
