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

import com.brijframework.useraccount.beans.rqrs.ReligionDetailRequest;
import com.brijframework.useraccount.beans.rqrs.ReligionDetailResponse;
import com.brijframework.useraccount.service.global.ReligionDetailService;

@RestController
@RequestMapping("api/global/religion")
public class ReligionDetailController {

	@Autowired
	private ReligionDetailService religionDetailService;
	
	@PostMapping
	public ReligionDetailResponse addReligionDetail(@RequestBody ReligionDetailRequest religionDetailRequest) {
		return religionDetailService.saveReligionDetail(religionDetailRequest);
	}
	
	@PutMapping
	public ReligionDetailResponse updateReligionDetail(@RequestBody ReligionDetailRequest religionDetailRequest) {
		return religionDetailService.saveReligionDetail(religionDetailRequest);
	}
	
	@GetMapping("{id}")
	public ReligionDetailResponse getReligionDetail(@PathVariable long id) {
		return religionDetailService.getReligionDetail(id);
	}
	

	@DeleteMapping("{id}")
	public boolean deleteReligionDetail(@PathVariable Long id) {
		return religionDetailService.deleteReligionDetail(id);
	}
}
