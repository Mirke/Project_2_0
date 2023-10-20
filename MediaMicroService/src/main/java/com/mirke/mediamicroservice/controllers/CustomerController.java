package com.mirke.mediamicroservice.controllers;


import com.mirke.mediamicroservice.models.*;
import com.mirke.mediamicroservice.services.*;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

@RestController
@RequestMapping("/api/edufy/media")
public class CustomerController {

    @Autowired
    private MediaService mediaService;

    public CustomerController() {}

    @GetMapping
    public List<Song> getAllMediaOnServer(){
        return mediaService.findAllMedia();
    }

    @GetMapping("/{id}")
    public Map<String, Object> getSpecificSongById(@PathVariable int id){
        return mediaService.getSongById(id);
    }
//
//    @GetMapping("/sortMediaByGenreId")
//    public Stream<Media> sortMediaByGenreId(){return mediaService.sortAllMediaByGenre();}
//
//    @GetMapping("/sortMediaByMediaTypeId")
//    public Stream<Media> getAllVideo(){return mediaService.sortAllMediaByMediaType();}
//
//    @GetMapping("/getMediaTypeById/{media_type_id}")
//    public Stream<Media> getMediaTypeById(@PathVariable("media_type_id") int media_type_id){
//        return mediaService.getMediaTypeById(media_type_id);
//    }
//
//    @GetMapping("/getGenreById/{genre_id}")
//    public Stream<Media> getGenreById(@PathVariable("genre_id") int genre_id){
//        return mediaService.getGenreById(genre_id);
//    }

}
