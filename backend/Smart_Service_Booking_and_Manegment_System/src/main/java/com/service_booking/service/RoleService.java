package com.service_booking.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.service_booking.entity.Role;
import com.service_booking.repository.RoleRepository;

@Service
public class RoleService {

    private final RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public Role addRole(Role role) {
        return roleRepository.save(role);
    }

    public List<Role> getrole() {
        return roleRepository.findAll();
    }
}

