package com.example.podcastservice.Service;

import com.example.podcastservice.Model.Podcast;
import com.example.podcastservice.Repository.PodcastRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PodcastService implements PodcastServiceInterface {

    @Autowired
    PodcastRepository podcastRepository;

    @Override
    public List<Podcast> getAllPodcasts() { return podcastRepository.findAll(); }

    public Podcast getPodcastById(int id){return podcastRepository.findById(id).orElseThrow(); }
}
