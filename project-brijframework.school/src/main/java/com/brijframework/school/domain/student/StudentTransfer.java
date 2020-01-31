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
@Table(name = "student_transfer")
public class StudentTransfer extends EntityObject<Integer> {
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "student_id")
	private Student student;
	
	@Column(name = "date_of_withdraw")
	private Date dateOfWithdraw;
	
	@Column(name = "in_word_dob")
	private String inWordDob;
	
	@Column(name = "religion_caste")
	private String religionCaste;
	
	@Column(name = "new_class")
	private String newClassName;
	
	@Column(name = "newclass_inword")
	private String newClassInWord;
	
	@Column(name = "conduct")
	private String conduct;
	
	@Column(name = "result")
	private String result;

	@Column(name = "class_in_word")
	private String classInWord;

}
