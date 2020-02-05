package com.brijframework.school.domain.student;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.brijframework.school.domain.EntityObject;
import com.brijframework.school.domain.comman.DocumentDetail;

@Entity
@Table(name = "STUDENT_DOCUMENT")
public class StudentDocument extends EntityObject<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@JoinColumn(name = "STUDENT_DETAIL_ID")
	@ManyToOne
	private StudentDetail studentDetail;
	
	@JoinColumn(name = "DOCUMENT_DETAIL_ID")
	@OneToOne
	private DocumentDetail documentDetail;

	public StudentDetail getStudentDetail() {
		return studentDetail;
	}

	public void setStudentDetail(StudentDetail studentDetail) {
		this.studentDetail = studentDetail;
	}

	public DocumentDetail getDocumentDetail() {
		return documentDetail;
	}

	public void setDocumentDetail(DocumentDetail documentDetail) {
		this.documentDetail = documentDetail;
	}

}
