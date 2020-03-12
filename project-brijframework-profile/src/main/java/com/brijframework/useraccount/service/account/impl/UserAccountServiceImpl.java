package com.brijframework.useraccount.service.account.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.useraccount.beans.rqrs.UserAccountRequest;
import com.brijframework.useraccount.beans.rqrs.UserAccountResponse;
import com.brijframework.useraccount.constant.UserRole;
import com.brijframework.useraccount.entities.account.EOUserAccount;
import com.brijframework.useraccount.mapper.account.UserAccountMapper;
import com.brijframework.useraccount.repository.account.UserAccountRepository;
import com.brijframework.useraccount.service.account.UserAccountService;
import com.brijframework.useraccount.service.account.UserRoleService;

@Service
public class UserAccountServiceImpl implements UserAccountService {

	@Autowired
	private UserAccountRepository userAccountRepository;
	
	@Autowired
	private UserAccountMapper userAccountMapper;
	
	private UserRoleService userRoleService;

	@Override
	public UserAccountResponse saveUserAccount(UserAccountRequest userAccountRequest) {
		EOUserAccount eoUserAccount=userAccountMapper.mapToDAO(userAccountRequest);
		eoUserAccount.setActive(true);
		eoUserAccount=userAccountRepository.save(eoUserAccount);
		userRoleService.saveUserRole(eoUserAccount, UserRole.OWNER.getRole());
		return userAccountMapper.mapToDTO(eoUserAccount);
	}

	@Override
	public List<UserAccountResponse> getUserAccountList() {
		return userAccountMapper.mapToDTO(userAccountRepository.findAll());
	}

	@Override
	public UserAccountResponse getUserAccount(Long id) {
		return userAccountMapper.mapToDTO(userAccountRepository.findById(id).orElse(null));
	}

	@Override
	public boolean deleteUserAccount(Long id) {
		EOUserAccount eoUserAccount = userAccountRepository.findById(id).orElseThrow(()->new RuntimeException("Not found."));
		eoUserAccount.setActive(false);
		userAccountRepository.save(eoUserAccount);
		return true;
	}

}
