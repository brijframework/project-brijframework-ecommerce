package com.brijframework.school.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brijframework.school.bean.comman.QualificationDetailDTO;
import com.brijframework.school.service.QualificationDetailService;

@RequestMapping("qualification/detail")
@RestController
public class QualificationDetailController {

	@Autowired
	private QualificationDetailService qualificationDetailService;
	
	@PostMapping
	public QualificationDetailDTO addQualification(@RequestBody QualificationDetailDTO qualificationDetailDTO ) {
		return qualificationDetailService.saveQualification(qualificationDetailDTO);
	}
	
	@PutMapping
	public QualificationDetailDTO updateQualification(@RequestBody QualificationDetailDTO qualificationDetailDTO ) {
		return qualificationDetailService.saveQualification(qualificationDetailDTO);
	}
}
