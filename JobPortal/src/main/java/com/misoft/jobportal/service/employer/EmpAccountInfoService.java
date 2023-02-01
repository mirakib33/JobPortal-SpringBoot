package com.misoft.jobportal.service.employer;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.misoft.jobportal.entity.employer.EmpAccountInfo;
import com.misoft.jobportal.repository.employer.EmpAccountInfoRepository;

@Service
public class EmpAccountInfoService {

	@Autowired
	EmpAccountInfoRepository empAccountInfoRepository;
	
	public EmpAccountInfo save(EmpAccountInfo empAccountInfo) {
		
		if(!empAccountInfo.equals(null)) {
			return empAccountInfoRepository.save(empAccountInfo);
		}
		return null;
	}
	
	public EmpAccountInfo getById(Long id) {
		Optional<EmpAccountInfo> data = empAccountInfoRepository.findById(id);
		EmpAccountInfo empAccountInfo = null;
		if (data.isPresent()) {
			empAccountInfo = data.get();
		} 
		return empAccountInfo;
	}
	
}
