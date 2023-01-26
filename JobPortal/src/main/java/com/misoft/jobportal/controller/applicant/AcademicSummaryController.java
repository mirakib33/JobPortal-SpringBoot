package com.misoft.jobportal.controller.applicant;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.misoft.jobportal.entity.applicant.AcademicSummary;
import com.misoft.jobportal.repository.applicant.AcademicSummaryRepository;

@RestController
@RequestMapping("/applicant")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class AcademicSummaryController {
	
	@Autowired
    AcademicSummaryRepository academicSummaryRepository;


    @GetMapping("/academic-summary")
    List<AcademicSummary> all() {

        System.out.println("Get All called");
        return academicSummaryRepository.findAll();
    }
    // end::get-aggregate-root[]

    @PostMapping("/academic-summary")
    AcademicSummary save(@RequestBody AcademicSummary academicSummary) {
        return academicSummaryRepository.save(academicSummary);
    }

    // Single item

    @GetMapping("/academic-summary/{id}")
    AcademicSummary get(@PathVariable Long id) {
        Optional<AcademicSummary> academicSummary =  academicSummaryRepository.findById(id);
        return academicSummary.get();
    }

//    @PutMapping("/academic-summary/{id}")
//    AcademicSummary update(@RequestBody AcademicSummary academicSummary, @PathVariable Long id) {

//        return academicSummaryRepository.findById(id)
//                .map(post -> {
//                    post.setDegree(academicSummary.getDegree());
//                    post.setSubjectGroup(academicSummary.getSubjectGroup());
//                    post.setInstituteBoard(academicSummary.getInstituteBoard());
//                    post.setPassingYear(academicSummary.getPassingYear());
//                    post.setResult(academicSummary.getResult());
//                    post.setScale(academicSummary.getScale());
//                    return academicSummary.save(post);
//                })
//                .orElseGet(() -> {
//                	academicSummary.setId(id);
//                    return academicSummaryRepository.save(academicSummary);
//                });
//    }

    @DeleteMapping("/academic-summary/{id}")
    void delete(@PathVariable Long id) {
    	academicSummaryRepository.deleteById(id);
    }

}
