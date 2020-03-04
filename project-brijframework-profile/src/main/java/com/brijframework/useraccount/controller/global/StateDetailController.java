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

import com.brijframework.useraccount.beans.rqrs.StateDetailRequest;
import com.brijframework.useraccount.beans.rqrs.StateDetailResponse;
import com.brijframework.useraccount.service.global.StateDetailService;

@RestController
@RequestMapping("api/global/state")
public class StateDetailController {

	@Autowired
	private StateDetailService stateDetailService;
	
	@PostMapping
	public StateDetailResponse addStateDetail(@RequestBody StateDetailRequest stateDetailRequest) {
		return stateDetailService.saveStateDetail(stateDetailRequest);
	}
	
	@PutMapping
	public StateDetailResponse updateStateDetail(@RequestBody StateDetailRequest stateDetailRequest) {
		return stateDetailService.saveStateDetail(stateDetailRequest);
	}
	
	@GetMapping("{id}")
	public StateDetailResponse getStateDetail(@PathVariable long id) {
		return stateDetailService.getStateDetail(id);
	}
	
	@DeleteMapping("{id}")
	public boolean deleteStateDetail(@PathVariable Long id) {
		return stateDetailService.deleteStateDetail(id);
	}
}
