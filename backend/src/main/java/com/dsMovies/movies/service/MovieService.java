package com.dsMovies.movies.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dsMovies.movies.dto.MovieDTO;
import com.dsMovies.movies.model.Movie;
import com.dsMovies.movies.repositories.MovieRepositories;

@Service
public class MovieService {

	@Autowired
	private MovieRepositories movieRepo;

	@Transactional(readOnly = true)
	public Page<MovieDTO> findALL(Pageable pageable) {
		Page<Movie> result = movieRepo.findAll(pageable);
		Page<MovieDTO> page = result.map(x -> new MovieDTO(x));
		return page;

	}

	@Transactional(readOnly = true)
	public MovieDTO findByid(Long id) {
		Movie result = movieRepo.findById(id).get();
        MovieDTO dto = new MovieDTO(result);
		return dto;
	}
}
