package com.brijframework.school.service.student;

import java.util.List;

import com.brijframework.school.bean.student.StudentInformationDTO;

public interface StudentInformationService {

	StudentInformationDTO saveStudentInformation(StudentInformationDTO studentInformationDTO);

	boolean deleteStudentInformation(Long id);

	StudentInformationDTO getStudentInformation(Long id);

	List<StudentInformationDTO> getStudentInformationList(Long schoolId);

}
