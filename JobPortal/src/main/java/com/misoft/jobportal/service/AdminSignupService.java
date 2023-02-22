package com.misoft.jobportal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.misoft.jobportal.entity.AdminSignup;
import com.misoft.jobportal.repository.AdminSignupRepository;

@Service
public class AdminSignupService {
	
	@Autowired
	AdminSignupRepository adminSignupRepository;
	
	public AdminSignup save(AdminSignup adminSignup) {
		
		if(!adminSignup.equals(null)) {
			return adminSignupRepository.save(adminSignup);
		}
		return null;
	}

}
