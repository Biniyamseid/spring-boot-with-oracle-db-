//package oracleproject.model;
//
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Entity
//@Table(name = "backdrops")
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//public class Backdrop {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String backdrop;
//    @ManyToOne
//    @JoinColumns({
//            @JoinColumn(name = "movie_timestamp", referencedColumnName = "timestamp"),
//            @JoinColumn(name = "movie_date", referencedColumnName = "date")
//    })
//    private Movie movie;
//}
//
//
//


