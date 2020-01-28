package com.brijframework.school.domain.library;

import java.util.Date;

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
@Table(name = "issue_book")
public class IssueBook extends EntityObject<Integer> {
	
	@Id
	@Column(name = "issue_book_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer issueBookId;
	@Column(name = "issue_date")
	private Date issueDate;
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "student_id")
	private Student student;
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "book_id")
	private Library book;
	@Column(name="is_active")
	private boolean active;
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="isbn")
	private ISBN isbn;
	
	public ISBN getIsbn() {
		return isbn;
	}
	public void setIsbn(ISBN isbn) {
		this.isbn = isbn;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public Integer getIssueBookId() {
		return issueBookId;
	}
	public void setIssueBookId(Integer issueBookId) {
		this.issueBookId = issueBookId;
	}
	public Date getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Library getBook() {
		return book;
	}
	public void setBook(Library book) {
		this.book = book;
	}
	
}
