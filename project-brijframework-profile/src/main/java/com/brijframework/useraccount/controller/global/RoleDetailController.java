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

import com.brijframework.useraccount.beans.rqrs.RoleDetailRequest;
import com.brijframework.useraccount.beans.rqrs.RoleDetailResponse;
import com.brijframework.useraccount.service.global.RoleDetailService;

@RestController
@RequestMapping("api/global/role")
public class RoleDetailController {

	@Autowired
	private RoleDetailService roleDetailService;
	
	@PostMapping
	public RoleDetailResponse addRoleDetail(@RequestBody RoleDetailRequest roleDetailRequest) {
		return roleDetailService.saveRoleDetail(roleDetailRequest);
	}
	
	@PutMapping
	public RoleDetailResponse updateRoleDetail(@RequestBody RoleDetailRequest roleDetailRequest) {
		return roleDetailService.saveRoleDetail(roleDetailRequest);
	}
	
	@GetMapping("{id}")
	public RoleDetailResponse getRoleDetail(@PathVariable long id) {
		return roleDetailService.getRoleDetail(id);
	}
	
	@GetMapping
	public List<RoleDetailResponse> getRoleDetailList() {
		return roleDetailService.getRoleDetailList();
	}
	
	@DeleteMapping("{id}")
	public boolean deleteRoleDetail(@PathVariable Long id) {
		return roleDetailService.deleteRoleDetail(id);
	}
}
