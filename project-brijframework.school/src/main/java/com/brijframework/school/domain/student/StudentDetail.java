package com.brijframework.school.domain.student;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.brijframework.school.domain.EntityObject;
import com.brijframework.school.domain.location.Address;
import com.brijframework.school.domain.profile.Religion;
import com.brijframework.school.domain.setting.SchoolDetail;

@Entity
@Table(name = "STUDENT_DETAIL")
public class StudentDetail extends EntityObject<Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "middle_name")
	private String middleName;
	
	@Column(name = "last_name")
	private String lastName;

	@Column(name = "DATE_OF_BIRTH")
	private Date dateOfBirth;
	
	@Column(name = "GENDER")
	private String gender;
	
	@Column(name = "MOTHER_TOUNGE")
	private String motherTounge;
	
	@Column(name = "PHYSICALLY_CHALLENGED")
	private String physicallyChallenged;
	
	@Column(name = "NATIONALITY")
	private String nationality;
	
	@ManyToOne
	@JoinColumn(name = "RELIGION_ID")
	private Religion religion;
	
	@OneToOne
	@JoinColumn(name = "ADDRESS_ID")
	private Address address;
	
	@OneToOne
	@JoinColumn(name = "SCHOOL_DETAIL_ID")
	private SchoolDetail schoolDetail;
	@OneToOne
	@JoinColumn(name = "ADMISSION_ID")
	private StudentAdmission admission;
	
	@OneToMany(mappedBy = "studentDetail")
	private List<StudentContact> contacts;
	
	@OneToMany(mappedBy = "studentDetail")
	private List<StudentFamily> families;
	
}
