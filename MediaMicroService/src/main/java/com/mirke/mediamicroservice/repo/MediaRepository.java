package com.mirke.mediamicroservice.repo;

import com.mirke.mediamicroservice.models.Media;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MediaRepository extends JpaRepository<Media,Integer> {


}
