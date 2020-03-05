package com.brijframework.useraccount.controller.global;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brijframework.useraccount.beans.rqrs.MaritalDetailRequest;
import com.brijframework.useraccount.beans.rqrs.MaritalDetailResponse;
import com.brijframework.useraccount.service.global.MaritalDetailService;

@RestController
@RequestMapping("api/global/marital")
public class MaritalDetailController {

	@Autowired
	private MaritalDetailService maritalDetailService;
	
	@PostMapping
	public MaritalDetailResponse addMaritalDetail(@RequestBody MaritalDetailRequest maritalDetailRequest) {
		return maritalDetailService.saveMaritalDetail(maritalDetailRequest);
	}
	
	@PutMapping
	public MaritalDetailResponse updateMaritalDetail(@RequestBody MaritalDetailRequest maritalDetailRequest) {
		return maritalDetailService.saveMaritalDetail(maritalDetailRequest);
	}
	
	@GetMapping("{id}")
	public MaritalDetailResponse getMaritalDetail(@PathVariable long id) {
		return maritalDetailService.getMaritalDetail(id);
	}

	@GetMapping
	public List<MaritalDetailResponse> getMaritalDetailList() {
		return maritalDetailService.getMaritalDetailList();
	}

	@DeleteMapping("{id}")
	public boolean deleteMaritalDetail(@PathVariable Long id) {
		return maritalDetailService.deleteMaritalDetail(id);
	}
}
