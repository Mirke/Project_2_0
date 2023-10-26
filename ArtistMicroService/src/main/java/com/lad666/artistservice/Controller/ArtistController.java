package com.lad666.artistservice.Controller;

import com.lad666.artistservice.Exception.ResourceNotFoundException;
import com.lad666.artistservice.Model.Artist;
import com.lad666.artistservice.Service.ArtistService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/edufy/artists")
public class ArtistController {

    @Autowired
    private ArtistService artistService;

        @GetMapping("/getallartists")
    public List<Artist> getAllArtists(){
        return artistService.getAllArtists();
    }

    @GetMapping("/getallartists/{id}")
    public ResponseEntity<Artist> getArtistById(@PathVariable("id") int id) throws ResourceNotFoundException {
        return new ResponseEntity<>(artistService.getArtistById(id), HttpStatus.OK);
    }
}
