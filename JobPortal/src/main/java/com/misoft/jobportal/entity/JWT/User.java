package com.misoft.jobportal.entity.JWT;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name="users")
public class User {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long user_id;
	
	@Column(name="first_name")
    private String firstName;
	
	@Column(name="last_name")
    private String lastName;
	
	@Column(name="email")
    private String email;
    
	@Column(name="phone")
    private int phone;
    
	@Column(name="password")
    private String password;
    
	@Column(name="user_type")
    private String userType;
	
	@Column(name="user_agreement")
    private String userAgreement;

	@CreationTimestamp
	@Column(name="signup_date")
	private LocalDateTime signupDate;

	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
	@JoinTable(name = "USER_ROLE",
			joinColumns = {
					@JoinColumn(name = "USER_ID")
			},
			inverseJoinColumns = {
					@JoinColumn(name = "ROLE_ID")
			}
	)
	private Set<Role> role;

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getUserAgreement() {
		return userAgreement;
	}

	public void setUserAgreement(String userAgreement) {
		this.userAgreement = userAgreement;
	}

	public LocalDateTime getSignupDate() {
		return signupDate;
	}

	public void setSignupDate(LocalDateTime signupDate) {
		this.signupDate = signupDate;
	}

	public Set<Role> getRole() {
		return role;
	}

	public void setRole(Set<Role> role) {
		this.role = role;
	}
}
