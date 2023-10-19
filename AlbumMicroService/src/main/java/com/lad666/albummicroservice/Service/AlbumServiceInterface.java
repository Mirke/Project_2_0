package com.lad666.albummicroservice.Service;


import com.lad666.albummicroservice.Model.Album;

import java.util.List;

public interface AlbumServiceInterface {
    List<Album> getAllAlbums();
    /*List<Album> getAlbumsByArtist(int creatorId);*/
}
