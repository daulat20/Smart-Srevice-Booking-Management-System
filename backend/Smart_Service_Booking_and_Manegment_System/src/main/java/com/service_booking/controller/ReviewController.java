package com.service_booking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.service_booking.entity.Provider;
import com.service_booking.entity.Review;
import com.service_booking.entity.User;
import com.service_booking.service.ReviewService;

@RestController
@RequestMapping("/api/reviews")
@CrossOrigin("*")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @PostMapping("/add")
    public Review addReview(@RequestParam Long userId,
                            @RequestParam Long providerId,
                            @RequestParam int rating,
                            @RequestParam String comment) {

        User user = new User();
        user.setId(userId);

        Provider provider = new Provider();
        provider.setId(providerId);

        return reviewService.addReview(user, provider, rating, comment);
    }

    @GetMapping("/provider/{providerId}")
    public List<Review> reviews(@PathVariable Long providerId) {
        Provider provider = new Provider();
        provider.setId(providerId);
        return reviewService.getReviewsByProvider(provider);
    }
}
