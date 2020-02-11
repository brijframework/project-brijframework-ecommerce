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

import com.brijframework.school.bean.student.StudentContactDTO;
import com.brijframework.school.service.student.StudentContactService;

@RequestMapping("school/student/{studentDetailId}/contact")
@RestController
public class StudentContactController {

	@Autowired
	private StudentContactService studentContactService;

	@PostMapping
	public StudentContactDTO addStudent(@PathVariable("studentDetailId") Long studentDetailId,@RequestBody StudentContactDTO student ) {
		return studentContactService.saveStudentContact(studentDetailId,student);
	}
	
	@PutMapping
	public StudentContactDTO updateStudent(@PathVariable("studentDetailId") Long studentDetailId,@RequestBody StudentContactDTO student ) {
		return studentContactService.saveStudentContact(studentDetailId,student);
	}

	@GetMapping
	public List<StudentContactDTO> getStudentList(@PathVariable("studentDetailId") Long studentDetailId) {
		return studentContactService.getStudentContactList(studentDetailId);
	}

	@GetMapping("/{id}")
	public StudentContactDTO getStudent(@PathVariable("studentDetailId") Long studentDetailId, @PathVariable Long id) {
		return studentContactService.getStudentContact(studentDetailId,id);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> delStudent(@PathVariable("studentDetailId") Long studentDetailId, @PathVariable Long id) {
		studentContactService.deleteStudentContact(studentDetailId,id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
}
