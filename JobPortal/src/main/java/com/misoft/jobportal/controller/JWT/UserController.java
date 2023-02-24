package com.misoft.jobportal.controller.JWT;

import com.misoft.jobportal.DTO.JWT.SignupRequest;
import com.misoft.jobportal.entity.JWT.Role;
import com.misoft.jobportal.repository.JWT.RoleDao;
import com.misoft.jobportal.repository.JWT.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.misoft.jobportal.entity.JWT.User;
import com.misoft.jobportal.service.JWT.UserService;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

@RestController
@CrossOrigin(origins = "http://localhost:4200", allowCredentials = "true")
public class UserController {


	@Autowired
	private RoleDao roleDao;

	@Autowired
	UserService userService;

	@PostConstruct
	public void initRoleAndUser() {
		userService.initRoleAndUser();
	}

	@PostMapping({"/signup"})
	public User registerNewUser(@RequestBody SignupRequest signupRequest) {
		User user = new User();
		user.setFirstName(signupRequest.getFirstName());
		user.setLastName(signupRequest.getLastName());
		user.setEmail(signupRequest.getEmail());
		user.setPhone(signupRequest.getPhone());
		user.setPassword(signupRequest.getPassword());
		user.setUserType(signupRequest.getUserType());
		user.setUserAgreement(signupRequest.getUserAgreement());
		Set<Role> roles = new HashSet<>();
		for (Role r:signupRequest.getRole()
			 ) {
			Role ro = roleDao.findByRoleName(r.getRoleName());
			if(ro!=null){
				roles.add(ro);
			}
		}
		user.setRole(roles);
		return userService.registerNewUser(user);
	}


	@PostMapping({"/registerNewUser"})
	public User registerNewUser(@RequestBody User user) {
		return userService.registerNewUser(user);
	}

	@GetMapping({"/forAdmin"})
//	@PreAuthorize("hasRole('Admin')")
	public String forAdmin(){
		return "This URL is only accessible to the admin";
	}

	@GetMapping({"/forApplicant"})
//	@PreAuthorize("hasRole('Applicant')")
	public String forApplicant(){
		return "This URL is only accessible to the applicant";
	}

	@GetMapping({"/forEmployer"})
//	@PreAuthorize("hasRole('Applicant')")
	public String forEmployer(){
		return "This URL is only accessible to the employer";
	}


}
