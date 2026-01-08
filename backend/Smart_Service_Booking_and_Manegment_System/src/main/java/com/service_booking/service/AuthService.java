package com.service_booking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service_booking.entity.Role;
import com.service_booking.entity.User;
import com.service_booking.repository.RoleRepository;
import com.service_booking.repository.UserRepository;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

  

    public User login(String email, String password) {

        return userRepository.findByEmailAndPassword(email, password)
                .orElseThrow(() -> new RuntimeException("Invalid email or password"));
    }
}
