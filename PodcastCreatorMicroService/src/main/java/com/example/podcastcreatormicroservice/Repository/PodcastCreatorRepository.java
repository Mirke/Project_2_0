package com.example.podcastcreatormicroservice.Repository;

import com.example.podcastcreatormicroservice.Model.PodcastCreator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PodcastCreatorRepository extends JpaRepository<PodcastCreator, Integer> {
}
