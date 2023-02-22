package com.misoft.jobportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.misoft.jobportal.entity.MobileBanking;
import com.misoft.jobportal.service.MobileBankingService;

@RestController
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
@RequestMapping("/payment-method")
public class MobileBankingController {
	
	@Autowired
	private MobileBankingService mobileBankingService;

	@PostMapping("/mobile-banking")
	public MobileBanking save(@RequestBody MobileBanking mobileBanking) {
		mobileBankingService.save(mobileBanking);
		return mobileBanking;
	}
	
	@GetMapping("/mobile-banking")
	public List<MobileBanking> get() {
		return mobileBankingService.get();
	}

	@GetMapping("/mobile-banking/{id}")
	public MobileBanking getById(@PathVariable Long id) {
		MobileBanking mobileBanking = mobileBankingService.getById(id);
		return mobileBanking;
	}

	@PutMapping("/mobile-banking/{id}")
	public MobileBanking update(@PathVariable Long id, @RequestBody MobileBanking mobileBanking) {
		MobileBanking post = mobileBankingService.getById(id);
		
		post.setId(mobileBanking.getId());
//		post.setCategoryName(mobileBanking.getCategoryName());
		mobileBankingService.save(post);
		    return post;
	}
	
	@DeleteMapping("/mobile-banking/{id}")
	public MobileBanking delete(@PathVariable Long id) {
		MobileBanking mobileBanking = mobileBankingService.getById(id);
		mobileBankingService.delete(mobileBanking);
		return mobileBanking;
	}

}
