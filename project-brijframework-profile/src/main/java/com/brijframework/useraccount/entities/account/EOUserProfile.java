package com.brijframework.useraccount.entities.account;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.brijframework.useraccount.entities.EntityObject;
import com.brijframework.useraccount.entities.global.EODocumentDetail;
import com.brijframework.useraccount.entities.global.EOGenderDetail;

@Entity
@Table(name = "USER_PROFILE")
public class EOUserProfile extends EntityObject<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "TITLE")
	private String title;

	@Column(name = "FIRST_NAME")
	private String firstName;

	@Column(name = "MIDDLE_NAME")
	private String middleName;

	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "PREFERRED_NAME")
	private String preferredName;
	
	@Column(name = "DATE_OF_BIRTH")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateOfBirth;

	@JoinColumn(name = "PICTURE_DETAIL_ID")
	@OneToOne
	private EODocumentDetail pictureDetail;

	@JoinColumn(name = "USER_GENDER_ID")
	@OneToOne
	private EOGenderDetail gender;

	@JoinColumn(name = "USER_RELIGION_ID")
	@OneToOne
	private EOUserReligion religion;

	@OneToOne
	@JoinColumn(name = "USER_ACCOUNT_ID")
	private EOUserAccount userAccount;

	@OneToMany(mappedBy = "userProfile")
	private List<EOUserImgDetail> pictureDetails;
	
	@OneToMany(mappedBy = "userProfile")
	private List<EOUserAddress> addressDetails;
	
	@OneToMany(mappedBy = "userProfile")
	private List<EOUserEducation> educationDetails;
	
	@OneToMany(mappedBy = "userProfile")
	private List<EOUserDocument> documentDetails;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public String getPreferredName() {
		return preferredName;
	}

	public void setPreferredName(String preferredName) {
		this.preferredName = preferredName;
	}

	public EOUserAccount getUserAccount() {
		return userAccount;
	}

	public void setUserAccount(EOUserAccount userAccount) {
		this.userAccount = userAccount;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public EODocumentDetail getPictureDetail() {
		return pictureDetail;
	}

	public void setPictureDetail(EODocumentDetail pictureDetail) {
		this.pictureDetail = pictureDetail;
	}

	public EOGenderDetail getGender() {
		return gender;
	}

	public void setGender(EOGenderDetail gender) {
		this.gender = gender;
	}

	public EOUserReligion getReligion() {
		return religion;
	}

	public void setReligion(EOUserReligion religion) {
		this.religion = religion;
	}

	public List<EOUserImgDetail> getPictureDetails() {
		return pictureDetails;
	}

	public void setPictureDetails(List<EOUserImgDetail> pictureDetails) {
		this.pictureDetails = pictureDetails;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public List<EOUserAddress> getAddressDetails() {
		return addressDetails;
	}

	public void setAddressDetails(List<EOUserAddress> addressDetails) {
		this.addressDetails = addressDetails;
	}

	public List<EOUserEducation> getEducationDetails() {
		return educationDetails;
	}

	public void setEducationDetails(List<EOUserEducation> educationDetails) {
		this.educationDetails = educationDetails;
	}

	public List<EOUserDocument> getDocumentDetails() {
		return documentDetails;
	}

	public void setDocumentDetails(List<EOUserDocument> documentDetails) {
		this.documentDetails = documentDetails;
	}
	
}
