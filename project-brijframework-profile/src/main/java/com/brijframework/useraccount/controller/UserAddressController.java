package com.brijframework.useraccount.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brijframework.useraccount.beans.rqrs.UserAddressRequest;
import com.brijframework.useraccount.beans.rqrs.UserAddressResponse;
import com.brijframework.useraccount.service.UserAddressService;

@RestController
@RequestMapping("api/user/address")
public class UserAddressController {
	
	@Autowired
	private UserAddressService userAddressService;
	
	@PostMapping
	public UserAddressResponse addAddress(@RequestBody UserAddressRequest userAddressRequest) {
		return userAddressService.saveAddress(userAddressRequest);
	}
	
	@PutMapping
	public UserAddressResponse updateAddress(@RequestBody UserAddressRequest userAddressRequest) {
		return userAddressService.saveAddress(userAddressRequest);
	}
	
	@GetMapping("{id}")
	public UserAddressResponse getUserAddress(@PathVariable long id) {
		return userAddressService.getAddress(id);
	}

	@DeleteMapping("{id}")
	public boolean deleteUserAddress(@PathVariable Long id) {
		return userAddressService.deleteAddress(id);
	}
	
}
