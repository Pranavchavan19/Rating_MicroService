package com.lcwd.rating.RatingService.repository;

import com.lcwd.rating.RatingService.entities.Rating;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface RatingRepository extends MongoRepository<Rating , String> {
    // custom finder repo

    List<Rating>  findByUserId(String userId);

    List<Rating>  findByHotelId(String hotelId);
}
