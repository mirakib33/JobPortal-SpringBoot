package com.misoft.jobportal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mobile_banking")
public class MobileBanking {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="m_bank_id")
	private long id;
	
	@Column(name="type")
    private String type;
	
	@Column(name="account_name")
    private String accountName;
	
	@Column(name="account_number")
    private int accountNumber;
	
	@Column(name="user_id")
    private long userId;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	
}
