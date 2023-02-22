package com.misoft.jobportal.controller.employer;

import java.util.List;

import com.misoft.jobportal.DTO.PerAppliedJobsDTO;
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

import com.misoft.jobportal.entity.employer.PerJobPost;
import com.misoft.jobportal.service.employer.PerJobPostService;

@RestController
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
@RequestMapping("/employer")
public class PerJobPostController {

	@Autowired
	private PerJobPostService perJobPostService;

	@PostMapping("/permanent-job-post")
	public PerJobPost save(@RequestBody PerJobPost perJobPost) {
		perJobPostService.save(perJobPost);
		return perJobPost;
	}
	
	@GetMapping("/permanent-job-post")
	public List<PerJobPost> get() {
		return perJobPostService.get();
	}

	@GetMapping("/permanent-job-post/{id}")
	public PerJobPost getById(@PathVariable Long id) {
		PerJobPost perJobPost = perJobPostService.getById(id);
		return perJobPost;
	}

	@PutMapping("/permanent-job-post/{id}")
	public PerJobPost update(@PathVariable Long id, @RequestBody PerJobPost perJobPost) {
		PerJobPost post = perJobPostService.getById(id);
		
		post.setPer_jobpost_id(perJobPost.getPer_jobpost_id());
		post.setPicture(perJobPost.getPicture());
		post.setDeadline(perJobPost.getDeadline());
		post.setJobTitle(perJobPost.getJobTitle());
		post.setCompanyName(perJobPost.getCompanyName());
		post.setVacancyNumber(perJobPost.getVacancyNumber());
		post.setEmploymentStatus(perJobPost.getEmploymentStatus());
		post.setLocation(perJobPost.getLocation());
		post.setWorkplace(perJobPost.getWorkplace());
		post.setGender(perJobPost.getGender());
		post.setAge(perJobPost.getAge());
		post.setJobContext(perJobPost.getJobContext());
		post.setDuties(perJobPost.getDuties());
		post.setEducation(perJobPost.getEducation());
		post.setExperience(perJobPost.getExperience());
		post.setAdditionalRequirements(perJobPost.getAdditionalRequirements());
		post.setOtherBenifits(perJobPost.getOtherBenifits());
		post.setJobCategory(perJobPost.getJobCategory());
		perJobPostService.save(post);
		    return post;
	}
	
	

	@DeleteMapping("/permanent-job-post/{id}")
	public PerJobPost delete(@PathVariable Long id) {
		PerJobPost perJobPost = perJobPostService.getById(id);
		perJobPostService.delete(perJobPost);
		return perJobPost;
	}

	@GetMapping("/per-job-cv/{userId}")
	public List<PerAppliedJobsDTO> getPerJobById(@PathVariable Long userId) {
		return perJobPostService.getJobById(userId);
	}
	
}
