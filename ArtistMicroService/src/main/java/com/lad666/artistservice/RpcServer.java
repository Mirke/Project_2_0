package com.lad666.artistservice;


import com.lad666.artistservice.Model.Artist;
import com.lad666.artistservice.Repository.ArtistRepository;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.json.JSONArray;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RpcServer {

    private final RabbitTemplate template;

    @Autowired
    private ArtistRepository artistRepository;

    public RpcServer(RabbitTemplate template) {
        this.template = template;
    }



    @RabbitListener(queues = "tut.rpc.requests")
    public String handleRequest(String message) throws JSONException {
        System.out.println("Received request: " + message);
        // Perform some processing here...

//        if (message.contains("album-service") && message.contains("\"alive\":\"true\"") ){
//            System.out.println("Yes it contains album-service and it is alive.");
//            Object response = template.convertSendAndReceive("tut.rpc.artist","tut.rpc.requests.artist", "");
//            String res = (String) response;
//             message = message.replace("\"alive\":\"true\"","\"alive\":\"false\"");
//            System.out.println(res);
//        }
        List<Artist> list = artistRepository.findAll();
        JSONArray jsonArray = new JSONArray(list);

        return message + ","+ jsonArray.toString();
    }
}