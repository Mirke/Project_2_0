package com.mirke.genremicroservice.service;

import com.mirke.genremicroservice.model.Genre;
import com.mirke.genremicroservice.repo.GenreRepository;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenreService implements GenreServiceInterface {

    @Autowired
    GenreRepository genreRepository;

    @Override
    public List<Genre> getAllGenres() {
        return genreRepository.findAll();
    }
}
