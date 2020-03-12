package com.brijframework.useraccount.service.account.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.useraccount.beans.rqrs.UserReligionRequest;
import com.brijframework.useraccount.beans.rqrs.UserReligionResponse;
import com.brijframework.useraccount.entities.account.EOUserReligion;
import com.brijframework.useraccount.mapper.account.UserReligionMapper;
import com.brijframework.useraccount.repository.account.UserReligionRepository;
import com.brijframework.useraccount.service.account.UserReligionService;

@Service
public class UserReligionServiceImpl implements UserReligionService {

	@Autowired
	private UserReligionRepository userAccountRepository;
	
	@Autowired
	private UserReligionMapper userAccountMapper;

	@Override
	public UserReligionResponse saveUserReligion(UserReligionRequest userAccountRequest) {
		EOUserReligion eoUserReligion=userAccountMapper.mapToDAO(userAccountRequest);
		eoUserReligion=userAccountRepository.save(eoUserReligion);
		eoUserReligion.setActive(true);
		return userAccountMapper.mapToDTO(eoUserReligion);
	}

	@Override
	public List<UserReligionResponse> getUserReligionList() {
		return userAccountMapper.mapToDTO(userAccountRepository.findAll());
	}

	@Override
	public UserReligionResponse getUserReligion(Long id) {
		return userAccountMapper.mapToDTO(userAccountRepository.findById(id).orElse(null));
	}

	@Override
	public boolean deleteUserReligion(Long id) {
		EOUserReligion eoUserReligion = userAccountRepository.findById(id).orElseThrow(()->new RuntimeException("Not found."));
		eoUserReligion.setActive(false);
		userAccountRepository.save(eoUserReligion);
		return true;
	}

}
