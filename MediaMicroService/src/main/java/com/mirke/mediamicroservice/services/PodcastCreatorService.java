package com.mirke.mediamicroservice.services;


import com.mirke.mediamicroservice.models.PodcastCreator;
import com.mirke.mediamicroservice.repo.PodcastCreatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PodcastCreatorService implements PodcastCreatorServiceInterface {

    @Autowired
    PodcastCreatorRepository podcastCreatorRepository;


}