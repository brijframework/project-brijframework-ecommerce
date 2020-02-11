package com.brijframework.school.domain.student;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.brijframework.school.domain.EntityObject;
import com.brijframework.school.domain.comman.QualificationDetail;

@Entity
@Table(name = "STUDENT_FAMILY_QUALIFICATION")
public class StudentFamilyQualification extends EntityObject<Long> {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "STUDENT_FAMILY_ID")
	private StudentFamily studentFamily;
	
	@OneToOne
	@JoinColumn(name = "STUDENT_QUALIFICATION_ID")
	private QualificationDetail qualificationDetail;

	public StudentFamily getStudentFamily() {
		return studentFamily;
	}

	public void setStudentFamily(StudentFamily studentFamily) {
		this.studentFamily = studentFamily;
	}

	public QualificationDetail getQualificationDetail() {
		return qualificationDetail;
	}

	public void setQualificationDetail(QualificationDetail qualificationDetail) {
		this.qualificationDetail = qualificationDetail;
	}

}
