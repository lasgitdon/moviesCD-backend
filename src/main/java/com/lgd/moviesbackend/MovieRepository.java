package com.lgd.moviesbackend;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MovieRepository extends JpaRepository<Movie,Long> {
    @Query("SELECT m FROM Movie m WHERE m.id = ?1")
    Movie findMovieById(String id);
}
