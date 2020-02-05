package com.brijframework.school.controller;

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
import com.brijframework.school.service.StudentAdmissionService;

@RequestMapping("school/{schoolId}/student/admission")
@RestController
public class StudentAdmissionController {

	@Autowired
	private StudentAdmissionService admissionService;

	@PostMapping
	public StudentAdmissionDTO addStudent(@PathVariable("schoolId") Long schoolId,@RequestBody StudentAdmissionDTO student ) {
		return admissionService.saveStudentAdmission(schoolId,student);
	}
	
	@PutMapping
	public StudentAdmissionDTO updateStudent(@PathVariable("schoolId") Long schoolId,@RequestBody StudentAdmissionDTO student ) {
		return admissionService.saveStudentAdmission(schoolId,student);
	}

	@GetMapping
	public List<StudentAdmissionDTO> getStudentList(@PathVariable("schoolId") Long schoolId) {
		return admissionService.getStudentAdmissionList(schoolId);
	}

	@GetMapping("/{id}")
	public StudentAdmissionDTO getStudent(@PathVariable("schoolId") Long schoolId, @PathVariable Long id) {
		return admissionService.getStudentAdmission(schoolId,id);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> delStudent(@PathVariable("schoolId") Long schoolId, @PathVariable Long id) {
		admissionService.deleteStudentAdmission(schoolId,id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
}
