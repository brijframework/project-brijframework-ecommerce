package com.brijframework.school.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brijframework.school.domain.location.City;
import com.brijframework.school.service.CityService;

@RequestMapping("city")
@RestController
public class CityController {
	
	@Autowired
	CityService cityService;

	@PostMapping
	public City saveCity(@RequestBody City city ) {
		return cityService.saveCity(city);
	}
}
