package com.movieapi.service;

import com.movieapi.model.Movie;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    private List<Movie> movies = new ArrayList<>();

    // Obtener todas las películas
    public List<Movie> getAllMovies() {
        return movies;
    }

    // Agregar una nueva película
    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    // Obtener una película por ID
    public Movie getMovieById(int id) {
        Optional<Movie> movie = movies.stream().filter(m -> m.getId() == id).findFirst();
        return movie.orElse(null);
    }

    // Actualizar una película
    public void updateMovie(Movie movie) {
        Movie existingMovie = getMovieById(movie.getId());
        if (existingMovie != null) {
            existingMovie.setName(movie.getName());
            existingMovie.setDirector(movie.getDirector());
            existingMovie.setYear(movie.getYear());
        }
    }

    // Eliminar una película
    public void deleteMovie(int id) {
        movies.removeIf(movie -> movie.getId() == id);
    }
}
