package com.brijframework.school.domain.student;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.brijframework.school.domain.EntityObject;
import com.brijframework.school.domain.UserLogin;
import com.brijframework.school.domain.account.StudentFeeSubmissionDetails;
import com.brijframework.school.domain.comman.ImageDetail;
import com.brijframework.school.domain.setting.School;
import com.brijframework.school.domain.setting.Section;
import com.brijframework.school.domain.setting.Session;

@SuppressWarnings("serial")
@Entity
@Table(name = "STUDENT")
public class Student extends EntityObject<Integer> {
	
	@Column(name = "roll_no")
	private Long rollNo;

	@Column(name="sr_no")
	private String srno;
	
	@Column(name = "lf_no")
	private Long lfNo;
	
	@ManyToOne
	@JoinColumn(name = "SCHOOL_ID")
	private School school;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SESSION_ID")
	private Session session;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SECTION_ID")
	private Section section;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	@JoinColumn(name = "CLASS_ID")
	private StudentClass studentClass;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CATEGORY_ID")
	private StudentCategory category;
	
	@JoinColumn(name = "PHOTO_ID")
	@OneToOne
	private ImageDetail imageDetail;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "students")
	private List<StudentAttendance> studentAttendances;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private UserLogin userLogin;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="admitclass_id")
	private StudentClass admitClassId;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "students")
	private List<StudentFeeSubmissionDetails> studentFeeSubmissionDetailsList;

}
