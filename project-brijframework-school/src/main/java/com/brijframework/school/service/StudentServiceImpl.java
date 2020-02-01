package com.brijframework.school.service;

import org.springframework.stereotype.Service;

import com.brijframework.school.bean.StudentDTO;

@Service
public class StudentServiceImpl implements StudentService{

	@Override
	public StudentDTO saveStudent(StudentDTO student) {
		return student;
	}

}
