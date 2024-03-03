package oracleproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import java.util.List;
//import oracleproject.model.Genres;
//import oracleproject.model.Backdrop;
//import oracleproject.model.ReviewId;

//@Entity
//@Table(name = "movies")
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//public class Movie {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String imdbId;
//    private String title;
//    private String releaseDate;
//    private String trailerLink;
//    @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL)
//    private List<Genres> genres;
//    private String poster;
//    @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL)
//    private List<Backdrop> backdrops;
//    @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL)
//    private List<ReviewId> reviewIds;
//    // getters and setters
//}



import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    @Id
    private Long id;
    private String imdbId;
    private String title;
    private LocalDate releaseDate;
    private String trailerLink;
    private String genres;
    private String poster;
    private String backdrops;
    private String reviewIds;


}


