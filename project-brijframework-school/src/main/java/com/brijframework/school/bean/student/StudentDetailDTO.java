package com.brijframework.school.bean.student;

import com.brijframework.school.bean.AbstractDTO;
import com.brijframework.school.bean.location.AddressDTO;

public class StudentDetailDTO extends AbstractDTO<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String firstName;

	private String middleName;

	private String lastName;

	private String dateOfBirth;

	private String gender;

	private String motherTounge;

	private String physicallyChallenged;

	private String nationality;

	private StudentRegistrationDTO student;

	private AddressDTO address;

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

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
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

	public StudentRegistrationDTO getStudent() {
		return student;
	}

	public void setStudent(StudentRegistrationDTO student) {
		this.student = student;
	}

	public AddressDTO getAddress() {
		return address;
	}

	public void setAddress(AddressDTO address) {
		this.address = address;
	}

}
