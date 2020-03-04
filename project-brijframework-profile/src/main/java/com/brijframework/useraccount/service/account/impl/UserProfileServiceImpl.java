package com.brijframework.useraccount.service.account.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.useraccount.beans.rqrs.UserProfileRequest;
import com.brijframework.useraccount.beans.rqrs.UserProfileResponse;
import com.brijframework.useraccount.entities.account.EOUserAccount;
import com.brijframework.useraccount.entities.account.EOUserProfile;
import com.brijframework.useraccount.mapper.account.UserProfileMapper;
import com.brijframework.useraccount.repository.account.UserAccountRepository;
import com.brijframework.useraccount.repository.account.UserProfileRepository;
import com.brijframework.useraccount.service.account.UserProfileService;

@Service
public class UserProfileServiceImpl implements UserProfileService {

	@Autowired
	private UserAccountRepository userAccountRepository;
	
	@Autowired
	private UserProfileRepository userProfileRepo;
	
	@Autowired
	private UserProfileMapper userProfileMapper;
	
	@Override
	public UserProfileResponse saveUserProfile(UserProfileRequest userProfileRequest) {
		EOUserAccount eoUserAccount = userAccountRepository.findById(userProfileRequest.getAccountId()).orElseThrow(()->new RuntimeException("Invalid account id found."));
		EOUserProfile eoUserProfile=userProfileMapper.mapRequestToDAO(userProfileRequest);
		eoUserProfile.setUserAccount(eoUserAccount);
		eoUserProfile=userProfileRepo.save(eoUserProfile);
		return userProfileMapper.mapToDTOResponse(eoUserProfile);
	}

	@Override
	public List<UserProfileResponse> getUserProfileList() {
		return userProfileMapper.mapToDTOResponse(userProfileRepo.findAll());
	}

	@Override
	public UserProfileResponse getUserProfile(Long id) {
		return userProfileMapper.mapToDTOResponse(userProfileRepo.findById(id).orElseThrow(()->new RuntimeException("Not found.")));
	}

	@Override
	public boolean deleteUserProfile(Long id) {
		EOUserProfile eoUserProfile = userProfileRepo.findById(id).orElseThrow(()->new RuntimeException("Not found."));
		eoUserProfile.setActive(false);
		userProfileRepo.save(eoUserProfile);
		return true;
	}

}
