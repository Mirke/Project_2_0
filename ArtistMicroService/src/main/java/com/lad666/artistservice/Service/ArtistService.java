package com.lad666.artistservice.Service;


import com.lad666.artistservice.Exception.ResourceNotFoundException;
import com.lad666.artistservice.Model.Artist;
import com.lad666.artistservice.Repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArtistService implements ArtistServiceInterface {

    @Autowired
    ArtistRepository artistRepository;

    @Override
    public List<Artist> getAllArtists() { return artistRepository.findAll(); }

    @Override
    public Artist getArtistById(int id) throws ResourceNotFoundException {
        Optional<Artist> artist = artistRepository.findById(id);
        if (artist.isPresent()){
            return artist.get();
        } else {
            throw new ResourceNotFoundException("Artist", "Id", id);
        }
    }
}
