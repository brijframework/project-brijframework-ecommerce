package com.brijframework.school.domain.student;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.brijframework.school.domain.EntityObject;

@Entity
@Table(name = "STUDENT_CONTACT")
public class StudentContact extends EntityObject<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String type;
	private String value;
	
	@ManyToOne
	@JoinColumn(name = "STUDENTDETAIL_ID")
	private StudentDetail studentDetail;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
