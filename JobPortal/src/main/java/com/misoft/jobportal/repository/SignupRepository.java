package com.misoft.jobportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.misoft.jobportal.entity.Signup;

@Repository
public interface SignupRepository extends JpaRepository<Signup, Long> {

    Signup findByEmail(String email);

}
