package com.brijframework.school.domain.setting;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.brijframework.school.domain.EntityObject;
import com.brijframework.school.domain.employee.EmployeeDetail;
import com.brijframework.school.domain.location.Address;
import com.brijframework.school.domain.student.StudentDetail;

@SuppressWarnings("serial")
@Entity
@Table(name = "SCHOOL_DETAIL")
public class SchoolDetail extends EntityObject<Long> {
	
	@Column(name = "NAME")
	private String name;

	@Column(name = "LOGO_URL")
	private String logoUrl;
	
	@OneToOne
	@JoinColumn(name = "ADDRESS_ID")
	private Address address;
	
	@OneToMany(mappedBy = "schoolDetail")
	private List<SchoolContact> contactList;
	
	@OneToMany(mappedBy = "schoolDetail")
	private List<ClassDetail> classDetailList;
	
	@OneToMany(mappedBy = "schoolDetail")
	private List<StudentDetail> studentDetailList;
	
	@OneToMany(mappedBy = "schoolDetail")
	private List<EmployeeDetail> employeeDetailList;
	
}
