package com.misoft.jobportal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.misoft.jobportal.entity.CardDetails;
import com.misoft.jobportal.entity.admin.JobCategory;
import com.misoft.jobportal.repository.CardDetailsRepository;
import com.misoft.jobportal.repository.admin.JobCategoryRepository;

@Service
public class CardDetailsService {
	
	@Autowired
	private CardDetailsRepository cardDetailsRepository;

	public void save(CardDetails cardDetails) {
		cardDetailsRepository.save(cardDetails);
	}
	
	public List<CardDetails> get() {
		return cardDetailsRepository.findAll();
	}

	public CardDetails getById(Long id) {
		Optional<CardDetails> data = cardDetailsRepository.findById(id);
		CardDetails cardDetails = null;
		if (data.isPresent()) {
			cardDetails = data.get();
		} 
		return cardDetails;
	}

	public void delete(CardDetails cardDetails) {
		cardDetailsRepository.delete(cardDetails);
	}

}
