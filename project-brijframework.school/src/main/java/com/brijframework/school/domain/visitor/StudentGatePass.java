package com.brijframework.school.domain.visitor;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.brijframework.school.domain.EntityObject;
import com.brijframework.school.domain.student.Student;

@SuppressWarnings("serial")
@Entity
@Table(name = "STUDENT_GATE_PASS")
public class StudentGatePass extends EntityObject<Integer> {
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ADMISSION_NO")
	private Student students;

	@Column(name = "LEAVING_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date leavingDate;

	@Column(name = "LEAVING_TIME")
	private Time leavingTime;

	@Column(name = "REASON")
	private String reason;

	@Column(name = "LEAVING_WITH")
	private String leavingWith;

	public Student getStudents() {
		return students;
	}

	public void setStudents(Student students) {
		this.students = students;
	}

	public Date getLeavingDate() {
		return leavingDate;
	}

	public void setLeavingDate(Date leavingDate) {
		this.leavingDate = leavingDate;
	}

	public Time getLeavingTime() {
		return leavingTime;
	}

	public void setLeavingTime(Time leavingTime) {
		this.leavingTime = leavingTime;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getLeavingWith() {
		return leavingWith;
	}

	public void setLeavingWith(String leavingWith) {
		this.leavingWith = leavingWith;
	}

}
