package com.misoft.jobportal.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.misoft.jobportal.entity.admin.JobCategory;
import com.misoft.jobportal.service.admin.JobCategoryService;

@RestController
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
@RequestMapping("/admin")
public class JobCategoryController {

	@Autowired
	private JobCategoryService jobCategoryService;

	@PostMapping("/job-category")
	public JobCategory save(@RequestBody JobCategory jobCategory) {
		jobCategoryService.save(jobCategory);
		return jobCategory;
	}
	
	@GetMapping("/job-category")
	public List<JobCategory> get() {
		return jobCategoryService.get();
	}

	@GetMapping("/job-category/{id}")
	public JobCategory getById(@PathVariable Long id) {
		JobCategory jobCategory = jobCategoryService.getById(id);
		return jobCategory;
	}

	@PutMapping("/job-category/{id}")
	public JobCategory update(@PathVariable Long id, @RequestBody JobCategory jobCategory) {
		JobCategory post = jobCategoryService.getById(id);
		
		post.setId(jobCategory.getId());
		post.setCategoryName(jobCategory.getCategoryName());
		jobCategoryService.save(post);
		    return post;
	}
	
	@DeleteMapping("/job-category/{id}")
	public JobCategory delete(@PathVariable Long id) {
		JobCategory jobCategory = jobCategoryService.getById(id);
		jobCategoryService.delete(jobCategory);
		return jobCategory;
	}
	
	@GetMapping("/job-category-list")
	public List<JobCategory> getJobCategoryList() {
		return jobCategoryService.getJobCategoryList();
	}
}
