package com.project.community_hub.controller;

import com.project.community_hub.model.Movie;
import com.project.community_hub.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MovieController {

    @Autowired
    MovieRepository movieRepository;

    @PostMapping("/addmovie")
    public String addMovie(Movie movie)  {
        movieRepository.save(movie);

        return "";
    }
}
