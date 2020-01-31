package com.brijframework.school.domain.setting;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.brijframework.school.domain.EntityObject;

@Entity
public class ClassDetail extends EntityObject<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "class_name")
	private String className;

	@ManyToOne
	@JoinColumn(name = "SCHOOL_DETAIL_ID")
	private SchoolDetail schoolDetail;

	@OneToMany(mappedBy = "classDetail")
	private List<SubjectDetail> subjectDetails;

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public SchoolDetail getSchoolDetail() {
		return schoolDetail;
	}

	public void setSchoolDetail(SchoolDetail schoolDetail) {
		this.schoolDetail = schoolDetail;
	}

	public List<SubjectDetail> getSubjectDetails() {
		return subjectDetails;
	}

	public void setSubjectDetails(List<SubjectDetail> subjectDetails) {
		this.subjectDetails = subjectDetails;
	}

}
