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

    @Query(value = "SELECT  pjp.* from per_job_cv pjc LEFT JOIN permanent_job_post pjp ON pjc.per_jobpost_id = pjp.per_jobpost_id WHERE pjc.user_id = :userID",nativeQuery = true)
    List<PerJobPost> getJobById(@Param("userID") Long userID);

}
