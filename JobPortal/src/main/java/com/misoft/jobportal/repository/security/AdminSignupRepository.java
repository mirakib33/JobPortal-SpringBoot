package com.misoft.jobportal.repository.security;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.misoft.jobportal.entity.security.AdminSignup;

@Repository
public interface AdminSignupRepository extends JpaRepository<AdminSignup, Long> {

}
