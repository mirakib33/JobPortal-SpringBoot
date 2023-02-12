package com.misoft.jobportal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.misoft.jobportal.entity.Signup;
import com.misoft.jobportal.repository.SignupRepository;

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
