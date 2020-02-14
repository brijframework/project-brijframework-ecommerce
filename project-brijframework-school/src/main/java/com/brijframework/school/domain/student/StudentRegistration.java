package com.brijframework.school.domain.student;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.brijframework.school.domain.EntityObject;
import com.brijframework.school.domain.setting.SchoolDetail;

@SuppressWarnings("serial")
@Entity
@Table(name = "STUDENT_REGISTRATION")
@SequenceGenerator(name = "REGISTRATION_SQN", sequenceName = "REGISTRATION_SQN", initialValue=1, allocationSize=100)
public class StudentRegistration extends EntityObject<Long> {

	@Column(name = "REGISTRATION_NO", unique = true)
	@GeneratedValue(generator = "REGISTRATION_SQN", strategy = GenerationType.SEQUENCE)
	private Long registrationNo;

	@ManyToOne
	@JoinColumn(name = "SCHOOL_DETAIL_ID", nullable = false)
	private SchoolDetail schoolDetail;

	@OneToOne
	@JoinColumn(name = "STUDENT_PROFILE_ID")
	private StudentProfile studentProfile;

	public SchoolDetail getSchoolDetail() {
		return schoolDetail;
	}

	public void setSchoolDetail(SchoolDetail schoolDetail) {
		this.schoolDetail = schoolDetail;
	}

	public Long getRegistrationNo() {
		return registrationNo;
	}

	public void setRegistrationNo(Long registrationNo) {
		this.registrationNo = registrationNo;
	}

	public StudentProfile getStudentProfile() {
		return studentProfile;
	}

	public void setStudentProfile(StudentProfile studentProfile) {
		this.studentProfile = studentProfile;
	}

}
