package com.brijframework.school.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brijframework.school.bean.StudentDTO;
import com.brijframework.school.service.StudentService;

@RequestMapping("student")
@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;

	@PostMapping
	public StudentDTO saveCity(@RequestBody StudentDTO student ) {
		return studentService.saveStudent(student);
	}
}
