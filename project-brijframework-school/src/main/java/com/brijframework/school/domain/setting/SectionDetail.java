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
import com.brijframework.school.domain.student.Student;

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
	private List<Student> students;
	
}