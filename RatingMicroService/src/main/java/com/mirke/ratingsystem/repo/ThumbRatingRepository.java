package com.mirke.ratingsystem.repo;

import com.mirke.ratingsystem.model.ThumbRating;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ThumbRatingRepository extends JpaRepository<ThumbRating,Integer> {

}
