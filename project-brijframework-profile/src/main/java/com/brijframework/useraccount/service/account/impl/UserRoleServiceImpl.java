package com.brijframework.useraccount.service.account.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brijframework.useraccount.beans.rqrs.UserRoleRequest;
import com.brijframework.useraccount.beans.rqrs.UserRoleResponse;
import com.brijframework.useraccount.entities.account.EOUserAccount;
import com.brijframework.useraccount.entities.account.EOUserRole;
import com.brijframework.useraccount.mapper.account.UserRoleMapper;
import com.brijframework.useraccount.repository.account.UserRoleRepository;
import com.brijframework.useraccount.repository.global.RoleDetailRepository;
import com.brijframework.useraccount.service.account.UserRoleService;

@Service
public class UserRoleServiceImpl implements UserRoleService {

	@Autowired
	private UserRoleRepository userRoleRepository;
	
	@Autowired
	private RoleDetailRepository roleDetailRepository;
	
	@Autowired
	private UserRoleMapper userRoleMapper;
	
	@Override
	public UserRoleResponse saveUserRole(UserRoleRequest roleRequest) {
		EOUserRole eoUserRole=userRoleMapper.mapToDAO(roleRequest);
		eoUserRole.setActive(true);
		return userRoleMapper.mapToDTO(userRoleRepository.save(eoUserRole));
	}

	@Override
	public List<UserRoleResponse> getUserRoleList() {
		return userRoleMapper.mapToDTO(userRoleRepository.findAll());
	}

	@Override
	public UserRoleResponse getUserRole(Long id) {
		return userRoleMapper.mapToDTO(userRoleRepository.findById(id).orElseGet(null));
	}

	@Override
	public boolean deleteUserRole(Long id) {
		userRoleRepository.deleteById(id);
		return true;
	}
	
	@Override
	public EOUserRole saveUserRole(EOUserAccount userAccount, String role) {
		EOUserRole userRole = userRoleRepository.findByUserAccountIdAndRoleDetailRoleName(userAccount.getId(),role);
		if(userRole!=null) {
			return userRole;
		}
		EOUserRole eoUserRole=new EOUserRole();
		eoUserRole.setActive(true);
		eoUserRole.setRoleDetail(roleDetailRepository.findByRoleName(role));
		eoUserRole.setUserAccount(userAccount);
		userRoleRepository.save(eoUserRole);
		return eoUserRole;
	}

}
