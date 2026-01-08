package com.service_booking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service_booking.dto.ProviderRequestDTO;
import com.service_booking.entity.Provider;
import com.service_booking.service.ProviderService;

@RestController
@RequestMapping("/api/providers")
@CrossOrigin("*")
public class ProviderController {

	private final ProviderService providerService;

    public ProviderController(ProviderService providerService) {
        this.providerService = providerService;
    }

    @PostMapping("/register")
    public ResponseEntity<Provider> registerProvider(
            @RequestBody ProviderRequestDTO dto) {

        return ResponseEntity.ok(
                providerService.registerProvider(dto)
        );
    }

    @GetMapping("/approved")
    public List<Provider> approvedProviders() {
        return providerService.getApprovedProviders();
    }

    @PutMapping("/approve/{id}")
    public Provider approve(@PathVariable Long id) {
        return providerService.approveProvider(id);
    }
}
