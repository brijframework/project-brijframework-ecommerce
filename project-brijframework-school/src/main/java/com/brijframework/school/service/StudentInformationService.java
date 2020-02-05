package com.brijframework.school.service;

import java.util.List;

import com.brijframework.school.bean.student.StudentInformationDTO;

public interface StudentInformationService {

	StudentInformationDTO saveStudentInformation(Long schoolId, StudentInformationDTO student);

	boolean deleteStudentInformation(Long schoolId, Long id);

	StudentInformationDTO getStudentInformation(Long schoolId, Long id);

	List<StudentInformationDTO> getStudentInformationList(Long schoolId);

}
