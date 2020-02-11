package com.brijframework.school.service.student;

import java.util.List;

import com.brijframework.school.bean.student.StudentCategoryDTO;

public interface StudentCategoryService {

	StudentCategoryDTO saveStudentCategory(Long schoolId, StudentCategoryDTO student);

	List<StudentCategoryDTO> getStudentCategoryList(Long schoolId);

	StudentCategoryDTO getStudentCategory(Long schoolId, Long id);

	boolean deleteStudentCategory(Long schoolId, Long id);

}
