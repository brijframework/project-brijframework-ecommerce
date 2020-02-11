package com.brijframework.school.service.student;

import java.util.List;

import com.brijframework.school.bean.student.StudentDocumentDTO;
import com.brijframework.school.bean.student.StudentDocumentRequest;

public interface StudentDocumentService {

	StudentDocumentDTO saveStudentDocument(StudentDocumentRequest student);

	List<StudentDocumentDTO> getStudentDocumentList(Long studentDetailId);

	StudentDocumentDTO getStudentDocument(Long id);

	boolean deleteStudentDocument(Long id);

}
