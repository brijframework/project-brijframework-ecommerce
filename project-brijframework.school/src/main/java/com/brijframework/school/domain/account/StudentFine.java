package com.brijframework.school.domain.account;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.brijframework.school.domain.EntityObject;
import com.brijframework.school.domain.setting.Section;
import com.brijframework.school.domain.student.Student;
import com.brijframework.school.domain.student.StudentClass;

@SuppressWarnings("serial")
@Entity
@Table(name = "student_fine")
public class StudentFine extends EntityObject<Integer> {
	@Id
	@Column(name = "student_fine_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer studentFineId;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "section_id")
	private Section section;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "class_id")
	private StudentClass studentClasses;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "student_id")
	private Student students;
	@Column(name = "fine_name")
	private String fineName;
	@Column(name = "fine_amount")
	private String fineAmount;
	@Column(name = "created_at")
	private Date createdAt;
	@Column(name = "updated_at")
	private Date updatedAt;
	@Column(name = "is_paid")
	private boolean paid;
	@Column(name = "last_date")
	private Date lastDate;
	@Column(name = "from_date")
	private Date fromDate;
	@Column(name = "to_date")
	private Date toDate;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "student_fee_sub_detail_id")
	private StudentFeeSubmissionDetails studentFeeSubmissionDetails;

	public Integer getStudentFineId() {
		return studentFineId;
	}

	public void setStudentFineId(Integer studentFineId) {
		this.studentFineId = studentFineId;
	}

	public Section getSection() {
		return section;
	}

	public void setSection(Section section) {
		this.section = section;
	}

	public StudentClass getStudentClasses() {
		return studentClasses;
	}

	public void setStudentClasses(StudentClass studentClasses) {
		this.studentClasses = studentClasses;
	}

	public Student getStudents() {
		return students;
	}

	public void setStudents(Student students) {
		this.students = students;
	}

	public String getFineName() {
		return fineName;
	}

	public void setFineName(String fineName) {
		this.fineName = fineName;
	}

	public String getFineAmount() {
		return fineAmount;
	}

	public void setFineAmount(String fineAmount) {
		this.fineAmount = fineAmount;
	}

	public boolean isPaid() {
		return paid;
	}

	public void setPaid(boolean paid) {
		this.paid = paid;
	}

	public Date getLastDate() {
		return lastDate;
	}

	public void setLastDate(Date lastDate) {
		this.lastDate = lastDate;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public StudentFeeSubmissionDetails getStudentFeeSubmissionDetails() {
		return studentFeeSubmissionDetails;
	}

	public void setStudentFeeSubmissionDetails(
			StudentFeeSubmissionDetails studentFeeSubmissionDetails) {
		this.studentFeeSubmissionDetails = studentFeeSubmissionDetails;
	}

}
