package com.brijframework.school.domain.library;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.brijframework.school.domain.EntityObject;
import com.brijframework.school.domain.student.Student;

@SuppressWarnings("serial")
@Entity
@Table(name="isbn")

public class ISBN extends EntityObject<Integer>{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	@Column(name="isbn_id")
	public Integer isbnId;
	@Column(name="isbn_no")	
	private String isbnNo;
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="library_book_id")
	private Library libraryBookId;
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="student_Id")
	private Student students;
	@Column(name="issue_status")
	private String issueStatus;
	
	public Student getStudents() {
		return students;
	}
	public void setStudents(Student students) {
		this.students = students;
	}
	public String getIssueStatus() {
		return issueStatus;
	}
	public void setIssueStatus(String issueStatus) {
		this.issueStatus = issueStatus;
	}
	public Integer getIsbnId() {
		return isbnId;
	}
	public void setIsbnId(Integer isbnId) {
		this.isbnId = isbnId;
	}
	public String getIsbnNo() {
		return isbnNo;
	}
	public void setIsbnNo(String isbnNo) {
		this.isbnNo = isbnNo;
	}
	public Library getLibraryBookId() {
		return libraryBookId;
	}
	public void setLibraryBookId(Library libraryBookId) {
		this.libraryBookId = libraryBookId;
	}
	
}
