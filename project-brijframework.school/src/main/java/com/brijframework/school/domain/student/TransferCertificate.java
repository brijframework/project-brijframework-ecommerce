package com.brijframework.school.domain.student;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.brijframework.school.domain.EntityObject;
import com.brijframework.school.domain.setting.SchoolSection;
import com.brijframework.school.domain.setting.SchoolSession;

@SuppressWarnings("serial")
@Entity
@Table(name = "transfer_certificate")
public class TransferCertificate extends EntityObject<Integer> {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "tc_id")
	private Integer tcId;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "session_id")
	private SchoolSession session;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "class_id")
	private StudentClass studentClasses;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "section_id")
	private SchoolSection section;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "student_id")
	private Student students;
	
	@Column(name = "receipt_by")
	private String receiptBy;
	
	@Column(name = "emirates")
	private String emirates;
	
	@Column(name = "school_name")
	private String schoolName;
	
	@Column(name = "residence_no")
	private String recidenceNo;
	
	@Column(name = "mobile_no")
	private String mobileNo;

	public Integer getTcId() {
		return tcId;
	}

	public void setTcId(Integer tcId) {
		this.tcId = tcId;
	}

	public Student getStudents() {
		return students;
	}

	public void setStudents(Student students) {
		this.students = students;
	}

	public String getReceiptBy() {
		return receiptBy;
	}

	public void setReceiptBy(String receiptBy) {
		this.receiptBy = receiptBy;
	}

	public String getEmirates() {
		return emirates;
	}

	public void setEmirates(String emirates) {
		this.emirates = emirates;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getRecidenceNo() {
		return recidenceNo;
	}

	public void setRecidenceNo(String recidenceNo) {
		this.recidenceNo = recidenceNo;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public SchoolSession getSession() {
		return session;
	}

	public void setSession(SchoolSession session) {
		this.session = session;
	}

	public StudentClass getStudentClasses() {
		return studentClasses;
	}

	public void setStudentClasses(StudentClass studentClasses) {
		this.studentClasses = studentClasses;
	}

	public SchoolSection getSection() {
		return section;
	}

	public void setSection(SchoolSection section) {
		this.section = section;
	}


}
