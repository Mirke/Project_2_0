package com.lad666.albummicroservice;

import com.lad666.albummicroservice.Model.Album;
import org.json.JSONArray;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@Component
public class RpcClient {


    private final RabbitTemplate template;

    private final DirectExchange exchange;

    public RpcClient(RabbitTemplate template, DirectExchange exchange) {
        this.template = template;
        this.exchange = exchange;
    }

    public CompletableFuture<Object> send(List<Album> albumList) throws ExecutionException, InterruptedException {
        JSONArray jsonArray = new JSONArray(albumList);
//        Map<String, String> map = new HashMap<>();
//        map.put("microservice","album-service");
//        map.put("alive","true");
//        jsonArray.put(map);

//        Object res = template.convertSendAndReceive
//                (exchange.getName(), "broker", jsonArray.toString());

        return CompletableFuture.supplyAsync(() -> template.convertSendAndReceive
                 (exchange.getName(), "broker", jsonArray.toString())).thenApply(res -> res);
//        System.out.println(result.get());

    }
}

