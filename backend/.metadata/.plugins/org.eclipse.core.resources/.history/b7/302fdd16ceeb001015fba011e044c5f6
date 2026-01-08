package com.service_booking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service_booking.entity.Role;
import com.service_booking.entity.User;
import com.service_booking.repository.RoleRepository;
import com.service_booking.repository.UserRepository;

@Service
public class UserService {

	@Autowired
//    private UserRepository userRepository;

	 private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    public UserService(UserRepository userRepository,
                       RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    public User register(User user) {

        if (user == null) {
            throw new IllegalArgumentException("User cannot be null");
        }

        if (user.getRole() == null || user.getRole().getId() == null) {
            throw new IllegalArgumentException("Role must be provided");
        }

        // Fetch role from DB to ensure it exists
        Role role = roleRepository.findById(user.getRole().getId())
                .orElseThrow(() -> new RuntimeException("Invalid role id"));

        user.setRole(role);

        return userRepository.save(user);
    }


	public User getUserById(Long id) {
		return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
	}

	public List<User> getAllUsers() {
		return userRepository.findAll();
	}
}
