//package oracleproject.model;
//
//import jakarta.persistence.*;
//
//@Entity
//@Table(name = "review_ids")
//public class ReviewId {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String reviewId;
//    @ManyToOne
//    @JoinColumns({
//            @JoinColumn(name = "movie_timestamp", referencedColumnName = "timestamp"),
//            @JoinColumn(name = "movie_date", referencedColumnName = "date")
//    })
//    private Movie movie;
//}