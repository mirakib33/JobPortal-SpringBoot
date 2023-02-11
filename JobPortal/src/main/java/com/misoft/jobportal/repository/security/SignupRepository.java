package com.misoft.jobportal.repository.security;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.misoft.jobportal.entity.security.Signup;

@Repository
public interface SignupRepository extends JpaRepository<Signup, Long> {

}
