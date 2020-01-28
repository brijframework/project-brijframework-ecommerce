package com.brijframework.school.domain.student;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.brijframework.school.domain.EntityObject;
import com.brijframework.school.domain.employee.AssignClass;
import com.brijframework.school.domain.setting.Section;

@SuppressWarnings("serial")
@Entity
@Table(name = "class")
public class StudentClass extends EntityObject<Long> {
	
	@Column(name = "class_name")
	private String className;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "studentClasses")
	private List<Section> sections;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "studentClasses")
	private List<StudentAttendance> studentAttendances;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "studentClasses")
	private List<AssignClass> assignClasses;

	public List<AssignClass> getAssignClasses() {
		return assignClasses;
	}

	public void setAssignClasses(List<AssignClass> assignClasses) {
		this.assignClasses = assignClasses;
	}

	public List<StudentAttendance> getStudentAttendances() {
		return studentAttendances;
	}

	public void setStudentAttendances(List<StudentAttendance> studentAttendances) {
		this.studentAttendances = studentAttendances;
	}

	public List<Section> getSections() {
		return sections;
	}

	public void setSections(List<Section> sections) {
		this.sections = sections;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

}