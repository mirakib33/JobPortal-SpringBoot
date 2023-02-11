package com.misoft.jobportal.entity.employer;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="per_job_cv")
public class PerJobCv {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="perjob_cv_id")
    private Long id;
	
	@Column(name="user_id")
    private Long userId;
	
	@Column(name="per_jobpost_id")
    private Long jobId;
	
	@Column(name="status")
    private boolean status;
	
	@CreationTimestamp
	@Column(name="apply_date")
	private LocalDateTime applyDate;

//	@ManyToMany
//	@JoinTable(name="cv_perjob", joinColumns = @JoinColumn(name="perjob_cv_id"),
//	inverseJoinColumns = @JoinColumn(name="per_jobpost_id"))
//	private Set<PerJobPost> perJobPosts = new HashSet<>();



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getJobId() {
		return jobId;
	}

	public void setJobId(Long jobId) {
		this.jobId = jobId;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public LocalDateTime getApplyDate() {
		return applyDate;
	}

	public void setApplyDate(LocalDateTime applyDate) {
		this.applyDate = applyDate;
	}

//	public Set<PerJobPost> getPerJobPosts() {
//		return perJobPosts;
//	}
//
//	public void setPerJobPosts(Set<PerJobPost> perJobPosts) {
//		this.perJobPosts = perJobPosts;
//	}
}
