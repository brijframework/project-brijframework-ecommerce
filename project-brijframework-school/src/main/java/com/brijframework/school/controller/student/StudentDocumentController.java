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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.brijframework.school.bean.student.StudentDocumentDTO;
import com.brijframework.school.bean.student.StudentDocumentRequest;
import com.brijframework.school.service.student.StudentDocumentService;

@RequestMapping("school/student/document")
@RestController
public class StudentDocumentController {

	@Autowired
	private StudentDocumentService studentDocumentService;

	@PostMapping
	public StudentDocumentDTO addStudentDocument(@RequestParam("studentDetailId") Long studentDetailId,@RequestParam Long categoryId, @RequestParam MultipartFile file) {
		return studentDocumentService.saveStudentDocument(new  StudentDocumentRequest(studentDetailId,null,categoryId,file));
	}
	
	@PutMapping
	public StudentDocumentDTO updateStudentDocument(@RequestParam("studentDetailId") Long studentDetailId,@RequestParam Long id, @RequestParam Long categoryId,@RequestParam MultipartFile file) {
		return studentDocumentService.saveStudentDocument(new  StudentDocumentRequest(studentDetailId,id,categoryId,file));
	}

	@GetMapping("/list/{studentDetailId}")
	public List<StudentDocumentDTO> getStudentDocumentList(@PathVariable("studentDetailId") Long studentDetailId) {
		return studentDocumentService.getStudentDocumentList(studentDetailId);
	}

	@GetMapping("/{id}")
	public StudentDocumentDTO getStudentDocument(@PathVariable Long id) {
		return studentDocumentService.getStudentDocument(id);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> delStudentDocument( @PathVariable Long id) {
		studentDocumentService.deleteStudentDocument(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
}
