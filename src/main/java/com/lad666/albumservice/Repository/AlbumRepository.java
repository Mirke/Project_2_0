package com.lad666.albumservice.Repository;

import com.lad666.albumservice.Model.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumRepository extends JpaRepository<Album, Integer> {
    /*List<Album> findAlbumsByArtistId(int creatorId);*/
}
