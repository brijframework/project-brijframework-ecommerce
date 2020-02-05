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
import com.brijframework.school.domain.student.StudentAdmission;
import com.brijframework.school.domain.student.StudentDetail;
import com.brijframework.school.domain.student.StudentInformation;

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
	private List<StudentInformation> studentInformationList;

	@OneToMany(mappedBy = "schoolDetail")
	private List<StudentAdmission> studentAdmissionList;

	@OneToMany(mappedBy = "schoolDetail")
	private List<StudentDetail> studentDetailList;

	@OneToMany(mappedBy = "schoolDetail")
	private List<EmployeeDetail> employeeDetailList;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogoUrl() {
		return logoUrl;
	}

	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<SchoolContact> getContactList() {
		return contactList;
	}

	public void setContactList(List<SchoolContact> contactList) {
		this.contactList = contactList;
	}

	public List<ClassDetail> getClassDetailList() {
		return classDetailList;
	}

	public void setClassDetailList(List<ClassDetail> classDetailList) {
		this.classDetailList = classDetailList;
	}

	public List<StudentInformation> getStudentInformationList() {
		return studentInformationList;
	}

	public void setStudentInformationList(List<StudentInformation> studentInformationList) {
		this.studentInformationList = studentInformationList;
	}

	public List<StudentAdmission> getStudentAdmissionList() {
		return studentAdmissionList;
	}

	public void setStudentAdmissionList(List<StudentAdmission> studentAdmissionList) {
		this.studentAdmissionList = studentAdmissionList;
	}

	public List<StudentDetail> getStudentDetailList() {
		return studentDetailList;
	}

	public void setStudentDetailList(List<StudentDetail> studentDetailList) {
		this.studentDetailList = studentDetailList;
	}

	public List<EmployeeDetail> getEmployeeDetailList() {
		return employeeDetailList;
	}

	public void setEmployeeDetailList(List<EmployeeDetail> employeeDetailList) {
		this.employeeDetailList = employeeDetailList;
	}

}
