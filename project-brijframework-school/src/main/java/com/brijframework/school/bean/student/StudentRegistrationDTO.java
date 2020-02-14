package com.brijframework.school.bean.student;

import com.brijframework.school.bean.AbstractDTO;

public class StudentRegistrationDTO extends AbstractDTO<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long registrationNo;
	private Long schoolDetailId;
	private StudentProfileDTO studentProfile;

	public Long getRegistrationNo() {
		return registrationNo;
	}

	public void setRegistrationNo(Long registrationNo) {
		this.registrationNo = registrationNo;
	}

	public Long getSchoolDetailId() {
		return schoolDetailId;
	}

	public void setSchoolDetailId(Long schoolDetailId) {
		this.schoolDetailId = schoolDetailId;
	}

	public StudentProfileDTO getStudentProfile() {
		return studentProfile;
	}

	public void setStudentProfile(StudentProfileDTO studentProfile) {
		this.studentProfile = studentProfile;
	}

}
