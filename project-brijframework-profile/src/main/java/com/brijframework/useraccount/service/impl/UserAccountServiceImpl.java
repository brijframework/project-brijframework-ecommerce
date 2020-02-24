package com.brijframework.useraccount.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.useraccount.beans.rqrs.UserAccountRequest;
import com.brijframework.useraccount.beans.rqrs.UserAccountResponse;
import com.brijframework.useraccount.constant.UserRole;
import com.brijframework.useraccount.entities.account.EOUserAccount;
import com.brijframework.useraccount.entities.account.EOUserRole;
import com.brijframework.useraccount.mapper.UserAccountMapper;
import com.brijframework.useraccount.repository.UserAccountRepository;
import com.brijframework.useraccount.repository.UserRoleRepository;
import com.brijframework.useraccount.service.UserAccountService;

@Service
public class UserAccountServiceImpl implements UserAccountService {

	@Autowired
	private UserAccountRepository userAccountRepository;
	
	@Autowired
	private UserRoleRepository userRoleRepository;
	
	@Autowired
	private UserAccountMapper userAccountMapper;

	@Override
	public UserAccountResponse saveAccount(UserAccountRequest userAccountRequest) {
		EOUserAccount eoUserAccount=userAccountMapper.getUserAccountRequest(userAccountRequest);
		EOUserRole userRole=userRoleRepository.findByRoleName(UserRole.OWNER.getRole());
		eoUserAccount.setUserRole(userRole);
		eoUserAccount=userAccountRepository.save(eoUserAccount);
		return userAccountMapper.getUserAccountResponse(eoUserAccount);
	}

	@Override
	public List<UserAccountResponse> getAccountList() {
		return userAccountMapper.getUserAccountResponse(userAccountRepository.findAll());
	}

	@Override
	public UserAccountResponse getAccount(Long id) {
		return userAccountMapper.getUserAccountResponse(userAccountRepository.findById(id).orElse(null));
	}

	@Override
	public boolean deleteAccount(Long id) {
		EOUserAccount eoUserAccount = userAccountRepository.findById(id).orElseThrow(()->new RuntimeException("Not found."));
		eoUserAccount.setActive(false);
		userAccountRepository.save(eoUserAccount);
		return true;
	}

}
