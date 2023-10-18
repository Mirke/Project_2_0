package com.mirke.mediamicroservice.controllers;


import com.mirke.mediamicroservice.models.*;
import com.mirke.mediamicroservice.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@RestController
@RequestMapping("/api/edufy/media")
public class CustomerController {

    @Autowired
    private MediaService mediaService;

    public CustomerController() {}

    @GetMapping("/getAllMediaOnServer")
    public List<Song> getAllMediaOnServer(){
        return mediaService.findAllMedia();
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
