package com.brijframework.school.service.student;

import java.util.List;

import com.brijframework.school.bean.student.StudentAdmissionDTO;

public interface StudentAdmissionService {

	StudentAdmissionDTO saveStudentAdmission(StudentAdmissionDTO student);

	boolean deleteStudentAdmission(Long id);

	StudentAdmissionDTO getStudentAdmission(Long id);

	List<StudentAdmissionDTO> getStudentAdmissionList(Long schoolId);

}
