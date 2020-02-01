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
@Table(name = "TRANSFER_CERTIFICATE")
public class TransferCertificate extends EntityObject<Integer> {

	@OneToOne
	@JoinColumn(name = "SESSION_DETAIL_ID")
	private SessionDetail sessionDetail;
	
	@OneToOne
	@JoinColumn(name = "CLASS_DETAIL_ID")
	private ClassDetail classDetail;
	
	@OneToOne
	@JoinColumn(name = "SECTION_DETAIL_ID")
	private SectionDetail sectionDetail;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "STUDENT_DETAIL_ID")
	private Student student;
	
	@Column(name = "RECEIPT_BY")
	private String receiptBy;
	
	@Column(name = "EMI_RATES")
	private String emirates;
	
	@Column(name = "SCHOOL_NAME")
	private String schoolName;
	
	@Column(name = "RESIDENCE_NO")
	private String recidenceNo;
	
	@Column(name = "MOBILE_NO")
	private String mobileNo;

}
