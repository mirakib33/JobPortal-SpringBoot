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

import com.misoft.jobportal.entity.BankAccount;
import com.misoft.jobportal.service.BankAccountService;

@RestController
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
@RequestMapping("/payment-method")
public class BankAccountController {
	
	@Autowired
	private BankAccountService bankAccountService;

	@PostMapping("/bank-account")
	public BankAccount save(@RequestBody BankAccount bankAccount) {
		bankAccountService.save(bankAccount);
		return bankAccount;
	}
	
	@GetMapping("/bank-account")
	public List<BankAccount> get() {
		return bankAccountService.get();
	}

	@GetMapping("/bank-account/{id}")
	public BankAccount getById(@PathVariable Long id) {
		BankAccount bankAccount = bankAccountService.getById(id);
		return bankAccount;
	}

	@PutMapping("/bank-account/{id}")
	public BankAccount update(@PathVariable Long id, @RequestBody BankAccount bankAccount) {
		BankAccount post = bankAccountService.getById(id);
		
		post.setId(bankAccount.getId());
//		post.setCategoryName(bankAccount.getCategoryName());
		bankAccountService.save(post);
		    return post;
	}
	
	@DeleteMapping("/bank-account/{id}")
	public BankAccount delete(@PathVariable Long id) {
		BankAccount bankAccount = bankAccountService.getById(id);
		bankAccountService.delete(bankAccount);
		return bankAccount;
	}

}
