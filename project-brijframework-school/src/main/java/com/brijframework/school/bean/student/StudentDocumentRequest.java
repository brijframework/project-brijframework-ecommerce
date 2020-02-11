package com.brijframework.school.bean.student;

import javax.validation.constraints.NotNull;

import org.springframework.web.multipart.MultipartFile;

import com.brijframework.school.bean.AbstractDTO;

public class StudentDocumentRequest extends AbstractDTO<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long categoryId;
	
	private Long studentDetailId;

	@NotNull
	private MultipartFile file;

	
	public StudentDocumentRequest(Long studentDetailId,Long id,Long categoryId, @NotNull MultipartFile file) {
		super();
		this.setId(id);
		this.categoryId = categoryId;
		this.file = file;
		this.studentDetailId=studentDetailId;
	}

	
	public Long getStudentDetailId() {
		return studentDetailId;
	}


	public void setStudentDetailId(Long studentDetailId) {
		this.studentDetailId = studentDetailId;
	}


	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

	@Override
	public String toString() {
		return "StudentDocumentRequest [categoryId=" + categoryId + ", file=" + file + ", getId()=" + getId() + "]";
	}
	
	
	
}
