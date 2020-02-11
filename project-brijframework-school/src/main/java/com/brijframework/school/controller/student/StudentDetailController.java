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

import com.brijframework.school.bean.student.StudentDetailDTO;
import com.brijframework.school.bean.student.StudentDetailRequest;
import com.brijframework.school.service.student.StudentDetailService;

@RequestMapping("school/{schoolId}/student/detail")
@RestController
public class StudentDetailController {

	@Autowired
	private StudentDetailService studentService;

	@PostMapping
	public StudentDetailDTO addStudentDetail(@PathVariable("schoolId") Long schoolId, @RequestBody StudentDetailRequest student ) {
		return studentService.saveStudentDetail(schoolId,student);
	}
	
	@PutMapping
	public StudentDetailDTO updateStudentDetail(@PathVariable("schoolId") Long schoolId, @RequestBody StudentDetailRequest student ) {
		return studentService.saveStudentDetail(schoolId,student);
	}
	
	@GetMapping
	public List<StudentDetailDTO> getStudentDetailList(@PathVariable("schoolId") Long schoolId) {
		return studentService.getStudentDetailList(schoolId);
	}

	@GetMapping("/{id}")
	public StudentDetailDTO getStudentDetail(@PathVariable("schoolId") Long schoolId, @PathVariable Long id) {
		return studentService.getStudentDetail(schoolId,id);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> delStudentDetail(@PathVariable("schoolId") Long schoolId, @PathVariable Long id) {
		studentService.deleteStudentDetail(schoolId,id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
}
