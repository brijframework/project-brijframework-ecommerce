package com.brijframework.school.domain.student;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import com.brijframework.school.domain.EntityObject;
import com.brijframework.school.domain.account.Receipt;
import com.brijframework.school.domain.comman.AdmissionStatus;
import com.brijframework.school.domain.setting.SchoolDetail;

@SuppressWarnings("serial")
@Entity
@Table(name = "STUDENT_ADMISSION")
public class StudentAdmission extends EntityObject<Long> {

	@Column(name = "ADMISSION_DATE")
	@CreationTimestamp
	private Date admissionDate;

	@Column(name = "S_NO")
	private int sNo;

	@Column(name = "REG_NO")
	private String regNo;

	@Column(name = "WRITTEN_OR_INTERVIEW_DATE")
	private Date writtenOrIntervieDate;

	@ManyToOne
	@JoinColumn(name = "SCHOOL_DETAIL_ID", nullable = false)
	private SchoolDetail schoolDetail;

	@OneToOne
	@JoinColumn(name = "STUDENT_DETAIL_ID")
	private StudentDetail studentDetail;

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

	public StudentDetail getStudentDetail() {
		return studentDetail;
	}

	public void setStudentDetail(StudentDetail studentDetail) {
		this.studentDetail = studentDetail;
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
