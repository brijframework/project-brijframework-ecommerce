package com.brijframework.school.domain.student;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.brijframework.school.domain.EntityObject;
import com.brijframework.school.domain.comman.ContactDetail;


@Entity
@Table(name = "STUDENT_FAMILY_CONTACT")
public class StudentFamilyContact extends EntityObject<Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name = "STUDENT_FAMILY_ID")
	private StudentFamily studentFamily;
	
	@OneToOne
	@JoinColumn(name = "CONTACT_DETAIL_ID")
	private ContactDetail contactDetail;

	public StudentFamily getStudentFamily() {
		return studentFamily;
	}

	public void setStudentFamily(StudentFamily studentFamily) {
		this.studentFamily = studentFamily;
	}

	public ContactDetail getContactDetail() {
		return contactDetail;
	}

	public void setContactDetail(ContactDetail contactDetail) {
		this.contactDetail = contactDetail;
	}

}
