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

import com.brijframework.useraccount.beans.rqrs.CountryDetailRequest;
import com.brijframework.useraccount.beans.rqrs.CountryDetailResponse;
import com.brijframework.useraccount.service.global.CountryDetailService;

@RestController
@RequestMapping("api/global/country")
public class CountryDetailController {

	@Autowired
	private CountryDetailService countryDetailService;
	
	@PostMapping
	public CountryDetailResponse addCountryDetail(@RequestBody CountryDetailRequest cityDetailRequest) {
		return countryDetailService.saveCountryDetail(cityDetailRequest);
	}
	
	@PutMapping
	public CountryDetailResponse updateCountryDetail(@RequestBody CountryDetailRequest cityDetailRequest) {
		return countryDetailService.saveCountryDetail(cityDetailRequest);
	}
	
	@GetMapping("{id}")
	public CountryDetailResponse getCountryDetail(@PathVariable long id) {
		return countryDetailService.getCountryDetail(id);
	}

	@GetMapping
	public List<CountryDetailResponse> getCountryDetailList() {
		return countryDetailService.getCountryDetailList();
	}
	
	@DeleteMapping("{id}")
	public boolean deleteCountryDetail(@PathVariable Long id) {
		return countryDetailService.deleteCountryDetail(id);
	}
}
