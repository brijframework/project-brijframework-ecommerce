package com.brijframework.school.mapper;

import com.brijframework.school.bean.student.StudentDocumentDTO;
import com.brijframework.school.bean.student.StudentDocumentRequest;
import com.brijframework.school.domain.student.StudentDocument;
import com.brijframework.school.domain.student.StudentProfile;

public interface StudentDocumentMapper {

	StudentDocument toEntity(StudentDocumentRequest student);

	StudentDocumentDTO toDTO(StudentDocument studentDocument);

	StudentProfile getStudentProfile(Long studentDetailId);
	
}
