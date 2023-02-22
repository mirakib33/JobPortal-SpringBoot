package com.misoft.jobportal.controller.employer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.misoft.jobportal.entity.employer.EmpAccountInfo;
import com.misoft.jobportal.service.employer.EmpAccountInfoService;

@RestController
@RequestMapping("/employer")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class EmpAccountInfoController {

	@Autowired
	EmpAccountInfoService empAccountInfoService;
	
	@PostMapping("/emp-account-info")
	EmpAccountInfo post(@RequestBody EmpAccountInfo empAccountInfo) {
        return empAccountInfoService.save(empAccountInfo);
    }
	
	@GetMapping("/emp-account-info/{id}")
	public EmpAccountInfo getById(@PathVariable Long id) {
		EmpAccountInfo empAccountInfo = empAccountInfoService.getById(id);
		return empAccountInfo;
	}
	
	@PutMapping("/emp-account-info/{id}")
	public EmpAccountInfo update(@PathVariable Long id, @RequestBody EmpAccountInfo empAccountInfo) {
		EmpAccountInfo post = empAccountInfoService.getById(id);
		
		if (post == null) {
			post = new EmpAccountInfo();
		}
		
		post.setId(empAccountInfo.getId());
		post.setFirstName(empAccountInfo.getFirstName());
		post.setLastName(empAccountInfo.getLastName());
		post.setEmail(empAccountInfo.getEmail());
		post.setPhone(empAccountInfo.getPhone());
		post.setCompanyName(empAccountInfo.getCompanyName());
		post.setDesignation(empAccountInfo.getDesignation());
		post.setDepartment(empAccountInfo.getDepartment());
		post.setCompanyLocation(empAccountInfo.getCompanyLocation());
		post.setPassword(empAccountInfo.getPassword());
		empAccountInfoService.save(post);
		    return post;
	}
	
}
