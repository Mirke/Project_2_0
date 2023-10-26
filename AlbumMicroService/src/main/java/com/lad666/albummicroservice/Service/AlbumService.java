package com.lad666.albummicroservice.Service;

import com.lad666.albummicroservice.Model.Album;
import com.lad666.albummicroservice.Repository.AlbumRepository;
import com.lad666.albummicroservice.RpcClient;
import jakarta.websocket.SendResult;
import org.json.JSONArray;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageBuilder;
import org.springframework.amqp.rabbit.AsyncRabbitTemplate;
import org.springframework.amqp.rabbit.RabbitMessageFuture;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@Service
public class AlbumService implements AlbumServiceInterface {

    @Autowired
    private AlbumRepository albumRepository;

    @Autowired
    private RabbitTemplate template;

    @Autowired
    private DirectExchange exchange;


    public CompletableFuture<Object> getAllAlbums() throws ExecutionException, InterruptedException {
        RpcClient r = new RpcClient(template, exchange);
        List<Album> list = albumRepository.findAll();

        return r.send(list);
    }


    /*@Override
    public List<Album> getAlbumsByArtist(int creatorId) {
        return albumRepository.findAlbumsByArtistId(creatorId);
    }*/


}
