package com.brijframework.school.domain.student;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.brijframework.school.domain.EntityObject;
import com.brijframework.school.domain.comman.DocumentDetail;
import com.brijframework.school.domain.comman.Religion;
import com.brijframework.school.domain.location.Address;

@Entity
@Table(name = "STUDENT_PROFILE")
public class StudentProfile extends EntityObject<Long> {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "FIRST_NAME")
	private String firstName;

	@Column(name = "MIDDLE_NAME")
	private String middleName;

	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "DATE_OF_BIRTH")
	private Date dateOfBirth;

	@Column(name = "GENDER")
	private String gender;

	@Column(name = "MOTHER_TOUNGE")
	private String motherTounge;

	@Column(name = "PHYSICALLY_CHALLENGED")
	private String physicallyChallenged;

	@Column(name = "NATIONALITY")
	private String nationality;
	
	@Column(name = "IMAGE_DETAIL_ID")
	private DocumentDetail imageDetail;

	@ManyToOne
	@JoinColumn(name = "RELIGION_ID")
	private Religion religion;

	@OneToOne
	@JoinColumn(name = "ADDRESS_ID")
	private Address address;
	
	@OneToOne(mappedBy = "studentProfile")
	private StudentAdmission studentAdmission;

	@OneToOne(mappedBy = "studentProfile")
	private StudentRegistration studentRegistration;

	@OneToMany(mappedBy = "studentProfile")
	private List<StudentContact> studentContacts;
	
	@OneToMany(mappedBy = "studentProfile")
	private List<StudentFamily> studentFamilies;

	@OneToMany(mappedBy = "studentProfile")
	private List<StudentDocument> studentDocuments;


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMotherTounge() {
		return motherTounge;
	}

	public void setMotherTounge(String motherTounge) {
		this.motherTounge = motherTounge;
	}

	public String getPhysicallyChallenged() {
		return physicallyChallenged;
	}

	public void setPhysicallyChallenged(String physicallyChallenged) {
		this.physicallyChallenged = physicallyChallenged;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public DocumentDetail getImageDetail() {
		return imageDetail;
	}

	public void setImageDetail(DocumentDetail imageDetail) {
		this.imageDetail = imageDetail;
	}

	public Religion getReligion() {
		return religion;
	}

	public void setReligion(Religion religion) {
		this.religion = religion;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public StudentAdmission getStudentAdmission() {
		return studentAdmission;
	}

	public void setStudentAdmission(StudentAdmission studentAdmission) {
		this.studentAdmission = studentAdmission;
	}

	public StudentRegistration getStudentRegistration() {
		return studentRegistration;
	}

	public void setStudentRegistration(StudentRegistration studentRegistration) {
		this.studentRegistration = studentRegistration;
	}

	public List<StudentContact> getStudentContacts() {
		return studentContacts;
	}

	public void setStudentContacts(List<StudentContact> studentContacts) {
		this.studentContacts = studentContacts;
	}

	public List<StudentFamily> getStudentFamilies() {
		return studentFamilies;
	}

	public void setStudentFamilies(List<StudentFamily> studentFamilies) {
		this.studentFamilies = studentFamilies;
	}
	
}
