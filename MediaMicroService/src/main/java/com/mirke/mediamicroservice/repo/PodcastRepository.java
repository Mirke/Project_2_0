package com.mirke.mediamicroservice.repo;


import com.mirke.mediamicroservice.models.Podcast;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PodcastRepository extends JpaRepository<Podcast,Integer> {

}
