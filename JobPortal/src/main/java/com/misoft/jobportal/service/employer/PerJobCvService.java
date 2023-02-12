package com.misoft.jobportal.service.employer;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.misoft.jobportal.entity.employer.PerJobCv;
import com.misoft.jobportal.repository.employer.PerJobCvRepository;

@Service
public class PerJobCvService {
	
	@Autowired
	private PerJobCvRepository perJobCvRepository;

	public void save(PerJobCv perJobCv) {
		perJobCvRepository.save(perJobCv);
	}

	public PerJobCv getById(Long id) {
		Optional<PerJobCv> data = perJobCvRepository.findById(id);
		PerJobCv perJobCv = null;
		if (data.isPresent()) {
			perJobCv = data.get();
		}
		return perJobCv;
	}


	public void delete(PerJobCv perJobCv) {
		perJobCvRepository.delete(perJobCv);
	}

}
