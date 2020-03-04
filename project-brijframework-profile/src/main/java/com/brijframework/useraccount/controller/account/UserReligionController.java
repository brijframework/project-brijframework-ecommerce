package com.brijframework.useraccount.controller.account;

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

import com.brijframework.useraccount.beans.rqrs.UserReligionRequest;
import com.brijframework.useraccount.beans.rqrs.UserReligionResponse;
import com.brijframework.useraccount.service.account.UserReligionService;

@RestController
@RequestMapping("api/user/religion")
public class UserReligionController {
		
	@Autowired
	private UserReligionService userRoleService;
	
	@PostMapping
	public UserReligionResponse addUserReligion(@RequestBody UserReligionRequest roleRequest) {
		return userRoleService.saveUserReligion(roleRequest);
	}
	
	@PutMapping
	public UserReligionResponse updateUserReligion(@RequestBody UserReligionRequest roleRequest) {
		return userRoleService.saveUserReligion(roleRequest);
	}
	
	@GetMapping
	public List<UserReligionResponse> getUserReligionList() {
		return userRoleService.getUserReligionList();
	}
	
	@GetMapping("{id}")
	public UserReligionResponse getUserReligion(@PathVariable Long id) {
		return userRoleService.getUserReligion(id);
	}
	
	@DeleteMapping("{id}")
	public boolean deleteUserReligion(@PathVariable Long id) {
		return userRoleService.deleteUserReligion(id);
	}
	
}
