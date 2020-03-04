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

import com.brijframework.useraccount.beans.rqrs.UserRoleRequest;
import com.brijframework.useraccount.beans.rqrs.UserRoleResponse;
import com.brijframework.useraccount.service.account.UserRoleService;

@RestController
@RequestMapping("api/user/role")
public class UserRoleController {
		
	@Autowired
	private UserRoleService userRoleService;
	
	@PostMapping
	public UserRoleResponse addUserRole(@RequestBody UserRoleRequest roleRequest) {
		return userRoleService.saveUserRole(roleRequest);
	}
	
	@PutMapping
	public UserRoleResponse updateUserRole(@RequestBody UserRoleRequest roleRequest) {
		return userRoleService.saveUserRole(roleRequest);
	}
	
	@GetMapping
	public List<UserRoleResponse> getUserRoleList() {
		return userRoleService.getUserRoleList();
	}
	
	@GetMapping("{id}")
	public UserRoleResponse getUserRole(@PathVariable Long id) {
		return userRoleService.getUserRole(id);
	}
	
	@DeleteMapping("{id}")
	public boolean deleteUserRole(@PathVariable Long id) {
		return userRoleService.deleteUserRole(id);
	}
	
}
