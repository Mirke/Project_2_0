package com.mirke.messagebroker;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.json.JSONArray;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@Component
public class RpcServer {

    private final RabbitTemplate template;

    public RpcServer(RabbitTemplate template) {
        this.template = template;
    }



    @RabbitListener(queues = "tut.rpc.requests")
    public Object handleRequest(String message) throws JSONException, ExecutionException, InterruptedException {
        System.out.println("Received request: " + message);
        // Perform some processing here...

//        if (message.contains("album-service") && message.contains("\"alive\":\"true\"") ){
//            System.out.println("Yes it contains album-service and it is alive.");
//            Object response = template.convertSendAndReceive("tut.rpc.artist","tut.rpc.requests.artist", "");
//            String res = (String) response;
//             message = message.replace("\"alive\":\"true\"","\"alive\":\"false\"");
//            System.out.println(res);
//        }

        var result = CompletableFuture.supplyAsync(() -> template.convertSendAndReceive
                ("artist", "artist")).thenApply(res -> res);
        System.out.println(result.get());

        return result.get();
    }
}