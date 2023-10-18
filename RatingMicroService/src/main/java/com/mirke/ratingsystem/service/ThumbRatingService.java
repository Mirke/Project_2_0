package com.mirke.ratingsystem.service;

import com.mirke.ratingsystem.model.*;
import com.mirke.ratingsystem.repo.ThumbRatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ThumbRatingService {


    private final ThumbRatingRepository thumbRatingRepository;

    @Autowired
    public ThumbRatingService(ThumbRatingRepository thumbRatingRepository) {
        this.thumbRatingRepository = thumbRatingRepository;
    }

    public ThumbRating giveThumbRatingToMediaItem() {
        ThumbRating thumbRating = new ThumbRating(0, 0);
        thumbRatingRepository.save(thumbRating);
        return thumbRating;

    }

    public void giveThumbsUp(int id, String media) {


    }

    public void giveThumbsDown(int id, String media) {
    }
}
