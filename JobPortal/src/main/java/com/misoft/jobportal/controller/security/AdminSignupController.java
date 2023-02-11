package com.misoft.jobportal.controller.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.misoft.jobportal.entity.security.AdminSignup;
import com.misoft.jobportal.service.security.AdminSignupService;

@RestController
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class AdminSignupController {
	
	@Autowired
	AdminSignupService adminSignupService;
	
	@PostMapping("/admin-signup")
	public AdminSignup save(@RequestBody AdminSignup adminSignup) {
		adminSignupService.save(adminSignup);
		return adminSignup;
	}

}
