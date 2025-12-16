package com.example.movierating.repository;

import com.example.movierating.model.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface RatingRepository extends JpaRepository<Rating, Long> {

    boolean existsByMovieIdAndUserId(Long movieId, Long userId);

    Optional<Rating> findByMovieIdAndUserId(Long movieId, Long userId);
}
