package com.brijframework.school.bean.student;

import java.util.List;

import com.brijframework.school.bean.AbstractDTO;

public class StudentFamilyDTO extends AbstractDTO<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String name;
	
	private String occupation;
	
	private Double annualIncome;
	
	private Long studentDetailId;
	
	private List<StudentFamilyContactDTO> familyContacts;
	
	private List<StudentFamilyQualificationDTO> familyQualifications;

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

	public Long getStudentDetailId() {
		return studentDetailId;
	}

	public void setStudentDetailId(Long studentDetailId) {
		this.studentDetailId = studentDetailId;
	}

	public List<StudentFamilyContactDTO> getFamilyContacts() {
		return familyContacts;
	}

	public void setFamilyContacts(List<StudentFamilyContactDTO> familyContacts) {
		this.familyContacts = familyContacts;
	}

	public List<StudentFamilyQualificationDTO> getFamilyQualifications() {
		return familyQualifications;
	}

	public void setFamilyQualifications(List<StudentFamilyQualificationDTO> familyQualifications) {
		this.familyQualifications = familyQualifications;
	}
	
}
