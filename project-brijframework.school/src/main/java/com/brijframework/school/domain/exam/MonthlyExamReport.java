package com.brijframework.school.domain.exam;

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
import com.brijframework.school.domain.setting.Session;
import com.brijframework.school.domain.setting.Subjects;
import com.brijframework.school.domain.student.Student;
import com.brijframework.school.domain.student.StudentClass;

@SuppressWarnings("serial")
@Entity
@Table(name = "monthly_exam_report")
public class MonthlyExamReport extends EntityObject<Integer> {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "monthly_exam_report_id")
	private int monthlyExamReportId;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "session_id")
	private Session session;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "class_id")
	private StudentClass studentClasses;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "section_id")
	private Section section;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "month_id")
	private Month month;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "student_id")
	private Student students;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "subject_id")
	private Subjects subjects;
	@Column(name = "max_marks")
	private Double maxMarks;
	@Column(name = "marks")
	private Double marks;
	@Column(name = "created_at")
	private Date createdAt;
	@Column(name = "updated_at")
	private Date updatedAt;

	public int getMonthlyExamReportId() {
		return monthlyExamReportId;
	}

	public void setMonthlyExamReportId(int monthlyExamReportId) {
		this.monthlyExamReportId = monthlyExamReportId;
	}

	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

	public StudentClass getStudentClasses() {
		return studentClasses;
	}

	public void setStudentClasses(StudentClass studentClasses) {
		this.studentClasses = studentClasses;
	}

	public Section getSection() {
		return section;
	}

	public void setSection(Section section) {
		this.section = section;
	}

	public Month getMonth() {
		return month;
	}

	public void setMonth(Month month) {
		this.month = month;
	}

	public Student getStudents() {
		return students;
	}

	public void setStudents(Student students) {
		this.students = students;
	}

	public Subjects getSubjects() {
		return subjects;
	}

	public void setSubjects(Subjects subjects) {
		this.subjects = subjects;
	}

	public Double getMaxMarks() {
		return maxMarks;
	}

	public void setMaxMarks(Double maxMarks) {
		this.maxMarks = maxMarks;
	}

	public Double getMarks() {
		return marks;
	}

	public void setMarks(Double marks) {
		this.marks = marks;
	}

}
