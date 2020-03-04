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

import com.brijframework.useraccount.beans.rqrs.CasteDetailRequest;
import com.brijframework.useraccount.beans.rqrs.CasteDetailResponse;
import com.brijframework.useraccount.service.global.CasteDetailService;

@RestController
@RequestMapping("api/global/caste")
public class CasteDetailController {

	@Autowired
	private CasteDetailService casteDetailService;
	
	@PostMapping
	public CasteDetailResponse addCasteDetail(@RequestBody CasteDetailRequest casteDetailRequest) {
		return casteDetailService.saveCasteDetail(casteDetailRequest);
	}
	
	@PutMapping
	public CasteDetailResponse updateCasteDetail(@RequestBody CasteDetailRequest casteDetailRequest) {
		return casteDetailService.saveCasteDetail(casteDetailRequest);
	}
	
	@GetMapping("{id}")
	public CasteDetailResponse getCasteDetail(@PathVariable long id) {
		return casteDetailService.getCasteDetail(id);
	}

	@DeleteMapping("{id}")
	public boolean deleteCasteDetail(@PathVariable Long id) {
		return casteDetailService.deleteCasteDetail(id);
	}
	
}
