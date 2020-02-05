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
import com.brijframework.school.domain.setting.SchoolDetail;

@SuppressWarnings("serial")
@Entity
@Table(name = "STUDENT_INFORMATION")
public class StudentInformation extends EntityObject<Long> {

	@Column(name = "ROLL_NO")
	private Long rollNo;

	@Column(name = "SR_NO")
	private String srno;

	@Column(name = "LF_NO")
	private Long lfNo;

	@ManyToOne
	@JoinColumn(name = "SCHOOL_DETAIL_ID", nullable = false)
	private SchoolDetail schoolDetail;

	@OneToOne
	@JoinColumn(name = "STUDENT_DETAIL_ID")
	private StudentDetail studentDetail;

	@ManyToOne
	@JoinColumn(name = "CATEGORY_DETAIL_ID")
	private StudentCategory studentCategory;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "student")
	private List<StudentAttendance> attendances;

	public Long getRollNo() {
		return rollNo;
	}

	public void setRollNo(Long rollNo) {
		this.rollNo = rollNo;
	}

	public String getSrno() {
		return srno;
	}

	public void setSrno(String srno) {
		this.srno = srno;
	}

	public Long getLfNo() {
		return lfNo;
	}

	public void setLfNo(Long lfNo) {
		this.lfNo = lfNo;
	}

	public SchoolDetail getSchoolDetail() {
		return schoolDetail;
	}

	public void setSchoolDetail(SchoolDetail schoolDetail) {
		this.schoolDetail = schoolDetail;
	}

	public StudentDetail getStudentDetail() {
		return studentDetail;
	}

	public void setStudentDetail(StudentDetail studentDetail) {
		this.studentDetail = studentDetail;
	}

	public StudentCategory getStudentCategory() {
		return studentCategory;
	}

	public void setStudentCategory(StudentCategory studentCategory) {
		this.studentCategory = studentCategory;
	}

	public List<StudentAttendance> getAttendances() {
		return attendances;
	}

	public void setAttendances(List<StudentAttendance> attendances) {
		this.attendances = attendances;
	}

}
