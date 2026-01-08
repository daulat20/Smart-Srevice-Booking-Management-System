package com.service_booking.dto;

import com.service_booking.entity.Role;

import jakarta.persistence.Column;

public class UserResponseDTO {

	private Long id;
	private String firstname;
	private String lastname;

	private String email;

	private String contact;
	private String role;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public void setRole(Role role2) {
		// TODO Auto-generated method stub
		
	}
	
	

}
