package com.misoft.jobportal.repository.employer;

import com.misoft.jobportal.entity.employer.FreeJobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FreeJobPostRepository extends JpaRepository<FreeJobPost, Long> {

}
