package com.example.podcastservice.Controller;

import com.example.podcastservice.Model.Podcast;
import com.example.podcastservice.Service.PodcastService;
import com.example.podcastservice.Service.PodcastServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/edufy/podcasts")
public class PodcastController {

    @Autowired
    private PodcastService podcastService;


    @GetMapping("/")
    public List <Podcast> getAllPodcasts() {return podcastService.getAllPodcasts(); }

    @GetMapping("/{id}")
    public Podcast getPodcastById(@PathVariable int id) {return podcastService.getPodcastById(id); }
}
