package com.brijframework.school.service;

import java.util.List;

import com.brijframework.school.bean.student.StudentAdmissionDTO;

public interface StudentAdmissionService {

	StudentAdmissionDTO saveStudentAdmission(Long schoolId, StudentAdmissionDTO student);

	boolean deleteStudentAdmission(Long schoolId, Long id);

	StudentAdmissionDTO getStudentAdmission(Long schoolId, Long id);

	List<StudentAdmissionDTO> getStudentAdmissionList(Long schoolId);

}
