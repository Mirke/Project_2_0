package com.example.podcastcreatormicroservice.Controller;

import com.example.podcastcreatormicroservice.Model.PodcastCreator;
import com.example.podcastcreatormicroservice.Service.PodcastCreatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/edufy/podcastcreators")
public class PodcastCreatorController {

    @Autowired
    private PodcastCreatorService podcastCreatorService;

    @GetMapping("/")
    public List<PodcastCreator> getAllPodcastCreators() {return podcastCreatorService.getAllPodcastCreators(); }

    @GetMapping("/{id}")
    public PodcastCreator getAllPodcastCreatorsById(@PathVariable int id) {return podcastCreatorService.getPodcastCreatorsById(id); }
}
