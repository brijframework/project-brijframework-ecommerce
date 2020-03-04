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

import com.brijframework.useraccount.beans.rqrs.CityDetailRequest;
import com.brijframework.useraccount.beans.rqrs.CityDetailResponse;
import com.brijframework.useraccount.service.global.CityDetailService;

@RestController
@RequestMapping("api/global/city")
public class CityDetailController {

	@Autowired
	private CityDetailService cityDetailService;
	
	@PostMapping
	public CityDetailResponse addCityDetail(@RequestBody CityDetailRequest cityDetailRequest) {
		return cityDetailService.saveCityDetail(cityDetailRequest);
	}
	
	@PutMapping
	public CityDetailResponse updateCityDetail(@RequestBody CityDetailRequest cityDetailRequest) {
		return cityDetailService.saveCityDetail(cityDetailRequest);
	}
	
	@GetMapping("{id}")
	public CityDetailResponse getCityDetail(@PathVariable long id) {
		return cityDetailService.getCityDetail(id);
	}
	

	@DeleteMapping("{id}")
	public boolean deleteCityDetail(@PathVariable Long id) {
		return cityDetailService.deleteCityDetail(id);
	}
}
