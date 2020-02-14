package com.brijframework.school.controller.student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brijframework.school.bean.student.StudentRegistrationDTO;
import com.brijframework.school.service.student.StudentRegistrationService;

@RequestMapping("school/student/registration")
@RestController
public class StudentRegistrationController {

	@Autowired
	private StudentRegistrationService studentRegistrationService;

	@PostMapping
	public StudentRegistrationDTO addStudent(@RequestBody StudentRegistrationDTO studentRegistrationDTO ) {
		return studentRegistrationService.saveStudentRegistration(studentRegistrationDTO);
	}
	
	@PutMapping
	public StudentRegistrationDTO updateStudent(@RequestBody StudentRegistrationDTO studentRegistrationDTO ) {
		return studentRegistrationService.saveStudentRegistration(studentRegistrationDTO);
	}

	@GetMapping
	public List<StudentRegistrationDTO> getStudentList(@PathVariable("schoolId") Long schoolId) {
		return studentRegistrationService.getStudentRegistrationList(schoolId);
	}

	@GetMapping("/{id}")
	public StudentRegistrationDTO getStudent( @PathVariable Long id) {
		return studentRegistrationService.getStudentRegistration(id);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> delStudent( @PathVariable Long id) {
		studentRegistrationService.deleteStudentRegistration(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
}
