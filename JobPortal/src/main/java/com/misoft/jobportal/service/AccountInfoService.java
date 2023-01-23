package com.misoft.jobportal.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.misoft.jobportal.entity.AccountInfo;
import com.misoft.jobportal.repository.AccountInfoRepository;

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
