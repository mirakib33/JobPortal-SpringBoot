package com.misoft.jobportal.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
		signupService.save(signup);
		return signup;
	}
}
