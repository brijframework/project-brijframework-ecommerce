package com.brijframework.school.domain.setting;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.brijframework.school.domain.EntityObject;

@Entity
public class SchoolClass extends EntityObject<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "class_name")
	private String className;
	
	@ManyToOne
	@JoinColumn(name = "school_id")
	private School school;

	@OneToMany(mappedBy = "schoolClass")
	private List<SchoolSubject> subjects;

}
