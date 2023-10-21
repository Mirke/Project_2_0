package com.mirke.mediamicroservice.repo;

import com.mirke.mediamicroservice.models.PodcastCreator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PodcastCreatorRepository extends JpaRepository<PodcastCreator,Integer> {


}
