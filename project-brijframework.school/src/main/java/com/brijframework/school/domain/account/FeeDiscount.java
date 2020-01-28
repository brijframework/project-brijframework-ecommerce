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
import javax.persistence.Table;

import com.brijframework.school.domain.EntityObject;
import com.brijframework.school.domain.setting.Section;
import com.brijframework.school.domain.student.Student;
import com.brijframework.school.domain.student.StudentClass;

@SuppressWarnings("serial")
@Entity
@Table(name = "fee_discount")
public class FeeDiscount extends EntityObject<Integer> {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "fee_discount_id")
	private Integer feeDiscountId;
	@Column(name = "fee_discount_amount")
	private Double feeDiscountAmount;
	@Column(name = "fee_discount_name")
	private String feeDiscountName;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "class_id")
	private StudentClass studentClasses;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "student_id")
	private Student students;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "section_id")
	private Section section;
	@Column(name = "last_date")
	private Date lastDate;
	@Column(name = "from_date")
	private Date fromDate;
	@Column(name = "to_date")
	private Date toDate;

	public Integer getFeeDiscountId() {
		return feeDiscountId;
	}

	public void setFeeDiscountId(Integer feeDiscountId) {
		this.feeDiscountId = feeDiscountId;
	}

	public Double getFeeDiscountAmount() {
		return feeDiscountAmount;
	}

	public void setFeeDiscountAmount(Double feeDiscountAmount) {
		this.feeDiscountAmount = feeDiscountAmount;
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

	public Section getSection() {
		return section;
	}

	public void setSection(Section section) {
		this.section = section;
	}

	public String getFeeDiscountName() {
		return feeDiscountName;
	}

	public void setFeeDiscountName(String feeDiscountName) {
		this.feeDiscountName = feeDiscountName;
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

}
