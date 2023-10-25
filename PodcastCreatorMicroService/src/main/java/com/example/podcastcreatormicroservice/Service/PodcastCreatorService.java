package com.example.podcastcreatormicroservice.Service;

import com.example.podcastcreatormicroservice.Model.PodcastCreator;
import com.example.podcastcreatormicroservice.Repository.PodcastCreatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PodcastCreatorService implements PodcastCreatorServiceInterface {

    @Autowired
    PodcastCreatorRepository podcastCreatorRepository;

    @Override
    public List<PodcastCreator> getAllPodcastCreators() { return podcastCreatorRepository.findAll(); }

    public PodcastCreator getPodcastCreatorsById(int id){return podcastCreatorRepository.findById(id).orElseThrow(); }
}
