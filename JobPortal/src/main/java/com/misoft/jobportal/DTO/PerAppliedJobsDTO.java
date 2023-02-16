package com.misoft.jobportal.DTO;

import javax.persistence.Column;

public class PerAppliedJobsDTO {


    private Long per_jobpost_id;
    private String jobTitle;
    private String companyName;
    private String jobCategory;
    private boolean status;
    private String applyDate;

    private Long perjob_cv_id;

    public Long getPer_jobpost_id() {
        return per_jobpost_id;
    }

    public void setPer_jobpost_id(Long per_jobpost_id) {
        this.per_jobpost_id = per_jobpost_id;
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

    public String getJobCategory() {
        return jobCategory;
    }

    public void setJobCategory(String jobCategory) {
        this.jobCategory = jobCategory;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(String applyDate) {
        this.applyDate = applyDate;
    }

    public Long getPerjob_cv_id() {
        return perjob_cv_id;
    }

    public void setPerjob_cv_id(Long perjob_cv_id) {
        this.perjob_cv_id = perjob_cv_id;
    }

    //    public PerAppliedJobsDTO(Long per_jobpost_id, String jobTitle, String companyName, String jobCategory, boolean status, String applyDate) {
//        this.per_jobpost_id = per_jobpost_id;
//        this.jobTitle = jobTitle;
//        this.companyName = companyName;
//        this.jobCategory = jobCategory;
//        this.status = status;
//        this.applyDate = applyDate;
//    }
//
//    public PerAppliedJobsDTO() {
//    }
}
