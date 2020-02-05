package com.brijframework.school.domain.student;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.brijframework.school.domain.EntityObject;

@SuppressWarnings("serial")
@Entity
@Table(name = "STUDENT_CATEGORY")
public class StudentCategory extends EntityObject<Long> {
	
	@Column(name = "NAME")
	private String name;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "studentCategory")
	private List<StudentInformation> students;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<StudentInformation> getStudents() {
		return students;
	}

	public void setStudents(List<StudentInformation> students) {
		this.students = students;
	}

}
