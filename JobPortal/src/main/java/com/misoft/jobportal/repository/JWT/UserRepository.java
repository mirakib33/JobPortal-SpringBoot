package com.misoft.jobportal.repository.JWT;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.misoft.jobportal.entity.JWT.User;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

//    Optional<User> findByEmailOrPhone(String email, String phone);

}
