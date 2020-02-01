package com.brijframework.school.domain.setting;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.brijframework.school.domain.EntityObject;

@Entity
@Table(name = "SCHOOL_CONTACT")
public class SchoolContact extends EntityObject<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name = "CONTACT_TYPE")
	private String type;
	
	@Column(name = "CONTACT_VALUE")
	private String value;

	@ManyToOne
	@JoinColumn(name = "SCHOOL_DETAIL_ID")
	private SchoolDetail schoolDetail;

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

	public SchoolDetail getSchoolDetail() {
		return schoolDetail;
	}

	public void setSchoolDetail(SchoolDetail schoolDetail) {
		this.schoolDetail = schoolDetail;
	}

}
