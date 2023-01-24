package com.misoft.jobportal.controller.applicant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.misoft.jobportal.entity.applicant.AccountInfo;
import com.misoft.jobportal.repository.applicant.AccountInfoRepository;

@RestController
@RequestMapping("/applicant")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class AccountInfoController {
	
	@Autowired
	AccountInfoRepository accountInfoRepository;
	
	@PostMapping("/account-info")
	AccountInfo post(@RequestBody AccountInfo accountInfo) {
        return accountInfoRepository.save(accountInfo);
    }

}
