package com.misoft.jobportal.service.employer;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.misoft.jobportal.entity.employer.PerJobPost;
import com.misoft.jobportal.repository.employer.PerJobPostRepository;

@Service
public class PerJobPostService {
	
	@Autowired
	private PerJobPostRepository perJobPostRepository;

	public void save(PerJobPost perJobPost) {
		perJobPostRepository.save(perJobPost);
	}
	
	public List<PerJobPost> get() {
		return perJobPostRepository.findAll();
	}

	public PerJobPost getById(Long id) {
		Optional<PerJobPost> data = perJobPostRepository.findById(id);
		PerJobPost perJobPost = null;
		if (data.isPresent()) {
			perJobPost = data.get();
		} 
		return perJobPost;
	}


	public void delete(PerJobPost perJobPost) {
		perJobPostRepository.delete(perJobPost);
	}

}
