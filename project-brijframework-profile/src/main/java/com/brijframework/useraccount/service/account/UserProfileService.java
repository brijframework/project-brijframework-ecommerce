package com.brijframework.useraccount.service.account;

import java.util.List;

import com.brijframework.useraccount.beans.rqrs.UserProfileRequest;
import com.brijframework.useraccount.beans.rqrs.UserProfileResponse;

public interface UserProfileService {

	public UserProfileResponse saveUserProfile(UserProfileRequest roleRequest);
	
	public List<UserProfileResponse> getUserProfileList();
	
	public UserProfileResponse getUserProfile(Long id) ;
	
	public boolean deleteUserProfile(Long id);
}
