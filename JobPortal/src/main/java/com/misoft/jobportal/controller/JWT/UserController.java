package com.misoft.jobportal.controller.JWT;

import com.misoft.jobportal.DTO.JWT.SignupRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.misoft.jobportal.entity.JWT.User;
import com.misoft.jobportal.service.JWT.UserService;

import javax.annotation.PostConstruct;

@RestController
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class UserController {

	@Autowired
	UserService userService;

	@PostConstruct
	public void initRoleAndUser() {
		userService.initRoleAndUser();
	}

	@PostMapping({"/signup"})
	public User registerNewUserNew(@RequestBody SignupRequest signupRequest) {
		User user = new User();
		user.setFirstName(signupRequest.getFirstName());
		user.setLastName(signupRequest.getLastName());
		user.setEmail(signupRequest.getEmail());
		user.setPhone(signupRequest.getPhone());
		user.setPassword(signupRequest.getPassword());
		user.setUserType(signupRequest.getUserType());
		user.setUserAgreement(signupRequest.getUserAgreement());
		return userService.registerNewUser(user);
	}


	@PostMapping({"/registerNewUser"})
	public User registerNewUser(@RequestBody User user) {
		return userService.registerNewUser(user);
	}

	@GetMapping({"/forAdmin"})
	@PreAuthorize("hasRole('Admin')")
	public String forAdmin(){
		return "This URL is only accessible to the admin";
	}

	@GetMapping({"/forUser"})
	@PreAuthorize("hasRole('User')")
	public String forUser(){
		return "This URL is only accessible to the user";
	}





	
//	@PostMapping("/signup")
//	public User save(@RequestBody User user) {
//		userService.save(user);
//		return user;
//	}
}
