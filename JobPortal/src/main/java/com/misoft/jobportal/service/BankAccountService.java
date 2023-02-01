package com.misoft.jobportal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.misoft.jobportal.entity.BankAccount;
import com.misoft.jobportal.entity.admin.JobCategory;
import com.misoft.jobportal.repository.BankAccountRepository;
import com.misoft.jobportal.repository.admin.JobCategoryRepository;

@Service
public class BankAccountService {
	
	@Autowired
	private BankAccountRepository bankAccountRepository;

	public void save(BankAccount bankAccount) {
		bankAccountRepository.save(bankAccount);
	}
	
	public List<BankAccount> get() {
		return bankAccountRepository.findAll();
	}

	public BankAccount getById(Long id) {
		Optional<BankAccount> data = bankAccountRepository.findById(id);
		BankAccount bankAccount = null;
		if (data.isPresent()) {
			bankAccount = data.get();
		} 
		return bankAccount;
	}

	public void delete(BankAccount bankAccount) {
		bankAccountRepository.delete(bankAccount);
	}
	

}
