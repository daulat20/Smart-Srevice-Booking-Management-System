package com.service_booking.repository;

import com.service_booking.entity.Review;
import com.service_booking.entity.Provider;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Long> {

    List<Review> findByProvider(Provider provider);
}
