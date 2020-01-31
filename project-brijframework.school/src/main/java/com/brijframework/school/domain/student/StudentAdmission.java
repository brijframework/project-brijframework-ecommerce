package com.brijframework.school.domain.student;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.brijframework.school.domain.EntityObject;
import com.brijframework.school.domain.account.Receipt;
import com.brijframework.school.domain.comman.ImageDetail;
import com.brijframework.school.domain.setting.ClassDetail;
import com.brijframework.school.domain.setting.SchoolDetail;

@SuppressWarnings("serial")
@Entity
@Table(name = "STUDENT_ADMISSION")
public class StudentAdmission extends EntityObject<Long> {
	
	@Column(name = "admission_no")
	private String admissionNo;
	
	@Column(name = "admission_date")
	private Date admissionDate;
	
	@Column(name = "s_no")
	private int sNo;
	
	@Column(name = "reg_no")
	private String regNo;

	@Column(name = "IMAGE_DETAIL_ID")
	private ImageDetail imageDetail;
	
	@Column(name = "written_or_interview_date")
	private Date writtenOrIntervieDate;
	
	@Column(name="SCHOOL_DETAIL_ID")
	private SchoolDetail schoolDetail;
	
	@Column(name="STATUS")
	private String status;
	
	@OneToOne
	@JoinColumn(name = "FEE_RECEIPT_NO")
	private Receipt feeReceipt;
	
	@ManyToOne
	@JoinColumn(name = "CLASS_DETAIL_ID")
	private ClassDetail classDetail;
	
}
