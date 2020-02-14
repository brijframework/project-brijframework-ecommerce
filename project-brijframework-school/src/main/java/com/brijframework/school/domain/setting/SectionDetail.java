package com.brijframework.school.domain.setting;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.brijframework.school.domain.EntityObject;
import com.brijframework.school.domain.student.StudentDetail;

@SuppressWarnings("serial")
@Entity
@Table(name = "SECTION_DETAIL")
public class SectionDetail extends EntityObject<Integer> {

	@Column(name = "SECTION_NAME")
	private String sectionName;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CLASS_DETAIL_ID")
	private ClassDetail classDetail;
	
	@OneToMany
	private List<StudentDetail> studentDetails;

	public String getSectionName() {
		return sectionName;
	}

	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}

	public ClassDetail getClassDetail() {
		return classDetail;
	}

	public void setClassDetail(ClassDetail classDetail) {
		this.classDetail = classDetail;
	}

	public List<StudentDetail> getStudentDetails() {
		return studentDetails;
	}

	public void setStudentDetails(List<StudentDetail> studentDetails) {
		this.studentDetails = studentDetails;
	}
	
	
	
}