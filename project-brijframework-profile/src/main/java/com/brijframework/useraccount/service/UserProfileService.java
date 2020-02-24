package com.brijframework.useraccount.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.brijframework.useraccount.beans.rqrs.UserProfileRequest;
import com.brijframework.useraccount.beans.rqrs.UserProfileResponse;

public interface UserProfileService {

	public UserProfileResponse saveProfile(UserProfileRequest roleRequest);
	
	public List<UserProfileResponse> getProfileList();
	
	public UserProfileResponse getProfile(Long id) ;
	
	public boolean deleteProfile(@PathVariable Long id);
}
