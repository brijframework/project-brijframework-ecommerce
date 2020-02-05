package com.brijframework.school.mapper;

import com.brijframework.school.bean.student.StudentDocumentDTO;
import com.brijframework.school.bean.student.StudentDocumentRequest;
import com.brijframework.school.domain.student.StudentDetail;
import com.brijframework.school.domain.student.StudentDocument;

public interface StudentDocumentMapper {

	StudentDocument toEntity(StudentDocumentRequest student);

	StudentDocumentDTO toDTO(StudentDocument studentDocument);

	StudentDetail getStudentDetail(Long studentDetailId);

}
