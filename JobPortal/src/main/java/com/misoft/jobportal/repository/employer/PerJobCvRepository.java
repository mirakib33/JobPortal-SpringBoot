package com.misoft.jobportal.repository.employer;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.misoft.jobportal.entity.employer.PerJobCv;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Repository
public interface PerJobCvRepository extends JpaRepository<PerJobCv, Long> {
	
	@Query("SELECT pjc.*, pjp.job_title, pjp.company_name, pjp.job_category from per_job_cv pjc LEFT JOIN permanent_job_post pjp ON pjc.per_jobpost_id = pjp.per_jobpost_id")
    Optional<PerJobCv> getJobById(Long id);

}
