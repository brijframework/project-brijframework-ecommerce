package com.brijframework.school.bean.student;

import com.brijframework.school.bean.AbstractDTO;

public class StudentFamilyQualificationDTO extends AbstractDTO<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long qualificationDetailId;

	public long getQualificationDetailId() {
		return qualificationDetailId;
	}

	public void setQualificationDetailId(long qualificationDetailId) {
		this.qualificationDetailId = qualificationDetailId;
	}

}
