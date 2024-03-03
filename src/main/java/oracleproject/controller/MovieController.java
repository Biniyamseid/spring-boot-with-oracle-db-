package oracleproject.controller;

import oracleproject.Service.MovieService;
import oracleproject.model.Movie;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {
    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies(){
        return new ResponseEntity<>(movieService.allMovies(), HttpStatus.OK);
    }

//    @GetMapping("/{imdbId}")
//    public ResponseEntity<Optional<Movie>> getSingleMovie(@PathVariable String imdbId){
//        return new ResponseEntity<Optional<Movie>>(movieService.singleMovie((imdbId)),HttpStatus.OK);
//    }
            @PostMapping
            public ResponseEntity<Movie> createMovie(@RequestBody Movie movie){
                return new ResponseEntity<>(movieService.saveMovie(movie), HttpStatus.CREATED);
            }
        @GetMapping("/{imdbId}")
        public ResponseEntity<Optional<List<Movie>>> getMovie(@PathVariable String imdbId){
            return new ResponseEntity<Optional<List<Movie>>>(movieService.getMovie(imdbId), HttpStatus.OK);
        }

}