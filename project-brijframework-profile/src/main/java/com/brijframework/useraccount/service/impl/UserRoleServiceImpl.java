package com.brijframework.useraccount.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.useraccount.beans.rqrs.UserRoleRequest;
import com.brijframework.useraccount.beans.rqrs.UserRoleResponse;
import com.brijframework.useraccount.entities.account.EOUserRole;
import com.brijframework.useraccount.mapper.UserRoleMapper;
import com.brijframework.useraccount.repository.UserRoleRepository;
import com.brijframework.useraccount.service.UserRoleService;

@Service
public class UserRoleServiceImpl implements UserRoleService {

	@Autowired
	private UserRoleRepository userRoleRepo;
	
	@Autowired
	private UserRoleMapper userRoleMapper;
	
	@Override
	public UserRoleResponse saveRole(UserRoleRequest roleRequest) {
		EOUserRole eoUserRole=userRoleMapper.getUserRoleRequest(roleRequest);
		return userRoleMapper.getUserRoleResponse(userRoleRepo.save(eoUserRole));
	}

	@Override
	public List<UserRoleResponse> getRoleList() {
		return userRoleMapper.getUserRoleResponse(userRoleRepo.findAll());
	}

	@Override
	public UserRoleResponse getRole(Long id) {
		return userRoleMapper.getUserRoleResponse(userRoleRepo.findById(id).orElseGet(null));
	}

	@Override
	public boolean deleteRole(Long id) {
		userRoleRepo.deleteById(id);
		return true;
	}

}
