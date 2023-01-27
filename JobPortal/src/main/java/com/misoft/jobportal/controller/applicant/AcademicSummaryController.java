package com.misoft.jobportal.controller.applicant;

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

import com.misoft.jobportal.entity.applicant.AcademicSummary;
import com.misoft.jobportal.service.applicant.AcademicSummaryService;

@RestController
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
@RequestMapping("/applicant")
public class AcademicSummaryController {
	
	@Autowired
	private AcademicSummaryService academicSummaryService;

	@GetMapping("/academic-summary")
	public List<AcademicSummary> get() {
		return academicSummaryService.get();
	}

	@PostMapping("/save")
	public AcademicSummary save(@RequestBody AcademicSummary academicSummary) {
		academicSummaryService.save(academicSummary);
		return academicSummary;
	}
	@GetMapping("/user/{id}")
	public AcademicSummary getById(@PathVariable Long id) {
		AcademicSummary academicSummary = academicSummaryService.getById(id);
		return academicSummary;
	}

	@DeleteMapping("/delete/{id}")
	public AcademicSummary delete(@PathVariable Long id) {
		AcademicSummary academicSummary = academicSummaryService.getById(id);
		academicSummaryService.delete(academicSummary);
		return academicSummary;
	}

	@PutMapping("/update/{id}")
	public AcademicSummary update(@PathVariable Long id, @RequestBody AcademicSummary academicSummary) {
		AcademicSummary post = academicSummaryService.getById(id);
		post.setDegree(academicSummary.getDegree());
		post.setSubjectGroup(academicSummary.getSubjectGroup());
		post.setInstituteBoard(academicSummary.getInstituteBoard());
		post.setPassingYear(academicSummary.getPassingYear());
		post.setResult(academicSummary.getResult());
		post.setScale(academicSummary.getScale());
		academicSummaryService.save(academicSummary);
		    return academicSummary;
	}

}
