package com.brijframework.school.service.student;

import java.util.List;

import com.brijframework.school.bean.student.StudentRegistrationDTO;

public interface StudentRegistrationService {

	StudentRegistrationDTO saveStudentRegistration(StudentRegistrationDTO studentRegistrationDTO);

	boolean deleteStudentRegistration(Long id);

	StudentRegistrationDTO getStudentRegistration(Long id);

	List<StudentRegistrationDTO> getStudentRegistrationList(Long schoolId);

}
