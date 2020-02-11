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

import com.brijframework.school.bean.student.StudentFamilyDTO;
import com.brijframework.school.service.student.StudentFamilyService;

@RequestMapping("school/student/family")
@RestController
public class StudentFamilyController {

	@Autowired
	private StudentFamilyService studentFamilyService;

	@PostMapping
	public StudentFamilyDTO addStudent(@RequestBody StudentFamilyDTO studentFamilyDTO ) {
		return studentFamilyService.saveStudentFamily(studentFamilyDTO);
	}
	
	@PutMapping
	public StudentFamilyDTO updateStudent(@RequestBody StudentFamilyDTO student ) {
		return studentFamilyService.saveStudentFamily(student);
	}

	@GetMapping
	public List<StudentFamilyDTO> getStudentList(@PathVariable("studentDetailId") Long studentDetailId) {
		return studentFamilyService.getStudentFamilyList(studentDetailId);
	}

	@GetMapping("/{id}")
	public StudentFamilyDTO getStudent( @PathVariable Long id) {
		return studentFamilyService.getStudentFamily(id);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> delStudent( @PathVariable Long id) {
		studentFamilyService.deleteStudentFamily(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
