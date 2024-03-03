package oracleproject.Service;

import jakarta.transaction.Transactional;
import oracleproject.model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import oracleproject.Repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.*;

@Service
@Transactional
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> allMovies(){
        return movieRepository.findAll();
    }

    public Movie saveMovie(Movie movie){
        return movieRepository.save(movie);
    }

    public Optional<List<Movie>> getMovie(String imdbId){
        return movieRepository.findByImdbId(imdbId);
    }
}
