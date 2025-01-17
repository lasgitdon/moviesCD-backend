package com.lgd.moviesbackend;

import jakarta.validation.Valid;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping(path = "/movies")
@CrossOrigin(origins = "http://localhost:4200")
public class MovieController {
    private final MovieRepository movieRepository;

    public MovieController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @GetMapping()
    public List<Movie> getMovies() {
        return movieRepository.findAll(); //Arrays.asList(new Movie("test1"), new Movie("test2"));
    }

    @GetMapping("/{id}")
    public Movie getMovieById(@PathVariable String id) {
        return movieRepository.findMovieById(id);
    }

    @PostMapping("/add")
    public Movie addMovie(@Valid @RequestBody Movie movie) {
        movie.id = UUID.randomUUID().toString();
        return movieRepository.save(movie);
    }

}
