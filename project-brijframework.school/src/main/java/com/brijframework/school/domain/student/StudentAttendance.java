package com.brijframework.school.domain.student;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.brijframework.school.domain.EntityObject;
import com.brijframework.school.domain.employee.Employee;
import com.brijframework.school.domain.setting.ClassDetail;
import com.brijframework.school.domain.setting.SectionDetail;

@SuppressWarnings("serial")
@Entity
@Table(name = "student_attendance")
public class StudentAttendance extends EntityObject<Long> {
	
	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	@JoinColumn(name = "student_id")
	private Student students;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	@JoinColumn(name = "class_id")
	private ClassDetail classDetail;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	@JoinColumn(name = "section_id")
	private SectionDetail sectionDetail;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	@JoinColumn(name = "employee_id")
	private Employee employee;
	
	@Column(name = "attendance_status")
	private String attendanceStatus;
	
	@Column(name = "date_of_attendance")
	private Date datOfAttendance;


}
