package com.misoft.jobportal.repository.applicant;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.misoft.jobportal.entity.applicant.AccountInfo;

import java.util.List;

@Repository
public interface AccountInfoRepository extends JpaRepository<AccountInfo, Long> {

    @Query(value = "SELECT  u.first_name first_name, u.last_name last_name, u.email email, u.phone phone  FROM per_job_cv pjc right JOIN users u ON pjc.user_id = u.user_id WHERE pjc.per_jobpost_id = :jobId ", nativeQuery = true)
    List<AccountInfo> getAppByJobId(@Param("jobId") Long jobId);

}
