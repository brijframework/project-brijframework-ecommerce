package org.brijframework.college.models.dto;

import java.util.List;

public class SubjectMarksDTO {
	private Integer studentId;
	private String subjectId;
	private String maxMarks;
	private String gainMarks;
	List<SubjectMarksDTO> subjectMarksDTOs;

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}

	public String getMaxMarks() {
		return maxMarks;
	}

	public void setMaxMarks(String maxMarks) {
		this.maxMarks = maxMarks;
	}

	public String getGainMarks() {
		return gainMarks;
	}

	public void setGainMarks(String gainMarks) {
		this.gainMarks = gainMarks;
	}

	public List<SubjectMarksDTO> getSubjectMarksDTOs() {
		return subjectMarksDTOs;
	}

	public void setSubjectMarksDTOs(List<SubjectMarksDTO> subjectMarksDTOs) {
		this.subjectMarksDTOs = subjectMarksDTOs;
	}

}
