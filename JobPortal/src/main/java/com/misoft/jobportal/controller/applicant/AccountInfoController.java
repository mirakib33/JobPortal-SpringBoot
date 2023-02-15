package com.misoft.jobportal.controller.applicant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.misoft.jobportal.entity.applicant.AccountInfo;
import com.misoft.jobportal.service.applicant.AccountInfoService;

import java.util.List;

@RestController
@RequestMapping("/applicant")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class AccountInfoController {
	
	@Autowired
	AccountInfoService accountInfoService;
	
	@PostMapping("/account-info")
	AccountInfo post(@RequestBody AccountInfo accountInfo) {
        return accountInfoService.save(accountInfo);
    }
	
	@GetMapping("/account-info/{id}")
	public AccountInfo getById(@PathVariable Long id) {
		AccountInfo accountInfo = accountInfoService.getById(id);
		return accountInfo;
	}
	
	@PutMapping("/account-info/{id}")
	public AccountInfo update(@PathVariable Long id, @RequestBody AccountInfo accountInfo) {
		AccountInfo post = accountInfoService.getById(id);
		
		if (post == null) {
			post = new AccountInfo();
		}
		
		post.setId(accountInfo.getId());
		post.setFirstName(accountInfo.getFirstName());
		post.setLastName(accountInfo.getLastName());
		post.setEmail(accountInfo.getEmail());
		post.setPhone(accountInfo.getPhone());
		post.setPassword(accountInfo.getPassword());
		accountInfoService.save(post);
		    return post;
	}

	@GetMapping("/list/{jobId}")
	public List<AccountInfo> getAppByJobId(@PathVariable Long jobId) {
		return accountInfoService.getAppByJobId(jobId);
	}

}
