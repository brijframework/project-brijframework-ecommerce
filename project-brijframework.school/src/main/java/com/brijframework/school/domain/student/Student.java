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
import com.brijframework.school.domain.comman.ImageDetail;
import com.brijframework.school.domain.setting.ClassDetail;
import com.brijframework.school.domain.setting.SchoolDetail;
import com.brijframework.school.domain.setting.SectionDetail;
import com.brijframework.school.domain.setting.SessionDetail;

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
	private SchoolDetail schoolDetail;
	
	@ManyToOne
	@JoinColumn(name = "STUDENT_DETAIL")
	private StudentDetail studentDetail;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SESSION_ID")
	private SessionDetail sessionDetail;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SECTION_ID")
	private SectionDetail sectionDetail;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	@JoinColumn(name = "CLASS_ID")
	private ClassDetail classDetail;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CATEGORY_ID")
	private StudentCategory category;
	
	@JoinColumn(name = "PHOTO_ID")
	@OneToOne
	private ImageDetail imageDetail;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "USER_ID")
	private UserLogin userLogin;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "students")
	private List<StudentAttendance> attendances;
	
}
