package com.brijframework.useraccount.controller.global;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brijframework.useraccount.beans.rqrs.GenderDetailRequest;
import com.brijframework.useraccount.beans.rqrs.GenderDetailResponse;
import com.brijframework.useraccount.service.global.GenderDetailService;

@RestController
@RequestMapping("api/global/gender")
public class GenderDetailController {

	@Autowired
	private GenderDetailService genderDetailService;
	
	@PostMapping
	public GenderDetailResponse addGenderDetail(@RequestBody GenderDetailRequest genderDetailRequest) {
		return genderDetailService.saveGenderDetail(genderDetailRequest);
	}
	
	@PutMapping
	public GenderDetailResponse updateGenderDetail(@RequestBody GenderDetailRequest genderDetailRequest) {
		return genderDetailService.saveGenderDetail(genderDetailRequest);
	}
	
	@GetMapping("{id}")
	public GenderDetailResponse getGenderDetail(@PathVariable long id) {
		return genderDetailService.getGenderDetail(id);
	}

	@DeleteMapping("{id}")
	public boolean deleteGenderDetail(@PathVariable Long id) {
		return genderDetailService.deleteGenderDetail(id);
	}
	
}
