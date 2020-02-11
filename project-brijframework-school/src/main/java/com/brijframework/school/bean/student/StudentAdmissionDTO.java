package com.brijframework.school.bean.student;

import javax.validation.constraints.NotNull;

import com.brijframework.school.bean.AbstractDTO;

public class StudentAdmissionDTO extends AbstractDTO<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String admissionDate;

	private int sNo;

	private String regNo;

	private String writtenOrIntervieDate;

	private String status;
	
	@NotNull
	private Long schoolId;

	public Long getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(Long schoolId) {
		this.schoolId = schoolId;
	}

	public String getAdmissionDate() {
		return admissionDate;
	}

	public void setAdmissionDate(String admissionDate) {
		this.admissionDate = admissionDate;
	}

	public int getsNo() {
		return sNo;
	}

	public void setsNo(int sNo) {
		this.sNo = sNo;
	}

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public String getWrittenOrIntervieDate() {
		return writtenOrIntervieDate;
	}

	public void setWrittenOrIntervieDate(String writtenOrIntervieDate) {
		this.writtenOrIntervieDate = writtenOrIntervieDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
