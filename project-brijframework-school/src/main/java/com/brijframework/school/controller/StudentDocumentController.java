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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.brijframework.school.bean.student.StudentDocumentDTO;
import com.brijframework.school.bean.student.StudentDocumentRequest;
import com.brijframework.school.service.StudentDocumentService;

@RequestMapping("school/student/{studentDetailId}/document")
@RestController
public class StudentDocumentController {

	@Autowired
	private StudentDocumentService studentDocumentService;

	@PostMapping
	public StudentDocumentDTO addStudentDocument(@PathVariable("studentDetailId") Long studentDetailId,@RequestParam Long categoryId, @RequestParam MultipartFile file) {
		return studentDocumentService.saveStudentDocument(studentDetailId,new  StudentDocumentRequest(null,categoryId,file));
	}
	
	@PutMapping
	public StudentDocumentDTO updateStudentDocument(@PathVariable("studentDetailId") Long studentDetailId,@RequestParam Long id, @RequestParam Long categoryId,@RequestParam MultipartFile file) {
		return studentDocumentService.saveStudentDocument(studentDetailId,new  StudentDocumentRequest(id,categoryId,file));
	}

	@GetMapping
	public List<StudentDocumentDTO> getStudentDocumentList(@PathVariable("studentDetailId") Long studentDetailId) {
		return studentDocumentService.getStudentDocumentList(studentDetailId);
	}

	@GetMapping("/{id}")
	public StudentDocumentDTO getStudentDocument(@PathVariable("studentDetailId") Long studentDetailId, @PathVariable Long id) {
		return studentDocumentService.getStudentDocument(studentDetailId,id);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> delStudentDocument(@PathVariable("studentDetailId") Long studentDetailId, @PathVariable Long id) {
		studentDocumentService.deleteStudentDocument(studentDetailId,id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
}
