package com.misoft.jobportal.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.misoft.jobportal.entity.Signup;
import com.misoft.jobportal.repository.SignupRepository;

public class SignupService {

	@Autowired
	SignupRepository signupRepository;
	
	public Signup post(Signup signupEntity) {
		
		if(!signupEntity.equals(null)) {
			return signupRepository.save(signupEntity);
		}
		return null;
	}
}
