package com.misoft.jobportal.repository.admin;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.misoft.jobportal.entity.admin.JobCategory;

@Repository
public interface JobCategoryRepository extends JpaRepository<JobCategory, Long> {

	@Query(value = "SELECT * FROM job_category", nativeQuery = true)
	List<JobCategory> getJobCategoryList();
	
}
