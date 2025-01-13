package com.movieapi.controller;

import com.movieapi.model.Movie;
import com.movieapi.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/")
    public String listMovies(Model model) {
        List<Movie> movies = movieService.getAllMovies();
        model.addAttribute("movies", movies);
        return "index";
    }

    @PostMapping("/add-movie")
    public String addMovie(@ModelAttribute Movie movie) {
        movieService.addMovie(movie);
        return "redirect:/";
    }

    @GetMapping("/update-movie/{id}")
    public String getMovieForUpdate(@PathVariable int id, Model model) {
        Movie movie = movieService.getMovieById(id);
        model.addAttribute("movie", movie);
        return "update-movie";
    }

    @PostMapping("/update-movie")
    public String updateMovie(@ModelAttribute Movie movie) {
        movieService.updateMovie(movie);
        return "redirect:/";
    }

    @GetMapping("/delete-movie/{id}")
    public String deleteMovie(@PathVariable int id) {
        movieService.deleteMovie(id);
        return "redirect:/";
    }
}
