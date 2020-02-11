package com.brijframework.school.controller.school;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brijframework.school.bean.school.SchoolDetailDTO;
import com.brijframework.school.bean.school.SchoolDetailRequest;
import com.brijframework.school.service.school.SchoolDetailService;

@RequestMapping("school/detail")
@RestController
public class SchoolDetailController {

	@Autowired
	private SchoolDetailService schoolService;
	
	@PostMapping
	public SchoolDetailDTO addSchool(@RequestBody SchoolDetailRequest student ) {
		return schoolService.saveSchool(student);
	}
	
	@PutMapping
	public SchoolDetailDTO updateSchool(@RequestBody SchoolDetailRequest student ) {
		return schoolService.saveSchool(student);
	}
	
}
