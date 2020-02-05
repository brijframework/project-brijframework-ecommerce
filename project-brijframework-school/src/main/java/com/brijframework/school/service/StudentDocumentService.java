package com.brijframework.school.service;

import java.util.List;

import com.brijframework.school.bean.student.StudentDocumentDTO;
import com.brijframework.school.bean.student.StudentDocumentRequest;

public interface StudentDocumentService {

	StudentDocumentDTO saveStudentDocument(Long studentDetailId, StudentDocumentRequest student);

	List<StudentDocumentDTO> getStudentDocumentList(Long studentDetailId);

	StudentDocumentDTO getStudentDocument(Long studentDetailId, Long id);

	boolean deleteStudentDocument(Long studentDetailId, Long id);

}
