package com.lad666.albummicroservice;

import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.rabbit.AsyncRabbitTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AlbumMicroServiceApplication {

    @Bean
    public DirectExchange exchange() {
        return new DirectExchange("tut.rpc");
    }

    public static void main(String[] args) {
        SpringApplication.run(AlbumMicroServiceApplication.class, args);
    }

}
