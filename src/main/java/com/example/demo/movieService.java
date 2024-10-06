package com.example.demo;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class movieService {

    private final MovieRepository movieRepository;

    public movieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<moviesapp> getAllMovies() {
        return movieRepository.findAll();
    }

    public Optional<moviesapp> getMovieById(Long id) {
        return movieRepository.findById(id);
    }

    public moviesapp createMovie(moviesapp movie) {
        return movieRepository.save(movie);
    }

    public void deleteMovie(Long id) {
        movieRepository.deleteById(id);
    }
}
