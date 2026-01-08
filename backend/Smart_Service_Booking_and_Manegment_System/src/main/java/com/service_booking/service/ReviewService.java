package com.service_booking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service_booking.entity.Provider;
import com.service_booking.entity.Review;
import com.service_booking.entity.User;
import com.service_booking.repository.ReviewRepository;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    public Review addReview(User user, Provider provider, int rating, String comment) {

        Review review = new Review();
        review.setUser(user);
        review.setProvider(provider);
        review.setRating(rating);
        review.setComment(comment);

        return reviewRepository.save(review);
    }

    public List<Review> getReviewsByProvider(Provider provider) {
        return reviewRepository.findByProvider(provider);
    }
}
