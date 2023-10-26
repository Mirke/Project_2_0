package com.mirke.messagebroker;


import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.stereotype.Component;

@Component
public class RpcServer {

    @RabbitListener(queues = "tut.rpc.requests")
    public String handleRequest(String message) {
        System.out.println("Received request: " + message);
        // Perform some processing here...


        return "Response from RpcServer with: " + message;
    }
}