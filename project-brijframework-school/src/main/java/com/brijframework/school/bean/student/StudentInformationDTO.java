package com.brijframework.school.bean.student;

import com.brijframework.school.bean.AbstractDTO;

public class StudentInformationDTO extends AbstractDTO<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long rollNo;
	private String srno;
	private Long lfNo;
	private Long studentDetailId;

	public Long getRollNo() {
		return rollNo;
	}

	public void setRollNo(Long rollNo) {
		this.rollNo = rollNo;
	}

	public String getSrno() {
		return srno;
	}

	public void setSrno(String srno) {
		this.srno = srno;
	}

	public Long getLfNo() {
		return lfNo;
	}

	public void setLfNo(Long lfNo) {
		this.lfNo = lfNo;
	}

	public Long getStudentDetailId() {
		return studentDetailId;
	}

	public void setStudentDetailId(Long studentDetailId) {
		this.studentDetailId = studentDetailId;
	}

}
