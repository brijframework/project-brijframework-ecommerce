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

import com.brijframework.school.bean.student.StudentAdmissionDTO;
import com.brijframework.school.service.student.StudentAdmissionService;

@RequestMapping("school/student/admission")
@RestController
public class StudentAdmissionController {

	@Autowired
	private StudentAdmissionService admissionService;

	@PostMapping
	public StudentAdmissionDTO addStudent(@RequestBody StudentAdmissionDTO studentAdmissionDTO ) {
		return admissionService.saveStudentAdmission(studentAdmissionDTO);
	}
	
	@PutMapping
	public StudentAdmissionDTO updateStudent(@RequestBody StudentAdmissionDTO studentAdmissionDTO ) {
		return admissionService.saveStudentAdmission(studentAdmissionDTO);
	}

	@GetMapping("/list/{schoolId}")
	public List<StudentAdmissionDTO> getStudentList(@PathVariable("schoolId") Long schoolId) {
		return admissionService.getStudentAdmissionList(schoolId);
	}

	@GetMapping("/{id}")
	public StudentAdmissionDTO getStudent(@PathVariable Long id) {
		return admissionService.getStudentAdmission(id);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> delStudent(@PathVariable Long id) {
		admissionService.deleteStudentAdmission(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
}
