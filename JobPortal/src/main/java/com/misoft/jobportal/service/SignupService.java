package com.misoft.jobportal.service;

import com.misoft.jobportal.entity.applicant.AccountInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.misoft.jobportal.entity.Signup;
import com.misoft.jobportal.repository.SignupRepository;

import java.util.Optional;

@Service
public class SignupService {

	@Autowired
	SignupRepository signupRepository;
	
	public Signup save(Signup signup) {
		
		if(!signup.equals(null)) {
			return signupRepository.save(signup);
		}
		return ResponseEntity.ok(message);
	}

	public Signup findByEmail(String email) {
		return signupRepository.findByEmail(email);
	}
}
