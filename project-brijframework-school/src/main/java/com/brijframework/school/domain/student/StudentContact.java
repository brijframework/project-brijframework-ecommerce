package com.brijframework.school.domain.student;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.brijframework.school.domain.EntityObject;
import com.brijframework.school.domain.comman.ContactDetail;

@Entity
@Table(name = "STUDENT_CONTACT")
public class StudentContact extends EntityObject<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "CONTACT_DETAIL_ID")
	private ContactDetail contactDetail;

	@ManyToOne
	@JoinColumn(name = "STUDENT_DETAIL_ID")
	private StudentDetail studentDetail;

	public ContactDetail getContactDetail() {
		return contactDetail;
	}

	public void setContactDetail(ContactDetail contactDetail) {
		this.contactDetail = contactDetail;
	}

	public StudentDetail getStudentDetail() {
		return studentDetail;
	}

	public void setStudentDetail(StudentDetail studentDetail) {
		this.studentDetail = studentDetail;
	}

}
