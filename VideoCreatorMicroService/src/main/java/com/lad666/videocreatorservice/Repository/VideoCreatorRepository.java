package com.lad666.videocreatorservice.Repository;

import com.lad666.videocreatorservice.Model.VideoCreator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoCreatorRepository extends JpaRepository<VideoCreator, Integer> {
}
