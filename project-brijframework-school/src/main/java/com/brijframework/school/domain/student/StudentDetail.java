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
import com.brijframework.school.domain.comman.ImageDetail;
import com.brijframework.school.domain.location.Address;
import com.brijframework.school.domain.profile.Religion;
import com.brijframework.school.domain.setting.ClassDetail;
import com.brijframework.school.domain.setting.SchoolDetail;

@Entity
@Table(name = "STUDENT_DETAIL")
public class StudentDetail extends EntityObject<Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name = "FIRST_NAME")
	private String firstName;
	
	@Column(name = "MIDDLE_NAME")
	private String middleName;
	
	@Column(name = "LAST_NAME")
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
	
	@Column(name = "IMAGE_DETAIL_ID")
	private ImageDetail imageDetail;
	
	@ManyToOne
	@JoinColumn(name = "RELIGION_ID")
	private Religion religion;
	
	@OneToOne
	@JoinColumn(name = "ADDRESS_ID")
	private Address address;
	
	@ManyToOne
	@JoinColumn(name = "CLASS_DETAIL_ID")
	private ClassDetail classDetail;

	@OneToOne
	@JoinColumn(name = "SCHOOL_DETAIL_ID")
	private SchoolDetail schoolDetail;
	
	@OneToOne
	@JoinColumn(name = "SCHOOL_ADMISSION_ID")
	private StudentAdmission admission;
	
	@OneToMany(mappedBy = "studentDetail")
	private List<StudentContact> contacts;
	
	@OneToMany(mappedBy = "studentDetail")
	private List<StudentFamily> families;
	
}
