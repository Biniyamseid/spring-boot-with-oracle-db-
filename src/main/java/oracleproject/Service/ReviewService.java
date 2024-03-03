//package oracleproject.Service;
//
//import oracleproject.Repository.ReviewRepository;
//import oracleproject.model.Movie;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.oracleproject.core.MongoTemplate;
//import org.springframework.data.oracleproject.core.query.Criteria;
//import org.springframework.data.oracleproject.core.query.Update;
//import org.springframework.stereotype.Service;
//import oracleproject.model.Review;
//
//@Service
//public class ReviewService {
//    @Autowired
//    ReviewRepository reviewRepository;
//    @Autowired
//    private MongoTemplate mongoTemplate;
//    public Review createReview(String reviewBody,String imdbId){
//        Review review = reviewRepository.insert(new Review(reviewBody));
//
//        mongoTemplate.update(Movie.class)
//                .matching(Criteria.where("imdbId").is(imdbId))
//                .apply(new Update().push("reviewIds").value(review))
//                .first();
//
//        return review;
//
//
//    }
//
//}
