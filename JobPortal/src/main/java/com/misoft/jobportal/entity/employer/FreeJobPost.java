package com.misoft.jobportal.entity.employer;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="freelance_job_post")
public class FreeJobPost {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="free_jobpost_id")
    private Long id;

    @Column(name="job_category")
    private String jobCategory;

    @Column(name="job_title")
    private String jobTitle;

    @Column(name="company_name")
    private String companyName;

    @Column(name="job_type")
    private String jobType;

    @Column(name="experience_level")
    private String experienceLevel;

    @Column(name="project_length")
    private String projectLength;

    @Column(name="workplace")
    private String workplace;

    @Column(name="price")
    private double price;

    @Column(name="deadline")
    private LocalDateTime deadline;

    @Column(name="required_skills")
    private String requiredSkills;

    @Column(name="description")
    private String description;

    @CreationTimestamp
    @Column(name="jobpost_date")
    private LocalDateTime jobPostDate;

    @Column(name="user_id")
    private Long userId;

    @Column(name="cat_id")
    private Long catId;

//    @ManyToMany(mappedBy = "freeJobPosts")
//    private Set<FreeJobCv> freeJobCvs = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getJobCategory() {
        return jobCategory;
    }

    public void setJobCategory(String jobCategory) {
        this.jobCategory = jobCategory;
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

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public String getExperienceLevel() {
        return experienceLevel;
    }

    public void setExperienceLevel(String experienceLevel) {
        this.experienceLevel = experienceLevel;
    }

    public String getProjectLength() {
        return projectLength;
    }

    public void setProjectLength(String projectLength) {
        this.projectLength = projectLength;
    }

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
    }

    public String getRequiredSkills() {
        return requiredSkills;
    }

    public void setRequiredSkills(String requiredSkills) {
        this.requiredSkills = requiredSkills;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getJobPostDate() {
        return jobPostDate;
    }

    public void setJobPostDate(LocalDateTime jobPostDate) {
        this.jobPostDate = jobPostDate;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getCatId() {
        return catId;
    }

    public void setCatId(Long catId) {
        this.catId = catId;
    }

//    public Set<FreeJobCv> getFreeJobCvs() {
//        return freeJobCvs;
//    }
//
//    public void setFreeJobCvs(Set<FreeJobCv> freeJobCvs) {
//        this.freeJobCvs = freeJobCvs;
//    }

}
