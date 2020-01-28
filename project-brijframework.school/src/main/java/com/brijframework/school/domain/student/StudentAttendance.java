package com.brijframework.school.domain.student;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.brijframework.school.domain.EntityObject;
import com.brijframework.school.domain.employee.Employees;
import com.brijframework.school.domain.setting.Section;

@SuppressWarnings("serial")
@Entity
@Table(name = "student_attendance")
public class StudentAttendance extends EntityObject<Long> {
	
	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	@JoinColumn(name = "student_id")
	private Student students;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	@JoinColumn(name = "class_id")
	private StudentClass studentClasses;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	@JoinColumn(name = "section_id")
	private Section section;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = true)
	@JoinColumn(name = "employee_id")
	private Employees employees;
	
	@Column(name = "attendance_status")
	private String attendanceStatus;
	
	@Column(name = "date_of_attendance")
	private Date datOfAttendance;

	public Employees getEmployees() {
		return employees;
	}

	public void setEmployees(Employees employees) {
		this.employees = employees;
	}

	public Student getStudents() {
		return students;
	}

	public void setStudents(Student students) {
		this.students = students;
	}

	public StudentClass getStudentClasses() {
		return studentClasses;
	}

	public void setStudentClasses(StudentClass studentClasses) {
		this.studentClasses = studentClasses;
	}

	public Section getSection() {
		return section;
	}

	public void setSection(Section section) {
		this.section = section;
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
