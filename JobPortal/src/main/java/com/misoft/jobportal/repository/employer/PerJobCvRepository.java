package com.misoft.jobportal.repository.employer;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.misoft.jobportal.entity.employer.PerJobCv;

@Repository
public interface PerJobCvRepository extends JpaRepository<PerJobCv, Long> {
	
	@Query(value = SELECT apj.perjob_cv_id,apj.status, u.last_name, u.email, pjp.job_title, pjp.company_name, pjp.job_category FROM job_portal.per_job_cv apj
			left join job_portal.users u on apj.user_id = u.user_id
			left join job_portal.permanent_job_post pjp on apj.per_jobpost_id = pjp.per_jobpost_id
			WHERE apj.user_id = 31, nativeQuery = true)
			List<PerJobCv> findAllActiveUsersNative();


}
