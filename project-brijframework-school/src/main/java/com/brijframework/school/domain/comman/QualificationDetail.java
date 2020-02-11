package com.brijframework.school.domain.comman;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.brijframework.school.domain.EntityObject;

@Entity
@Table(name = "QUALIFICATION_DETAIL")
public class QualificationDetail extends EntityObject<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "QUALIFICATION_TYPE")
	private String type;

	@Column(name = "QUALIFICATION_VALUE")
	private String value;
	
	public QualificationDetail() {
		// TODO Auto-generated constructor stub
	}

	public QualificationDetail(long qualificationDetailId) {
		this.setId(qualificationDetailId);
	}

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
