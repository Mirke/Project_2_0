package com.lad666.albumservice.Service;


import com.lad666.albumservice.Model.Album;

import java.util.List;

public interface AlbumServiceInterface {
    List<Album> getAllAlbums();
    /*List<Album> getAlbumsByArtist(int creatorId);*/
}
