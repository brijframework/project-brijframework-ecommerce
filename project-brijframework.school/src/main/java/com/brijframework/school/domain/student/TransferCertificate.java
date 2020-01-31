package com.brijframework.school.domain.student;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.brijframework.school.domain.EntityObject;
import com.brijframework.school.domain.setting.ClassDetail;
import com.brijframework.school.domain.setting.SectionDetail;
import com.brijframework.school.domain.setting.SessionDetail;

@SuppressWarnings("serial")
@Entity
@Table(name = "transfer_certificate")
public class TransferCertificate extends EntityObject<Integer> {

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "session_id")
	private SessionDetail sessionDetail;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "class_id")
	private ClassDetail classDetail;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "section_id")
	private SectionDetail sectionDetail;
	
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

}
