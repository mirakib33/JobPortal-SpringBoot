package com.misoft.jobportal.service.applicant;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.misoft.jobportal.entity.applicant.AccountInfo;
import com.misoft.jobportal.repository.applicant.AccountInfoRepository;

@Service
public class AccountInfoService {
	
	@Autowired
	AccountInfoRepository accountInfoRepository;
	
	public AccountInfo save(AccountInfo accountInfo) {
		
		if(!accountInfo.equals(null)) {
			return accountInfoRepository.save(accountInfo);
		}
		return null;
	}
	
	public AccountInfo getById(Long id) {
		Optional<AccountInfo> data = accountInfoRepository.findById(id);
		AccountInfo accountInfo = null;
		if (data.isPresent()) {
			accountInfo = data.get();
		} 
		return accountInfo;
	}

	public List<AccountInfo> getAppByJobId(Long jobId) {
		System.out.println(jobId);
		return accountInfoRepository.getAppByJobId(jobId);
	}

}
