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

import com.brijframework.useraccount.beans.rqrs.UserAccountRequest;
import com.brijframework.useraccount.beans.rqrs.UserAccountResponse;
import com.brijframework.useraccount.service.UserAccountService;

@RestController
@RequestMapping("api/user/account")
public class UserAccountController {
	
	@Autowired
	private UserAccountService userAccountService;
	
	@PostMapping
	public UserAccountResponse addAccount(@RequestBody UserAccountRequest userAccountRequest) {
		return userAccountService.saveAccount(userAccountRequest);
	}
	
	@PutMapping
	public UserAccountResponse updateAccount(@RequestBody UserAccountRequest userAccountRequest) {
		return userAccountService.saveAccount(userAccountRequest);
	}
	
	@GetMapping("{id}")
	public UserAccountResponse getUserAccount(@PathVariable long id) {
		return userAccountService.getAccount(id);
	}
	

	@DeleteMapping("{id}")
	public boolean deleteUserAccount(@PathVariable Long id) {
		return userAccountService.deleteAccount(id);
	}
	
}
