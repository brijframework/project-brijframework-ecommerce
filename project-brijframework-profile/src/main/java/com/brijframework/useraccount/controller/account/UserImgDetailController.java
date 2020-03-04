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

import com.brijframework.useraccount.beans.rqrs.UserImgDetailRequest;
import com.brijframework.useraccount.beans.rqrs.UserImgDetailResponse;
import com.brijframework.useraccount.service.account.UserImgDetailService;

@RestController
@RequestMapping("api/user/image")
public class UserImgDetailController {
		
	@Autowired
	private UserImgDetailService userRoleService;
	
	@PostMapping
	public UserImgDetailResponse addUserImgDetail(@RequestBody UserImgDetailRequest roleRequest) {
		return userRoleService.saveUserImgDetail(roleRequest);
	}
	
	@PutMapping
	public UserImgDetailResponse updateUserImgDetail(@RequestBody UserImgDetailRequest roleRequest) {
		return userRoleService.saveUserImgDetail(roleRequest);
	}
	
	@GetMapping
	public List<UserImgDetailResponse> getUserImgDetailList() {
		return userRoleService.getUserImgDetailList();
	}
	
	@GetMapping("{id}")
	public UserImgDetailResponse getUserImgDetail(@PathVariable Long id) {
		return userRoleService.getUserImgDetail(id);
	}
	
	@DeleteMapping("{id}")
	public boolean deleteUserImgDetail(@PathVariable Long id) {
		return userRoleService.deleteUserImgDetail(id);
	}
	
}
