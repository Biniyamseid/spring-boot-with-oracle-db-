//package oracleproject.model;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Entity
//@Table(name = "genres")
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//public class Genres {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String genre;
//    @ManyToOne
//    @JoinColumns({
//            @JoinColumn(name = "movie_timestamp", referencedColumnName = "timestamp"),
//            @JoinColumn(name = "movie_date", referencedColumnName = "date")
//    })
//    private Movie movie;
//}
//
