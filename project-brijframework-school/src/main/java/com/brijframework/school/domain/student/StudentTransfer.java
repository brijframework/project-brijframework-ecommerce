package com.brijframework.school.domain.student;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.brijframework.school.domain.EntityObject;

@SuppressWarnings("serial")
@Entity
@Table(name = "STUDENT_TRANSFER")
public class StudentTransfer extends EntityObject<Integer> {
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "STUDENT_ID")
	private Student student;
	
	@Column(name = "DATE_OF_WITHDRAW")
	private Date dateOfWithdraw;
	
	@Column(name = "IN_WORD_DOB")
	private String inWordDob;
	
	@Column(name = "RELIGION_CASTE")
	private String religionCaste;
	
	@Column(name = "CONDUCT")
	private String conduct;
	
	@Column(name = "RESULT")
	private String result;

	@Column(name = "CLASS_IN_WORD")
	private String classInWord;

}
