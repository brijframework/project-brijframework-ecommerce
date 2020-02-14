package com.brijframework.school.domain.student;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import com.brijframework.school.domain.EntityObject;
import com.brijframework.school.domain.account.Receipt;
import com.brijframework.school.domain.comman.AdmissionStatus;
import com.brijframework.school.domain.setting.SchoolDetail;

@SuppressWarnings("serial")
@Entity
@Table(name = "STUDENT_ADMISSION")
@SequenceGenerator(name = "ADMISSION_SQN", sequenceName = "ADMISSION_SQN", initialValue = 1000)
public class StudentAdmission extends EntityObject<Long> {

	@Column(name = "ADMISSION_NO")
	@GeneratedValue(generator = "ADMISSION_SQN" , strategy = GenerationType.SEQUENCE)
	private Long admissionNo;
	
	@Column(name = "ADMISSION_DATE")
	@CreationTimestamp
	private Date admissionDate;

	@Column(name = "WRITTEN_OR_INTERVIEW_DATE")
	private Date writtenOrIntervieDate;

	@ManyToOne
	@JoinColumn(name = "SCHOOL_DETAIL_ID", nullable = false)
	private SchoolDetail schoolDetail;

	@OneToOne
	@JoinColumn(name = "STUDENT_PROFILE_ID")
	private StudentProfile studentProfile;

	@OneToOne
	@JoinColumn(name = "ADMISSION_STATUS_ID")
	private AdmissionStatus admissionStatus;

	@OneToOne
	@JoinColumn(name = "FEE_RECEIPT_NO")
	private Receipt feeReceipt;

	public Date getAdmissionDate() {
		return admissionDate;
	}

	public void setAdmissionDate(Date admissionDate) {
		this.admissionDate = admissionDate;
	}

	public Long getAdmissionNo() {
		return admissionNo;
	}

	public void setAdmissionNo(Long admissionNo) {
		this.admissionNo = admissionNo;
	}

	public Date getWrittenOrIntervieDate() {
		return writtenOrIntervieDate;
	}

	public void setWrittenOrIntervieDate(Date writtenOrIntervieDate) {
		this.writtenOrIntervieDate = writtenOrIntervieDate;
	}

	public SchoolDetail getSchoolDetail() {
		return schoolDetail;
	}

	public void setSchoolDetail(SchoolDetail schoolDetail) {
		this.schoolDetail = schoolDetail;
	}

	public StudentProfile getStudentProfile() {
		return studentProfile;
	}

	public void setStudentProfile(StudentProfile studentProfile) {
		this.studentProfile = studentProfile;
	}

	public AdmissionStatus getAdmissionStatus() {
		return admissionStatus;
	}

	public void setAdmissionStatus(AdmissionStatus admissionStatus) {
		this.admissionStatus = admissionStatus;
	}

	public Receipt getFeeReceipt() {
		return feeReceipt;
	}

	public void setFeeReceipt(Receipt feeReceipt) {
		this.feeReceipt = feeReceipt;
	}

}
