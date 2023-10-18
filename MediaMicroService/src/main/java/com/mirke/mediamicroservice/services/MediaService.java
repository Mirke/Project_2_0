package com.mirke.mediamicroservice.services;

import com.mirke.mediamicroservice.models.Song;
import com.mirke.mediamicroservice.repo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;


@Service
public class MediaService implements MediaServiceInterface {

    @Autowired
    SongRepository songRepository;

    @Override
    public List<Song> findAllMedia() {
        List<Song> songs = songRepository.findAll();
        return new ArrayList<>(songs);
    }
}
