package com.misoft.jobportal.entity.employer;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="permanent_job_post")
public class PerJobPost {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long per_jobpost_id;
	
	@Column(name="picture")
    private String picture;
	
	@Column(name="deadline")
    private String deadline;
	
	@Column(name="job_title")
    private String jobTitle;
	
	@Column(name="company_name")
    private String companyName;
	
	@Column(name="vacancy_number")
    private int vacancyNumber;
	
	@Column(name="employment_status")
    private String employmentStatus;
	
	@Column(name="location")
    private String location;
	
	@Column(name="workplace")
    private String workplace;
	
	@Column(name="gender")
    private String gender;
	
	@Column(name="age")
    private int age;
	
	@Column(name="job_context")
    private String jobContext;
	
	@Column(name="duties")
    private String duties;
	
	@Column(name="education")
    private String education;
	
	@Column(name="experience")
    private String experience;
	
	@Column(name="additional_requirements")
    private String additionalRequirements;
	
	@Column(name="other_benifits")
    private String otherBenifits;
	
	@Column(name="salary")
    private double salary;
	
	@Column(name="job_category")
    private String jobCategory;
	
	@CreationTimestamp
	@Column(name="jobpost_date")
	private LocalDateTime jobPostDate;
	
	@Column(name="user_id")
	private Long userId;
	
	@Column(name="cat_id")
	private Long catId;

//	@ManyToMany(mappedBy = "perJobPosts")
//	private Set<PerJobCv> perJobCvs = new HashSet<>();
	

	public Long getCatId() {
		return catId;
	}

	public void setCatId(Long catId) {
		this.catId = catId;
	}

	public Long getPer_jobpost_id() {
		return per_jobpost_id;
	}

	public void setPer_jobpost_id(Long per_jobpost_id) {
		this.per_jobpost_id = per_jobpost_id;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getDeadline() {
		return deadline;
	}

	public void setDeadline(String deadline) {
		this.deadline = deadline;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getVacancyNumber() {
		return vacancyNumber;
	}

	public void setVacancyNumber(int vacancyNumber) {
		this.vacancyNumber = vacancyNumber;
	}

	public String getEmploymentStatus() {
		return employmentStatus;
	}

	public void setEmploymentStatus(String employmentStatus) {
		this.employmentStatus = employmentStatus;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getWorkplace() {
		return workplace;
	}

	public void setWorkplace(String workplace) {
		this.workplace = workplace;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJobContext() {
		return jobContext;
	}

	public void setJobContext(String jobContext) {
		this.jobContext = jobContext;
	}

	public String getDuties() {
		return duties;
	}

	public void setDuties(String duties) {
		this.duties = duties;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getAdditionalRequirements() {
		return additionalRequirements;
	}

	public void setAdditionalRequirements(String additionalRequirements) {
		this.additionalRequirements = additionalRequirements;
	}

	public String getOtherBenifits() {
		return otherBenifits;
	}

	public void setOtherBenifits(String otherBenifits) {
		this.otherBenifits = otherBenifits;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getJobCategory() {
		return jobCategory;
	}

	public void setJobCategory(String jobCategory) {
		this.jobCategory = jobCategory;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public LocalDateTime getJobPostDate() {
		return jobPostDate;
	}

	public void setJobPostDate(LocalDateTime jobPostDate) {
		this.jobPostDate = jobPostDate;
	}
	
	
	
}
