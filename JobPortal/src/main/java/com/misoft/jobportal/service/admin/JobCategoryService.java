package com.misoft.jobportal.service.admin;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.misoft.jobportal.entity.admin.JobCategory;
import com.misoft.jobportal.repository.admin.JobCategoryRepository;

@Service
public class JobCategoryService {

	@Autowired
	private JobCategoryRepository jobCategoryRepository;

	public void save(JobCategory jobCategory) {
		jobCategoryRepository.save(jobCategory);
	}
	
	public List<JobCategory> get() {
		return jobCategoryRepository.findAll();
	}

	public JobCategory getById(Long id) {
		Optional<JobCategory> data = jobCategoryRepository.findById(id);
		JobCategory jobCategory = null;
		if (data.isPresent()) {
			jobCategory = data.get();
		} 
		return jobCategory;
	}

	public void delete(JobCategory jobCategory) {
		jobCategoryRepository.delete(jobCategory);
	}
	
	public List<JobCategory> getJobCategoryList() {
		return jobCategoryRepository.getJobCategoryList();
	}
	
}
