package com.misoft.jobportal.repository.employer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.misoft.jobportal.entity.employer.PerJobPost;

@Repository
public interface PerJobPostRepository extends JpaRepository<PerJobPost, Long> {

	

}
