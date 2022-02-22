package com.dsMovies.movies.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dsMovies.movies.model.Movie;


@Repository
public interface MovieRepositories extends JpaRepository<Movie,Long> {

}
