package com.misoft.jobportal.service.applicant;

import org.springframework.beans.factory.annotation.Autowired;

import com.misoft.jobportal.entity.applicant.AccountInfo;
import com.misoft.jobportal.repository.applicant.AccountInfoRepository;

public class AccountInfoService {
	
	@Autowired
	AccountInfoRepository accountInfoRepository;
	
	public AccountInfo post(AccountInfo accountInfo) {
		
		if(!accountInfo.equals(null)) {
			return accountInfoRepository.save(accountInfo);
		}
		return null;
	}

}
