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

import com.brijframework.useraccount.beans.rqrs.UserAccountRequest;
import com.brijframework.useraccount.beans.rqrs.UserAccountResponse;
import com.brijframework.useraccount.service.account.UserAccountService;

@RestController
@RequestMapping("api/user/account")
public class UserAccountController {
	
	@Autowired
	private UserAccountService userAccountService;
	
	@PostMapping
	public UserAccountResponse addUserAccount(@RequestBody UserAccountRequest userAccountRequest) {
		return userAccountService.saveUserAccount(userAccountRequest);
	}
	
	@PutMapping
	public UserAccountResponse updateUserAccount(@RequestBody UserAccountRequest userAccountRequest) {
		return userAccountService.saveUserAccount(userAccountRequest);
	}
	
	@GetMapping("{id}")
	public UserAccountResponse getUserAccount(@PathVariable long id) {
		return userAccountService.getUserAccount(id);
	}
	

	@DeleteMapping("{id}")
	public boolean deleteUserAccount(@PathVariable Long id) {
		return userAccountService.deleteUserAccount(id);
	}
	
}
