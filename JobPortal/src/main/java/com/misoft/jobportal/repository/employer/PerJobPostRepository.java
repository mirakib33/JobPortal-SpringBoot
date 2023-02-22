package com.misoft.jobportal.repository.employer;

import com.misoft.jobportal.entity.employer.PerJobCv;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.misoft.jobportal.entity.employer.PerJobPost;

import java.util.List;

@Repository
public interface PerJobPostRepository extends JpaRepository<PerJobPost, Long> {

    @Query(value = "SELECT pjc.apply_date apply_date, pjc.status, pjp.per_jobpost_id, pjp.job_title, pjp.company_name, pjp.job_category, pjc.perjob_cv_id from per_job_cv pjc LEFT JOIN permanent_job_post pjp ON pjc.per_jobpost_id = pjp.per_jobpost_id WHERE pjc.user_id = :userID ", nativeQuery = true)
    List<Object[]> getJobById(@Param("userID") Long userID);

}
