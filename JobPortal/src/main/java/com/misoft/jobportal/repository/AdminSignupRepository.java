package com.misoft.jobportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.misoft.jobportal.entity.AdminSignup;

@Repository
public interface AdminSignupRepository extends JpaRepository<AdminSignup, Long> {

}
