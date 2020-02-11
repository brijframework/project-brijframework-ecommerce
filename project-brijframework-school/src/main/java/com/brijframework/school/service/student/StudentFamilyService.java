package com.brijframework.school.service.student;

import java.util.List;

import com.brijframework.school.bean.student.StudentFamilyDTO;

public interface StudentFamilyService {

	StudentFamilyDTO saveStudentFamily(StudentFamilyDTO student);

	List<StudentFamilyDTO> getStudentFamilyList(Long studentDetailId);

	StudentFamilyDTO getStudentFamily(Long id);

	boolean deleteStudentFamily(Long id);

}
