package com.brijframework.school.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brijframework.school.domain.student.Student;
import com.brijframework.school.service.StudentService;

@RequestMapping("student")
@RestController
public class StudentController {

	@Autowired
	StudentService studentService;

	@PostMapping
	public Student saveCity(@RequestBody Student student ) {
		return studentService.saveStudent(student);
	}
}
