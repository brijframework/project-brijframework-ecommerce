package com.brijframework.school.domain.student;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.brijframework.school.domain.EntityObject;
import com.brijframework.school.domain.setting.ClassDetail;
import com.brijframework.school.domain.setting.SchoolDetail;

@Entity
@Table(name = "STUDENT_DETAIL")
public class StudentDetail extends EntityObject<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "CATEGORY_DETAIL_ID")
	private StudentCategory studentCategory;

	@ManyToOne
	@JoinColumn(name = "CLASS_DETAIL_ID")
	private ClassDetail classDetail;

	@ManyToOne
	@JoinColumn(name = "SCHOOL_DETAIL_ID", nullable = false)
	private SchoolDetail schoolDetail;
	
	@ManyToOne
	@JoinColumn(name = "STUDENT_PROFILE_ID", nullable = false)
	private StudentProfile studentProfile;

	@OneToMany(mappedBy = "studentDetail")
	private List<StudentAttendance> attendances;

	public ClassDetail getClassDetail() {
		return classDetail;
	}

	public void setClassDetail(ClassDetail classDetail) {
		this.classDetail = classDetail;
	}

	public SchoolDetail getSchoolDetail() {
		return schoolDetail;
	}

	public void setSchoolDetail(SchoolDetail schoolDetail) {
		this.schoolDetail = schoolDetail;
	}

	public StudentCategory getStudentCategory() {
		return studentCategory;
	}

	public void setStudentCategory(StudentCategory studentCategory) {
		this.studentCategory = studentCategory;
	}

	public StudentProfile getStudentProfile() {
		return studentProfile;
	}

	public void setStudentProfile(StudentProfile studentProfile) {
		this.studentProfile = studentProfile;
	}

	public List<StudentAttendance> getAttendances() {
		return attendances;
	}

	public void setAttendances(List<StudentAttendance> attendances) {
		this.attendances = attendances;
	}

	
}
