package com.brijframework.school.bean.student;

import com.brijframework.school.bean.AbstractDTO;

public class StudentContactDTO extends AbstractDTO<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String type;

	private String value;

	private Long studentProfileId;

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

	public Long getStudentProfileId() {
		return studentProfileId;
	}

	public void setStudentProfileId(Long studentProfileId) {
		this.studentProfileId = studentProfileId;
	}

}
