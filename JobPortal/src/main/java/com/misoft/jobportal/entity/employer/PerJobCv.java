package com.misoft.jobportal.entity.employer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
	
	
}
