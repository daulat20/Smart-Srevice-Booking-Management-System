package com.service_booking.repository;

import com.service_booking.entity.Services;
import com.service_booking.entity.Provider;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ServiceRepository extends JpaRepository<Services, Long> {

    List<Services> findByProvider(Provider provider);

    List<Services> findByServiceNameContainingIgnoreCase(String serviceName);
}
