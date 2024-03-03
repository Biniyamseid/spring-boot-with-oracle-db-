package oracleproject.Repository;

import oracleproject.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.*;
@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
    Optional<List<Movie>> findByImdbId(String imdbId);
}
