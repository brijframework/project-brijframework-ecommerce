package com.brijframework.school.domain.student;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.brijframework.school.domain.EntityObject;

@Entity
@Table(name = "STUDENT_FAMILY")
public class StudentFamily extends EntityObject<Long> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "NAME")
	private String name;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "MOBILE")
	private String mobile;
	
	@Column(name = "EDUCATION")
	private String education;
	
	@Column(name = "OCCUPATION")
	private String occupation;
	
	@Column(name = "ANNUAL_INCOME")
	private String annualIncome;
	
	@ManyToOne
	@JoinColumn(name = "STUDENT_DETAIL_ID")
	private StudentDetail studentDetail;

}
