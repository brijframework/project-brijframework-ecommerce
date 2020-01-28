package com.brijframework.school.domain.student;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.brijframework.school.domain.DocumentsCategory;
import com.brijframework.school.domain.EntityObject;

@Entity
@Table(name = "STUDENT_DOCUMENT")
public class StudentDocument extends EntityObject<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@JoinColumn(name = "STUDENT_ID")
	@ManyToOne(fetch = FetchType.LAZY)
	private Student student;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CATEGORY_ID")
	private DocumentsCategory document;

	@Column(name = "file_name")
	private String fileName;
	
	@Column(name = "file_url")
	private String fileUrl;
	
	@Lob
	@Column(name = "file_data")
	private byte[] fileData;

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public DocumentsCategory getDocument() {
		return document;
	}

	public void setDocument(DocumentsCategory document) {
		this.document = document;
	}
}
