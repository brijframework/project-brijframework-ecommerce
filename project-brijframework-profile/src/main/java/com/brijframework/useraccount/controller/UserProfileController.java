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

import com.brijframework.useraccount.beans.rqrs.UserProfileRequest;
import com.brijframework.useraccount.beans.rqrs.UserProfileResponse;
import com.brijframework.useraccount.service.UserProfileService;

@RestController
@RequestMapping("api/user/profile")
public class UserProfileController {
	
	@Autowired
	private UserProfileService userProfileService;
	
	@PostMapping
	public UserProfileResponse addProfile(@RequestBody UserProfileRequest userProfileRequest) {
		return userProfileService.saveProfile(userProfileRequest);
	}
	
	@PutMapping
	public UserProfileResponse updateProfile(@RequestBody UserProfileRequest userProfileRequest) {
		return userProfileService.saveProfile(userProfileRequest);
	}
	
	@GetMapping("{id}")
	public UserProfileResponse getUserProfile(@PathVariable long id) {
		return userProfileService.getProfile(id);
	}
	

	@DeleteMapping("{id}")
	public boolean deleteUserProfile(@PathVariable Long id) {
		return userProfileService.deleteProfile(id);
	}
	
}
