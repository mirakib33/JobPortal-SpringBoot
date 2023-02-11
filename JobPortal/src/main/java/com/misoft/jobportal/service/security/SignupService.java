package com.misoft.jobportal.service.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.misoft.jobportal.entity.security.Signup;
import com.misoft.jobportal.repository.security.SignupRepository;

@Service
public class SignupService {

	@Autowired
	SignupRepository signupRepository;
	
	public Signup save(Signup signup) {
		
		if(!signup.equals(null)) {
			return signupRepository.save(signup);
		}
		return null;
	}
}
