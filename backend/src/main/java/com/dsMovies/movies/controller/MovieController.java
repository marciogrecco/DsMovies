package com.dsMovies.movies.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dsMovies.movies.dto.MovieDTO;
import com.dsMovies.movies.service.MovieService;

@RestController
@RequestMapping(value = "/movies")
public class MovieController {

	@Autowired
	private MovieService movieservices;

	@GetMapping
	public Page<MovieDTO> findALL(Pageable pageable) {
		return movieservices.findALL(pageable);

	}

	@GetMapping("/{id}")
	public MovieDTO findByid(@PathVariable Long id) {
		return movieservices.findByid(id);

	}
}
