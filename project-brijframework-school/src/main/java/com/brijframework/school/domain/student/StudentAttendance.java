package com.brijframework.school.domain.student;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.brijframework.school.domain.EntityObject;
import com.brijframework.school.domain.employee.EmployeeDetail;
import com.brijframework.school.domain.setting.ClassDetail;
import com.brijframework.school.domain.setting.SectionDetail;

@SuppressWarnings("serial")
@Entity
@Table(name = "STUDENT_ATTENDANCE")
public class StudentAttendance extends EntityObject<Long> {
	
	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	@JoinColumn(name = "STUDENT_ID")
	private StudentInformation student;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	@JoinColumn(name = "CLASS_DETAIL_ID")
	private ClassDetail classDetail;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	@JoinColumn(name = "SECTION_DETAIL_ID")
	private SectionDetail sectionDetail;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	@JoinColumn(name = "EMPLOYEE_DETAIL_ID")
	private EmployeeDetail employeeDetail;
	
	@Column(name = "ATTENDANCE_STATUS")
	private String attendanceStatus;
	
	@Column(name = "DATE_OF_ATTENDANCE")
	private Date datOfAttendance;
}
