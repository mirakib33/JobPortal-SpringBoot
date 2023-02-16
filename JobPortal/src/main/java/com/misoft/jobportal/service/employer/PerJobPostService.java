package com.misoft.jobportal.service.employer;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.misoft.jobportal.DTO.PerAppliedJobsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.misoft.jobportal.entity.employer.PerJobPost;
import com.misoft.jobportal.repository.employer.PerJobPostRepository;

@Service
public class PerJobPostService {
	
	@Autowired
	PerJobPostRepository perJobPostRepository;

	public void save(PerJobPost perJobPost) {
		perJobPostRepository.save(perJobPost);
	}
	
	public List<PerJobPost> get() {
		return perJobPostRepository.findAll();
	}

	public PerJobPost getById(Long id) {
		Optional<PerJobPost> data = perJobPostRepository.findById(id);
		PerJobPost perJobPost = null;
		if (data.isPresent()) {
			perJobPost = data.get();
		} 
		return perJobPost;
	}


	public void delete(PerJobPost perJobPost) {
		perJobPostRepository.delete(perJobPost);
	}

	public List<PerAppliedJobsDTO> getJobById(Long userID) {
		List<PerAppliedJobsDTO> perAppliedJobsDTOS = new ArrayList<>();
		List<Object[]> obList = perJobPostRepository.getJobById(userID);
		for (Object[] ob : obList
		){
			PerAppliedJobsDTO opPerAppliedJobsDTO = new PerAppliedJobsDTO();
			opPerAppliedJobsDTO.setApplyDate(ob[0]!=null? String.valueOf(ob[0])  :"");
			opPerAppliedJobsDTO.setStatus(ob[1] != null && (boolean) ob[1]);
			BigInteger b1 = (BigInteger) ob[2];
			opPerAppliedJobsDTO.setPer_jobpost_id(ob[2]!=null?  b1.longValue() :null);
			opPerAppliedJobsDTO.setJobTitle(ob[3]!=null? (String) ob[3] :"");
			opPerAppliedJobsDTO.setCompanyName(ob[4]!=null? (String) ob[4] :"");
			opPerAppliedJobsDTO.setJobCategory(ob[5]!=null? (String) ob[5] :"");
			BigInteger b2 = (BigInteger) ob[6];
			opPerAppliedJobsDTO.setPerjob_cv_id(ob[6]!=null?  b2.longValue() :null);
			perAppliedJobsDTOS.add(opPerAppliedJobsDTO);
		}

		return perAppliedJobsDTOS;
	}

}
