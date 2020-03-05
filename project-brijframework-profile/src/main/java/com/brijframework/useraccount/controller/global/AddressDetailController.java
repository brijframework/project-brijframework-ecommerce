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

import com.brijframework.useraccount.beans.rqrs.AddressDetailRequest;
import com.brijframework.useraccount.beans.rqrs.AddressDetailResponse;
import com.brijframework.useraccount.service.global.AddressDetailService;

@RestController
@RequestMapping("api/global/address")
public class AddressDetailController {

	@Autowired
	private AddressDetailService addressDetailService;
	
	@PostMapping
	public AddressDetailResponse addAddressDetail(@RequestBody AddressDetailRequest AddressDetailRequest) {
		return addressDetailService.saveAddressDetail(AddressDetailRequest);
	}
	
	@PutMapping
	public AddressDetailResponse updateAddressDetail(@RequestBody AddressDetailRequest AddressDetailRequest) {
		return addressDetailService.saveAddressDetail(AddressDetailRequest);
	}
	
	@GetMapping("{id}")
	public AddressDetailResponse getAddressDetail(@PathVariable long id) {
		return addressDetailService.getAddressDetail(id);
	}
	
	@GetMapping
	public List<AddressDetailResponse> getAddressDetailList() {
		return addressDetailService.getAddressDetailList();
	}

	@DeleteMapping("{id}")
	public boolean deleteAddressDetail(@PathVariable Long id) {
		return addressDetailService.deleteAddressDetail(id);
	}
}
