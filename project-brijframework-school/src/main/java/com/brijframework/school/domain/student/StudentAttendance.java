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
	@JoinColumn(name = "STUDENT_DETAIL_ID")
	private StudentDetail studentDetail;

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

	public StudentDetail getStudentDetail() {
		return studentDetail;
	}

	public void setStudentDetail(StudentDetail studentDetail) {
		this.studentDetail = studentDetail;
	}

	public ClassDetail getClassDetail() {
		return classDetail;
	}

	public void setClassDetail(ClassDetail classDetail) {
		this.classDetail = classDetail;
	}

	public SectionDetail getSectionDetail() {
		return sectionDetail;
	}

	public void setSectionDetail(SectionDetail sectionDetail) {
		this.sectionDetail = sectionDetail;
	}

	public EmployeeDetail getEmployeeDetail() {
		return employeeDetail;
	}

	public void setEmployeeDetail(EmployeeDetail employeeDetail) {
		this.employeeDetail = employeeDetail;
	}

	public String getAttendanceStatus() {
		return attendanceStatus;
	}

	public void setAttendanceStatus(String attendanceStatus) {
		this.attendanceStatus = attendanceStatus;
	}

	public Date getDatOfAttendance() {
		return datOfAttendance;
	}

	public void setDatOfAttendance(Date datOfAttendance) {
		this.datOfAttendance = datOfAttendance;
	}

}
