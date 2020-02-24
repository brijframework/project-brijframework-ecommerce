package com.brijframework.useraccount.controller;

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
import com.brijframework.useraccount.service.UserRoleService;

@RestController
@RequestMapping("api/user/role")
public class UserRoleController {
		
	@Autowired
	private UserRoleService userRoleService;
	
	@PostMapping
	public UserRoleResponse addRole(@RequestBody UserRoleRequest roleRequest) {
		return userRoleService.saveRole(roleRequest);
	}
	
	@PutMapping
	public UserRoleResponse updateRole(@RequestBody UserRoleRequest roleRequest) {
		return userRoleService.saveRole(roleRequest);
	}
	
	@GetMapping
	public List<UserRoleResponse> getRoleList() {
		return userRoleService.getRoleList();
	}
	
	@GetMapping("{id}")
	public UserRoleResponse getRole(@PathVariable Long id) {
		return userRoleService.getRole(id);
	}
	
	@DeleteMapping("{id}")
	public boolean deleteRole(@PathVariable Long id) {
		return userRoleService.deleteRole(id);
	}
	
}
