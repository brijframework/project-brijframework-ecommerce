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

import com.brijframework.school.bean.student.StudentInformationDTO;
import com.brijframework.school.service.student.StudentInformationService;

@RequestMapping("school/student/information")
@RestController
public class StudentInformationController {

	@Autowired
	private StudentInformationService studentInformationService;

	@PostMapping
	public StudentInformationDTO addStudent(@RequestBody StudentInformationDTO studentInformationDTO ) {
		return studentInformationService.saveStudentInformation(studentInformationDTO);
	}
	
	@PutMapping
	public StudentInformationDTO updateStudent(@RequestBody StudentInformationDTO studentInformationDTO ) {
		return studentInformationService.saveStudentInformation(studentInformationDTO);
	}

	@GetMapping
	public List<StudentInformationDTO> getStudentList(@PathVariable("schoolId") Long schoolId) {
		return studentInformationService.getStudentInformationList(schoolId);
	}

	@GetMapping("/{id}")
	public StudentInformationDTO getStudent( @PathVariable Long id) {
		return studentInformationService.getStudentInformation(id);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> delStudent( @PathVariable Long id) {
		studentInformationService.deleteStudentInformation(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
}
