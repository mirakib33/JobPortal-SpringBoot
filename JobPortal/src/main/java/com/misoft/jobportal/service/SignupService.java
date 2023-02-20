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
	
	public String save(Signup signup) {
		if(signupRepository.findByEmail(signup.getEmail()) != null) {
			return "User already exist";
		}
		signupRepository.save(signup);
		return "Successfully registered";
	}

}
