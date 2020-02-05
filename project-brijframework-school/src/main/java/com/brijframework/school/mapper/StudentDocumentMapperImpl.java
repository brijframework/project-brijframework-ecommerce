package com.brijframework.school.mapper;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.brijframework.school.bean.student.StudentDocumentDTO;
import com.brijframework.school.bean.student.StudentDocumentRequest;
import com.brijframework.school.domain.comman.DocumentDetail;
import com.brijframework.school.domain.student.StudentDetail;
import com.brijframework.school.domain.student.StudentDocument;
import com.brijframework.school.util.ApplicationUtil;

@Component
public class StudentDocumentMapperImpl implements StudentDocumentMapper {

	@Autowired
	ApplicationUtil applicationUtil;
	
	@Override
	public StudentDocument toEntity(StudentDocumentRequest student) {
		StudentDocument studentDocument=new StudentDocument();
		studentDocument.setId(student.getId());
		studentDocument.setActive(true);
		DocumentDetail documentDetail=new DocumentDetail();
		try {
			documentDetail.setFileData(student.getFile().getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
		documentDetail.setFileName(student.getFile().getOriginalFilename());
		documentDetail.setFileType(student.getFile().getContentType());
		studentDocument.setDocumentDetail(documentDetail);
		return studentDocument;
	}

	@Override
	public StudentDocumentDTO toDTO(StudentDocument student) {
		if(student==null) {
			return null;
		}
		StudentDocumentDTO document=new StudentDocumentDTO();
		document.setId(student.getId());
		document.setFileData(student.getDocumentDetail().getFileData());
		document.setFileName(student.getDocumentDetail().getFileName());
		document.setFileType(student.getDocumentDetail().getFileType());
		return document;
	}
	
	@Override
	public StudentDetail getStudentDetail(Long studentDetailId) {
		if(studentDetailId==null) {
			return null;
		}
		StudentDetail studentDetail = new StudentDetail();
		studentDetail.setId(studentDetailId);
		return studentDetail;
	}
}
