package com.brijframework.school.service.student;

import java.util.List;

import com.brijframework.school.bean.student.StudentContactDTO;

public interface StudentContactService {

	StudentContactDTO saveStudentContact(Long studentDetailId, StudentContactDTO student);

	List<StudentContactDTO> getStudentContactList(Long studentDetailId);

	StudentContactDTO getStudentContact(Long studentDetailId, Long id);

	boolean deleteStudentContact(Long studentDetailId, Long id);

}
