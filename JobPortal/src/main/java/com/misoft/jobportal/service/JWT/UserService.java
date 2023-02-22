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
		roleAdmin.setRoleName("ROLE_ADMIN");
		roleAdmin.setRoleDescription("Default role for newly ROLE_ADMIN record");
		roleDao.save(roleAdmin);

		User adminUser = new User();

		adminUser.setEmail("admin@gmail.com");
		adminUser.setPassword(getEncodedPassword("admin"));
		Set<Role> adminRoles = new HashSet<>();
		adminRoles.add(roleAdmin);
		adminUser.setRole(adminRoles);
		try {
			if (userDao.findByEmailOrPhone("admin@gmail.com")==null){
				userDao.save(adminUser);
			}
		}catch (Exception e){e.printStackTrace();}
	}

	public User registerNewUser(User user) {
		Role role = roleDao.findByRoleName("ROLE_ADMIN");
		Set<Role> userRoles = new HashSet<>();
		userRoles.add(role);
		user.setRole(userRoles);
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
