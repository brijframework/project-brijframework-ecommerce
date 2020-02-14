package com.brijframework.school.domain.student;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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

	@Column(name = "OCCUPATION")
	private String occupation;

	@Column(name = "ANNUAL_INCOME")
	private Double annualIncome;

	@ManyToOne
	@JoinColumn(name = "STUDENT_PROFILE_ID")
	private StudentProfile studentProfile;

	@OneToMany(mappedBy = "studentFamily")
	private List<StudentFamilyContact> familyContacts;

	@OneToMany(mappedBy = "studentFamily")
	private List<StudentFamilyQualification> familyQualifications;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public Double getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(Double annualIncome) {
		this.annualIncome = annualIncome;
	}

	public StudentProfile getStudentProfile() {
		return studentProfile;
	}

	public void setStudentProfile(StudentProfile studentProfile) {
		this.studentProfile = studentProfile;
	}

	public List<StudentFamilyContact> getFamilyContacts() {
		return familyContacts;
	}

	public void setFamilyContacts(List<StudentFamilyContact> familyContacts) {
		this.familyContacts = familyContacts;
	}

	public List<StudentFamilyQualification> getFamilyQualifications() {
		return familyQualifications;
	}

	public void setFamilyQualifications(List<StudentFamilyQualification> familyQualifications) {
		this.familyQualifications = familyQualifications;
	}
}
