package com.brijframework.useraccount.controller.account;

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
import com.brijframework.useraccount.service.account.UserAddressService;

@RestController
@RequestMapping("api/user/account/address")
public class UserAddressController {
	
	@Autowired
	private UserAddressService userAddressService;
	
	@PostMapping
	public UserAddressResponse addUserAddress(@RequestBody UserAddressRequest userAddressRequest) {
		return userAddressService.saveUserAddress(userAddressRequest);
	}
	
	@PutMapping
	public UserAddressResponse updateUserAddress(@RequestBody UserAddressRequest userAddressRequest) {
		return userAddressService.saveUserAddress(userAddressRequest);
	}
	
	@GetMapping("{id}")
	public UserAddressResponse getUserAddress(@PathVariable long id) {
		return userAddressService.getUserAddress(id);
	}

	@DeleteMapping("{id}")
	public boolean deleteUserAddress(@PathVariable Long id) {
		return userAddressService.deleteUserAddress(id);
	}
	
}
