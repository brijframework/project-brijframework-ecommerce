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

import com.brijframework.school.bean.student.StudentCategoryDTO;
import com.brijframework.school.service.student.StudentCategoryService;

@RequestMapping("school/{schoolId}/student/category")
@RestController
public class StudentCategoryController {

	@Autowired
	private StudentCategoryService studentCategoryService;

	@PostMapping
	public StudentCategoryDTO addStudent(@PathVariable("schoolId") Long schoolId,@RequestBody StudentCategoryDTO student ) {
		return studentCategoryService.saveStudentCategory(schoolId,student);
	}
	
	@PutMapping
	public StudentCategoryDTO updateStudent(@PathVariable("schoolId") Long schoolId,@RequestBody StudentCategoryDTO student ) {
		return studentCategoryService.saveStudentCategory(schoolId,student);
	}

	@GetMapping
	public List<StudentCategoryDTO> getStudentList(@PathVariable("schoolId") Long schoolId) {
		return studentCategoryService.getStudentCategoryList(schoolId);
	}

	@GetMapping("/{id}")
	public StudentCategoryDTO getStudent(@PathVariable("schoolId") Long schoolId, @PathVariable Long id) {
		return studentCategoryService.getStudentCategory(schoolId,id);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> delStudent(@PathVariable("schoolId") Long schoolId, @PathVariable Long id) {
		studentCategoryService.deleteStudentCategory(schoolId,id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
