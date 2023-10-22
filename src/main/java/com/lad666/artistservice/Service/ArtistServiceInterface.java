package com.lad666.artistservice.Service;



import com.lad666.artistservice.Exception.ResourceNotFoundException;
import com.lad666.artistservice.Model.Artist;

import java.util.List;
import java.util.Optional;

public interface ArtistServiceInterface {
    List<Artist> getAllArtists();
    Artist getArtistById(int id) throws ResourceNotFoundException;
}
