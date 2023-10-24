package com.example.podcastservice.Repository;

import com.example.podcastservice.Model.Podcast;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PodcastRepository extends JpaRepository<Podcast, Integer> {
}
