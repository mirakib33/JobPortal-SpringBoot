package com.misoft.jobportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.misoft.jobportal.entity.User;

public interface LoginRepository extends JpaRepository<User, Long>{
	
	@Query(value = "SELECT * FROM users u WHERE (u.email = :user or u.phone = :user) and u.password = :password", nativeQuery = true)
    User login(@Param("user") String user, @Param("password") String password);

}
