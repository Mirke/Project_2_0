package com.lad666.albummicroservice;

import com.lad666.albummicroservice.Model.Album;
import org.json.JSONObject;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageProperties;
import org.springframework.amqp.rabbit.AsyncRabbitTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.json.JSONArray;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@Component
public class RpcClient {


    private final RabbitTemplate template;


    private final DirectExchange exchange;

    public RpcClient(RabbitTemplate template, DirectExchange exchange) {
        this.template = template;
        this.exchange = exchange;
    }

    public void send(List<Album> albumList) {
        JSONArray jsonArray = new JSONArray(albumList);
        Map<String, String> map = new HashMap<>();
        map.put("microservice","album-service");
        jsonArray.put(map);
        Object response = template.convertSendAndReceive
                (exchange.getName(), "rpc", jsonArray.toString());
        System.out.println(response);
    }
}

