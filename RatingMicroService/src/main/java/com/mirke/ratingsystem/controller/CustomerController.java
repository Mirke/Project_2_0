package com.mirke.ratingsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.mirke.ratingsystem.service.ThumbRatingService;

@RestController
@RequestMapping("/api/edufy/rating")
public class CustomerController {
    //properties

    @Autowired
    private ThumbRatingService thumbRatingService;

    // Constructors:
    public CustomerController() {}

    @GetMapping("/giveThumbsUp/{mediaType}/{song_id}")
    public void giveThumbsUp(@PathVariable("song_id") int song_id, @PathVariable String mediaType){
        thumbRatingService.giveThumbsUp(song_id, mediaType);
    }

    @GetMapping("/giveThumbsDown/{mediaType}/{song_id}")
    public void giveThumbsDown(@PathVariable("song_id") int song_id, @PathVariable String mediaType){
        thumbRatingService.giveThumbsDown(song_id, mediaType);
    }

}
