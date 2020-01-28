package com.brijframework.school.domain.setting;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.brijframework.school.domain.EntityObject;
import com.brijframework.school.domain.student.StudentClass;

@SuppressWarnings("serial")
@Entity
@Table(name = "School_subject")
public class SchoolSubject extends EntityObject<Integer> {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "subject_id")
	private Integer subjectsId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "class_id")
	private StudentClass schoolClass;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "section_id")
	private SchoolSection section;

	@Column(name = "subject_name")
	private String subjectName;
	@Column(name = "isActive")
	private boolean active;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "session_id")
	private SchoolSession session;
	
	

	/*
	 * @OneToMany(fetch = FetchType.LAZY, mappedBy = "subjects") private
	 * List<StudentAttendance> studentAttendances;
	 */

	public SchoolSession getSession() {
		return session;
	}

	public void setSession(SchoolSession session) {
		this.session = session;
	}

	public Integer getSubjectsId() {
		return subjectsId;
	}

	public void setSubjectsId(Integer subjectsId) {
		this.subjectsId = subjectsId;
	}

	public StudentClass getStudentClasses() {
		return studentClasses;
	}

	public void setStudentClasses(StudentClass studentClasses) {
		this.studentClasses = studentClasses;
	}

	public SchoolSection getSection() {
		return section;
	}

	public void setSection(SchoolSection section) {
		this.section = section;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	/*
	 * public List<StudentAttendance> getStudentAttendances() { return
	 * studentAttendances; }
	 * 
	 * public void setStudentAttendances(List<StudentAttendance>
	 * studentAttendances) { this.studentAttendances = studentAttendances; }
	 */
}
