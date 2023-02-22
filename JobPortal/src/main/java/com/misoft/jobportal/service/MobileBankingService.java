package com.misoft.jobportal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.misoft.jobportal.entity.MobileBanking;
import com.misoft.jobportal.repository.MobileBankingRepository;

@Service
public class MobileBankingService {
	
	@Autowired
	private MobileBankingRepository mobileBankingRepository;

	public void save(MobileBanking mobileBanking) {
		mobileBankingRepository.save(mobileBanking);
	}
	
	public List<MobileBanking> get() {
		return mobileBankingRepository.findAll();
	}

	public MobileBanking getById(Long id) {
		Optional<MobileBanking> data = mobileBankingRepository.findById(id);
		MobileBanking mobileBanking = null;
		if (data.isPresent()) {
			mobileBanking = data.get();
		} 
		return mobileBanking;
	}

	public void delete(MobileBanking mobileBanking) {
		mobileBankingRepository.delete(mobileBanking);
	}

}
