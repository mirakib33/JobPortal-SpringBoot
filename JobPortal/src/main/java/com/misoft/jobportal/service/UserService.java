package com.misoft.jobportal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.misoft.jobportal.entity.User;
import com.misoft.jobportal.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	public User save(User user) {
		
		if(!user.equals(null)) {
			return userRepository.save(user);
		}
		return null;
	}
}
