package com.lad666.albummicroservice.Service;

import com.lad666.albummicroservice.Model.Album;
import com.lad666.albummicroservice.Repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumService implements AlbumServiceInterface {

    @Autowired
    private AlbumRepository albumRepository;

    @Override
    public List<Album> getAllAlbums() {
        return albumRepository.findAll();
    }

    /*@Override
    public List<Album> getAlbumsByArtist(int creatorId) {
        return albumRepository.findAlbumsByArtistId(creatorId);
    }*/


}
