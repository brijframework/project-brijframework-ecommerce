package com.brijframework.useraccount.entities.account;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.brijframework.useraccount.entities.EntityObject;
import com.brijframework.useraccount.entities.global.EOCollegeDetail;
import com.brijframework.useraccount.entities.global.EOEducationDetail;

@Entity
@Table(name = "USER_EDUCATION")
public class EOUserEducation extends EntityObject<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@OneToOne
	@JoinColumn(name = "EDUCATION_DETAIL_ID")
	private EOEducationDetail educationDetail;

	@OneToOne
	@JoinColumn(name = "COLLEGE_DETAIL_ID")
	private EOCollegeDetail collegeDetail;

	@ManyToOne
	@JoinColumn(name = "USER_PROFILE_ID")
	private EOUserProfile userProfile;

	public EOCollegeDetail getCollegeDetail() {
		return collegeDetail;
	}

	public void setCollegeDetail(EOCollegeDetail collegeDetail) {
		this.collegeDetail = collegeDetail;
	}

	public EOEducationDetail getEducationDetail() {
		return educationDetail;
	}

	public void setEducationDetail(EOEducationDetail educationDetail) {
		this.educationDetail = educationDetail;
	}

	public EOUserProfile getUserProfile() {
		return userProfile;
	}

	public void setUserProfile(EOUserProfile userProfile) {
		this.userProfile = userProfile;
	}

}
