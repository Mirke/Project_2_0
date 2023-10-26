package com.lad666.albummicroservice.Controller;

import com.lad666.albummicroservice.Model.Album;
import com.lad666.albummicroservice.Service.AlbumService;
import org.json.JSONArray;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@RestController
@RequestMapping("/api/edufy/album")
public class AlbumController {

    @Autowired
    private AlbumService albumService;


    // Methods:
    @GetMapping("/allalbums")
    public String getAllAlbums() throws ExecutionException, InterruptedException, TimeoutException {
        return (String) albumService.getAllAlbums().get(1, TimeUnit.MINUTES);
    }

    /*@GetMapping("/albumsbyartist/{creator_id}")
    List<Album> getAlbumsByArtist(@PathVariable("creator_id") int creatorId) {
        return albumService.getAlbumsByArtist(creatorId);
    }*/
}
