package com.misoft.jobportal.repository.applicant;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.misoft.jobportal.entity.applicant.AcademicSummary;

public interface AcademicSummaryRepository extends JpaRepository<AcademicSummary, Long> {

	Optional<AcademicSummary> findByUserId(Long id);

}
