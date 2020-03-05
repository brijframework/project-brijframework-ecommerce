package com.brijframework.useraccount.service.account.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.useraccount.beans.rqrs.UserRoleRequest;
import com.brijframework.useraccount.beans.rqrs.UserRoleResponse;
import com.brijframework.useraccount.entities.account.EOUserRole;
import com.brijframework.useraccount.mapper.account.UserRoleMapper;
import com.brijframework.useraccount.repository.account.UserRoleRepository;
import com.brijframework.useraccount.service.account.UserRoleService;

@Service
public class UserRoleServiceImpl implements UserRoleService {

	@Autowired
	private UserRoleRepository userRoleRepo;
	
	@Autowired
	private UserRoleMapper userRoleMapper;
	
	@Override
	public UserRoleResponse saveUserRole(UserRoleRequest roleRequest) {
		EOUserRole eoUserRole=userRoleMapper.mapToDAO(roleRequest);
		return userRoleMapper.mapToDTO(userRoleRepo.save(eoUserRole));
	}

	@Override
	public List<UserRoleResponse> getUserRoleList() {
		return userRoleMapper.mapToDTO(userRoleRepo.findAll());
	}

	@Override
	public UserRoleResponse getUserRole(Long id) {
		return userRoleMapper.mapToDTO(userRoleRepo.findById(id).orElseGet(null));
	}

	@Override
	public boolean deleteUserRole(Long id) {
		userRoleRepo.deleteById(id);
		return true;
	}

}
