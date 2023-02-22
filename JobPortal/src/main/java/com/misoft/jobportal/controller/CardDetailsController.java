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

import com.misoft.jobportal.entity.CardDetails;
import com.misoft.jobportal.service.CardDetailsService;

@RestController
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
@RequestMapping("/payment-method")
public class CardDetailsController {
	
	@Autowired
	private CardDetailsService cardDetailsService;

	@PostMapping("/card-details")
	public CardDetails save(@RequestBody CardDetails cardDetails) {
		cardDetailsService.save(cardDetails);
		return cardDetails;
	}
	
	@GetMapping("/card-details")
	public List<CardDetails> get() {
		return cardDetailsService.get();
	}

	@GetMapping("/card-details/{id}")
	public CardDetails getById(@PathVariable Long id) {
		CardDetails cardDetails = cardDetailsService.getById(id);
		return cardDetails;
	}

	@PutMapping("/card-details/{id}")
	public CardDetails update(@PathVariable Long id, @RequestBody CardDetails cardDetails) {
		CardDetails post = cardDetailsService.getById(id);
		
		post.setId(cardDetails.getId());
//		post.setCategoryName(cardDetails.getCategoryName());
		cardDetailsService.save(post);
		    return post;
	}
	
	@DeleteMapping("/card-details/{id}")
	public CardDetails delete(@PathVariable Long id) {
		CardDetails cardDetails = cardDetailsService.getById(id);
		cardDetailsService.delete(cardDetails);
		return cardDetails;
	}

}
