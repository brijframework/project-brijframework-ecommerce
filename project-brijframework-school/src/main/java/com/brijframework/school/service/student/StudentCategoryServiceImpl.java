package com.brijframework.school.service.student;

import java.util.List;

import org.springframework.stereotype.Service;

import com.brijframework.school.bean.student.StudentCategoryDTO;

@Service
public class StudentCategoryServiceImpl implements StudentCategoryService {

	@Override
	public StudentCategoryDTO saveStudentCategory(Long schoolId, StudentCategoryDTO student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<StudentCategoryDTO> getStudentCategoryList(Long schoolId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentCategoryDTO getStudentCategory(Long schoolId, Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteStudentCategory(Long schoolId, Long id) {
		// TODO Auto-generated method stub
		return false;
	}

}
