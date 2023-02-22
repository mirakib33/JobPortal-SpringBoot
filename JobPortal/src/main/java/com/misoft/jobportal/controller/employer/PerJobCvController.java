package com.misoft.jobportal.controller.employer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.misoft.jobportal.entity.employer.PerJobCv;
import com.misoft.jobportal.service.employer.PerJobCvService;

@RestController
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class PerJobCvController {

	@Autowired
	private PerJobCvService perJobCvService;

	@PostMapping("/per-job-cv")
	public PerJobCv save(@RequestBody PerJobCv perJobCv) {
		perJobCvService.save(perJobCv);
		return perJobCv;
	}

	@DeleteMapping("/per-job-cv/{id}")
	public PerJobCv delete(@PathVariable Long id) {
		PerJobCv perJobCv = perJobCvService.getById(id);
		perJobCvService.delete(perJobCv);
		return perJobCv;
	}
	
}
