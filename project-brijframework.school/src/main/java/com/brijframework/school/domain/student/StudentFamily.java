package com.brijframework.school.domain.student;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.brijframework.school.domain.EntityObject;
import com.brijframework.school.domain.UserLogin;

@Entity
@Table(name = "STUDENT_FAMILY")
public class StudentFamily extends EntityObject<Long> {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private UserLogin user;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "MOBILE")
	private String mobile;
	
	@Column(name = "education")
	private String education;
	
	@Column(name = "occupation")
	private String occupation;
	
	@Column(name = "annual_income")
	private String annualIncome;
	
	@ManyToOne
	@JoinColumn(name = "STUDENTDETAIL_ID")
	private StudentDetail studentDetail;

	public UserLogin getUser() {
		return user;
	}

	public void setUser(UserLogin user) {
		this.user = user;
	}

}
