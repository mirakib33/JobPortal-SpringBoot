package com.misoft.jobportal.service.applicant;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.misoft.jobportal.entity.applicant.AcademicSummary;
import com.misoft.jobportal.repository.applicant.AcademicSummaryRepository;

@Service
public class AcademicSummaryService {

	@Autowired
	private AcademicSummaryRepository academicSummaryRepository;

	public List<AcademicSummary> get() {
		return academicSummaryRepository.findAll();
	}

	public void save(AcademicSummary academicSummary) {
		academicSummaryRepository.save(academicSummary);
	}

	public AcademicSummary getById(Long id) {
		Optional<AcademicSummary> data = academicSummaryRepository.findById(id);
		AcademicSummary academicSummary = null;
		if (data.isPresent()) {
			academicSummary = data.get();
		} 
		return academicSummary;
	}
	
	public AcademicSummary getByUserId(Long id) {
		Optional<AcademicSummary> data = academicSummaryRepository.findByUserId(id);
		AcademicSummary academicSummary = null;
		if (data.isPresent()) {
			academicSummary = data.get();
		} 
		return academicSummary;
	}

	public void delete(AcademicSummary academicSummary) {
		academicSummaryRepository.delete(academicSummary);
	}
	
}
