package com.brijframework.school.domain.student;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.brijframework.school.domain.EntityObject;
import com.brijframework.school.domain.account.Receipt;

@SuppressWarnings("serial")
@Entity
@Table(name = "STUDENT_ADMISSION")
public class StudentAdmission extends EntityObject<Long> {
	
	@Column(name = "ADMISSION_NO")
	private String admissionNo;
	
	@Column(name = "ADMISSION_DATE")
	private Date admissionDate;
	
	@Column(name = "S_NO")
	private int sNo;
	
	@Column(name = "REG_NO")
	private String regNo;
	
	@Column(name = "WRITTEN_OR_INTERVIEW_DATE")
	private Date writtenOrIntervieDate;
	
	@OneToOne
	@JoinColumn(name = "STUDENT_DETAIL_ID")
	private StudentDetail studentDetail;
	
	@Column(name="STATUS")
	private String status;
	
	@OneToOne
	@JoinColumn(name = "FEE_RECEIPT_NO")
	private Receipt feeReceipt;
	
	
}
