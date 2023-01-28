package com.misoft.jobportal.entity.applicant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="academic_summary")
public class AcademicSummary {

		@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Long academic_id;
		
		@Column(name="degree")
	    private String degree;
		
		@Column(name="subject_group")
	    private String subjectGroup;
		
		@Column(name="institute_board")
	    private String instituteBoard;
		
		@Column(name="passing_year")
	    private String passingYear;
		
		@Column(name="result")
	    private double result;
		
		@Column(name="scale")
	    private String scale;
		
		@Column(name="user_id")
		private Long userId;

		public Long getAcademic_id() {
			return academic_id;
		}

		public void setAcademic_id(Long academic_id) {
			this.academic_id = academic_id;
		}

		public String getDegree() {
			return degree;
		}

		public void setDegree(String degree) {
			this.degree = degree;
		}

		public String getSubjectGroup() {
			return subjectGroup;
		}

		public void setSubjectGroup(String subjectGroup) {
			this.subjectGroup = subjectGroup;
		}

		public String getInstituteBoard() {
			return instituteBoard;
		}

		public void setInstituteBoard(String instituteBoard) {
			this.instituteBoard = instituteBoard;
		}

		public String getPassingYear() {
			return passingYear;
		}

		public void setPassingYear(String passingYear) {
			this.passingYear = passingYear;
		}

		public double getResult() {
			return result;
		}

		public void setResult(double result) {
			this.result = result;
		}

		public String getScale() {
			return scale;
		}

		public Long getUserId() {
			return userId;
		}

		public void setUserId(Long userId) {
			this.userId = userId;
		}

		public void setScale(String scale) {
			this.scale = scale;
		}

}
