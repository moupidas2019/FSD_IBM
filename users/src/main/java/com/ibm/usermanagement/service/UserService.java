package com.ibm.usermanagement.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.ibm.usermanagement.models.User;
import com.ibm.usermanagement.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{

	User findByEmail(String email);
	
	User save(UserRegistrationDto registration);
}
