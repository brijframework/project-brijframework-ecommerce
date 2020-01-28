package com.brijframework.school.domain.student;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.brijframework.school.domain.EntityObject;
import com.brijframework.school.domain.account.Receipt;
import com.brijframework.school.domain.setting.Section;

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

	@Column(name = "image_name")
	private String imageName;
	
	@Column(name = "written_or_interview_date")
	private Date writtenOrIntervieDate;
	
	@Column(name = "admit_in_class")
	private String admitInClass;
	
	@Column(name = "principal_or_director_name")
	private String principalOrDirectorName;
	
	@Column(name = "fee_receipt_date")
	private Date feeReceiptDate;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "section_id")
	private Section section;
	
	@Column(name="school_phone")
	private String school;
	
	@Column(name="transfer_status")
	private String transferStatus;
	
	@OneToOne
	@JoinColumn(name = "fee_receipt_no")
	private Receipt receipt;
	
	@ManyToOne
	@JoinColumn(name = "class_id")
	private StudentClass classes;
	
}
