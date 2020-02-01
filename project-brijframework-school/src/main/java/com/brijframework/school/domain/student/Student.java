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

@SuppressWarnings("serial")
@Entity
@Table(name = "STUDENT")
public class Student extends EntityObject<Integer> {
	
	@Column(name = "ROLL_NO")
	private Long rollNo;

	@Column(name="SR_NO")
	private String srno;
	
	@Column(name = "LF_NO")
	private Long lfNo;

	@OneToOne
	@JoinColumn(name = "STUDENT_DETAIL_ID")
	private StudentDetail studentDetail;
	
	@ManyToOne
	@JoinColumn(name = "CATEGORY_DETAIL_ID")
	private StudentCategory studentCategory;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "students")
	private List<StudentAttendance> attendances;
	
}
