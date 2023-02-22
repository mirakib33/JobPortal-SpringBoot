package com.misoft.jobportal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.misoft.jobportal.entity.Signup;
import com.misoft.jobportal.service.SignupService;

@RestController
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class SignupController {

	@Autowired
	SignupService signupService;
	
	@PostMapping("/signup")
	public Signup save(@RequestBody Signup signup) {
		if (signupService.findByEmail(signup.getEmail()) != null) {
			return ResponseEntity.status(HttpStatus.CONFLICT).build();
		}

		// Set the role to "Applicant" by default
//		user.setRole("Applicant");

		Signup savedUser = signupService.save(signup);
		return ResponseEntity.ok(message);
	}
		return signupService.save(signup);
	}
}
