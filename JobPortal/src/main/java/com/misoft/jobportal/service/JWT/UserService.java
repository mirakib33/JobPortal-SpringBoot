package com.misoft.jobportal.service.JWT;

import com.misoft.jobportal.entity.JWT.Role;
import com.misoft.jobportal.repository.JWT.RoleDao;
import com.misoft.jobportal.repository.JWT.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.misoft.jobportal.entity.JWT.User;
import com.misoft.jobportal.repository.JWT.UserRepository;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;

	@Autowired
	private RoleDao roleDao;

	@Autowired
	private PasswordEncoder passwordEncoder;

	public void initRoleAndUser() {

		Role roleAdmin = new Role();
		if(roleDao.findByRoleName("ROLE_ADMIN")==null){
			roleAdmin.setRoleName("ROLE_ADMIN");
			roleAdmin.setRoleDescription("Default role for newly ROLE_ADMIN record");
			roleDao.save(roleAdmin);
		}

		Role roleApplicant = new Role();
		if(roleDao.findByRoleName("ROLE_APPLICANT")==null){
			roleApplicant.setRoleName("ROLE_APPLICANT");
			roleApplicant.setRoleDescription("Default role for newly ROLE_APPLICANT record");
			roleDao.save(roleApplicant);
		}

		Role roleEmployer = new Role();
		if(roleDao.findByRoleName("ROLE_EMPLOYER")==null){
			roleEmployer.setRoleName("ROLE_EMPLOYER");
			roleEmployer.setRoleDescription("Default role for newly ROLE_EMPLOYER record");
			roleDao.save(roleEmployer);
		}

		User adminUser = new User();

		adminUser.setEmail("admin@gmail.com");
		adminUser.setPassword(getEncodedPassword("admin"));
		Set<Role> adminRoles = new HashSet<>();
		adminRoles.add(roleAdmin);
		adminUser.setRole(adminRoles);
		adminUser.setPhone(123456789);

		try {
			if (userDao.findByEmailOrPhone("admin@gmail.com")==null){
				userDao.save(adminUser);
			}
		}catch (Exception e){e.printStackTrace();}
	}

	public User registerNewUser(User user) {
		if (user.getRole()==null){
			Role role = roleDao.findByRoleName("ROLE_APPLICANT");
			Set<Role> userRoles = new HashSet<>();
			userRoles.add(role);
			user.setRole(userRoles);
		}
		User u = userDao.findByEmailOrPhone(user.getEmail());
		if (u!=null){
//			user.setUser_id(u.getUser_id());
			return null;
		}
		user.setPassword(getEncodedPassword(user.getPassword()));

		return userDao.save(user);
	}

	public String getEncodedPassword(String password) {
		return passwordEncoder.encode(password);
	}





	
//	public User save(User user) {
//
//		if(!user.equals(null)) {
//			return userRepository.save(user);
//		}
//		return null;
//	}
}
