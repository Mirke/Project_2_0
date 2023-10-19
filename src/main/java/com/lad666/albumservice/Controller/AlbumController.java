package com.lad666.albumservice.Controller;

import com.lad666.albumservice.Model.Album;
import com.lad666.albumservice.Service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/album/api/edufy")
public class AlbumController {
    @Autowired
    private AlbumService albumService;

    // Methods:
    @GetMapping("/allalbums")
    public List<Album> getAllAlbums() {
        return albumService.getAllAlbums();
    }

    /*@GetMapping("/albumsbyartist/{creator_id}")
    List<Album> getAlbumsByArtist(@PathVariable("creator_id") int creatorId) {
        return albumService.getAlbumsByArtist(creatorId);
    }*/
}
