package com.lad666.albummicroservice.Service;

import com.lad666.albummicroservice.Model.Album;
import com.lad666.albummicroservice.Repository.AlbumRepository;
import com.lad666.albummicroservice.RpcClient;
import jakarta.websocket.SendResult;
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

@Service
public class AlbumService implements AlbumServiceInterface {

    @Autowired
    private AlbumRepository albumRepository;

    @Autowired
    private RabbitTemplate template;

    @Autowired
    private DirectExchange exchange;


    @Override
    public List<Album> getAllAlbums() {
        RpcClient r = new RpcClient(template, exchange);
        List<Album> list = albumRepository.findAll();
        r.send(list);
        return albumRepository.findAll();
    }



    /*@Override
    public List<Album> getAlbumsByArtist(int creatorId) {
        return albumRepository.findAlbumsByArtistId(creatorId);
    }*/


}
