package com.brijframework.school.domain.setting;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.brijframework.school.domain.EntityObject;
import com.brijframework.school.domain.location.Address;
import com.brijframework.school.domain.student.Student;

@SuppressWarnings("serial")
@Entity
@Table(name = "SCHOOL")
public class School extends EntityObject<Long> {
	
	@Column(name = "NAME")
	private String name;

	@Column(name = "LOGO_URL")
	private String logoUrl;
	
	@OneToOne
	@JoinColumn(name = "ADDRESS_ID")
	private Address address;
	
	@OneToMany(mappedBy = "school")
	private List<SchoolContact> contactList;
	
	@OneToMany(mappedBy = "school")
	private List<SchoolClass> classList;
	
	@OneToMany(mappedBy = "school")
	private List<Student> studentList;
	
}
